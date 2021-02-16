package model.events;

import model.persons.FieldOfficer;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Examination {
    /*
     * Unfortunately, examID must be assigned manually. The reason is that data is not persistently stored in a database, and each time
     * the program is closed, data will get lost. Therefore it is easier to define the ID manually.
     */
    private final int examID;
    private final String examName;
    private LocalDateTime examDate;

    private final Set<FieldOfficer> participants = new HashSet<>();

    public Examination(int id, String name, LocalDateTime date) {
        examID = id;
        examName = name;
        examDate = date;
    }

    public int getExamID() {
        return examID;
    }

    public String getExamName() {
        return examName;
    }

    public LocalDateTime getExamDate() {
        return examDate;
    }

    public Set<FieldOfficer> getParticipants() {
        return participants;
    }

    public int getParticipantCount() {
        return participants.size();
    }

    /**
     * Adds an employee to the participants.
     *
     * @param emp The Employee object.
     */
    public void addParticipant(FieldOfficer emp) {
        participants.add(emp);
        System.out.println("[Examination] Added employee to exam participants: ");
        System.out.println("[Examination] " + emp.toString() + ".");
    }

    /**
     * Removes an employee from the participants.
     *
     * @param emp The Employee object.
     */
    public void removeParticipant(FieldOfficer emp) {
        participants.remove(emp);
        System.out.println("[Examination] Removed employee from exam participants.");
        System.out.println("[Examination] " + emp.toString() + ".");
    }

    /**
     * Allows to change the date of the scheduled examination.
     *
     * @param newDate The new date of the examination.
     */
    public void setExamDate(LocalDateTime newDate) {
        examDate = newDate;
        System.out.println("[*] Date of examination was set successfully.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Examination that = (Examination) o;
        return examID == that.examID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(examID);
    }


}
