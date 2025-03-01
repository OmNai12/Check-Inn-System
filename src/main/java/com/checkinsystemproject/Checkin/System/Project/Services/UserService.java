package com.checkinsystemproject.Checkin.System.Project.Services;

// Java imports
import java.util.List;

// Spring imports
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Project imports
import com.checkinsystemproject.Checkin.System.Project.Repository.UserRepository;
import com.checkinsystemproject.Checkin.System.Project.Models.User;

@Service
public class UserService {
     @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
