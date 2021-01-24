package com.stardust.eventsapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stardust.eventsapp.datarepos.RoomRepository;
import com.stardust.eventsapp.domain.Room;


@RestController
public class RoomController {

	@Autowired
	private RoomRepository repository;
	
	@GetMapping("/getAvailableRooms")
    public List<Room> getAvailabeRooms() {
        return repository.findAll();
    }
    
	@PostMapping("/RegisterRooms")
    public String registerRoomRequest(@RequestBody Room room) {
        repository.save(room);
    	return "saved";
    }

}
