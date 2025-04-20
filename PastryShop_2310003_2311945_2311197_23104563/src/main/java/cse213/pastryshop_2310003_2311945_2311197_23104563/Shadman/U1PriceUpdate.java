package cse213.pastryshop_2310003_2311945_2311197_23104563.Shadman;

public class U1PriceUpdate {private int updateId;
    private int productId;
    private String productName;
    private double oldPrice;
    private double newPrice;

    public int getUpdateId() {
        return updateId;
    }

    public void setUpdateId(int updateId) {
        this.updateId = updateId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(double oldPrice) {
        this.oldPrice = oldPrice;
    }

    public double getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(double newPrice) {
        this.newPrice = newPrice;
    }

    @Override
    public String toString() {
        return "U1PriceUpdate{" +
                "updateId=" + updateId +
                ", productId=" + productId +
                ", productName='" + productName + '\'' +
                ", oldPrice=" + oldPrice +
                ", newPrice=" + newPrice +
                '}';
    }

    public U1PriceUpdate(int updateId, int productId, String productName, double oldPrice, double newPrice) {
        this.updateId = updateId;
        this.productId = productId;
        this.productName = productName;
        this.oldPrice = oldPrice;
        this.newPrice = newPrice;

    }
}
