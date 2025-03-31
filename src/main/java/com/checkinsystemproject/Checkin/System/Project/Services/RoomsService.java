package com.checkinsystemproject.Checkin.System.Project.Services;


import java.util.List;

// Spring Imports
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Project Imports
import com.checkinsystemproject.Checkin.System.Project.Models.Rooms;
import com.checkinsystemproject.Checkin.System.Project.Repository.RoomRepository;
import com.checkinsystemproject.Checkin.System.Project.Exceptions.RoomsExceptions.RoomsServiceExceptions;

@Service
public class RoomsService {

    @Autowired
    private RoomRepository roomsRepository;

    public Rooms createRooms(Rooms room){
            try{
                Rooms savedRooms = roomsRepository.save(room);
                return savedRooms;
            }
            catch(Exception e) {
            e.printStackTrace();
            throw new RoomsServiceExceptions("[RoomService][createRooms] : Error creating room"+ e.getMessage());
        }
    }

    public Rooms updateRooms(Rooms room) {
        try {
            Rooms updatedRoom = roomsRepository.save(room);
            return updatedRoom;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RoomsServiceExceptions("[RoomService][updateRooms] : Error updating room" + e.getMessage());
        }
    }

    public List<Rooms> getAllRooms() {
        try {
            List<Rooms> allRooms = roomsRepository.findAll();
            return allRooms;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RoomsServiceExceptions("[RoomService][getAllRooms] : Error getting all rooms" + e.getMessage());
        }
    }

    
}
