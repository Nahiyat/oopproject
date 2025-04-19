package cse213.pastryshop_2310003_2311945_2311197_2310563;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class SetCashierWorkScheduleController {
    @javafx.fxml.FXML
    private TableView<Cashier> cashierScheduleTable;
    @javafx.fxml.FXML
    private CheckBox saturdayCheckBox;
    @javafx.fxml.FXML
    private CheckBox wednesdayCheckBox;
    @javafx.fxml.FXML
    private ComboBox<String> repeatingWorkShiftComboBox;
    @javafx.fxml.FXML
    private CheckBox fridayCheckBox;
    @javafx.fxml.FXML
    private CheckBox thursdayCheckBox;
    @javafx.fxml.FXML
    private DatePicker workDatePicker;
    @javafx.fxml.FXML
    private CheckBox tuesdayCheckBox;
    @javafx.fxml.FXML
    private TableColumn<Cashier, Integer> idCol;
    @javafx.fxml.FXML
    private TableColumn<Cashier, String> nameCol;
    @javafx.fxml.FXML
    private TableColumn<Cashier, String> startAndEndTimeCol;
    @javafx.fxml.FXML
    private CheckBox mondayCheckBox;
    @javafx.fxml.FXML
    private ComboBox<String > workShiftComboBox;
    @javafx.fxml.FXML
    private CheckBox sundayCheckBox;
    @javafx.fxml.FXML
    private TableColumn<Cashier, String> workingDaysCol;

    ArrayList<Cashier> c;



    @javafx.fxml.FXML
    public void initialize() {
        repeatingWorkShiftComboBox.getItems().addAll("One Time Shift","Repeating Shift");
        workShiftComboBox.getItems().addAll("Morning", "Evening");

        nameCol.setCellValueFactory(new PropertyValueFactory<>("cashierName"));
        idCol.setCellValueFactory((new PropertyValueFactory<>("cashierID")));
        workingDaysCol.setCellValueFactory(new PropertyValueFactory<>("workingDays"));  //jani nh
        startAndEndTimeCol.setCellValueFactory(new PropertyValueFactory<>("workingShifts"));   //jani nh

        c= new ArrayList<>();
    }

    @javafx.fxml.FXML
    public void AddShiftOnAction(ActionEvent actionEvent) {
        cashierScheduleTable.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            if (newSelection != null) {
                // Do something with the selected item
                //int a= new Cashier();
                System.out.println("Selected item: " + newSelection);
                // Example: open a detail view, update a form, etc.
            }
        });

        //Cashier c= new Cashier();
        //cashierScheduleTable.getItems().add(new Cashier());
    }
}