package main.java.com.mkdevs.dyma.games;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe implements AutoCloseable{

    public final static char PLAYER_1 = 'X';
    public final static char PLAYER_2 = 'O';
    public final static char EMPTY = '.';
    private char[][] board = { {EMPTY, EMPTY, EMPTY}, {EMPTY, EMPTY, EMPTY}, {EMPTY, EMPTY, EMPTY} };

    private char currentPlayer; // 'X' or 'O'
    private Scanner scanner;

    //#region Constructors
    public TicTacToe() {
        scanner = new Scanner(System.in);
        try {
            System.out.print("Enter starting player (X/O): ");
            char inputPlayer = scanner.nextLine().toUpperCase().charAt(0);
            if (inputPlayer != PLAYER_1 && inputPlayer != PLAYER_2) {
                System.out.println("Invalid input. Defaulting to player 'X'.");
                this.currentPlayer = PLAYER_1;
            } else {
                this.currentPlayer = inputPlayer;
            }
            scanner.reset();
        } catch (Exception e) {
            System.out.println("Error reading input. Defaulting to player 'X'.");
            this.currentPlayer = PLAYER_1;
       }
    }
    //#endregion

    //#region Public Methods
    /**
     * Play a turn for the current player
     */
    public void playTurn() {
        int row, col;
        
        try{
            while (true) {
                System.out.print("Player " + currentPlayer + ", enter your move (row col): ");
                String[] input = scanner.nextLine().split(" ");
                row = Integer.parseInt(input[0]);
                col = Integer.parseInt(input[1]);
                if (isValidMove(row, col)) {
                    board[row][col] = currentPlayer;
                    break;
                } else {
                    System.out.println("Invalid move. Try again.");
                }
            }
        } catch (Exception e) {
            System.out.println("Error reading input. Turn skipped.");
        }
    }

    /**
     * Check if the game is over (win or draw)
     * @return true if the game is over, false otherwise
     */
    public boolean isGameOver() {
        return checkWin(PLAYER_1) || checkWin(PLAYER_2) || isBoardFull();
    }

    /**
     * Switch the current player
     */
    public void switchPlayer() {
        currentPlayer = (currentPlayer == PLAYER_1) ? PLAYER_2 : PLAYER_1;
    }

    /**
     * Get the winner of the game
     * @return 'X' if player X wins, 'O' if player O wins, '.' if draw or game not over
     */
    public char getWinner() {
        if (checkWin(PLAYER_1)) {
            return PLAYER_1;
        } else if (checkWin(PLAYER_2)) {
            return PLAYER_2;
        } else {
            return EMPTY; // Draw or game not over
        }
    }

    /**
     * Ask the players if they want to play again
     * @return true if they want to play again, false otherwise
     */
    public boolean playAgain() {
        System.out.print("Do you want to play again? (y/n): ");
        String input = scanner.nextLine().toLowerCase();
        return input.equals("y") || input.equals("yes");
    }
    /**
     * Reset the game state for a new game
     */
    public void resetGame() {
        for (char[] row : board) {
            Arrays.fill(row, EMPTY);
        }
        currentPlayer = PLAYER_1; // Default starting player
    }
    //#endregion    
    
    //#region Private Methods
    /**
     * Check if the move is valid
     * @param row the row of the move
     * @param col the column of the move
     * @return true if the move is valid, false otherwise
     */
    private boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == EMPTY;
    }

    /**
     * Check if the given player has won
     * @param player the player to check ('X' or 'O')
     * @return true if the player has won, false otherwise
     */
    private boolean checkWin(char player) {
        // Check rows, columns, and diagonals
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }
        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
            (board[0][2] == player && board[1][1] == player && board[2][0] == player)) {
            return true;
        }        
        return false;
    }

    /**
     * Check if the board is full
     * @return true if the board is full, false otherwise
     */
    private boolean isBoardFull() {
        for (char[] row : board) {
            for (char cell : row) {
                if (cell == EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
    //#endregion

    //#region Overrided Methods
    /**
     * String representation of the game state
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (char[] row : board) {
            sb.append(Arrays.toString(row)).append("\n");
        }
        return "TicTacToe\n[Board]:\n" + sb.toString() + "[Current Player]: " + currentPlayer;
    }

    /**
     * Close the resources
     */
    @Override
    public void close() throws Exception {
        if (scanner != null) {
            scanner.close();
        }
    }
    //#endregion

}
