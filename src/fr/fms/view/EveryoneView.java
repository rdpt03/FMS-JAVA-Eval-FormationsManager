package fr.fms.view;

import java.util.List;
import java.util.Scanner;

import fr.fms.Helper;
import fr.fms.entities.Training;

public class EveryoneView {
	public static void mainMenu(Scanner sc, List<Training> trainingList) {
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
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
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
