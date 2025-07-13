package program;

import java.util.Scanner;

import util.DateTimeCalculator;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char repeat;
		
		do {
			System.out.println("Insira dia, mês e ano no formato dd/mm/aaaa");
			
			System.out.println();
			System.out.print("Data de início: ");
			String startDate = sc.nextLine();
					
			System.out.print("Data final: ");
			String endDate = sc.nextLine();
			
			System.out.println();
			System.out.print("Deseja incluir o horário? s/n ");
			char hasTime = sc.next().charAt(0);
			hasTime = Character.toLowerCase(hasTime);
			
			if (hasTime == 's') {
				System.out.println();
				System.out.println("Insira o horário no formato hh:mm");
				
				System.out.println();
				System.out.print("Horário da data de início: ");
				sc.nextLine();
				String startTime = sc.nextLine();
				
				System.out.print("Horário da data final: ");
				String endTime = sc.nextLine();
				
				DateTimeCalculator.calculateDateTime(startDate, startTime, endDate, endTime);
				
			} else {
				DateTimeCalculator.calculateDateTime(startDate, endDate);
			}
			
			System.out.println();
			System.out.print("Deseja repetir? s/n ");
			repeat = sc.next().charAt(0);
			repeat = Character.toLowerCase(repeat);
			sc.nextLine();
			System.out.println();
			
		} while (repeat == 's');
		
		sc.close();

	}

}
