package com.gestion.ulka_stock.auth;

import com.gestion.ulka_stock.model.User;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class UserController {

    @FXML
    private Label welcomeLabel;

    @FXML
    public void initialize() {
        User user = UserSession.getUser();

        if (user != null) {
            welcomeLabel.setText("Welcome " + user.getUsername());
        } else {
            welcomeLabel.setText("Welcome User");
        }

        System.out.println("User dashboard loaded");
    }
}
