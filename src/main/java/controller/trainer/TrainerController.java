package controller.trainer;

import java.time.LocalDateTime;

import model.events.Training;
import model.persons.Trainer;

public class TrainerController {
	
	public static int trainingID = 1;
    
	public static void createTraining(String name, String description, LocalDateTime dateTime, String place,
			int maxParticipants, String requirements) {
		
    	Training training = new Training(trainingID++, name, description, dateTime, place, maxParticipants, requirements);
    	Training.trainings.add(training);
    }
}