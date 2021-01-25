package model.persons;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.events.Examination;
import model.events.Training;
import model.schedules.Roster;
import model.events.*;


public class FieldOfficer extends Employee {
	// Class for fieldofficer

	private String rank;
	private List<Training> trainings = new ArrayList<Training>();
	private List<Examination> examinations = new ArrayList<Examination>();
	// educations ist nicht vorhanden!!


	public FieldOfficer(String firstname, String lastname, LocalDate dateOfBirth, Address address, int staffID,
						String email, String phone, Roster roster, String rank, List<Training> trainings,
						List<Examination> educations) {
		super(firstname, lastname, dateOfBirth, address, staffID, email, phone, roster);
		this.rank = rank;
		this.trainings = trainings;
		this.examinations = educations;
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
}



