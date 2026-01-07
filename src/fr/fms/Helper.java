package fr.fms;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Helper {
	/**
	 * Prompts the user to enter an integer from the console, with optional restriction on negative numbers.
	 * <p>
	 * The method will continue to ask the user until a valid integer is entered.  
	 * If negative numbers are not allowed and the user enters a negative integer, an error message is shown and the prompt repeats.  
	 * If the input is not a valid integer, an error message is shown and the prompt repeats.
	 * </p>
	 *
	 * @param scanner The Scanner object used to read user input from the console.
	 * @param question The message/question to display to the user before input.
	 * @param allowNegative If true, negative integers are allowed; if false, negative integers will trigger an error.
	 * @return The integer entered by the user that satisfies the constraints.
	 */
	public static int askInt(Scanner scanner, String question, boolean negative) {
		while(true) {
			System.out.print(question+" : ");
			try {
				//get the number
				int chosenEntreeI = scanner.nextInt();
				System.out.println();	
				
				//if negative not available and user insert a negative : error
				if(!negative && chosenEntreeI < 0) {
					throw new IllegalArgumentException("Numero negatif non autorisé");
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
	
	
	public static String repeatString(String s, int nOfTimes) {
	    if (nOfTimes < 1) {
	        throw new IllegalArgumentException("The number of times to repeat must be >= 1");
	    }

	    // Use StringBuilder for memory-efficient string concatenation
	    StringBuilder sb = new StringBuilder(s.length() * nOfTimes);
	    
	    for (int i = 0; i < nOfTimes; i++) {
	        sb.append(s); // append original string each iteration
	    }

	    return sb.toString(); // convert to String and return
	}
	

}
