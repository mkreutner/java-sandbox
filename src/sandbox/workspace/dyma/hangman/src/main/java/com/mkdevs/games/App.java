package com.mkdevs.games;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Hangman Game
 *
 */
public class App 
{
    //#region Private methods
    /**
     * Return a random sentence to find
     * @return String
     * @throws FileNotFoundException
     * @throws IOException
     */
    private static String peekSentenceToGuess() throws FileNotFoundException, IOException {
        File file = new File("resources/words_list.txt");
        if (!file.exists()) {
            throw new FileNotFoundException("The file words_list.txt was not found");
        }
        Random random = new Random();
        int linesCounter;
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        ArrayList<String> wordsList = new ArrayList<String>();
        
        linesCounter = 0;
        String s;
        while ((s = bufferedReader.readLine()) != null) {
            wordsList.add(s);
            linesCounter++;        
        }
        bufferedReader.close();
        fileReader.close();

        return wordsList.get(random.nextInt(linesCounter));
    }

    private static char scanLetter() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.length() != 1) {
            System.out.println("Please enter a single letter");
            return scanLetter();
        }
        return input.charAt(0);
    }

    private static boolean playAgain() {
        System.out.println("Do you want to play again? (y/n)");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.length() != 1) {
            System.out.println("Please enter y or n");
            return playAgain();
        }
        char answer = input.charAt(0);
        if (answer == 'y' || answer == 'Y') {
            return true;
        } else if (answer == 'n' || answer == 'N') {
            return false;
        } else {
            System.out.println("Please enter y or n");
            return playAgain();
        }
    }
    //#endregion

    /**
     * Entry point
     * @param args
     */
    public static void main( String[] args ) throws FileNotFoundException, IOException
    {
        String wordToFind = peekSentenceToGuess(); 
        System.out.println( "Welcome to the Hangman Game" );
        System.out.println(String.format("The word to find is: %s", wordToFind));

        Hangman hangman = new Hangman(wordToFind, 500);
        System.out.println(String.format("You have %d lives", hangman.getNumberOfLives()));

        while (true) {
            System.out.println(hangman.getStatus());
            System.out.println("Please enter a letter:");
            char letter = scanLetter();
            if (hangman.tryLetter(letter) == true) {
                System.out.println(String.format("Good! The letter %c is in the word to find", letter));
            } else {
                System.out.println(String.format("Oops! The letter %c is not in the word to find", letter));
                System.out.println(String.format("You have %d lives left", hangman.getNumberOfLives()));
            }
            if (hangman.isWin()) {
                System.out.println(String.format("Congratulations! You found the word: %s", hangman.getWordToFind()));
                if (playAgain()) {
                    wordToFind = peekSentenceToGuess();
                    hangman.setWordToFind(wordToFind);
                    hangman.setNumberOfLives(hangman.MAX_LIVES);
                    System.out.println(String.format("The word to find is: %s", wordToFind));
                } else {
                    break;
                }
            }
            if (hangman.isGameOver()) {
                System.out.println(String.format("Game over! You lost. The word was: %s", hangman.getWordToFind()));
                if (playAgain()) {
                    wordToFind = peekSentenceToGuess();
                    hangman.setWordToFind(wordToFind);
                    hangman.setNumberOfLives(hangman.MAX_LIVES);
                    System.out.println(String.format("The word to find is: %s", wordToFind));
                } else {
                    break;
                } 
            }
        }
    }
}
