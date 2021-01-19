package model.persons;

import model.schedules.Roster;

import java.time.LocalDate;

public class Trainer extends Employee {
	
	private String specialisation;

	public Trainer(String firstname, String lastname, LocalDate dateOfBirth, Address address, int staffID, String email, String phone, Roster roster, String specialisation) {
		super(firstname, lastname, dateOfBirth, address, staffID, email, phone, roster);
		specialisation = this.specialisation;
	}

	public String getSpecialisation() {
		return specialisation;
	}
	
}
