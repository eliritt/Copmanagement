package view;

import controller.employee.EmployeeController;
import controller.schedules.TimeRecordingController;
import model.persons.Address;
import model.persons.Employee;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Console {
    public static void main(String[] args) {
        EmployeeController employeeController = new EmployeeController();
        // test login
        employeeController.insertEmployee(new Employee("Karl", "Nehammer", LocalDate.of(1958, 1, 1),
                new Address(4020, "3B", "Linz", "Peter-Behrens-Platz"), 123, "aaa@bbb.com", "+4312345", null));
        Employee employee = employeeController.getEmployeeFromDB(123);

        TimeRecordingController timeRecording = new TimeRecordingController();
        // clock in
        timeRecording.comeIn(employee, false, false, LocalDateTime.now(), 8);

        System.out.println(timeRecording.getTimeRecording(employee));
    }
}
