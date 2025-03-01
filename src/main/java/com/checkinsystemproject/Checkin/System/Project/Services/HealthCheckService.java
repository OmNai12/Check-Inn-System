package com.checkinsystemproject.Checkin.System.Project.Services;

// Spring imports
import org.springframework.stereotype.Service;

// Project imports
// import com.checkinsystemproject.Checkin.System.Project.Repository.HealthCheckRepository;

@Service
public class HealthCheckService {

    // private HealthCheckRepository healthCheckRepository;

    public String healthCheck() {
        try {
            return "OK";
        } catch (Exception e) {
            System.out.println("[HealthCheckService]:[healthCheck]" + e.getMessage());
            throw new RuntimeException("Health check failed");
        }
    }
}
