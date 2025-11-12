module me.example.demojavafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens me.example.demojavafx.frontend.Controller to javafx.fxml;
    opens me.example.demojavafx.frontend.View to javafx.fxml;

    exports me.example.demojavafx;
    exports me.example.demojavafx.frontend.View;
}