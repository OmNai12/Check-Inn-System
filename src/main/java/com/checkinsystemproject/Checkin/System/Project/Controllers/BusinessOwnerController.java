package com.checkinsystemproject.Checkin.System.Project.Controllers;

import java.util.List;

// spring imports
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.checkinsystemproject.Checkin.System.Project.Exceptions.BusinessOwnerExceptions.BusinessOwnerControllerExceptions;
// project imports
import com.checkinsystemproject.Checkin.System.Project.Models.BusinessOwner;
import com.checkinsystemproject.Checkin.System.Project.Services.BusinessOwnerService;

@RestController
public class BusinessOwnerController {

    @Autowired
    private BusinessOwnerService businessOwnerService;

    @PostMapping("/businessowner")
    public BusinessOwner createBusinessOwner(@RequestBody BusinessOwner businessOwner) {
        try {
            return businessOwnerService.createBusinessOwner(businessOwner);
        } catch (Exception e) {
            e.printStackTrace();
            throw new BusinessOwnerControllerExceptions("[BusinessOwnerController][createBusinessOwner] : Error creating BusinessOwner: " + e.getMessage());
        }
    }

    @GetMapping("/getAllBusinessowner")
    public List<BusinessOwner> getAllBusinessOwner() {
        try {
            return businessOwnerService.getAllBusinessOwner();
        } catch (Exception e) {
            e.printStackTrace();
            throw new BusinessOwnerControllerExceptions("[BusinessOwnerController][getAllBusinessOwner] : Error getting all BusinessOwners: " + e.getMessage());
        }
    }
    
    @PostMapping("/updateBusinessOwner")
    public BusinessOwner updatBusinessOwner(BusinessOwner businessOwner) {
        try {
            return businessOwnerService.updateBusinessOwner(businessOwner);
        } catch (Exception e) {
            e.printStackTrace();
            throw new BusinessOwnerControllerExceptions("[BusinessOwnerController][updatBusinessOwner] : Error updating BusinessOwner: " + e.getMessage());
        }
    }
}
