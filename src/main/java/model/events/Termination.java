package model.events;

import model.persons.Employee;

public class Termination {

    private final Employee employee;
    private Boolean isPresent;
    private final String leavingReason;

    public Termination(Employee employee, Boolean isPresent, String leavingReason) {
        this.employee = employee;
        this.isPresent = isPresent;
        this.leavingReason = leavingReason;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Boolean getPresent() {
        return isPresent;
    }

    public void setPresent(Boolean present) {
        isPresent = present;
    }

    public String getLeavingReason() {
        return leavingReason;
    }
}
