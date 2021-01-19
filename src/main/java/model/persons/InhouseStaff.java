package model.persons;

import java.time.LocalDate;

import model.schedules.Roster;

public class InhouseStaff extends Employee{

	public InhouseStaff(String firstname, String lastname, LocalDate dateOfBirth, Address address, int staffID,
			String email, String phone, Roster roster) {
		super(firstname, lastname, dateOfBirth, address, staffID, email, phone, roster);

	}		
}
	

