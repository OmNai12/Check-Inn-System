package com.checkinsystemproject.Checkin.System.Project.Models;

// Java Imports
import java.util.UUID;

// Utlity Imports
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Rooms")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false, unique = true)
    private String roomNumber;

    @Enumerated(EnumType.STRING)
    private RoomType roomType;

    @Column(nullable = false)
    private float price;

    @Enumerated(EnumType.STRING)
    private RoomStatus status;

    public enum RoomType {
        SINGLE, DOUBLE
    }

    public enum RoomStatus {
        AVAILABLE, OCCUPIED
    }
}
