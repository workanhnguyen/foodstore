package com.mycompany.project;

import java.io.IOException;
import javafx.fxml.FXML;

public class MainLoginPageController {

    @FXML
    private void switchToManagerFunctionsPage() throws IOException {
        App.setRoot("manager-functions-page");
    }
}
