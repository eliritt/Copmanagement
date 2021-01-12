package model.events;

import model.persons.Employee;

public class Examination {
	private final int examID = 0; // auto increment?
	private String name, date;
	
//	TODO implement auto increment id method
	
	public Examination(String name, String date) {
//		TODO add id (auto increment function implemented)
		this.name = name;
		this.date = date;
	}
	
	public Employee[] getParticipants() {
		Employee[] participants = new Employee[1]; // just to get no errors
//		TODO change array size
		
		return participants;
	}
	
	public void generateListing() {
		// TODO listing of participants as pdf-file to print
	}
	
}
