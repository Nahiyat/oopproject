package cse213.pastryshop_2310003_2311945_2311197_23104563.Mahatab;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CustomerLoginController {

    @FXML
    private TextField userIDFX;

    @FXML
    private PasswordField userPasswordFX;



    @FXML
    void registerAccountBtn(ActionEvent event) {

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("customerRegistration.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void signInBtn(ActionEvent event) {
        String userID = userIDFX.getText();
        String userPassword = userPasswordFX.getText();

        boolean loginSuccess = false;

        try {
            File file = new File("Customers.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                if (line.contains(userID) && line.contains(userPassword)) {
                    loginSuccess = true;
                    break;

                }

            }
            scanner.close();
        }
        catch (Exception e) {
            e.printStackTrace();

        }

        if (loginSuccess) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("customerDashboard.fxml"));
                Parent root = loader.load();
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.setTitle("Customer Dashboard");
                stage.show();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
        else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("WRONG LOGIN INFO");
            alert.setHeaderText("WRONG LOGIN INFORMATION");
            alert.setContentText("TRY AGAIN");
            alert.showAndWait();
        }



    }

}
