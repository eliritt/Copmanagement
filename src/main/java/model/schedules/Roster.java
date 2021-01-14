package model.schedules;

import java.util.ArrayList;
import java.util.List;

import model.events.Training;
//Roster  beudeutet Dienstplan
public class Roster {
	private int diffHours, diffVacation;
	private final List<String> tasks; // should show open Tasks from colleague
	private final List<Training>openTrainings; // Get data from Class Training
	private final List<String> timetable; // should show when shift starts and ends
	
	public Roster(int diffHours, int diffVacation) {
		this.diffHours = diffHours;
		this.diffVacation = diffVacation;
		tasks = new ArrayList<>();
		openTrainings = new ArrayList<>();
		timetable = new ArrayList<>();		
	}

	private int getDiffHours() {
		return diffHours;
	}

	private void setDiffHours(int diffHours) {
		this.diffHours = diffHours;
	}

	private int getDiffVacation() {
		return diffVacation;
	}

	private void setDiffVacation(int diffVacation) {
		this.diffVacation = diffVacation;
	}
	
	public List<String> getTasks() {
		return tasks;
	}

	public List<Training> getOpenTrainings() {
		return openTrainings;
	}

	public List<String> getTimetable() {
		return timetable;
	}

	@Override
	public String toString() {
		return "Dienstplan [diffHours=" + diffHours + ", diffVacation=" + diffVacation + ", tasks=" + tasks
				+ ", openTrainings=" + openTrainings + ", timetable=" + timetable + "]";
	}
	
	

}
