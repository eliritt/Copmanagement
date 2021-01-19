package model.schedules;

//Roster  beudeutet Dienstplan

public class Roster {
	// Class Roster
 
    private  boolean isOnVacation;
    private  boolean isSick;
    private int allocatedHours;
    private int actualHours;
    private int differenceHours;
    private int vacationdays;
    private int illnessHouresMonth;
    
    
	public Roster(boolean isOnVacation, boolean isSick, int allocatedHours, int actualHours, int differenceHours,
			int vacationdays, int illnessHouresMonth) {

		this.isOnVacation = isOnVacation;
		this.isSick = isSick;
		this.allocatedHours = allocatedHours;
		this.actualHours = actualHours;
		this.differenceHours = differenceHours;
		this.vacationdays = vacationdays;
		this.illnessHouresMonth = illnessHouresMonth;
	}


	public boolean isOnVacation() {
		return isOnVacation;
	}


	public void setOnVacation(boolean isOnVacation) {
		this.isOnVacation = isOnVacation;
	}


	public boolean isSick() {
		return isSick;
	}


	public void setSick(boolean isSick) {
		this.isSick = isSick;
	}


	public int getAllocatedHours() {
		return allocatedHours;
	}


	public void setAllocatedHours(int allocatedHours) {
		this.allocatedHours = allocatedHours;
	}


	public int getActualHours() {
		return actualHours;
	}


	public void setActualHours(int actualHours) {
		this.actualHours = actualHours;
	}


	public int getDifferenceHours() {
		return differenceHours;
	}


	public void setDifferenceHours(int differenceHours) {
		this.differenceHours = differenceHours;
	}


	public int getVacationdays() {
		return vacationdays;
	}


	public void setVacationdays(int vacationdays) {
		this.vacationdays = vacationdays;
	}


	public int getIllnessHouresMonth() {
		return illnessHouresMonth;
	}


	public void setIllnessHouresMonth(int illnessHouresMonth) {
		this.illnessHouresMonth = illnessHouresMonth;
	}


	@Override
	public String toString() {
		return "Roster [isOnVacation=" + isOnVacation + ", isSick=" + isSick + ", allocatedHours=" + allocatedHours
				+ ", actualHours=" + actualHours + ", differenceHours=" + differenceHours + ", vacationdays="
				+ vacationdays + ", illnessHouresMonth=" + illnessHouresMonth + "]";
	}
    
	
}
