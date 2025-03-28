package com.checkinsystemproject.Checkin.System.Project.Services;

// Java Imports
import java.util.List;

// Spring Imports
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Project Imports
import com.checkinsystemproject.Checkin.System.Project.Models.Guest;
import com.checkinsystemproject.Checkin.System.Project.Repository.GuestRepository;
import com.checkinsystemproject.Checkin.System.Project.Exceptions.GuestExceptions.GuestServiceExceptions;

@Service
public class GuestService {

    @Autowired
    private GuestRepository guestRepository;

    public Guest createGuest(Guest guest) {
        try {
            Guest savedGuest = guestRepository.save(guest);
            return savedGuest;
        } catch (Exception e) {
            e.printStackTrace();
            throw new GuestServiceExceptions("[GuestService][createGuest] : Error creating guest");
        }
    }

    public List<Guest> GetAllGuests(){
        try {
            return guestRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
            throw new GuestServiceExceptions("[GuestService][GetAllGuests] : Error getting all guests");
        }
    }

}
