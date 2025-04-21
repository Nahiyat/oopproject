package cse213.pastryshop_2310003_2311945_2311197_23104563.Shadman_2310563;

public class U1PriceUpdate {private int updateId;
    private int productId;
    private String productName;
    private float oldPrice;
    private float newPrice;

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

    public void setOldPrice(float oldPrice) {
        this.oldPrice = oldPrice;
    }

    public double getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(float newPrice) {
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

    public U1PriceUpdate(int updateId, int productId, String productName, float oldPrice, float newPrice) {
        this.updateId = updateId;
        this.productId = productId;
        this.productName = productName;
        this.oldPrice = oldPrice;
        this.newPrice = newPrice;

    }
}
