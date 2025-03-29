package com.checkinsystemproject.Checkin.System.Project.Repository;

// Spring Imports
import org.springframework.data.jpa.repository.JpaRepository;

// Java Imports
import com.checkinsystemproject.Checkin.System.Project.Models.BusinessOwner;

public interface BusinessOwnerRepository extends JpaRepository<BusinessOwner, String> {

}
