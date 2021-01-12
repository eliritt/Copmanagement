package model.persons;

import model.schedules.Roster;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Employee extends Person {
    private static final Set<Employee> employeeDB = new HashSet<>();
    private final int staffID;
    private String email;
    private String phone;
    private Roster roster;

    public Employee(String firstname, String lastname, LocalDate dateOfBirth, Address address, int staffID,
                    String email, String phone, Roster roster) {
        super(firstname, lastname, dateOfBirth, address);
        this.staffID = staffID;
        this.email = email;
        this.phone = phone;
        this.roster = roster;
    }

    public static void insertEmployee(Employee employee) {
        employeeDB.add(employee);
    }

    public static Employee getEmployeeFromDB(int staffID) {
        for (Employee employee : employeeDB) {
            if (employee.staffID == staffID) {
                return employee;
            }
        }
        return null;
    }

    public int getStaffID() {
        return staffID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Roster getRoster() {
        return roster;
    }

    public void setRoster(Roster roster) {
        this.roster = roster;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return staffID == employee.staffID;
    }

}
