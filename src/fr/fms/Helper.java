package fr.fms;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Helper {
	public static int askInt(Scanner scanner, String question, boolean negative) {
		while(true) {
			System.out.print(question+" : ");
			try {
				//get the number
				int chosenEntreeI = scanner.nextInt();
				System.out.println();	
				
				//if negative not available and user insert a negative : error
				if(!negative && chosenEntreeI < 0) {
					throw new Exception("Numero negatif non autorisé");
				}
				return chosenEntreeI;
			}
			//catch errors
			//not a number
			catch(InputMismatchException e) {
				System.out.println("[Erreur] Numero non valide");
				//spend the scanner token
				scanner.next();
			}
			//unknown error
			catch(Exception e) {
				System.out.println("[Erreur] "+e.getMessage());
			}
			
		}
	}
	
	

}
