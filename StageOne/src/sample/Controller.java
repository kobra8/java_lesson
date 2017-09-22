package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    TextField nameField;

    @FXML
    TextField surnameField;

    @FXML
    Label scoreLabel;

    @FXML
    void clicked() {
       scoreLabel.setText(nameField.getText() + " " + surnameField.getText());

    }
}
