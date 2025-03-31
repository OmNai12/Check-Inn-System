package com.checkinsystemproject.Checkin.System.Project.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.checkinsystemproject.Checkin.System.Project.Models.Rooms;
import com.checkinsystemproject.Checkin.System.Project.Services.RoomsService;

public class RoomsController {

    @Autowired
    private RoomsService roomsService;

    @PostMapping("/room")
    public Rooms createRoom(@RequestBody Rooms room) {
        try {
            return roomsService.createRooms(room);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("[RoomsController][createRoom] : Error creating room" + e.getMessage());
        }
    }

    @PostMapping("/updateRoom")
    public Rooms updateRoom(@RequestBody Rooms room) {
        try {
            return roomsService.updateRooms(room);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("[RoomsController][updateRoom] : Error updating room" + e.getMessage());
        }
    }

    @PostMapping("/getallrooms")
    public List<Rooms> getAllRooms() {
        try {
            return roomsService.getAllRooms();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("[RoomsController][getAllRooms] : Error getting all rooms" + e.getMessage());
        }
    }

}
