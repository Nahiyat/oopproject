package cse213.pastryshop_2310003_2311945_2311197_23104563;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        SceneSwitcher.stage=stage;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("cashierDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Pastry Shop Management....");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}