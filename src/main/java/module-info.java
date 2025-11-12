module me.example.demojavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens me.example.demojavafx to javafx.fxml;
    exports me.example.demojavafx;
}