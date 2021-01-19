package model.persons;

import java.time.LocalDate;
import java.util.ArrayList;

import model.schedules.Roster;


public class FieldOfficer extends Employee {
	
	public String partner;
	public String car;
	public String area;
	
	public FieldOfficer(String firstname, String lastname, LocalDate dateOfBirth, Address address, int staffID,
			String email, String phone, Roster roster) {
		super(firstname, lastname, dateOfBirth, address, staffID, email, phone, roster);

	}

	public String getPartner() {
		return partner;
	}

	public void setPartner(String partner) {
		this.partner = partner;
	}

	public String getCar() {
		return car;
	}

	public void setCar(String car) {
		this.car = car;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
}
