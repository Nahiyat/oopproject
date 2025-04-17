package cse213.pastryshop_2310003_2311945_2311197_2310563;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.TableColumn;

import java.time.LocalDate;

public class CashierProcessTransactionController
{
    @javafx.fxml.FXML
    private TableView<Food> productTableView;
    @javafx.fxml.FXML
    private TableColumn<Food, String> foodNameCol;
    @javafx.fxml.FXML
    private TableColumn<Food, Button> addToCartCol;
    @javafx.fxml.FXML
    private TableColumn<Food, LocalDate> expDateCol;
    @javafx.fxml.FXML
    private TextField searchTextField;
    @javafx.fxml.FXML
    private TableColumn<Food, Integer> stockAmountCol;
    @javafx.fxml.FXML
    private TableColumn<Food, String> foodTypeCol;

    ObservableList<Food> f= FXCollections.observableArrayList();
    @javafx.fxml.FXML
    private TableColumn foodInCartCol;
    @javafx.fxml.FXML
    private TableColumn quantityInCartCol;
    @javafx.fxml.FXML
    private TableColumn priceInCartCol;
    @javafx.fxml.FXML
    private TableView cartTableView;

    @javafx.fxml.FXML
    public void initialize() {
        foodNameCol.setCellValueFactory(new PropertyValueFactory<Food, String>("foodName"));
        foodTypeCol.setCellValueFactory(new PropertyValueFactory<>("foodType"));
        addToCartCol.setCellValueFactory(new PropertyValueFactory<>("addToCart"));
        expDateCol.setCellValueFactory((new PropertyValueFactory<>("expiryDate")));
        stockAmountCol.setCellValueFactory(new PropertyValueFactory<>("stockAmount"));
    }

    @javafx.fxml.FXML
    public void SearchFoodOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void processTransactionOnAction(ActionEvent actionEvent) {
    }
}