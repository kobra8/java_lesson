package javaFxWprowadzenie;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class PrzykladUzyciaCSS extends Application {

    @Override
    public void  start(Stage primaryStage) throws Exception {

        // Definiowanie layoutu
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.getStyleClass().add("grid-pane");

        // Definiowanie elementów
        Button button_1 = new Button("Przycisk 1");
        Button button_2 = new Button("Przycisk 2");
        //button_2.setStyle("-fx-base: #eeff55; -fx-font: 12 consola");
        button_2.setId("button_2");

        TextField textField_1 = new TextField("Pole tekstowe 1");
        TextField textField_2 = new TextField("Pole tekstowe 2");

        CheckBox checkBox_1 = new CheckBox("Checkbox `1");
        CheckBox checkBox_2 = new CheckBox("Checkbox `2");

        // Dodanie elementów do layoutu
        gridPane.add(button_1, 0, 0);
        gridPane.add(button_2, 0, 1);

        gridPane.add(textField_1, 1, 0);
        gridPane.add(textField_2, 1, 1);

        gridPane.add(checkBox_1, 2, 0);
        gridPane.add(checkBox_2, 2, 1);

        // Zdefiniowanie sceny
        Scene scene = new Scene(gridPane, 500, 200);
        scene.getStylesheets().add("javaFxWprowadzenie/base_style.css");

        // Wyświetlanie okna
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
