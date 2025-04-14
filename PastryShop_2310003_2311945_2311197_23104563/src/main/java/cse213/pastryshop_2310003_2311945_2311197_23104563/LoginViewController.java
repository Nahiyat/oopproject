package cse213.pastryshop_2310003_2311945_2311197_23104563;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


public class LoginViewController
{
    @javafx.fxml.FXML
    private TextField passwordTextField;
    @javafx.fxml.FXML
    private TextField userIDTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    private boolean validateUsernameAndPassword(String userId, String password){
        if (userId.length() < 4) {
            return false;
        }

        String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        boolean hasNumber = false;

        for (String number : numbers) {
            if (password.contains(number)) {
                hasNumber = true;
            }
        }

        if (!hasNumber || password.length() < 6) {
            return false;
        }

        return true;
    }


    @javafx.fxml.FXML
    public void ForgotPasswordOnMouseClicked(Event event) {

    }

    @javafx.fxml.FXML
    public void LoginOnAction(ActionEvent actionEvent) {
        String userId = userIDTextField.getText();
        String password = passwordTextField.getText();
        Alert alert = new Alert(Alert.AlertType.ERROR);

        boolean isValidCred = this.validateUsernameAndPassword(userId, password);
        if (!isValidCred) {
            alert.setTitle("Incorrect Credentials");
            alert.setContentText("Username must be longer than 4, password must be longer than 6, and must contain a number");
            alert.showAndWait();
            return;
        }
    }

    @javafx.fxml.FXML
    public void RegisterOnAction(ActionEvent actionEvent) throws IOException {
        Parent root= null;
        FXMLLoader registerFXML = new FXMLLoader(HelloApplication.class.getResource("registrationView.fxml"));
        root= registerFXML.load();
        Scene scene= new Scene(root);
        Stage stage= (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Create Account");
        stage.show();
    }
}