package com.joda.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTest {
	public static void main(String[] args) {
//		LocalDate date = LocalDate.now();
//		System.out.println(date);
//		System.out.println("This year is -  " + date.getYear());
//		System.out.println("DayOfMonth -  " + date.getDayOfMonth());
//		System.out.println("DayOfYear -  " + date.getDayOfYear());
//		System.out.println("MonthValue - " + date.getMonthValue());
//		System.out.println("DayOfWeek - " + date.getDayOfWeek());
//		System.out.println("getEra - " + date.getEra());
//		System.out.println("getMonth - " + date.getMonth());

		LocalTime time = LocalTime.now();
		System.out.println("getHour -  " + time.getHour());
		System.out.println("getMinute -  " + time.getMinute());
		System.out.println("getSecond - " + time.getSecond());
		System.out.println("getNano -  " + time.getNano());

		LocalDateTime dateTime = LocalDateTime.now();
//		System.out.println(dateTime.get);
	}
}
