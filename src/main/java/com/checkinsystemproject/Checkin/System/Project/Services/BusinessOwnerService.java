package com.checkinsystemproject.Checkin.System.Project.Services;

// spring imports
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// project imports
import com.checkinsystemproject.Checkin.System.Project.Models.BusinessOwner;
import com.checkinsystemproject.Checkin.System.Project.Repository.BusinessOwnerRepository;

@Service
public class BusinessOwnerService {
    
    @Autowired
    private BusinessOwnerRepository businessOwnerRepository;

    public BusinessOwner createBuisinessOwner(BusinessOwner businessOwner) {
        try {
            BusinessOwner savedBusinessOwner = businessOwnerRepository.save(businessOwner);
            return savedBusinessOwner;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("[BusinessOwnerService][createBusinessOwner] : Error creating business owner");
        }   
    }
}
