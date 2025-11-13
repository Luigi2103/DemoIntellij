package me.example.demojavafx.frontend;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class MyFristGuiController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private CheckBox rememberMeCheck;

    @FXML
    private Label feedbackLabel;

    @FXML
    protected void handleLogin() {
        final String username = usernameField.getText() != null ? usernameField.getText().trim() : "";
        final String password = passwordField.getText() != null ? passwordField.getText() : "";

        if (username.isEmpty() || password.isEmpty()) {
            showFeedback("Compila tutti i campi per continuare.", true);
            return;
        }

        if (isValidCredential(username, password)) {
            showFeedback("Accesso eseguito con successo" + (rememberMeCheck.isSelected() ? " (dati salvati)." : "."), false);
            clearFields(false);
        } else {
            showFeedback("Credenziali non valide. Riprova.", true);
        }
    }

    @FXML
    protected void handleForgotPassword() {
        showFeedback("Funzione di recupero password non ancora disponibile.", true);
    }

    private boolean isValidCredential(String username, String password) {
        return "admin".equalsIgnoreCase(username) && "admin123".equals(password);
    }

    private void showFeedback(String message, boolean isError) {
        feedbackLabel.setText(message);
        feedbackLabel.setStyle(isError
                ? "-fx-text-fill: #d9534f; -fx-font-size: 13px;"
                : "-fx-text-fill: #28965a; -fx-font-size: 13px;");
        feedbackLabel.setVisible(true);
    }

    private void clearFields(boolean clearRemember) {
        usernameField.clear();
        passwordField.clear();
        if (clearRemember) {
            rememberMeCheck.setSelected(false);
        }
    }
}
