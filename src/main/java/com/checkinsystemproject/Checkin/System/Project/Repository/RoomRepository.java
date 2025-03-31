package com.checkinsystemproject.Checkin.System.Project.Repository;

// Spring Imports
import org.springframework.data.jpa.repository.JpaRepository;

// Java Imports
import com.checkinsystemproject.Checkin.System.Project.Models.Rooms;

public interface RoomRepository extends JpaRepository<Rooms, String> {
	
}
