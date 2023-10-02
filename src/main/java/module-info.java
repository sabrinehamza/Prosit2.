module com.example.prosit2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.prosit2 to javafx.fxml;
    exports com.example.prosit2;
}