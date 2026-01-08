package fr.fms.view;

import java.util.List;
import java.util.Scanner;

import fr.fms.Helper;
import fr.fms.daos.TrainingDAO;
import fr.fms.entities.Training;

public class EveryoneView {
	public static void mainMenu(Scanner sc, TrainingDAO trainingDao) {
		boolean mainMenuRunning = true;
		while(mainMenuRunning) {
			System.out.println(Helper.repeatString("-", 30));
			System.out.println("1 - Afficher toutes les formations");
			System.out.println("2 - Filtrer par mot clé");
			System.out.println("3 - Afficher les formations en presentiel");
			System.out.println("4 - Afficher les formations en distanciel");
			System.out.println("5 - Fermer le programme");
			System.out.println(Helper.repeatString("-", 30));

			//choose
			int option = Helper.askInt(sc, "Choisir une option", true);

			//handle
			switch (option) {
				/*Option 1 : print all */
				case 1:
					for(Training t : trainingDao.getAllTrainings()){
						System.out.println(t.btShow());
					}
					break;
				/*Option 2 : filter by word */
				case 2:
					System.out.println("Inserer le mot clé pour effectuer une recherche : ");
					String keyword = sc.nextLine();
					for(Training t : trainingDao.getTrainingsByKeyword(keyword)){
						System.out.println(t.btShow());
					}
					break;
				case 3:
				/*Option 3 : print only insite */
					for(Training t : trainingDao.getAllTrainings()){
						if(t.isInPerson()) {
							System.out.println(t.btShow());
						}
					}
					break;
				/*Option 4 : print only remote */
				case 4:
					for(Training t : trainingDao.getAllTrainings()){
						if(t.isRemotely()) {
							System.out.println(t.btShow());
						}
					}
					break;
				/*Option 4 : exit*/
				case 5:
					System.out.println("À bientot!");
					mainMenuRunning = false;
					break;
				default:
					System.out.println("Option incorrecte");
			}
		}
	}
}
