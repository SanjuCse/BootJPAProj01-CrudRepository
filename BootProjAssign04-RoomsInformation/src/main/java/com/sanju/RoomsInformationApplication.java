package com.sanju;

import java.sql.SQLException;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sanju.controller.HotelController;
import com.sanju.model.Hotel;

@SpringBootApplication
public class RoomsInformationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(RoomsInformationApplication.class, args);
		HotelController controller = context.getBean("hController", HotelController.class);
		try {
			List<Hotel> hotelInfoByCityName = controller.getHotelInfoByCityName("Bhubaneswar", "Berhampur", "Rourkela");
			hotelInfoByCityName.forEach(hotel -> {
				System.out.println(hotel);
			});
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Something went wrong with Database: " + e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Something went wrong with Application: " + e.getMessage());
		}
	}

}
