package org.login.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML
    private PasswordField pwdTxt;
    @FXML
    private TextField userTxt;
    @FXML
    private Label auxLabel;

    @FXML
    private void reset() throws IOException {
        userTxt.setText("");
        pwdTxt.setText("");
        auxLabel.setText("Log in to get access");
    }

    @FXML
    private void login() throws IOException{
        if(userTxt.getText().equalsIgnoreCase("Pablo") && pwdTxt.getText().equalsIgnoreCase("1234")){
            auxLabel.setText("Log in successful");
        }
        else{
            auxLabel.setText("Access denied");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
