module com.mycompany.project {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.mycompany.project to javafx.fxml;
    exports com.mycompany.project;
}
