package ua.org.anzo;


import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

public class Game {

    Board board = new Board();


    private String player1 = "X";
    private String player2 = "O";
    public String currentPlayer = player1;

    public void changePlayer() {
        if (currentPlayer == player1) {
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }


    }

    public void check(String id, String player) {


        checkInputButtonX(id, player);
        checkInputButtonO(id, player);

        if (checkWinnerX()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Congratulation " + " Player1 " + currentPlayer + " you are the winner ", ButtonType.CLOSE);
            alert.show();
        }
        if (checkWinnerO()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "Congratulation" + " Player2 " + currentPlayer + " you are the winner ", ButtonType.CLOSE);
            alert.show();
        }


    }


    public void checkInputButtonX(String id, String player) {
        if (id.equals("00") && player.equals("X")) {
            board.board[0][0] = 'X';
        }
        if (id.equals("10") && player.equals("X")) {
            board.board[1][0] = 'X';
        }

        if (id.equals("20") && player.equals("X")) {
            board.board[2][0] = 'X';
        }
        if (id.equals("01") && player.equals("X")) {
            board.board[0][1] = 'X';
        }
        if (id.equals("11") && player.equals("X")) {
            board.board[1][1] = 'X';
        }
        if (id.equals("21") && player.equals("X")) {
            board.board[2][1] = 'X';
        }
        if (id.equals("02") && player.equals("X")) {
            board.board[0][2] = 'X';
        }
        if (id.equals("12") && player.equals("X")) {
            board.board[1][2] = 'X';
        }
        if (id.equals("22") && player.equals("X")) {
            board.board[2][2] = 'X';
        }
    }


    public void checkInputButtonO(String id, String player) {
        if (id.equals("00") && player.equals("O")) {
            board.board[0][0] = 'O';
        }
        if (id.equals("10") && player.equals("O")) {
            board.board[1][0] = 'O';
        }

        if (id.equals("20") && player.equals("O")) {
            board.board[2][0] = 'O';
        }
        if (id.equals("01") && player.equals("O")) {
            board.board[0][1] = 'O';
        }
        if (id.equals("11") && player.equals("O")) {
            board.board[1][1] = 'O';
        }
        if (id.equals("21") && player.equals("O")) {
            board.board[2][1] = 'O';
        }
        if (id.equals("02") && player.equals("O")) {
            board.board[0][2] = 'O';
        }
        if (id.equals("12") && player.equals("O")) {
            board.board[1][2] = 'O';
        }
        if (id.equals("22") && player.equals("O")) {
            board.board[2][2] = 'O';
        }
    }


    public boolean checkWinnerX() {

        if (board.board[0][0] == 'X' && board.board[1][0] == 'X' && board.board[2][0] == 'X') {

            return true;
        } else if (board.board[0][1] == 'X' && board.board[1][1] == 'X' && board.board[2][1] == 'X') {

            return true;
        } else if (board.board[0][2] == 'X' && board.board[1][2] == 'X' && board.board[2][2] == 'X') {

            return true;
        } else if (board.board[0][0] == 'X' && board.board[0][1] == 'X' && board.board[0][2] == 'X') {

            return true;
        } else if (board.board[1][0] == 'X' && board.board[1][1] == 'X' && board.board[1][2] == 'X') {

            return true;
        } else if (board.board[2][0] == 'X' && board.board[2][1] == 'X' && board.board[2][2] == 'X') {

            return true;
        } else if (board.board[0][0] == 'X' && board.board[1][1] == 'X' && board.board[2][2] == 'X') {

            return true;
        } else if (board.board[0][2] == 'X' && board.board[1][1] == 'X' && board.board[2][0] == 'X') {

            return true;
        }
        return false;
    }

    public boolean checkWinnerO() {
        if (board.board[0][0] == 'O' && board.board[1][0] == 'O' && board.board[2][0] == 'O') {

            return true;
        } else if (board.board[0][1] == 'O' && board.board[1][1] == 'O' && board.board[2][1] == 'O') {

            return true;
        } else if (board.board[0][2] == 'O' && board.board[1][2] == 'O' && board.board[2][2] == 'O') {

            return true;
        } else if (board.board[0][0] == 'O' && board.board[0][1] == 'O' && board.board[0][2] == 'O') {

            return true;
        } else if (board.board[1][0] == 'O' && board.board[1][1] == 'O' && board.board[1][2] == 'O') {

            return true;
        } else if (board.board[2][0] == 'O' && board.board[2][1] == 'O' && board.board[2][2] == 'O') {

            return true;
        } else if (board.board[0][0] == 'O' && board.board[1][1] == 'O' && board.board[2][2] == 'O') {

            return true;
        } else if (board.board[0][2] == 'O' && board.board[1][1] == 'O' && board.board[2][0] == 'O') {

            return true;
        }
        return false;
    }
}



