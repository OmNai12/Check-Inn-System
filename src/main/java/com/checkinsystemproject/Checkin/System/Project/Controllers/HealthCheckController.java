package com.checkinsystemproject.Checkin.System.Project.Controllers;

// Spring imports
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

// Project imports
import com.checkinsystemproject.Checkin.System.Project.Services.HealthCheckService;

@RestController
public class HealthCheckController {

    @Autowired
    private HealthCheckService healthCheckService;

    @GetMapping("/health")
    public String healthCheck ()  {
        try {
            return healthCheckService.healthCheck();
        } catch (Exception e) {
            System.out.println("[HealthCheckController]:[healthCheck]" + e.getMessage());
            throw new RuntimeException("Health check failed");
        }
    }
}
