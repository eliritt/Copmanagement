package model.schedules;

import java.util.ArrayList;


public class FieldStaff extends Roster {
	
	public String partner;
	public String car;
	public String area;
	
	
	public FieldStaff(int diffHours, int diffVacation, ArrayList tasks, ArrayList openTrainings, ArrayList timetable, String Partner, String car, String area) {
		super(diffHours, diffVacation, tasks, openTrainings, timetable);
		// TODO Auto-generated constructor stub
		this.partner = partner;
		this.car = car;
		this.area = area;
	}

	
}
