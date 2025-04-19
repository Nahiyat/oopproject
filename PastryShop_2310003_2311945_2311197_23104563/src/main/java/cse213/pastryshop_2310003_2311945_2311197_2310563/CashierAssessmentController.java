package cse213.pastryshop_2310003_2311945_2311197_2310563;

import javafx.collections.FXCollections;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.time.LocalDate;

public class CashierAssessmentController
{
    @javafx.fxml.FXML
    private TableColumn<Cashier,Integer> cashierIDCol;
    @javafx.fxml.FXML
    private TableColumn<Cashier,String> cashierNameCol;
    @javafx.fxml.FXML
    private TableColumn<Cashier, LocalDate> workDaysCol;
    @javafx.fxml.FXML
    private TableColumn<Cashier, Float> salaryCol;
    @javafx.fxml.FXML
    private TableColumn<Cashier, Integer> lateArrivalCol;
    @javafx.fxml.FXML
    private TableView<Cashier> cashierInfoTable;
    @javafx.fxml.FXML
    private TableColumn<Cashier, LocalDate> dateOfJoiningCol;
    @javafx.fxml.FXML
    private TableColumn<Cashier, Integer> phoneNumberCol;
    @javafx.fxml.FXML
    private TableColumn<Cashier, String> workShiftCol;
    @javafx.fxml.FXML
    private TableColumn<Cashier, Integer> absentCol;



    @javafx.fxml.FXML
    public void initialize() {
        Cashier cashierList= (Cashier) FXCollections.observableArrayList();
    }


}