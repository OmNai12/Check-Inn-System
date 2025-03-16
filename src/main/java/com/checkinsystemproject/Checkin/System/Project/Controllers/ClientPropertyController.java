package com.checkinsystemproject.Checkin.System.Project.Controllers;

// Spring Imports
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// Project Imports
import com.checkinsystemproject.Checkin.System.Project.Models.ClientProperty;
import com.checkinsystemproject.Checkin.System.Project.Services.ClientPropertyDetailService;

@RestController
public class ClientPropertyController {
    @Autowired
    private ClientPropertyDetailService clientPropertyService;

    @PostMapping("/clientProperty")
    public ClientProperty addClientPropertyDetails(@RequestBody ClientProperty clientProperty) {
        System.out.println("Client Property Details: " + clientProperty);
        return clientPropertyService.createClientProperty(clientProperty);
    }
}
