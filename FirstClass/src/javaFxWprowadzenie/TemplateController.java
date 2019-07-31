package javaFxWprowadzenie;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class TemplateController {

    @FXML
    private Label label;

    private int i = 0;

    @FXML
    public void inkrementacja() {
        label.setText("Obecna wartość, to: " + ++i);
    }
}
