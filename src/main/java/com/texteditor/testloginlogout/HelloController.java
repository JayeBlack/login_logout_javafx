package com.texteditor.testloginlogout;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private Button btncancel;

    @FXML
    private Button btnlogin;

    @FXML
    private TextField password;

    @FXML
    private TextField txtusername;

    @FXML
    private Button btnlogout;

    @FXML
    void onCancel(ActionEvent event) {
        Platform.exit();

    }

    @FXML
    void onLogin(ActionEvent event) throws IOException {
        if (txtusername.getText().equals("admin") && password.getText().equals("1234")) {

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("mainApp.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 600, 400);
            Stage stage = new Stage();
            stage.setTitle("mainapp");
            stage.setScene(scene);

            Stage loginstage = (Stage) btnlogin.getScene().getWindow();
            loginstage.close();
            stage.show();
            stage.setResizable(false);

        } else {
            //
        }

    }

    @FXML
    void onLogout(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        Stage stage = new Stage();
        stage.setTitle("login");
        stage.setScene(scene);
        Stage loginstage = (Stage) btnlogout.getScene().getWindow();
        loginstage.close();
        stage.show();
        stage.setResizable(false);

    }
}
