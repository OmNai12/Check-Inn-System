package com.checkinsystemproject.Checkin.System.Project.Models;

// Java Imports
import java.time.LocalDateTime;

// Utlity Imports
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

@Entity
@Table(name = "Reservations")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Reservations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reservationID;

    @ManyToOne
    @JoinColumn(name = "guestID", nullable = false)
    private Guest guest;

    @ManyToOne
    @JoinColumn(name = "roomID", nullable = false)
    private Room room;

    @Column(nullable = false)
    private LocalDateTime checkInDate;

    @Column(nullable = false)
    private LocalDateTime checkOutDate;

    @Enumerated(EnumType.STRING)
    private ReservationStatus status;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

    public enum ReservationStatus {
        BOOKED, CHECKEDIN, CHECKEDINOUT, CANCELLED
    }
}
