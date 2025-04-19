package cse213.pastryshop_2310003_2311945_2311197_2310563;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class AddFoodController
{
    @javafx.fxml.FXML
    private ComboBox<String> foodTypeCB;
    @javafx.fxml.FXML
    private DatePicker expDatePicker;
    @javafx.fxml.FXML
    private TextField stockAmountTextField;
    @javafx.fxml.FXML
    private TextField foodNameTextField;
    @javafx.fxml.FXML
    private TextField priceTextField;
    @javafx.fxml.FXML
    private TextField foodIDTextField;
    @javafx.fxml.FXML
    private TableColumn<Food, String> foodNameCol;
    @javafx.fxml.FXML
    private TableColumn<Food, String> foodIDCol;
    @javafx.fxml.FXML
    private TableColumn<Food, LocalDate> expDateCol;
    @javafx.fxml.FXML
    private TableColumn<Food, Float> priceCol;
    @javafx.fxml.FXML
    private TableView<Food> foodTabelView;
    @javafx.fxml.FXML
    private TableColumn<Food, Integer> stockAmountCol;
    @javafx.fxml.FXML
    private TableColumn<Food, String> foodTypeCol;

    ArrayList<Food> foodList;

    @javafx.fxml.FXML
    public void initialize() {
        foodTypeCB.getItems().addAll("Cookies", "Pastries", "Cake");

        foodIDCol.setCellValueFactory(new PropertyValueFactory<>("foodID"));
        foodNameCol.setCellValueFactory(new PropertyValueFactory<>("foodName"));
        foodTypeCol.setCellValueFactory(new PropertyValueFactory<>("foodType"));
        expDateCol.setCellValueFactory(new PropertyValueFactory<>("expiryDate"));
        priceCol.setCellValueFactory(new PropertyValueFactory<>("price"));
        stockAmountCol.setCellValueFactory(new PropertyValueFactory<>("stockAmount"));

        foodList= new ArrayList<>();

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
        foodTabelView.getItems().addAll(foodList);
    }


    @javafx.fxml.FXML
    public void AddFoodOnAction(ActionEvent actionEvent) {
        //String id, String foodName, String foodType, LocalDate expiryDate, int stockAmount, float price
        Food newFood= new Food(foodIDTextField.getText(), foodNameTextField.getText(), foodTypeCB.getValue(), expDatePicker.getValue(), Integer.parseInt(stockAmountTextField.getText()), Float.parseFloat(priceTextField.getText()));
        foodList.add(newFood);

        File file = new File("food.bin");
        FileOutputStream fos;
        ObjectOutputStream oos;

        try {
            if (file.exists()) {
                fos = new FileOutputStream(file, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(file, true);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(newFood);
            oos.close();
        } catch (Exception e) {
            System.out.println("There was a error writing to bin file");
        }
        foodTabelView.getItems().clear();
        foodTabelView.getItems().addAll(foodList);
        System.out.println(newFood.toString());
    }
}