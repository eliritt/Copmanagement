package controller.medic;

import model.events.Examination;
import model.persons.Employee;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MedicController {

//  TODO Change "Employees" in each method to the according data type (policemen in field)

    //  Pending Exams: Exams that are not completed (outstanding exams)
//  Completed Exams: Exams that are completed and closed (exams in the past; stored for statistic purposes?)
    private final List<Examination> pendingExamDates = new ArrayList<>();
    private final List<Examination> completedExamDates = new ArrayList<>();

    //  Template for output of date and time:
    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd kk:mm");

    public MedicController() {
        System.out.println("[Medic] Controller initialised");
    }

    public void createExamination(String name, LocalDateTime date) {
        System.out.println("[Medic] *** EXAMINATION SCHEDULED SUCCESSFULLY ***");
        System.out.println("[Medic] Description: " + name + " | scheduled at: " + date.format(DATE_FORMAT) + ".");

        pendingExamDates.add(new Examination(name, date));
        System.out.println("[Medic] Redirecting you to main menu.\n");
    }

    public void cancelExamination(LocalDateTime date) {
        boolean success = false;
        for (int i = 0; i < pendingExamDates.size(); i++) {
            if (pendingExamDates.get(i).getExamDate().equals(date)) {
                System.out.println("[Medic] *** EXAMINATION CANCELLED SUCCESSFULLY ***");
                System.out.println("[Medic] Description: " + pendingExamDates.get(i).getExamName() + " | scheduled at: " + pendingExamDates.get(i).getExamDate().format(DATE_FORMAT) + ".\n");
                pendingExamDates.remove(i);
                success = true;
                break;
            }
        }
        if(!success) {
            System.out.println("[Medic] *** NO EXAMINATION WAS FOUND TO CANCEL! CHECK IF DATE IS CORRECT AND RETRY? ***\n");
        }

    }

    /*
     * ********
     * findExam() methods below are for internal use to prevent replications in the code
     * ********
     */
    public Examination findExamByDate(LocalDateTime examDate, List<Examination> examList) {
        for (Examination e: examList) {
            if (e.getExamDate().equals(examDate)) {
                return e;
            }
        }
        System.out.println("[Medic] findExamByDate() -> Could not find examination with the given parameters");
        return null;
    }

    public Examination findExamByDate(String examDate, List<Examination> examList) {
        LocalDateTime tmpDate = LocalDateTime.parse(examDate, DATE_FORMAT);
        for (Examination e: examList) {
            if (e.getExamDate().equals(tmpDate)) {
                return e;
            }
        }
        System.out.println("[Medic] findExamByDate() -> Could not find examination with the given parameters");
        return null;
    }

    /*
     * ********
     * End of findExam() methods
     * ********
     */

    public void showAllExaminations() {
        System.out.println("[*] Examination overview: ");
        for (Examination e : pendingExamDates) {
            System.out.println("[*] Examination ID: " + e.getExamID() + " | Name/Description: " + e.getExamName() + " | Date: " + e.getExamDate().format(DATE_FORMAT) + ".\n");
        }
    }

    public void showParticipants(LocalDateTime dateOfExamination) {
        System.out.println("[Examination] Listing participants for examination, scheduled at: " + dateOfExamination.format(DATE_FORMAT) + ".");
        Set<Employee> participants = new HashSet<>();
        Examination tmpExam = findExamByDate(dateOfExamination, pendingExamDates);
        if(tmpExam != null) {
            participants = tmpExam.getParticipants();
            for (Employee e: participants) {
                System.out.println(e.toString()+"\n");
            }
        } else {
            System.out.println("[Examination] Failure: No exams found.\n");
        }

    }

    //  Confirm the yearly examination for an employee (for HR department)
    public void confirmExaminationForEmployee(Employee emp) {
//		TODO implement method

    }

    //  Method is intended to set an Exam to finished
    public void completeExamination(Examination e) {
//		TODO Change "Employee" to the according class for policemen in field
//      TODO Complete exam => remove from pending exams, add it to completed exam list
    }

    //  Generate a medical attest for an employee (in field) (passed exam/not passed)
    public void generateAttest(Examination e, Employee emp) {
//		TODO Change "Employee" to the according class for policemen in field
    }

    public void generateListing() {
//      TODO listing of participants as pdf-file to print
    }
}
