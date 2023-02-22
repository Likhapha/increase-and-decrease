module com.example.increanddecre {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.increanddecre to javafx.fxml;
    exports com.example.increanddecre;
}