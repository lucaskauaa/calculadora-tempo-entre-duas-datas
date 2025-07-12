package util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeCalculator {
	
	public static void calculateDateTime(String startDate, String endDate) {
		startDate = startDate.trim();
		endDate = endDate.trim();
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate date01 = LocalDate.parse(startDate, dateTimeFormatter);
		
		LocalDate date02 = LocalDate.parse(endDate, dateTimeFormatter);
	}
	
	public static void calculateDateTime(String startDate, String startTime, String endDate, String endTime) {
		startDate = startDate.trim();
		startTime = startTime.trim();
		endDate = endDate.trim();
		endTime = endTime.trim();
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDateTime dateTime01 = LocalDateTime.parse(startDate + " " + startTime, dateTimeFormatter);
		
		LocalDateTime dateTime02 = LocalDateTime.parse(endDate + " " + endTime, dateTimeFormatter);
	}
	
//	public static void calculate (LocalDateTime startDateTime, LocalDateTime endDateTime) {
//		
//		
//	}
}
