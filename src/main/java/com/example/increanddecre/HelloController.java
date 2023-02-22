package com.example.increanddecre;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import javax.security.auth.callback.TextOutputCallback;
import java.util.IdentityHashMap;

public class HelloController {
    Stage stage;

    @FXML
    private Button Add;

    @FXML
    private Button Minus;

    @FXML
    private TextField Text_Fi;

    @FXML
    private Button clear;
    @FXML
    int x=0;

    @FXML
    private AnchorPane scenePane;

    public void HandleIncremental(ActionEvent event){
       if (Text_Fi.getText().isBlank()){
             x=x+1;
             Text_Fi.setText(String.valueOf(x));
       }else {
           x=Integer.parseInt(Text_Fi.getText());
           x=x+1;
           Text_Fi.setText(String.valueOf(x));

       }


    }
  public void HandleDecremental(){
if (Text_Fi.getText().isBlank()){
    x=x-1;
    Text_Fi.setText(String.valueOf(x));
}else {
  x=Integer.parseInt(Text_Fi.getText());
  x=x-1;
  Text_Fi.setText(String.valueOf(x));
}
  }
  public void TextClear(ActionEvent E){
        Text_Fi.clear();
        x=0;
  }
  public void HandleQuit(ActionEvent event){
      Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
      alert.setTitle("Quit");
      alert.setHeaderText("Do you want to quit?");

      if (alert.showAndWait().get()== ButtonType.OK){
          stage = (Stage) scenePane.getScene().getWindow();
          System.out.println("You are successfully quit");
          stage.close();
      }
  }
}


