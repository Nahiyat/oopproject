package cse213.pastryshop_2310003_2311945_2311197_23104563;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class CashierInformRetailManagerController
{
    @javafx.fxml.FXML
    private TableView<Food> productTableView;
    @javafx.fxml.FXML
    private TableColumn<Food, LocalDate> productExpDateCol;
    @javafx.fxml.FXML
    private TextField problemTypeTextField;
    @javafx.fxml.FXML
    private ComboBox<String> typeCB;
    @javafx.fxml.FXML
    private TextArea problemTextBox;
    @javafx.fxml.FXML
    private TableColumn<Food, Integer> productIdCol;
    @javafx.fxml.FXML
    private TableColumn<Food, String> productNameCol;

    ArrayList<Food> foodList;

    @javafx.fxml.FXML
    public void initialize() {
        typeCB.getItems().addAll("Exceed Expiry Date", "Torn Packaging", "Missing Scanner Label", "Others");
        problemTypeTextField.setDisable(true);

        productIdCol.setCellValueFactory(new PropertyValueFactory<>("foodID"));
        productNameCol.setCellValueFactory(new PropertyValueFactory<>("foodName"));
        productExpDateCol.setCellValueFactory(new PropertyValueFactory<>("expiryDate"));

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
        productTableView.getItems().addAll(foodList);
    }


    @javafx.fxml.FXML
    public void ReportProblemOnAction(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void HideTextFieldOnAction(ActionEvent actionEvent) {
        if (typeCB.getValue().equals("Others")){
            problemTypeTextField.setDisable(false);
        } else{
            problemTypeTextField.clear();
            problemTypeTextField.setDisable(true);
        }
    }

    @javafx.fxml.FXML
    public void ReturnToDashBoardOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("cashierDashboard.fxml");
    }
}