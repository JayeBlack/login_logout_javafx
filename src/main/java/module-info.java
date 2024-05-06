module com.texteditor.testloginlogout {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.texteditor.testloginlogout to javafx.fxml;
    exports com.texteditor.testloginlogout;
}