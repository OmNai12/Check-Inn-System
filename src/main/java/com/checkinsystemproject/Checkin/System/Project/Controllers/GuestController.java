package com.checkinsystemproject.Checkin.System.Project.Controllers;

// Spring Imports
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

// Project Imports
import com.checkinsystemproject.Checkin.System.Project.Models.Guest;
import com.checkinsystemproject.Checkin.System.Project.Services.GuestService;

@Controller
public class GuestController {

    @Autowired
    private GuestService guestService;

    @PostMapping("/guest")
    public String createGuest(@RequestBody Guest guest) {
        // System.out.println("GuestController: " + guest);
        return guestService.createGuest(guest);
    }
}
