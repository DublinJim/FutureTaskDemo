package com.example.futuretaskdemo;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {
    public Button btn1;
    public Label lbl1;



    @FXML
    protected void onHelloButtonClick() {
        lbl1.setText("Welcome to JavaFX Application!");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        for (int i = 0; i <10 ; i++) {
            Thread thread = new Thread(new Task());
            thread.start();
            System.out.println("new stuff");
            System.out.println("adds more ");
        }

    }
}