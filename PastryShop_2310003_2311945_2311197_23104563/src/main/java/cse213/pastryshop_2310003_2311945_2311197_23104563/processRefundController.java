package cse213.pastryshop_2310003_2311945_2311197_23104563;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class processRefundController
{
    @javafx.fxml.FXML
    private TextArea refundAvailableTextArea;
    @javafx.fxml.FXML
    private TableColumn<Food, String> foodNameCol;
    @javafx.fxml.FXML
    private TableView<Food> foodTableView;
    @javafx.fxml.FXML
    private TableColumn<Food, Integer> foodIdCol;
    @javafx.fxml.FXML
    private TableColumn<Food, LocalDate> expDateCol;
    @javafx.fxml.FXML
    private DatePicker purchaseDatePicker;

    ArrayList<Food> foodList;

    @javafx.fxml.FXML
    public void initialize() {
        foodIdCol.setCellValueFactory(new PropertyValueFactory<>("foodID"));
        foodNameCol.setCellValueFactory(new PropertyValueFactory<>("foodName"));
        expDateCol.setCellValueFactory(new PropertyValueFactory<>("expiryDate"));

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
        foodTableView.getItems().addAll(foodList);
    }

    @javafx.fxml.FXML
    public void CheckForRefundOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ReturnToDashboardOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("cashierDashboard.fxml");
    }
}