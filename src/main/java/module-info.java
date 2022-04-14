module com.example.oopassignment2final {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.oopassignment2final to javafx.fxml;
    exports com.example.oopassignment2final;
}