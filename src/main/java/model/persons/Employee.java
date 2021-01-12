package model.persons;

import model.schedules.Roster;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Employee extends Person {
    private final int staffID;
    private String email;
    private String phone;
    private Roster roster;
    private static final Set<Employee> employeeDB = new HashSet<>();

    public Employee(String firstname, String lastname, LocalDate dateOfBirth, Address address, int staffID,
                    String email, String phone, Roster roster) {
        super(firstname, lastname, dateOfBirth, address);
        this.staffID = staffID;
        this.email = email;
        this.phone = phone;
        this.roster = roster;
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

    public static Set<Employee> getEmployeeDB() {
        return employeeDB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return staffID == employee.staffID;
    }

}
