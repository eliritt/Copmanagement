package controller.medic;

import model.events.Examination;
import model.persons.Employee;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class MedicController {

//  TODO Change "Employees" in each method to the according data type (policemen in field)

    //  Pending Exams: Exams that are not completed (outstanding exams)
//  Completed Exams: Exams that are completed and closed (exams in the past; stored for statistic purposes?)
    private final List<Examination> pendingExamDates = new ArrayList<>();
    private final List<Examination> completedExamDates = new ArrayList<>();

    //  Template for output of date and time:
    private final DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd kk:mm");

    public MedicController() {
        System.out.println("[Medic] Controller initialised");
    }

    public void createExamination(String name, LocalDateTime date) {
        System.out.println("[Medic] *** EXAMINATION SCHEDULED SUCCESSFULLY ***");
        System.out.println("[Medic] Description: " + name + " | scheduled at: " + date.format(dateFormat) + ".");

        pendingExamDates.add(new Examination(name, date));
        System.out.println("[Medic] Redirecting you to main menu.\n");
    }

    public void cancelExamination(LocalDateTime date) {
        boolean success = false;
        for (int i = 0; i < pendingExamDates.size(); i++) {
            if (pendingExamDates.get(i).getExamDate().equals(date)) {
                System.out.println("[Medic] *** EXAMINATION CANCELLED SUCCESSFULLY ***");
                System.out.println("[Medic] Description: " + pendingExamDates.get(i).getExamName() + " | scheduled at: " + pendingExamDates.get(i).getExamDate().format(dateFormat) + ".\n");
                pendingExamDates.remove(i);
                success = true;
                break;
            }
        }
        if(!success) {
            System.out.println("[Medic] *** NO EXAMINATION WAS FOUND TO CANCEL! CHECK IF DATE IS CORRECT AND RETRY? ***\n");
        }

    }

    public void showAllExaminations() {
        System.out.println("[*] Examination overview: ");
        for (Examination e : pendingExamDates) {
            System.out.println("[*] Examination ID: " + e.getExamID() + " | Name/Description: " + e.getExamName() + " | Date: " + e.getExamDate().format(dateFormat) + ".\n");
        }
    }

    public void showParticipants(LocalDateTime dateOfExamination) {
        System.out.println("[Examination] Listing participants for examination, scheduled at: " + dateOfExamination.format(dateFormat) + ".");
//      TODO implement method
    }

    //  Confirm the yearly examination for an employee (for HR department)
    public void confirmExaminationForEmployee(Employee emp) {
//		TODO implement method

    }

    //  Method is intended to set an Exam to finished
    public void completeExamination(Examination e, Employee emp) {
//		TODO Change "Employee" to the according class for policemen in field
//      TODO Complete exam => remove from pending exams, add it to completed exam list
    }

    //  Generate a medical attest for an employee (passed exam/not passed)
    public void generateAttest(Examination e, Employee emp) {
//		TODO Change "Employee" to the according class for policemen in field
    }

    public void generateListing() {
//      TODO listing of participants as pdf-file to print
    }
}
