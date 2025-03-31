package com.checkinsystemproject.Checkin.System.Project.Services;

// java imports
import java.util.List;

// spring imports
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.checkinsystemproject.Checkin.System.Project.Exceptions.BusinessOwnerExceptions.BusinessOwnerServiceExceptions;
// project imports
import com.checkinsystemproject.Checkin.System.Project.Models.BusinessOwner;
import com.checkinsystemproject.Checkin.System.Project.Repository.BusinessOwnerRepository;

@Service
public class BusinessOwnerService {
    
    @Autowired
    private BusinessOwnerRepository businessOwnerRepository;

    public BusinessOwner createBusinessOwner(BusinessOwner businessOwner) {
        try {
            BusinessOwner savedBusinessOwner = businessOwnerRepository.save(businessOwner);
            return savedBusinessOwner;
        } catch (Exception e) {
            e.printStackTrace();
            throw new BusinessOwnerServiceExceptions("[BusinessOwnerService][createBusinessOwner] : Error creating business owner" + e.getMessage());
        }   
    }

    public List<BusinessOwner> getAllBusinessOwner() {
        try {
            return businessOwnerRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
            throw new BusinessOwnerServiceExceptions("[BusinessOwnerService][getAllBusinessOwner] : Error getting all business owners" + e.getMessage());
        }
    }

    public BusinessOwner updateBusinessOwner(BusinessOwner businessOwner) {
        try {
            BusinessOwner updatedBusinessOwner = businessOwnerRepository.save(businessOwner);
            return updatedBusinessOwner;
        } catch (Exception e) {
            e.printStackTrace();
            throw new BusinessOwnerServiceExceptions("[BusinessOwnerService][updateBusinessOwner] : Error updating business owner" + e.getMessage());
        }
    }
}
