package com.mkdevs.games;


public class Hangman {

    final int MAX_LIVES = 20;

    private String wordToFind;
    private String blankWord;
    private int numberOfLives;

    public Hangman(String wordToFind) {
        this.wordToFind = wordToFind;
        this.blankWord = "_".repeat(wordToFind.length());
        this.numberOfLives = MAX_LIVES;
    }

    public Hangman(String wordToFind, int numberOfLives) {
        this.wordToFind = wordToFind;
        this.blankWord = "_".repeat(wordToFind.length());
        this.numberOfLives = Math.min(MAX_LIVES, numberOfLives);
    }

    public String getWordToFind() {
        return wordToFind;
    }

    public int getNumberOfLives() {
        return numberOfLives;
    }

    public Hangman setNumberOfLives(int numberOfLives) {
        this.numberOfLives = numberOfLives;
        return this;
    }

    public String getStatus() {
        return blankWord;
    }

    public boolean tryLetter(char letter) {
        boolean isLetterFound = false;
        StringBuilder newBlankWord = new StringBuilder(blankWord);

        for (int i = 0; i < wordToFind.length(); i++) {
            if (wordToFind.charAt(i) == letter) {
                newBlankWord.setCharAt(i, letter);
                isLetterFound = true;
            }
        }
        blankWord = newBlankWord.toString();
        if (!isLetterFound) {
            numberOfLives--;
        }

        return isLetterFound;
    }
    
    public boolean isGameOver() {
        return numberOfLives <= 0 && !blankWord.equals(wordToFind);
    }

    public boolean isWin() {
        return blankWord.equals(wordToFind);
    }    

}
