package com.mkdevs.dyma.errors;

public class BlankInputException extends Exception {

    public BlankInputException(String message) {
        super(message);
    }

    public BlankInputException() {
        super("Input cannot be blank.");
    }
}
