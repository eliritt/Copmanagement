package model.schedules;

import java.util.ArrayList;


public class FieldStaffRoster extends Roster {
	
	public String partner;
	public String car;
	public String area;
	
	
	public FieldStaffRoster(int diffHours, int diffVacation, ArrayList tasks, ArrayList openTrainings, ArrayList timetable, String partner, String car, String area) {
		super(diffHours, diffVacation, tasks, openTrainings, timetable);
		
		this.partner = partner;
		this.car = car;
		this.area = area;
	}

	
}
