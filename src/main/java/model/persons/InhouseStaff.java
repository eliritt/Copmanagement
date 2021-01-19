package model.persons;

import java.time.LocalDate;

import model.schedules.Roster;
//Class for Inhouse


public class InhouseStaff extends Employee{
	
	private String position;
	
	public InhouseStaff(String firstname, String lastname, LocalDate dateOfBirth, Address address, int staffID,
			String email, String phone, Roster roster) {
		super(firstname, lastname, dateOfBirth, address, staffID, email, phone, roster);
	
	}

	public String getPosition() {
		return position;
	}

	@Override
	public String toString() {
		return "InhouseStaff [position=" + position + "]";
	}
	
}
	

