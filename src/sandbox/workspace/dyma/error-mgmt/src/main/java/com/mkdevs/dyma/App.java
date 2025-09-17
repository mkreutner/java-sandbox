package com.mkdevs.dyma;

import java.util.Scanner;

import com.mkdevs.dyma.errors.BlankInputException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        var chaine = "1234";
        var chaine2 = "abcd";

        try {
            var nombre = Integer.parseInt(chaine);
            System.out.println("Everything is fine " + nombre + " !");
            var nombre2 = Integer.parseInt(chaine2);
            System.out.println("Everything is fine " + nombre2 + " !");
        } catch (NumberFormatException e) {
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
        } finally {
            System.out.println("End of the program.");
        }

        try {
            var userInput = inputFromUser();
            System.out.println("User input is: " + userInput);
        } catch (BlankInputException e) {
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }

    private static String inputFromUser() throws BlankInputException {
        System.out.print("Enter something: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        if (input.isBlank()) {
            throw new BlankInputException();
        }
        return input;
    }
}
