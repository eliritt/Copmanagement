package view;

import java.util.Scanner;
import controller.employee.*;
import controller.schedules.Roster;
import model.persons.Employee;
import model.schedules.*;

public class ConsoleRoster {

	public static void main(String[] args) {
		
		dialog();
	}
	
	public static void dialog() {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("##################################");
		System.out.println("""
				Please make your choice:
				+ 1. Create a new Roster: 
				+ 2. Show current Roster:
				+ 3. Update Roster:
				""");
		System.out.println("##################################");
		System.out.println("Your input:");
		int input = scan.nextInt();
		scan.nextLine();	
	
	
		switch(input) {
			case 1:
			// Call Constuctor controler.Rooster
				create();
			dialog();
			case 2:
			// View all entered values
			dialog();
			case 3:
			// Methode to update rooster
		}
	}
	
	public static void create() {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Choose employee:");
		EmployeeController out = new EmployeeController();
		System.out.println(out.getEmployeeDB());
		
		int idnr = scan.nextInt();
		// loop thrue EmployeeDB
		//System.out.println("Die Eingabe " + idnr);
		for (Employee id : out.getEmployeeDB()) {
			if(id.getStaffID() == idnr){
				System.out.println("Is Employee" + idnr +"in vacation? : () Yes = 1 no = 0");
				boolean vacation = scan.hasNext();
				System.out.println("Is Employee" + idnr +"sick ? : () Yes = 1 no = 0");
				boolean sick = scan.nextBoolean();
				System.out.println("Please enter the working time : ");
				int workingtime = scan.nextInt();
	
				Roster roster = new Roster(id,vacation,sick,workingtime);
				//System.out.println("gefunden");
											
			}
			else {
				System.out.println("Der Mitarbeiter ist nicht verfÃ¼gbar");
			}
		}
		
	}
	
}
