package com.petcare;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Lab10 extends Application {
    @FXML Label lbl;
    @FXML Button btn;
    @FXML TextField txtField;



    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("Lab.fxml"));


        Scene scene = new Scene(fxmlLoader.load());

        stage.setTitle("Lab10");
        stage.setScene(scene);
        stage.show();

    }

    public void saludar(){
        lbl.setText("Hola "+txtField.getText());
    }

    public static void main(String[] args) {
        launch(args);
    }

}