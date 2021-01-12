package model.schedules;

import model.persons.Employee;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

// TODO ist soll berechnen
public class TimeRecording {
    // instead of DB static list
    private static final List<TimeRecording> timeRecordings = new ArrayList<>();
    private final Employee employee;
    private final boolean isOnVacation;
    private final boolean isSick;
    private final LocalDateTime date;
    // TODO check for better solution
    // @see https://www.baeldung.com/java-add-hours-date
    private final int workingTime; // Sollzeit

    public TimeRecording(Employee employee, boolean isOnVacation, boolean isSick, LocalDateTime date, int workingTime) {
        this.employee = employee;
        this.isOnVacation = isOnVacation;
        this.isSick = isSick;
        this.date = date;
        this.workingTime = workingTime;
    }

    public static List<TimeRecording> getTimeRecordings() {
        return timeRecordings;
    }

    public Employee getEmployee() {
        return employee;
    }

    public boolean isOnVacation() {
        return isOnVacation;
    }

    public boolean isSick() {
        return isSick;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public int getWorkingTime() {
        return workingTime;
    }

    @Override
    public String toString() {
        return "TimeRecording{" +
                "employee=" + employee +
                ", isOnVacation=" + isOnVacation +
                ", isSick=" + isSick +
                ", date=" + date +
                ", workingTime=" + workingTime +
                '}';
    }
}
