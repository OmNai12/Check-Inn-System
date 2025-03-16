package com.checkinsystemproject.Checkin.System.Project.DTO;

// Java Imports 
import java.time.LocalDateTime;

// Utlity Imports
import lombok.*;

// Project Imports
import com.checkinsystemproject.Checkin.System.Project.Models.Payment;

@Data
public class CheckInRequest {
    private String firstName;
    private String lastName;
    private String govtId;
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    private String roomNumber;
    private String roomType;
    private LocalDateTime checkInDate;
    private LocalDateTime checkOutDate;
    private float amount;
    private Payment.PaymentMethod paymentMethod;
}
