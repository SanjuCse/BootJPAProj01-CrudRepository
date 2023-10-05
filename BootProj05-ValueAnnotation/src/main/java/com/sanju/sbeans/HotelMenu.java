package com.sanju.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("menu")
//@Getter
public class HotelMenu {
	@Value("${menu.dosaPrice}")
	public Double dosa;

	@Value("${menu.itlyPrice}")
	public Double itly;

	@Value("${menu.vadapawPrice}")
	public Double vadapaw;

	@Value("${menu.pohaPrice}")
	public Double poha;

}
