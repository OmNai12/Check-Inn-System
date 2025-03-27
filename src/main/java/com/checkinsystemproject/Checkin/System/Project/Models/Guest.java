package com.checkinsystemproject.Checkin.System.Project.Models;

// Java Imports
import java.time.LocalDateTime;

// Utlity Imports
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
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
    // @Column(updatable = false)
    private String id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String govtId;

    private String streetAddress;

    private String city;

    private String state;

    private String zipCode;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

}
