package model.events;

import model.persons.Employee;
import java.time.LocalDateTime;

public class InductionPhase {

    private final Employee employee;
    private final String department;
    private final String trainingForm;
    private final LocalDateTime dateStart;
    private final LocalDateTime dateEnd;

    public InductionPhase(Employee employee, String department, String trainingForm, LocalDateTime dateStart, LocalDateTime dateEnd) {
        this.employee = employee;
        this.department = department;
        this.trainingForm = trainingForm;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
    }

    public Employee getEmployee() {
        return employee;
    }

    public String getDepartment() {
        return department;
    }

    public String getTrainingForm() {
        return trainingForm;
    }

    public LocalDateTime getDateStart() {
        return dateStart;
    }

    public LocalDateTime getDateEnd() {
        return dateEnd;
    }
}
