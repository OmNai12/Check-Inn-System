package com.checkinsystemproject.Checkin.System.Project.Models;

// Utility Imports
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "business_owner")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BusinessOwner {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false)
    private String propertyName;

    @Column(nullable = false)
    private int taxAmount;

    @Column(nullable = false)
    private int totalRooms;

    @Lob
    private byte[] imageOfProperty;
}
