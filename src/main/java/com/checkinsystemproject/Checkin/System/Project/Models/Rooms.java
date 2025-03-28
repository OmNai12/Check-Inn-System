package com.checkinsystemproject.Checkin.System.Project.Models;

// Utility Imports
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "rooms")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Rooms {
    @Id()
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String aliasRoomName;

    private String roomType;

    @OneToOne(mappedBy = "room")
    private CheckInns checkInns;
}
