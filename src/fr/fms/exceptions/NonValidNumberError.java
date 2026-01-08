package fr.fms.exceptions;

public class NonValidNumberError extends Exception {
    public NonValidNumberError() {
        super("Numero non valide");
    }

    public NonValidNumberError(String message) {
        super(message);
    }
}
