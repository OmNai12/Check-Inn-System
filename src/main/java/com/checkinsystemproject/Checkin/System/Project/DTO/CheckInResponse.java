package com.checkinsystemproject.Checkin.System.Project.DTO;

// project imports
import com.checkinsystemproject.Checkin.System.Project.Models.Guest;
import com.checkinsystemproject.Checkin.System.Project.Models.Payment;
import com.checkinsystemproject.Checkin.System.Project.Models.Reservations;

// Utlity Imports
import lombok.*;

@Data
@AllArgsConstructor
public class CheckInResponse {
    private Guest guest;
    private Reservations reservation;
    private Payment payment;
}
