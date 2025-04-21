package cse213.pastryshop_2310003_2311945_2311197_23104563;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.IOException;

public class DiscountDisplayForCashier
{
    @javafx.fxml.FXML
    private TableColumn foodNameCol;
    @javafx.fxml.FXML
    private TableView foodTableView;
    @javafx.fxml.FXML
    private TableColumn foodIdCol;
    @javafx.fxml.FXML
    private TableColumn discountTypeCol;
    @javafx.fxml.FXML
    private TableColumn endDateCol;
    @javafx.fxml.FXML
    private TableColumn startDateCol;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @Deprecated
    public void CheckForRefundOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ReturnToDashboardOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("cashierDashboard.fxml");
    }
}