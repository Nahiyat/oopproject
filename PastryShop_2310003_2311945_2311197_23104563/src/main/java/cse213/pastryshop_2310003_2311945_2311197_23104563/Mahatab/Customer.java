package cse213.pastryshop_2310003_2311945_2311197_23104563.Mahatab;

public class Customer {
    private String userID;
    private String userPassword;
    private String userPhoneNumber;

    public Customer(String userID, String userPassword, String userPhoneNumber) {
        this.userID = userID;
        this.userPassword = userPassword;
        this.userPhoneNumber = userPhoneNumber;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }



}