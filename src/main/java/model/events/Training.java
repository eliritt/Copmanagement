package model.events;

import java.time.LocalDateTime;

import model.persons.Trainer;

public class Training {
	private final int trainingID;
	private String name;
	private String description;
	private Trainer trainer;
	private LocalDateTime dateTime;
	private String place;
	private int maxParticipants;
	private String requirements;
	
	public Training(int trainingID, String name, String description, LocalDateTime dateTime, String place,
			int maxParticipants, String requirements) {
		this.trainingID = trainingID;
		this.name = name;
		this.description = description;
		this.dateTime = dateTime;
		this.place = place;
		this.maxParticipants = maxParticipants;
		this.requirements = requirements;
	}
	
	public int getTrainingID() {
		return trainingID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public int getMaxParticipants() {
		return maxParticipants;
	}

	public void setMaxParticipants(int maxParticipants) {
		this.maxParticipants = maxParticipants;
	}

	public String getRequirements() {
		return requirements;
	}

	public void setRequirements(String requirements) {
		this.requirements = requirements;
	}

	public Trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}	
}