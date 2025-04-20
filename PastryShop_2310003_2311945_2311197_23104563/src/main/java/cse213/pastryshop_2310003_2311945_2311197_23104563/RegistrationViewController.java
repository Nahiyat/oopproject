package cse213.pastryshop_2310003_2311945_2311197_23104563;


import cse213.pastryshop_2310003_2311945_2311197_2310563.Cashier;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.io.*;
import java.util.ArrayList;

public class RegistrationViewController
{
    @javafx.fxml.FXML
    private TextField pwTextField;
    @javafx.fxml.FXML
    private TextField idTextField;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private DatePicker dobDatePicker;

    ArrayList<cse213.pastryshop_2310003_2311945_2311197_2310563.Cashier> c;


    @javafx.fxml.FXML
    private ComboBox<String> genderCB;

    @javafx.fxml.FXML
    public void initialize() {
        c= new ArrayList<>();
        genderCB.getItems().addAll("Male","Female");

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
                    cse213.pastryshop_2310003_2311945_2311197_2310563.Cashier cashier = (cse213.pastryshop_2310003_2311945_2311197_2310563.Cashier) ois.readObject();
                    c.add(cashier);
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

        }
    }


    @javafx.fxml.FXML
    public void RegisterOnAction(ActionEvent actionEvent) {
        //id, name, gender, password, dateOfBirth
        //float salary=1.0f;
        //LocalDate currentDate=LocalDate.now();
        //String workDays= "N/A";
        //String workShift= "N/A";

        cse213.pastryshop_2310003_2311945_2311197_2310563.Cashier newCashier = new Cashier(Integer.parseInt(idTextField.getText()),
                                        nameTextField.getText(),
                                        genderCB.getValue(),
                                        pwTextField.getText(),
                                        dobDatePicker.getValue());

        c.add(newCashier);
        System.out.println(c);

        File file = new File("cashier.bin");
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

            oos.writeObject(newCashier);
            oos.close();
        } catch (Exception e) {
            System.out.println("There was a error writing to bin file");
        }
    }
        //id, name, gender, password, dateOfBirth
        //Cashier newCashier= new Cashier(Integer.parseInt(idTextField.getText()),nameTextField.getText(),genderCB.getValue(), pwTextField.getText(), dobDatePicker.getValue());
        //c.add(newCashier);
        //cashierList.add(new Cashier(Integer.parseInt(idTextField.getText()),nameTextField.getText(),genderCB.getValue(), pwTextField.getText(), dobDatePicker.getValue()));
        //System.out.println(c);

}