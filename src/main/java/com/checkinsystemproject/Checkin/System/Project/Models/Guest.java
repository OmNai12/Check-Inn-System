package com.checkinsystemproject.Checkin.System.Project.Models;

// Java Imports
import java.time.LocalDateTime;

// Utility Imports
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "guest")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Guest {
    @Id()
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String govtId;

    private String idType;

//    private String streetAddress;
//
//    private String city;
//
//    private String state;
//
//    private String zipCode;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

    private String remarks;

    @OneToOne(mappedBy = "guest")
    private CheckInns checkInns;
}
