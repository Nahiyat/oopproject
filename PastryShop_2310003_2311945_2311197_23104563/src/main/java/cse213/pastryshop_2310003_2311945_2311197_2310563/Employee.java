package cse213.pastryshop_2310003_2311945_2311197_2310563;

import java.time.LocalDate;

public abstract class Employee extends User{
    protected float salary;
    protected LocalDate dateOfJoining;

    public Employee(int id, String name, String gender, String password, LocalDate dateOfBirth, float salary, LocalDate dateOfJoining) {
        super(id, name, gender, password, dateOfBirth);
        this.salary = salary;
        this.dateOfJoining = dateOfJoining;
    }

    public Employee() {
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public LocalDate getDateOfJoining() {
        return dateOfJoining;
    }

    public void setDateOfJoining(LocalDate dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", dateOfJoining=" + dateOfJoining +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", password='" + password + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
