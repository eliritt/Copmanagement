package model.persons;

import model.schedules.Roster;

import java.time.LocalDate;

public class Employee extends Person {
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

    @Override
    public String toString() {
        return "[Employee] First name = " + super.getFirstname() + " | Last name = " + super.getLastname() + " | DateOfBirth = " + super.getDateOfBirth() + " | Address = " + super.getAddress().toString() +
                " | StaffID = " + staffID + " | E-Mail = " + email + " | Phone = " + phone + " | Roster = " + roster + ".";
    }
}
