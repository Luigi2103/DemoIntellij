module me.example.demojavafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens me.example.demojavafx.frontend to javafx.fxml;

    exports me.example.demojavafx;
    exports me.example.demojavafx.frontend;
    //exports me.example.demojavafx.backend;
}