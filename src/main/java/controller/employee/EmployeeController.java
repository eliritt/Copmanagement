package controller.employee;

import model.persons.Employee;

public class EmployeeController {
    public void insertEmployee(Employee employee) {
        Employee.getEmployeeDB().add(employee);
    }

    public Employee getEmployeeFromDB(int staffID) {
        for (Employee employee : Employee.getEmployeeDB()) {
            if (employee.getStaffID() == staffID) {
                return employee;
            }
        }
        return null;
    }
}
