package javaFxWprowadzenie;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.awt.*;

public class PierwszaAplikacja extends Application {

    @Override
    public void  start(Stage primaryStage) throws Exception {

        BorderPane layout = new BorderPane();

        Scene scene = new Scene(layout, 400, 200);

        TextField textField = new TextField();
        textField.setMaxWidth(300);

        Label label = new Label("Average: 0.0");

        Button button = new Button("Oblicz średnią");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String textfromTextfield = textField.getText();
                String[] splitedText = textfromTextfield.split(",");
                double average = 0;
                for (String item: splitedText) {
                    average += Double.parseDouble(item);
                }
                average /= splitedText.length;
                label.setText("Average: " + average);
            }
        });

        VBox vBox = new VBox();
        vBox.getChildren().addAll(textField, button, label);
        vBox.setAlignment(Pos.CENTER);
        vBox.setSpacing(20);

        layout.setCenter(vBox);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Pierwsza aplikacja");
        primaryStage.show();
    }

}
