package com.example.futuretaskdemo;

import javafx.application.Platform;
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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        OtherClass.hello();

        for (int i = 0; i <3 ; i++) {
            Thread thread = new Thread(new Task());
            thread.start();

        }

        lbl1.setText("Threads");
        btn1.setText("Exit");

        System.out.println("task 2");
        OtherClass otherClass= new OtherClass(3,4,"Joey");
        otherClass.getTotal();
        OtherClass.hello();

    }

    public void exitTheStage() {
        Platform.exit();
    }

}