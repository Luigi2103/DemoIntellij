package me.example.demojavafx.frontend;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MyFristGuiController {

    @FXML
    private Label titolo;

    @FXML
    protected void nascondiTitolo() {
        titolo.setVisible(false);
    }
}
