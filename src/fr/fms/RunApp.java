package fr.fms;
import java.util.List;
import java.util.Scanner;

import fr.fms.daos.TrainingDAO;
import fr.fms.entities.Training;
import fr.fms.view.EveryoneView;

public class RunApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//get trainings from the DB
		TrainingDAO trainingDao = new TrainingDAO(); 
		List<Training> trainingList = trainingDao.getAllTrainings();

		//create scanner
		Scanner sc = new Scanner(System.in);
		//call main view
		EveryoneView.mainMenu(sc, trainingList);
	}

}
