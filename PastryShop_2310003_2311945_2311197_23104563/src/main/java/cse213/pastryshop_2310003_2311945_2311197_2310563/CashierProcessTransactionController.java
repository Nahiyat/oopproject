package cse213.pastryshop_2310003_2311945_2311197_2310563;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class CashierProcessTransactionController {
    @javafx.fxml.FXML
    private TableView<Food> productTableView;
    @javafx.fxml.FXML
    private TableColumn<Food, String> foodNameCol;
    @javafx.fxml.FXML
    private TableColumn<Food, Button> addToCartCol;
    @javafx.fxml.FXML
    private TableColumn<Food, LocalDate> expDateCol;
    @javafx.fxml.FXML
    private TableColumn<Food, Integer> stockAmountCol;
    @javafx.fxml.FXML
    private TableColumn<Food, String> foodTypeCol;

    ObservableList<Food> f = FXCollections.observableArrayList();
    @javafx.fxml.FXML
    private TableColumn<Cart, String> foodInCartCol;
    @javafx.fxml.FXML
    private TableColumn<Cart, Integer> quantityInCartCol;
    @javafx.fxml.FXML
    private TableColumn<Cart, Float> priceInCartCol;
    @javafx.fxml.FXML
    private TableView<Cart> cartTableView;

    ArrayList<Food> foodList;

    ArrayList<Cart> foodInCart;
    @javafx.fxml.FXML
    private TextField quantityTextField;
    @javafx.fxml.FXML
    private TextArea totalPrice;

    @javafx.fxml.FXML
    public void initialize() {
        foodNameCol.setCellValueFactory(new PropertyValueFactory<Food, String>("foodName"));
        foodTypeCol.setCellValueFactory(new PropertyValueFactory<>("foodType"));
        addToCartCol.setCellValueFactory(new PropertyValueFactory<>("addToCart"));
        expDateCol.setCellValueFactory((new PropertyValueFactory<>("expiryDate")));
        stockAmountCol.setCellValueFactory(new PropertyValueFactory<>("stockAmount"));

        foodList = new ArrayList<>();

        foodInCartCol.setCellValueFactory(new PropertyValueFactory<>("foodName"));
        priceInCartCol.setCellValueFactory(new PropertyValueFactory<>("price"));
        quantityInCartCol.setCellValueFactory(new PropertyValueFactory<>("quantity"));

        foodInCart = new ArrayList<>();

        File file;
        FileInputStream fis;
        ObjectInputStream ois;

        try {
            file = new File("food.bin");
            if (!file.exists()) return;

            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);

            try {
                while (true) {
                    Food newFood = (Food) ois.readObject();
                    foodList.add(newFood);
                }
            } catch (EOFException eofException) {
                System.out.println("End of file reached");

            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            System.out.println("A");
        }
        productTableView.getItems().addAll(foodList);
    }


    @javafx.fxml.FXML
    public void processTransactionOnAction(ActionEvent actionEvent) {
        productTableView.getItems().clear();

        productTableView.getItems().addAll(foodList);
        System.out.println(foodList);

        float total_price=0f;
        for(Cart fc: foodInCart){
            total_price+= fc.price*fc.quantity;

        }
        totalPrice.setText(Float.toString(total_price));
        cartTableView.getItems().clear();
        foodInCart.clear();
    }

    @javafx.fxml.FXML
    public void AddToCartOnAction(ActionEvent actionEvent) {
        Food selectedFood = productTableView.getSelectionModel().getSelectedItem();

        if (selectedFood == null) {
            System.out.println("No Item Selected");
        } else if (selectedFood.getStockAmount() < Integer.parseInt(quantityTextField.getText())) {
            System.out.println("Not enough food in Stock");

        } else {
            Cart newFoodInCart = new Cart(selectedFood.getFoodName(),
                    Integer.parseInt(quantityTextField.getText()),
                    selectedFood.getPrice());

            foodInCart.add(newFoodInCart);
            cartTableView.getItems().add(newFoodInCart);
        }
    }

    @javafx.fxml.FXML
    public void EmptyCartOnAction(ActionEvent actionEvent) {
        if (foodInCart.isEmpty()){
            return;
        } else{
            foodInCart.clear();
            cartTableView.getItems().clear();
        }
    }
}