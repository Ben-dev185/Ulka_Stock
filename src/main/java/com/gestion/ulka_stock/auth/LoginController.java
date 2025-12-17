package com.gestion.ulka_stock.auth;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label errorLabel;

    @FXML
    public void handleLogin() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username.isEmpty() || password.isEmpty()) {
            errorLabel.setText("Champs obligatoires");
            return;
        }

        // temporaire
        if (username.equals("admin") && password.equals("admin")) {
            errorLabel.setText("Connexion réussie");
        } else {
            errorLabel.setText("Identifiants incorrects");
        }
        System.out.println("USERNAME SAISI = " + usernameField.getText());
        System.out.println("PASSWORD SAISI = " + passwordField.getText());

    }
}

