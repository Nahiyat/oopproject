package cse213.pastryshop_2310003_2311945_2311197_23104563.Mahatab;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class CustomerSupportController {

    @FXML
    private TextField complaintTextField;

    @FXML
    public void reportComplaint(ActionEvent event) {
        String complaint = complaintTextField.getText();
        if (complaint == null || complaint.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Empty Complaint");
            alert.setContentText("Please enter your complaint before submitting.");
            alert.showAndWait();
        } else {
            System.out.println("Complaint received: " + complaint); // Or save to file
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Complaint Submitted");
            alert.setContentText("Thank you! Your complaint has been submitted.");
            alert.showAndWait();
            complaintTextField.clear();
        }
    }

    @FXML
    public void goBack(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("customerDashboard.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Customer Dashboard");
        stage.show();
    }
}
