package model.events;

import model.persons.Employee;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class Examination {
	private int examID;
	private final String examName;
	private LocalDateTime examDate;

//	TODO Change Generic field "Employee" to employees that are field policemen (need exam every year)
	private final Set<Employee> participants = new HashSet<>();
	
	public Examination(String name, LocalDateTime date) {
		examID = incrementID();
		examName = name;
		examDate = date;
	}

	/**
	 * A Method that increments the examID automatically. Every exam that is created has an ID to identify it (primary key).
	 * @return The new (incremented) examID.
	 */
	private int incrementID() {	// method is private because it is only used inside this class
		examID += 1;
		return examID;
	}

	public int getExamID() {
		return examID;
	}

	public String getExamName() {
		return examName;
	}

	public LocalDateTime getExamDate() {
		return examDate;
	}

	public Set<Employee> getParticipants() {
		return participants;
	}

	/**
	 * Adds an employee to the participants.
	 * @param emp The Employee object.
	 */
	public void addParticipant(Employee emp) {
		participants.add(emp);
		System.out.println("[Examination] Added employee to exam participants: ");
		System.out.println("[Examination] +"emp.toString()+".");
	}

	/**
	 * Removes an employee from the participants.
	 * @param emp The Employee object.
	 */
	public void removeParticipant(Employee emp) {
		participants.remove(emp);
		System.out.println("[Examination] Removed employee from exam participants.");
		System.out.println("[Examination] +"emp.toString()+".");
	}

	/**
	 * Allows to change the date of the scheduled examination.
	 * @param newDate The new date of the examination.
	 */
	public void setExamDate(LocalDateTime newDate) {
		examDate = newDate;
		System.out.println("[*] Date of examination was set successfully.");
	}

}
