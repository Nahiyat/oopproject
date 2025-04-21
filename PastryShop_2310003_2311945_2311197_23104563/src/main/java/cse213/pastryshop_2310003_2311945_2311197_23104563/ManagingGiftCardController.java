package cse213.pastryshop_2310003_2311945_2311197_23104563;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ManagingGiftCardController
{
    @javafx.fxml.FXML
    private TextField oldCardNoTextField;
    @javafx.fxml.FXML
    private TextField phoneNoTextField;
    @javafx.fxml.FXML
    private TextField loadNewCardTextField;
    @javafx.fxml.FXML
    private TextField loadOldCardTextField;
    @javafx.fxml.FXML
    private TextField newCardNoTextField;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void ReturnToDashboardOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("cashierDashboard.fxml");
    }

    @javafx.fxml.FXML
    public void CreateNewCardOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void redeemGiftCardOnAction(ActionEvent actionEvent) {
    }
}