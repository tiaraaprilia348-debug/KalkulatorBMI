package com.mycompany.kalkulatorbmi;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(
                App.class.getResource("/com/mycompany/kalkulatorbmi/bmi-view.fxml")
        );

        Scene scene = new Scene(loader.load(), 520, 600);
        scene.getStylesheets().add(
                App.class.getResource("/com/mycompany/kalkulatorbmi/style.css").toExternalForm()
        );

        stage.setTitle("Kalkulator BMI");
        stage.setMinWidth(460);
        stage.setMinHeight(560);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
