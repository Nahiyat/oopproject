package cse213.pastryshop_2310003_2311945_2311197_2310563;

public class Cart{
    String foodName;
    int quantity;
    float price;

    public Cart(String foodName, int quantity, float price) {

        this.foodName = foodName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "foodName='" + foodName + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
