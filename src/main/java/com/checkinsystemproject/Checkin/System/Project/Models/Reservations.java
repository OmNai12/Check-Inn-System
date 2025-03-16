package com.checkinsystemproject.Checkin.System.Project.Models;

// Java Imports
import java.time.LocalDateTime;

// Utlity Imports
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

@Entity
@Table(name = "Reservations", 
indexes = {
    @Index(name = "idx_checkin_checkout", columnList = "checkInDate, checkOutDate")
})
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Reservations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reservation_id;

    @ManyToOne
    @JoinColumn(name = "guest_id", nullable = false)
    private Guest guest;

    @ManyToOne
    @JoinColumn(name = "room_id", nullable = false)
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
