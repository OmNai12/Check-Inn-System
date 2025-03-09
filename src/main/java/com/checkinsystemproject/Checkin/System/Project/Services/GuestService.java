package com.checkinsystemproject.Checkin.System.Project.Services;

// Spring Imports
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Project Imports
import com.checkinsystemproject.Checkin.System.Project.Models.Guest;
import com.checkinsystemproject.Checkin.System.Project.Repository.GuestRepository;

@Service
public class GuestService {

    @Autowired
    private GuestRepository guestRepository;

    public Guest createGuest(Guest guest) {
        try {
            Guest savedGuest = guestRepository.save(guest);
            return savedGuest;
        } catch (Exception e) {
            return null;
        }
    }

}
