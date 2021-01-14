package controller.trainer;

import java.time.LocalDateTime;

import model.events.Training;
import model.persons.Trainer;

public class TrainerController {
    
	public static void createTraining(int trainingID, String name, String description, Trainer trainer, LocalDateTime dateTime, String place,
			int maxParticipants, String requirements) {
		
    	Training training = new Training(trainingID, name, description, trainer, dateTime, place, maxParticipants, requirements);
    	Training.trainings.add(training);
    }
}