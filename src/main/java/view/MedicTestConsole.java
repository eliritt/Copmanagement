package view;

import controller.medic.MedicController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MedicTestConsole {
    //    Class is intended to test the "medic" branch and will be removed afterwards
    private final DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd kk:mm");

    MedicController controller = new MedicController();

    public void dialog() {
        Scanner userInput = new Scanner(System.in);

        System.out.println("[+] Hi Doc. What do you want to do?");
        System.out.println("[+] Please choose one of the following options:");
        System.out.println("[+] 1. Schedule new examination | 2. Show all scheduled examinations | 3. Cancel an examination");
        System.out.println("[+] 4. Generate a participant list | 5. Confirm participation for an employee");
        System.out.println("[+] 6. Generate an attest for an employee | 7. Show completed examinations");

        int choice = userInput.nextInt();
        userInput.nextLine();

        switch (choice) {
            case 1:
                System.out.println("[+] *** SCHEDULE NEW EXAMINATION ***");
                System.out.println("[+] Please type the name of the exam below: ");
                String examName = userInput.nextLine();
                System.out.println("[+] Please type the date of the exam below: (!! use format: yyyy-MM-dd hh:mm !!)");
                String examDateStr = userInput.nextLine();
                LocalDateTime examDate = LocalDateTime.parse(examDateStr, dateFormat);
                controller.createExamination(examName, examDate);
                dialog();
            case 2:
                System.out.println("[+] *** EXAMINATION OVERVIEW ***");
                System.out.println("[+] Displaying all scheduled examinations: ");
                controller.showAllExaminations();
                dialog();
            case 3:
                System.out.println("[+] *** CANCEL EXAMINATION ***");
                System.out.println("[+] Which exam do you want to cancel? Type date below: (!! use format: yyyy-MM-dd hh:mm !!)");
                String cancelDateStr = userInput.nextLine();
                LocalDateTime cancelDate = LocalDateTime.parse(cancelDateStr, dateFormat);
                controller.cancelExamination(cancelDate);
                dialog();
            case 4:
                System.out.println("[+] *** EXAM PARTICIPANT LIST ***");
                System.out.println("[+] Please enter the date of the exam:");
                String eDate = userInput.nextLine();
                controller.showParticipants(LocalDateTime.parse(eDate, DateTimeFormatter.ofPattern("yyyy-MM-dd kk:mm")));
                dialog();
            case 7:
                System.out.println("*** PRINTING COMPLETED EXAMS ***");
                controller.showCompletedExaminations();
                dialog();
            default:
                System.out.println("[+] No valid choice. Back to main menu.");
                break;
            // TODO Add the outstanding cases above
        }

    }

}
