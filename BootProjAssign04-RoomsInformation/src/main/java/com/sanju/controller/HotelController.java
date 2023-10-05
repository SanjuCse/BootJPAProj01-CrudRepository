package com.sanju.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.sanju.model.Hotel;
import com.sanju.service.HotelServiceImpl;

@Controller("hController")
public class HotelController {
	@Autowired
	private HotelServiceImpl serviceImpl;

	public List<Hotel> getHotelInfoByCityName(String city1, String city2, String city3) throws Exception {
		List<Hotel> hotelInfoByCityName = serviceImpl.getHotelInfoByCityName(city1, city2, city3);

		return hotelInfoByCityName;
	}
}
