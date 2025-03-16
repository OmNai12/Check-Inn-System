package com.checkinsystemproject.Checkin.System.Project.Services;

// Java Imports
import java.time.LocalDateTime;

// Spring Imports
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Project Imports
import com.checkinsystemproject.Checkin.System.Project.DTO.CheckInRequest;
import com.checkinsystemproject.Checkin.System.Project.DTO.CheckInResponse;
import com.checkinsystemproject.Checkin.System.Project.Models.Guest;
import com.checkinsystemproject.Checkin.System.Project.Models.Payment;
import com.checkinsystemproject.Checkin.System.Project.Models.Reservations;
import com.checkinsystemproject.Checkin.System.Project.Models.Room;
import com.checkinsystemproject.Checkin.System.Project.Repository.GuestRepository;
import com.checkinsystemproject.Checkin.System.Project.Repository.PaymentRepository;
import com.checkinsystemproject.Checkin.System.Project.Repository.ReservationRepository;
import com.checkinsystemproject.Checkin.System.Project.Repository.RoomRepository;

// Utility Imports
import jakarta.transaction.Transactional;

@Service
public class CheckInService {
    @Autowired
    private GuestRepository guestRepository;
    
    @Autowired
    private RoomRepository roomRepository;

    @Autowired
    private ReservationRepository reservationRepository;

    @Autowired
    private PaymentRepository paymentRepository;

    @Transactional
    public CheckInResponse CheckIn(CheckInRequest request) {
        System.err.println("CheckInService: " + request);
        // 1️⃣ Create & Save Guest
        Guest guest = new Guest();
        guest.setFirstName(request.getFirstName());
        guest.setLastName(request.getLastName());
        guest.setGovtId(request.getGovtId());
        guest.setStreetAddress(request.getStreetAddress());
        guest.setCity(request.getCity());
        guest.setState(request.getState());
        guest.setZipCode(request.getZipCode());
        guest = guestRepository.save(guest);

        // 2️⃣ Assign Room
        Room room = roomRepository.findByRoomNumber(request.getRoomNumber())
                .orElseThrow(() -> new RuntimeException("Room not found"));
        if (room.getStatus() != Room.RoomStatus.AVAILABLE) {
            throw new RuntimeException("Room is not available");
        }
        room.setStatus(Room.RoomStatus.OCCUPIED);
        room.setPrice(request.getAmount());
        roomRepository.save(room);

        // 3️⃣ Create & Save Reservation
        Reservations reservation = new Reservations();
        reservation.setGuest(guest);
        reservation.setRoom(room);
        reservation.setCheckInDate(request.getCheckInDate());
        reservation.setCheckOutDate(request.getCheckOutDate());
        reservation.setStatus(Reservations.ReservationStatus.BOOKED);
        reservation = reservationRepository.save(reservation);

        // 4️⃣ Process Payment
        Payment payment = new Payment();
        payment.setReservation(reservation);
        payment.setAmount(request.getAmount());
        payment.setPaymentMethod(request.getPaymentMethod());
        payment.setPaymentStatus(Payment.PaymentStatus.COMPLETED);
        payment.setPaymentDate(LocalDateTime.now());
        paymentRepository.save(payment);

        // 5️⃣ Return Response
        return new CheckInResponse(guest, reservation, payment);
    }
}
