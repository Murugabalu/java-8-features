package com.example.java8.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		
		int day = date.getDayOfMonth();
		int month = date.getMonthValue();
		int year = date.getYear();
		
		System.out.printf("%d-%d-%d", day, month, year);
		System.out.println();
		
		int hh = time.getHour();
		int mm = time.getMinute();
		int ss = time.getSecond();
		
		System.out.printf(String.format("%s:%d:%s", hh, mm, ss));
		System.out.println();
		
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		//Calculate my age
		LocalDate bday = LocalDate.of(1993, 6, 24);
		Period p = Period.between(bday, date);
		System.out.println();
		
		System.out.printf("Years: %d, Months: %d, Days: %d", p.getYears(), p.getMonths(), p.getDays());
		System.out.println();
		LocalDate dday = LocalDate.of(1993+60, 6, 24);
		p = Period.between(date, dday);
		
		System.out.printf("Years: %d, Months: %d, Days: %d", p.getYears(), p.getMonths(), p.getDays());
	}

}
