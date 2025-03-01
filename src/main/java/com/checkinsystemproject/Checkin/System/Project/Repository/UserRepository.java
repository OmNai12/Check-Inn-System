package com.checkinsystemproject.Checkin.System.Project.Repository;

// Spring imports
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

// Project imports
import com.checkinsystemproject.Checkin.System.Project.Models.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}