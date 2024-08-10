package com.travelnest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.travelnest.services.HotelService;
import com.travelnest.services.RoomService;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class RoomController {
	
	@Autowired
	HotelService hs;
	
	@Autowired
	RoomService rs;
}
