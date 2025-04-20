package cse213.pastryshop_2310003_2311945_2311197_2310563;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

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

    ArrayList<Cashier> cashierList;

    @javafx.fxml.FXML
    public void initialize() {
        cashierList= new ArrayList<>();

        cashierIDCol.setCellValueFactory(new PropertyValueFactory<>("id"));
        cashierNameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        salaryCol.setCellValueFactory(new PropertyValueFactory<>("salary"));
        workDaysCol.setCellValueFactory(new PropertyValueFactory<>("workingDays"));
        workShiftCol.setCellValueFactory(new PropertyValueFactory<>("workShift"));
        dateOfJoiningCol.setCellValueFactory(new PropertyValueFactory<>("dateOfJoining"));
        //lateArrivalCol.setCellValueFactory(new PropertyValueFactory<>(""));
        //absentCol.setCellValueFactory(new PropertyValueFactory<>(""));
        //phoneNumberCol.setCellValueFactory(new PropertyValueFactory<>(""));

        File file;
        FileInputStream fis;
        ObjectInputStream ois;

        try {
            file = new File("cashier.bin");
            if (!file.exists()) return;

            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);

            try {
                while (true) {
                    Cashier cashier = (Cashier) ois.readObject();
                    cashierList.add(cashier);
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
            cashierInfoTable.getItems().addAll(cashierList);
        }
    }

    @javafx.fxml.FXML
    public void ShowCashierInformationOnAction(ActionEvent actionEvent) {
        cashierInfoTable.getItems().clear();
        cashierInfoTable.getItems().addAll(cashierList);
        System.out.println(cashierList);
    }
}