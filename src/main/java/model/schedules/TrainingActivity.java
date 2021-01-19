package model.schedules;

import model.persons.Employee;
import java.time.LocalDateTime;

abstract class TrainingActivity {

    private final Employee employee;
    private String trainingType;
    private String trainingPlace;
    private final LocalDateTime dateStart;
    private final LocalDateTime dateEnd;

    public TrainingActivity(Employee employee, String trainingType, String trainingPlace, LocalDateTime dateStart, LocalDateTime dateEnd) {
        this.employee = employee;
        this.trainingType = trainingType;
        this.trainingPlace = trainingPlace;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
    }

    public Employee getEmployee() {
        return employee;
    }

    public String getTrainingType() {
        return trainingType;
    }

    public void setTrainingType(String trainingType) {
        this.trainingType = trainingType;
    }

    public String getTrainingPlace() {
        return trainingPlace;
    }

    public void setTrainingPlace(String trainingPlace) {
        this.trainingPlace = trainingPlace;
    }

    public LocalDateTime getDateStart() {
        return dateStart;
    }

    public LocalDateTime getDateEnd() {
        return dateEnd;
    }

}
