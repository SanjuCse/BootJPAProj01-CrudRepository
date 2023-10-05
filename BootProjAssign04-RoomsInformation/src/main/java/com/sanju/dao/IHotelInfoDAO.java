package com.sanju.dao;

import java.util.List;

import com.sanju.model.Hotel;

public interface IHotelInfoDAO {
	public List<Hotel> getHotelInfoByCityName(String city1, String city2, String city3) throws Exception;
}
