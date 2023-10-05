package com.sanju.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component("hotel")
@ToString
public class Hotel {
	@Value("${hotel.id}")
	private Integer hotelID;
	@Value("${hotel.name}")
	private String hotelName;
	@Value("${hotel.addr}")
	private String hotelAddr;
	@Value("${hotel.contact}")
	private Integer hotelContact;

	@Value("${customer.name}")
	private String customerName;

	@Value("#{menu.dosa+ menu.itly+ menu.vadapaw + menu.poha}")
	private Double billAmount;

	
	@Value("${customer.discount}")
	private Double discount;

	@Value("#{hotel.billAmount - (hotel.billAmount*hotel.discount)/100.0}")
	private Double finalAmount;
	/*


	public String msg() {

		return "Hello " + customerName + "Your bill amount is " + billAmount + " and we offered discount of " + discount
				+ "Rs. and your final amount is " + finalAmount;
	}
	*/
	
	@Override
	public String toString() {
		return "Hotel [hotelID=" + hotelID + ", hotelName=" + hotelName + ", hotelAddr=" + hotelAddr + ", hotelContact="
				+ hotelContact + ", customerName=" + customerName + ", billAmount=" + billAmount + "]";
	}
	
}