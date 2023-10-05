package com.sanju.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Repository;

import com.sanju.model.Hotel;

@Repository("hDAO")
public class HotelInfoDAOImpl implements IHotelInfoDAO {
	@Autowired
	private DataSource dataSource;

	private List<Hotel> hotels;
	private static final String GET_HOTEL_INFO_BY_CITY_NAME = "SELECT HOTEL_NAME, NO_OF_ROOM, HOTEL_LOCATION, ROOM_CHARGES_PER_DAY FROM HOTEL WHERE HOTEL_LOCATION IN (?,?,?) ORDER BY HOTEL_LOCATION";

	@Override
	public List<Hotel> getHotelInfoByCityName(String city1, String city2, String city3) throws Exception {
		try (Connection con = dataSource.getConnection();
				PreparedStatement pstmt = con.prepareStatement(GET_HOTEL_INFO_BY_CITY_NAME);) {
			pstmt.setString(1, city1);
			pstmt.setString(2, city2);
			pstmt.setString(3, city3);

			try (ResultSet resultSet = pstmt.executeQuery()) {
				hotels = new ArrayList<>();
				while (resultSet.next()) {
					Hotel hotel = new Hotel();
					hotel.setHotelName(resultSet.getString(1));
					hotel.setNoOfRoom(resultSet.getInt(2));
					hotel.setHotelLocation(resultSet.getString(3));
					hotel.setRoomChargesPerDay(resultSet.getDouble(4));

					hotels.add(hotel);
				}
			} catch (Exception e) {
				throw e;
			}

		} catch (Exception e) {
			throw e;
		}
		return hotels;
	}
}
