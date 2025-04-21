package cse213.pastryshop_2310003_2311945_2311197_23104563.Mahatab;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import java.io.FileWriter;
import java.io.IOException;

public class CustomerRegistrationController {

    @FXML
    private TextField userIDFX;

    @FXML
    private TextField userPasswordFX;

    @FXML
    private TextField userPhoneNumberFX;

    private boolean validateUser(String userID, String userPassword, String userPhoneNumber) {
        if (userID.length()<4) {
            return false;
        }
        String[] numbers = {"0","1","2","3","4","5","6","7","8","9"};
        boolean hasNumber = false;
        for (String number: numbers) {
            if (userPassword.contains(number)) {
                hasNumber = true;
            }
        }
        if (!hasNumber ||  userPassword.length()<6) {
            return false;
        }
        if (userPhoneNumber.length()<11) {
            return false;
        }

        return true;
    }

    @FXML
    void createAccountBtn(ActionEvent event) {
        String userID = userIDFX.getText();
        String userPassword = userPasswordFX.getText();
        String userPhoneNumber = userPhoneNumberFX.getText();
        Alert alert = new Alert(Alert.AlertType.ERROR);


        boolean isRegValid = this.validateUser(userID,userPassword,userPhoneNumber);

        if (!isRegValid)  {
            alert.setTitle("Incorrect Credentials");
            alert.setContentText("Username should have minimum 4 characters" +
                    "Password minimum 6 with one number AT LEAST" +
                    "  Phone Numbers MUST contain 11 digits ");
            alert.showAndWait();
            return;

        }

        try {
            FileWriter  writer = new FileWriter("Customers.txt", true);
            writer.write(userID + "|" + userPassword + "|" + userPhoneNumber + "\n");
            writer.close();

            Alert success = new Alert(Alert.AlertType.INFORMATION);
            success.setTitle("Success!");
            success.setHeaderText("Successful!!!");
            success.setContentText("You are now an official Customer!!!");
            success.showAndWait();



        }

        catch (IOException e) {
            e.printStackTrace();
            alert.setTitle("ERROR");
            alert.setHeaderText("PLEASE TRY AGAIN");
            alert.setContentText("SOMETHING WENT WRONG");
        }






    }

}
