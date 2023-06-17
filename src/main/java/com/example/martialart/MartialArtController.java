package com.example.martialart;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MartialArtController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}