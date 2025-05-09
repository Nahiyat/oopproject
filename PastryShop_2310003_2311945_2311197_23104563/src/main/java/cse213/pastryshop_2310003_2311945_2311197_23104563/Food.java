package cse213.pastryshop_2310003_2311945_2311197_23104563;

import cse213.pastryshop_2310003_2311945_2311197_23104563.Shadman.U1Product;

import java.io.Serializable;
import java.time.LocalDate;

public class Food extends U1Product implements Serializable {
    String  foodType;
    String id= Integer.toString(super.getProductId());
    String foodName= super.getName();
    LocalDate expiryDate;
    int stockAmount;
    float price;

    public Food(String id, String foodName, String foodType, LocalDate expiryDate, int stockAmount, float price) {
        this.id = id;
        this.foodName = foodName;
        this.foodType = foodType;
        this.expiryDate = expiryDate;
        this.stockAmount = stockAmount;
        this.price = price;
    }

    public Food() {
        super();

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
