package controller.schedules;

import java.util.ArrayList;
//Roster  beudeutet Dienstplan
public class Roster {
	private int diffHours, diffVacation;
	protected ArrayList tasks, openTrainings;
	protected ArrayList timetable;
	
	public Roster(int diffHours, int diffVacation, ArrayList tasks, ArrayList openTrainings, ArrayList timetable) {
		
		this.diffHours = diffHours;
		this.diffVacation = diffVacation;
		this.tasks = tasks;
		this.openTrainings = openTrainings;
		this.timetable = timetable;
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

	private ArrayList getTasks() {
		return tasks;
	}

	private void setTasks(ArrayList tasks) {
		this.tasks = tasks;
	}

	private ArrayList getOpenTrainings() {
		return openTrainings;
	}

	private void setOpenTrainings(ArrayList openTrainings) {
		this.openTrainings = openTrainings;
	}

	private ArrayList getTimetable() {
		return timetable;
	}

	private void setTimetable(ArrayList timetable) {
		this.timetable = timetable;
	}

	@Override
	public String toString() {
		return "Dienstplan [diffHours=" + diffHours + ", diffVacation=" + diffVacation + ", tasks=" + tasks
				+ ", openTrainings=" + openTrainings + ", timetable=" + timetable + "]";
	}
	
	

}
