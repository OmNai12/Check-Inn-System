package com.checkinsystemproject.Checkin.System.Project.Services;

// Spring Imports
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.checkinsystemproject.Checkin.System.Project.Models.Guest;
// Project Imports
import com.checkinsystemproject.Checkin.System.Project.Repository.GuestRepository;

@Service
public class GuestService {

    @Autowired
    private GuestRepository guestRepository;

    public String createGuest(Guest guest) {
        try {
            System.out.println("GuestService: " + guest);
            guestRepository.save(guest);
            return "Guest created successfully";
        } catch (Exception e) {
            return "Error creating guest: " + e.getMessage();
        }
    }

}
