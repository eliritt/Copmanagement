package controller.employee;

import model.persons.Employee;

import java.util.HashSet;
import java.util.Set;

public class EmployeeController {

    private static final Set<Employee> employeeDB = new HashSet<>();

    public void insertEmployee(Employee employee) {
        getEmployeeDB().add(employee);
    }

    public static Set<Employee> getEmployeeDB() {
        return employeeDB;
    }

    public Employee getEmployeeFromDB(int staffID) {
        for (Employee employee : getEmployeeDB()) {
            if (employee.getStaffID() == staffID) {
                return employee;
            }
        }
        return null;
    }
}
