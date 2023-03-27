module com.example.futuretaskdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.futuretaskdemo to javafx.fxml;
    exports com.example.futuretaskdemo;
}