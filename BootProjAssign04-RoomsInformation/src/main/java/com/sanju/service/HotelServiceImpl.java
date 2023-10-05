package com.sanju.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanju.dao.HotelInfoDAOImpl;
import com.sanju.model.Hotel;

@Service("hService")
public class HotelServiceImpl implements IHotelService {
	@Autowired
	HotelInfoDAOImpl infoDAOImpl;

	@Override
	public List<Hotel> getHotelInfoByCityName(String city1, String city2, String city3) throws Exception {

		List<Hotel> hotelInfoByCityName = infoDAOImpl.getHotelInfoByCityName(city1, city2, city3);
		return hotelInfoByCityName;
	}
}
