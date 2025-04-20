package cse213.pastryshop_2310003_2311945_2311197_23104563;

import javafx.event.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.*;

import java.io.*;
import java.util.Objects;

public class SceneSwitcher {
    public static Stage stage;

    public static void switchTo(String fxml, ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(
                Objects.requireNonNull(cse213.pastryshop_2310003_2311945_2311197_23104563.SceneSwitcher.class.getResource(fxml))
        );
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
    }

    public static void switchTo(String fxml) throws IOException {
        Parent root = FXMLLoader.load(
                Objects.requireNonNull(cse213.pastryshop_2310003_2311945_2311197_23104563.SceneSwitcher.class.getResource(fxml))
        );
        Scene scene = new Scene(root);
        stage.setScene(scene);
    }
}
