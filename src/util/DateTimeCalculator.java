package util;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateTimeCalculator {
	
	public static void calculateDateTime(String startDate, String endDate) {
		startDate = startDate.trim();
		endDate = endDate.trim();
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDate date01 = LocalDate.parse(startDate, dateTimeFormatter);
		
		LocalDate date02 = LocalDate.parse(endDate, dateTimeFormatter);
		
		calculate(date01.atStartOfDay(), date02.atStartOfDay());
	}
	
	public static void calculateDateTime(String startDate, String startTime, String endDate, String endTime) {
		startDate = startDate.trim();
		startTime = startTime.trim();
		endDate = endDate.trim();
		endTime = endTime.trim();
		
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		LocalDateTime dateTime01 = LocalDateTime.parse(startDate + " " + startTime, dateTimeFormatter);
		
		LocalDateTime dateTime02 = LocalDateTime.parse(endDate + " " + endTime, dateTimeFormatter);
		
		calculate(dateTime01, dateTime02);
	}
	
	private static void calculate (LocalDateTime startDateTime, LocalDateTime endDateTime) {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println();
		System.out.println("==============================================");
		System.out.println("Data inicial: " + startDateTime.format(dateTimeFormatter));
		System.out.println("Data final: " + endDateTime.format(dateTimeFormatter));
		
		LocalDate startDate = startDateTime.toLocalDate();
		LocalDate endDate = endDateTime.toLocalDate();
		
		Period period = Period.between(startDate, endDate);
		
		System.out.println();
		System.out.println("Tempo percorrido: " + period.getYears() + " anos, " + period.getMonths() + " meses e " + period.getDays() + " dias.");
		
		Duration duration = Duration.between(startDateTime, endDateTime);
		
		System.out.println();
		System.out.println(duration.toHours() + " horas");
		System.out.println(duration.toDays() + " dias");
		System.out.println(duration.toDays() / 7 + " semanas");
		System.out.println(duration.toDays() / 30 + " meses aproximadamente");
		System.out.println(period.getYears() + " anos");
		
	}
}
