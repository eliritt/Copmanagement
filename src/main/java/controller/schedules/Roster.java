package controller.schedules;

import java.time.LocalDate;


import model.persons.Address;
import model.persons.Employee;
//Roster  beudeutet Dienstplan
public class Roster {

	private  Employee employee;
    private  boolean isOnVacation;
    private  boolean isSick;
    private int workingTime;
	public Roster(Employee employee, boolean isOnVacation, boolean isSick, int workingTime) {
		super();
		this.employee = employee;
		this.isOnVacation = isOnVacation;
		this.isSick = isSick;
		this.workingTime = workingTime;
	}
    

   

}
