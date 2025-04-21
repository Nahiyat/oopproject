package cse213.pastryshop_2310003_2311945_2311197_23104563.Shadman_2310563;

import cse213.pastryshop_2310003_2311945_2311197_23104563.SceneSwitcher;
import javafx.event.ActionEvent;

import java.io.IOException;

public class ProductManagerDashboardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void restockOrdersOA(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Shadman/U1restock.fxml");
    }

    @javafx.fxml.FXML
    public void returnDisputesOA(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Shadman/U1return_dispute.fxml");
    }

    @javafx.fxml.FXML
    public void expiryCheckOA(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Shadman/U1espiry.fxml");
    }

    @javafx.fxml.FXML
    public void pricingUpdateOA(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Shadman/U1pricing_update.fxml");
    }

    @javafx.fxml.FXML
    public void seasonalLaunchOA(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Shadman/U1seasonallaunge.fxml");
    }

    @javafx.fxml.FXML
    public void shipmentsOA(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Shadman/U1viewShipments.fxml");
    }

    @javafx.fxml.FXML
    public void inventoryAuditOA(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Shadman/U1inventory_audit.fxml");
    }

    @javafx.fxml.FXML
    public void weeklySalesOA(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Shadman/U1weeklySales.fxml");
    }

    @javafx.fxml.FXML
    public void LogOutOA(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("loginView.fxml");
    }
}