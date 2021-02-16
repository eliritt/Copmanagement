package model.persons;

import model.events.Examination;
import model.events.Training;
import model.schedules.Roster;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class FieldOfficer extends Employee {

    private String rank;
    private boolean examIsValid;
    private List<Training> trainings = new ArrayList<>();
    private Examination nextExam;
    // TODO Add educations

    public FieldOfficer(String firstname, String lastname, LocalDate dateOfBirth, Address address, int staffID,
                        String email, String phone, Roster roster, String rank, List<Training> trainings,
                        Examination nextExam) {
        super(firstname, lastname, dateOfBirth, address, staffID, email, phone, roster);
        this.rank = rank;
        this.trainings = trainings;
        this.nextExam = nextExam;
    }

    public boolean isExamValid() {
        return examIsValid;
    }

    public void setExamValidity(boolean value) {
        examIsValid = value;
    }

    public String getRank() {
        return rank;
    }


    public void setRank(String rank) {
        this.rank = rank;
    }


    public List<Training> getTrainings() {
        return trainings;
    }


    public void setTrainings(List<Training> trainings) {
        this.trainings = trainings;
    }

    public Examination getNextExamination() {
        return nextExam;
    }

    public void addExamination(Examination e) {
        nextExam = e;
    }

    public void removeExamination() {
        nextExam = null;
    }

}



