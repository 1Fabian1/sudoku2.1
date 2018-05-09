package main.model;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
        return;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/main/view/plansza.fxml"));
        primaryStage.setTitle("Sudoku");
        primaryStage.setScene(new Scene(root, 500, 375));
        primaryStage.show();
    }
}
