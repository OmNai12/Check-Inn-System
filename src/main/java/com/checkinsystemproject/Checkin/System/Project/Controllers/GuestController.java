package com.checkinsystemproject.Checkin.System.Project.Controllers;

// Java Imports
import java.util.List;

// Spring Imports
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// Project Imports
import com.checkinsystemproject.Checkin.System.Project.Models.Guest;
import com.checkinsystemproject.Checkin.System.Project.Services.GuestService;
import org.springframework.web.bind.annotation.GetMapping;
import com.checkinsystemproject.Checkin.System.Project.Exceptions.GuestExceptions.GuestControllerExceptions;

@RestController
public class GuestController {

    @Autowired
    private GuestService guestService;

    @PostMapping("/guest")
    public Guest createGuest(@RequestBody Guest guest) {
        try {
            return guestService.createGuest(guest);
        } catch (Exception e) {
            e.printStackTrace();
            throw new GuestControllerExceptions("[GuestController][createGuest] : Error creating guest");
        }
    }

    @GetMapping("/getallguests")
    public List<Guest> getAllGuests() {
        try {
            return guestService.GetAllGuests();
        } catch (Exception e) {
            e.printStackTrace();
            throw new GuestControllerExceptions("[GuestController][getAllGuests] : Error getting all guests");
        }
    }
    
}
