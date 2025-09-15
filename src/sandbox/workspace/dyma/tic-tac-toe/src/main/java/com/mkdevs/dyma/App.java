package com.mkdevs.dyma;

import main.java.com.mkdevs.dyma.games.TicTacToe;

/**
 * Tic Tac Toe App
 */
public class App {
    public static void main(String[] args) {
        
        try {
            // Initialize the Tic Tac Toe game
            TicTacToe ticTacToeGame = new TicTacToe();
            // Print the initial state of the game
            System.out.println(ticTacToeGame);

            while (true) {
                // Game loop 
                ticTacToeGame.playTurn();
                System.out.println(ticTacToeGame);
                if (ticTacToeGame.isGameOver()) {
                    System.out.println("Game Over!");
                    if (ticTacToeGame.getWinner() != TicTacToe.EMPTY) {
                        System.out.println("Player " + ticTacToeGame.getWinner() + " wins!");
                    } else {
                        System.out.println("It's a draw!");
                    }
                    if (ticTacToeGame.playAgain()) {
                        ticTacToeGame.resetGame();
                        System.out.println("Starting a new game!");
                        System.out.println(ticTacToeGame);
                    } else {
                        System.out.println("Thanks for playing!");
                        break;
                    }
                }
                // Switch player
                ticTacToeGame.switchPlayer();
                
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("An error occurred while running the Tic Tac Toe game.");
        }

    }
}
