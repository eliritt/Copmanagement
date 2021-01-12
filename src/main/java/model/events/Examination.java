package model.events;

import model.persons.Employee;

import java.time.LocalDateTime;

public class Examination {
	private final int examID = 0; // auto increment?
	private final String name;
	private final LocalDateTime date;
	
//	TODO implement auto increment id method
	
	public Examination(String name, LocalDateTime date) {
//		TODO add id (auto increment function implemented)
		this.name = name;
		this.date = date;
	}
	
	public Employee[] getParticipants() {
		Employee[] participants = new Employee[1]; // just to get no errors
//		TODO change to List
		
		return participants;
	}
	
	public void generateListing() {
		// TODO listing of participants as pdf-file to print
	}
	
}
