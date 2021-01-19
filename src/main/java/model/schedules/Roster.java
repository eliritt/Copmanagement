package model.schedules;

import java.util.List;

import model.events.Training;
import model.persons.Employee;
//Roster  beudeutet Dienstplan
public class Roster {

    private  Employee employee;
    private  boolean isOnVacation;
    private  boolean isSick;
    private  int workingTime;
    
    
	public Roster(Employee employee, boolean isOnVacation, boolean isSick, int workingTime) {
		super();
		this.employee = employee;
		this.isOnVacation = isOnVacation;
		this.isSick = isSick;
		this.workingTime = workingTime;
	}
}
