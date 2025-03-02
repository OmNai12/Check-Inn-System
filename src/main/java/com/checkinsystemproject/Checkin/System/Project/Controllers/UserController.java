package com.checkinsystemproject.Checkin.System.Project.Controllers;

// Java imports
import java.util.List;

// Spring imports
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// Project imports
import com.checkinsystemproject.Checkin.System.Project.Models.User;
import com.checkinsystemproject.Checkin.System.Project.Services.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }
}
