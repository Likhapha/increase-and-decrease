package com.example.increanddecre;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 480, 300);
        stage.setTitle("Numbers Menu" );
        stage.setScene(scene);
        stage.show();
        stage.setOnCloseRequest(windowEvent ->{
            windowEvent.consume();
            HandleQuit(stage);
        } );
    }

    public void HandleQuit(Stage stage){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Quit");
        alert.setHeaderText("Do you want to quit?");

        if (alert.showAndWait().get()== ButtonType.OK){
            System.out.println("You are successfully quit");
            stage.close();
        }
    }
    public static void main(String[] args) {
        launch();
    }
}