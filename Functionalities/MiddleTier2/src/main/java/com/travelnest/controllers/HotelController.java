package com.travelnest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.travelnest.entities.Area;
import com.travelnest.entities.HotelDummy;
import com.travelnest.entities.Hotel;
import com.travelnest.entities.User;
import com.travelnest.services.AreaService;
import com.travelnest.services.HotelService;
import com.travelnest.services.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class HotelController {
	
	@Autowired
	AreaService as;
	
	@Autowired
	UserService us;
	
	@Autowired
	HotelService hs;
	
	@PostMapping("/addHotel")
	public Hotel addHotel(@RequestBody HotelDummy hd) {
		Area a = as.getById(hd.getAreaid());
		
		User u = us.getById(hd.getUid());
		
		Hotel h = new Hotel();
		
		h.setHname(hd.getHname());
		
		//h.setStatus(0);
		h.setContact(hd.getContact());
		
		h.setLicenseno(hd.getLicenseno());
		
		h.setAddress(hd.getAddress());
		
		h.setArea(a);
		
		h.setOwner_id(u);
		
		return hs.addHotel(h);
		
		
		
	}

}
