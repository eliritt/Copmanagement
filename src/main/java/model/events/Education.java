package model.events;

import model.persons.Employee;
import model.persons.FieldOfficer;
import model.persons.Trainer;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class Education {

    private final int educationID;
    private String name;
    private String description;
    private Trainer lecturer;
    private LocalDateTime dateTime;
    private String place;
    private int maxParticipants;
    private String targetAudience;
    private static final Set<FieldOfficer> participants = new HashSet<>();

    public Education(int educationID, String name, String description, Trainer lecturer, LocalDateTime dateTime,
                     String place, int maxParticipants, String targetAudience) {
        this.educationID = educationID;
        this.name = name;
        this.description = description;
        this.lecturer = lecturer;
        this.dateTime = dateTime;
        this.place = place;
        this.maxParticipants = maxParticipants;
        this.targetAudience = targetAudience;
    }

    public int getEducationID() {
        return educationID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Trainer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Trainer lecturer) {
        this.lecturer = lecturer;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getMaxParticipants() {
        return maxParticipants;
    }

    public void setMaxParticipants(int maxParticipants) {
        this.maxParticipants = maxParticipants;
    }

    public String getTargetAudience() {
        return targetAudience;
    }

    public void setTargetAudience(String targetAudience) {
        this.targetAudience = targetAudience;
    }

    public static Set<FieldOfficer> getParticipants() {
        return participants;
    }

    @Override
    public String toString() {
        return "Education{" +
                "educationID=" + educationID +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", lecturer=" + lecturer +
                ", dateTime=" + dateTime +
                ", place='" + place + '\'' +
                ", maxParticipants=" + maxParticipants +
                ", targetAudience='" + targetAudience + '\'' +
                '}';
    }
}
