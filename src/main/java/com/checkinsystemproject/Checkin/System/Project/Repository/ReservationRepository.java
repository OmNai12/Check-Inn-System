package com.checkinsystemproject.Checkin.System.Project.Repository;

// Spring Imports
import org.springframework.data.jpa.repository.JpaRepository;

// Project Imports
import com.checkinsystemproject.Checkin.System.Project.Models.Reservations;

public interface ReservationRepository extends JpaRepository<Reservations, String> {

}
