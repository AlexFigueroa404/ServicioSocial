import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {

    static final String ANSI_RED = "\u001B[31m";
    static final String ANSI_RESET = "\u001B[0m";

    static char[][] board = new char[3][3];
    static Scanner scanner = new Scanner(System.in);
    static char player = 'X';
    static boolean gameOver = false;
    static boolean winner = false;

    public static void main(String[] args) {

        initBoard(board);
        printBoard(board);
        while (!gameOver) {
            System.out.println("Jugador " + player + "\n Ingrese la fila: ");
            int row = scanner.nextInt() - 1;
            System.out.println("Ingrese la columna: ");
            int column = scanner.nextInt() - 1;

            if (isvalidMove(board, row, column)) {

                board[row][column] = player;
                printBoard(board);
                gameOver = isFull(board);
                player = player == 'X' ? 'O' : 'X';


            } else {
                System.out.println("Movimiento invalido");
            }
        }


    }


    static void printBoard(char[][] board) {

        System.out.println(" ");
        System.out.println(ANSI_RED + " \t1\t 2\t 3" + ANSI_RESET);
        System.out.println("   -------------");
        for (int row = 0; row < board.length; row++) {

            System.out.print(ANSI_RED + " " + (row + 1) + ANSI_RESET);
            for (int column = 0; column < board.length; column++) {
                System.out.print(" | " + board[row][column]);
            }
            System.out.println(" |");
            System.out.println("   -------------");
        }


    }

    static void initBoard(char[][] board) {

        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board.length; column++) {
                board[row][column] = ' ';
            }
        }

    }

    static boolean isvalidMove(char[][] board, int row, int column) {

        if (row >= 0 && row <= 2 && column >= 0 && column <= 2) {

            return board[row][column] == ' ';
        }

        return false;

    }


    static boolean isFull(char[][] board) {

        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board.length; column++) {
                if (board[row][column] == ' ') {
                    return false;
                }
            }
        }

        return true;
    }


}


