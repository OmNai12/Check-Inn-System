package com.checkinsystemproject.Checkin.System.Project.Models;

// Java Imports
import java.time.LocalDateTime;
import java.util.UUID;

// Utlity Imports
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Payment")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID payment_id;

    @Column(nullable = false)
    private float amount;

    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;

    @Column(nullable = false)
    private LocalDateTime paymentDate;

    @OneToOne
    @JoinColumn(name = "reservation_id", nullable = false)
    private Reservations reservation;

    public enum PaymentMethod {
        CREDIT_CARD, DEBIT_CARD, CASH, NET_BANKING
    }

    public enum PaymentStatus {
        PENDING, COMPLETED
    }
}
