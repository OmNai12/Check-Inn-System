package com.checkinsystemproject.Checkin.System.Project.Repository;

// Spring Imports   
import org.springframework.data.jpa.repository.JpaRepository;

// Project Imports
import com.checkinsystemproject.Checkin.System.Project.Models.ClientProperty;

public interface ClientPropertyRepository extends JpaRepository<ClientProperty, String> {

}
