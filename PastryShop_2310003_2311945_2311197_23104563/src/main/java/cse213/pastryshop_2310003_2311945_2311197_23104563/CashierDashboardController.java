package cse213.pastryshop_2310003_2311945_2311197_23104563;

import javafx.event.ActionEvent;

import java.io.IOException;

public class CashierDashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void CashierHandleCakeOrderOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("cashierCakeOrder.fxml");
    }

    @javafx.fxml.FXML
    public void RecieveCustomerComplaintOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("informingAboutCustomerComplaint.fxml");
    }

    @javafx.fxml.FXML
    public void ManageGiftCardOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("managingGiftCard.fxml");
    }

    @javafx.fxml.FXML
    public void ShowDiscountOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("discountDisplayForCashier");
    }

    @javafx.fxml.FXML
    public void ProcessTransactionOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("cashierTransaction.fxml");
    }

    @javafx.fxml.FXML
    public void ProcessRefundOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("processRefund.fxml");
    }

    @javafx.fxml.FXML
    public void InformAboutDamagedGoodsOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("cashierInformRetailManager.fxml");
    }
}