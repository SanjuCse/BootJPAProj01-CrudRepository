package com.sanju.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hotel {
	private String hotelName;
	private Integer noOfRoom;
	private String hotelLocation;
	private Double roomChargesPerDay;
}
