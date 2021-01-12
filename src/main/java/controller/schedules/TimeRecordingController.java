package controller.schedules;

import model.persons.Employee;
import model.schedules.TimeRecording;

import java.time.LocalDateTime;
import java.util.List;

public class TimeRecordingController {
    private final List<TimeRecording> timeRecordings = TimeRecording.getTimeRecordings();

    public void comeIn(Employee employee, boolean isOnVacation, boolean isSick, LocalDateTime date, int workingTime) {
        timeRecordings.add(new TimeRecording(employee, isOnVacation, isSick, date, workingTime));
    }

    public TimeRecording getTimeRecording(Employee employee) {
        for (TimeRecording recording : timeRecordings) {
            if (recording.getEmployee().getStaffID() == employee.getStaffID()) {
                return recording;
            }
        }
        return null;
    }
}
