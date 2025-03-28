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

@RestController
public class GuestController {

    @Autowired
    private GuestService guestService;

    @PostMapping("/guest")
    public Guest createGuest(@RequestBody Guest guest) {
        // System.out.println("GuestController: " + guest);
        return guestService.createGuest(guest);
    }

    @GetMapping("/getallguests")
    public List<Guest> getAllGuests() {
        return guestService.GetAllGuests();
    }
    
}
