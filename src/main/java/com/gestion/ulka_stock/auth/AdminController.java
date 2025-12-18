package com.gestion.ulka_stock.auth;

import com.gestion.ulka_stock.model.User;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class AdminController {

    @FXML
    private Label welcomeLabel;

    @FXML
    public void initialize() {
        User user = UserSession.getUser();

        if (user != null) {
            welcomeLabel.setText("Welcome Admin: " + user.getUsername());
        } else {
            welcomeLabel.setText("Welcome Admin");
        }

        System.out.println("Admin dashboard loaded");
    }
}
