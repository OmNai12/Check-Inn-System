package com.checkinsystemproject.Checkin.System.Project.Services;

import org.springframework.beans.factory.annotation.Autowired;
// Spring Imports
import org.springframework.stereotype.Service;

import com.checkinsystemproject.Checkin.System.Project.Models.ClientProperty;
import com.checkinsystemproject.Checkin.System.Project.Repository.ClientPropertyRepository;

@Service
public class ClientPropertyDetailService {

    @Autowired
    private ClientPropertyRepository clientPropertyRepository;

    public ClientProperty createClientProperty(ClientProperty clientProperty) {
        try {
            ClientProperty savedClientProperty = clientPropertyRepository.save(clientProperty);
            return savedClientProperty;
        } catch (Exception e) {
            return null;
        }
    }
}
