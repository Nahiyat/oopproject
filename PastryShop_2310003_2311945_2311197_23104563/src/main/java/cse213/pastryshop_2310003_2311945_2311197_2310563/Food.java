package cse213.pastryshop_2310003_2311945_2311197_2310563;

import java.awt.*;
import java.time.LocalDate;

public class Food {
    String id, foodName, foodType;
    LocalDate expiryDate;
    int stockAmount;
    float price;
    Button addToCart= new Button();

    public Food(String id, String foodName, String foodType, LocalDate expiryDate, int stockAmount, float price) {
        this.id = id;
        this.foodName = foodName;
        this.foodType = foodType;
        this.expiryDate = expiryDate;
        this.stockAmount = stockAmount;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Food{" +
                "id='" + id + '\'' +
                ", foodName='" + foodName + '\'' +
                ", foodType='" + foodType + '\'' +
                ", expiryDate=" + expiryDate +
                ", stockAmount=" + stockAmount +
                ", price=" + price +
                '}';
    }


}
