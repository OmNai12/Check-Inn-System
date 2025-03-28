package com.checkinsystemproject.Checkin.System.Project.Models;

// Utility Imports
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "payment")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Payment {
    @Id()
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(columnDefinition = "jsonb")
    private String payments;

    @OneToOne(mappedBy = "payment")
    private CheckInns checkInns;
}
