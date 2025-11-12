package me.example.demojavafx.frontend.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MyFristGuiController {

    @FXML
    private Label titolo;

    @FXML
    protected void nascondiTitolo() {
        titolo.setVisible(false);
    }

    @FXML
    protected void mostraTitolo() {
        titolo.setVisible(true);
    }
}
