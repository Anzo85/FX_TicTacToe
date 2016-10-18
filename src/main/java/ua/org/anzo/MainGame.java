package ua.org.anzo;

import javafx.application.Application;
import javafx.beans.binding.StringBinding;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class MainGame extends Application {

    @Override
    public void start(final Stage primaryStage) throws Exception {

        GridPane gridPane = new GridPane();
        final Game game = new Game();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                final Button button = new Button(i + "" + j);
                button.setPrefSize(150, 150);
                button.setId(i + "" + j);
                button.setOnAction(new EventHandler<ActionEvent>() {


                    public void handle(ActionEvent event) {
                        button.setText(game.currentPlayer);
                        game.check(button.getId(), game.currentPlayer);
                        game.changePlayer();
                        if (Game.gameIsFinish == true) {
                            primaryStage.close();
                        }
                    }
                });

                gridPane.add(button, i, j);

            }
        }

        Scene scene = new Scene(gridPane);

        primaryStage.setScene(scene);
        primaryStage.setTitle("TicTacToe");
        primaryStage.show();


    }


    public static void main(String[] args) {

        launch();


    }


}