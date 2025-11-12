package me.example.demojavafx.frontend.View;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class MyFristGui extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
                getClass().getResource("/me/example/demojavafx/MyFristGui.fxml")
        );


        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Demo JavaFX");
        stage.setScene(scene);
        stage.show();
    }
}
