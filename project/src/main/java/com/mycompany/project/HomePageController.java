package com.mycompany.project;

import java.io.IOException;
import javafx.fxml.FXML;

public class HomePageController {

    @FXML
    private void switchToChooseRoleLoginPage() throws IOException {
        App.setRoot("main-login-page");
    }
}
