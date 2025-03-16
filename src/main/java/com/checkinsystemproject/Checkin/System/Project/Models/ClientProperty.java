package com.checkinsystemproject.Checkin.System.Project.Models;

import java.sql.Blob;
// Java Imports
import java.util.UUID;

// Utlity Imports
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "client_property")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ClientProperty {
    @Id()
    @GeneratedValue(strategy = GenerationType.UUID)
    // @Column(updatable = false)
    private UUID id;

    @Column(nullable = false)
    private String PropertyName;

    private Blob PropertyImage;

    private int NumberOfrooms;

    private String AvailableRoomTypes;
}
