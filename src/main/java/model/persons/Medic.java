package model.persons;

import model.events.Examination;
import model.schedules.Roster;

import java.time.LocalDate;

public class Medic extends Employee {
	private final int examCounter = 0;

	public Medic(String firstname, String lastname, LocalDate dateOfBirth, Address address, int staffID, String email, String phone, Roster roster) {
		super(firstname, lastname, dateOfBirth, address, staffID, email, phone, roster);
	}


	public void createExamination() {

	}

	public void completeExamination() {
//		TODO stuff
//		this.examCounter++;
	}
	
	public void confirmExamination(Examination e, Employee emp) {
//		TODO Change "Employee" to the class for policemen in field
	}
	
	public void generateAttest(Examination e, Employee emp) {
//		TODO Change "Employee" to the class for policemen in field
	}
	
}
