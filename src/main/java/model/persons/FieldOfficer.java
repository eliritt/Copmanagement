package model.persons;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.events.Examination;
import model.events.Training;
import model.schedules.Roster;


public class FieldOfficer extends Employee {
	// Class for fieldofficer
	
	private String rank;
	private List<Training> trainings;
	private List<Examination> educations;
	// educations ist nicht vorhanden!!
	
	
	public FieldOfficer(String firstname, String lastname, LocalDate dateOfBirth, Address address, int staffID,
			String email, String phone, Roster roster, String rank, List<Training> trainings,
			List<Examination> educations) {
		super(firstname, lastname, dateOfBirth, address, staffID, email, phone, roster);
		this.rank = rank;
		this.trainings = trainings;
		this.educations = educations;
	}


	public String getRank() {
		return rank;
	}


	public void setRank(String rank) {
		this.rank = rank;
	}


	public List<Training> getTrainings() {
		return trainings;
	}


	public void setTrainings(List<Training> trainings) {
		this.trainings = trainings;
	}


	public List<Examination> getEducations() {
		return educations;
	}


	public void setEducations(List<Examination> educations) {
		this.educations = educations;
	}
	
}
