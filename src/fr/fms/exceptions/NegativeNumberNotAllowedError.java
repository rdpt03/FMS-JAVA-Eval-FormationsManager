package fr.fms.exceptions;

public class NegativeNumberNotAllowedError extends Exception {
    public NegativeNumberNotAllowedError() {
        super("Numero negatif non autorisé");
    }

    public NegativeNumberNotAllowedError(String message) {
        super(message);
    }
}
