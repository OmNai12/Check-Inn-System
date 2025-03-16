package com.checkinsystemproject.Checkin.System.Project.Controllers;

// Spring Imports
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

// Project Imports
import com.checkinsystemproject.Checkin.System.Project.Services.CheckInService;
import com.checkinsystemproject.Checkin.System.Project.DTO.CheckInRequest;
import com.checkinsystemproject.Checkin.System.Project.DTO.CheckInResponse;

@RestController
public class CheckInGuestController {

    @Autowired
    private CheckInService checkInService;

    @PostMapping("/checkin")
    public ResponseEntity<CheckInResponse> checkInGuest(@RequestBody CheckInRequest request) {
        CheckInResponse response = checkInService.CheckIn(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
