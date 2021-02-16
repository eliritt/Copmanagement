package view;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TrainerConsole {
	
	private final DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd kk:mm");
	
	public static void dialog() {
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("Hello Mr. Trainer!");
		System.out.println("What would you like to do? Type one of the following numbers.");
		System.out.println("1. Schedule a new training | 2. Show a list of all participants");
		
		String trainerInput = myScanner.nextLine();
		int trainerChoice = Integer.parseInt(trainerInput);

		switch(trainerChoice) {
			case 1: System.out.println("You chose to create a new training!");
					System.out.println("Please enter the name of the training!");
					String trainingName = myScanner.nextLine();
					System.out.println("Please enter the description of the training!");
					String trainingDescription = myScanner.nextLine();
					System.out.println("Please enter date and time of the training (please like yyyy-MM-dd hh:mm)!");
					String trainingDateTimeStr = myScanner.nextLine();
					LocalDateTime trainingDateTime = LocalDateTime.parse(trainingDateTimeStr, dateFormat);
					System.out.println("Please enter the place of the training!");
					String trainingPlace = myScanner.nextLine();
					System.out.println("Please enter the number of max. Participants!");
					String trainingMaxParticipantsStr = myScanner.nextLine();
					int trainingMaxParticipants = Integer.parseInt(trainingMaxParticipantsStr);
					System.out.println("Please enter requirements for this training!");
					String trainingRequirements = myScanner.nextLine();
					
					controller.trainer.TrainerController.createTraining(trainingName, trainingDescription, trainingDateTime, trainingPlace, trainingMaxParticipants, trainingRequirements);
					System.out.println("Thank you for creating a new training!");
					break;
			case 2: System.out.println("You chose to show a list of trainings!");
					model.events.Training.getTrainings();
					break;

			default: System.out.println("Please try again and select a valid number!");
		}
	}
}
