package model.persons;

import model.schedules.Roster;

import java.time.LocalDate;

public class Medic extends Employee {

    // A counter for all the examinations that a Medic has carried out. For statistic purposes.
    private int examCounter = 0;

    public Medic(String firstname, String lastname, LocalDate dateOfBirth, Address address, int staffID, String email, String phone, Roster roster) {
        super(firstname, lastname, dateOfBirth, address, staffID, email, phone, roster);
        examCounter = 0;
    }

    public int getExamCounter() {
        return examCounter;
    }

    public void increaseExamCounter() {
        examCounter += 1;
    }

    @Override
    public String toString() {
        return "[Medic] " + super.toString() + " | Total examinations: " + examCounter + ".";
    }
}
