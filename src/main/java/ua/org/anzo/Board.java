package ua.org.anzo;


public class Board {


    public static final int BOARD_SIZE = 3;
    public char[][] board;



    public Board() {
        board = new char[BOARD_SIZE][BOARD_SIZE];
        fillBoard();
    }


    public void fillBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }
}
