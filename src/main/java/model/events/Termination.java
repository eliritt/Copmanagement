package model.events;

import model.persons.Employee;
import java.time.LocalDateTime;

public class Termination {

    private final Employee employee;
    private final String leavingReason;
    private final LocalDateTime dateEnd;

    public Termination(Employee employee, String leavingReason, LocalDateTime dateEnd) {
        this.employee = employee;
        this.leavingReason = leavingReason;
        this.dateEnd = dateEnd;
    }

    public Employee getEmployee() {
        return employee;
    }

    public String getLeavingReason() {
        return leavingReason;
    }

    public LocalDateTime getDateEnd() {
        return dateEnd;
    }
    
}
