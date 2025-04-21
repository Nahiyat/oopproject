package cse213.pastryshop_2310003_2311945_2311197_23104563.Mahatab;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.fxml.Initializable;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;





import java.util.ResourceBundle;

public class CustomerDashboardController implements Initializable {

    @FXML
    private ComboBox<String> cakeComboBox;

    @FXML
    void addToCartBtn(ActionEvent event) {

    }

    @FXML
    void applyForDiscountBtn(ActionEvent event) {

    }

    @FXML
    void buySingleItemBtn(ActionEvent event) {

    }

    @FXML
    void cartBtn(ActionEvent event) {

    }

    @FXML
    void contactSupportBtn(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("customerSupport.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Customer Support");
            stage.show();

        }
        catch (IOException e) {
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Unable to load the support page");
            alert.setContentText("Please try again later.");
            alert.showAndWait();
        }

    }

    @FXML
    void manageAccountBtn(ActionEvent event) {

    }

    @FXML
    void orderHistoryBtn(ActionEvent event) {

    }

    @FXML
    void viewDescriptionBtn(ActionEvent event) {
        String selectedCake = cakeComboBox.getSelectionModel().getSelectedItem();

        if (selectedCake==null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("NO CAKE SELECTED!!!!");
            alert.showAndWait();
            return;


        }
        try {
            Parent root = null;

            if (selectedCake.equals("Vanilla Cake 1KG")) {

                    root = FXMLLoader.load(getClass().getResource("vanillaCakeDescription.fxml"));

            }
            if (root != null) {
                // Get the current stage
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setScene(new Scene(root));
                stage.setTitle("Cake Description");
                stage.show();
            }


        }
        catch (IOException e) {
            e.printStackTrace();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Unable to load the description page");
            alert.setContentText("Please try again later.");
            alert.showAndWait();
        }
    }

    @Override

    public void initialize(URL location, ResourceBundle resources) {
            ArrayList<String> cakes = new ArrayList<>();
            cakes.add("Vanilla Cake 1KG");
            cakes.add("Chocolate Cake 1KG");
            cakes.add("Red Velvet 1KG");
            cakeComboBox.getItems().addAll(cakes);
    }

}
