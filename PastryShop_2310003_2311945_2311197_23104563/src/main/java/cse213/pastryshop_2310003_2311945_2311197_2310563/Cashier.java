package cse213.pastryshop_2310003_2311945_2311197_2310563;

import java.time.LocalDate;
import java.time.LocalTime;

public class Cashier extends Employee {

    String workingDays;
    String workShift;
    int cashierId= super.getId();
    String cashierName= super.getName();

    public Cashier(int cashierId, String cashierName, String workShift, String workingDays) {
        this.cashierId = cashierId;
        this.cashierName = cashierName;
        this.workShift = workShift;
        this.workingDays = workingDays;
    }

    public Cashier(int id, String name, String gender, String password, LocalDate dateOfBirth, float salary, LocalDate dateOfJoining, String workingDays, String workShift) {
        super(id, name, gender, password, dateOfBirth, salary, dateOfJoining);
        this.workingDays = workingDays;
        this.workShift = workShift;
    }

    public Cashier(int id, String name, String gender, String password, LocalDate dateOfBirth) {
        super(id, name, gender, password, dateOfBirth);
    }

    public String getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(String workingDays) {
        this.workingDays = workingDays;
    }

    public String getWorkShift() {
        return workShift;
    }

    public void setWorkShift(String workShift) {
        this.workShift = workShift;
    }

    @Override
    public String toString() {
        return "Cashier{" +
                "workingDays=" + workingDays +
                ", workShift='" + workShift + '\'' +
                ", salary=" + salary +
                ", dateOfJoining=" + dateOfJoining +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", password='" + password + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }


}
