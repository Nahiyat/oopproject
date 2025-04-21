package cse213.pastryshop_2310003_2311945_2311197_23104563.Shadman_2310563;

import java.time.LocalDate;

public class U1Product {
    private int productId;
    private String name;
    private LocalDate expiryDate;

    public U1Product(Integer productId, String name, LocalDate expiryDate) {
        this.productId = productId;
        this.name = name;
        this.expiryDate = expiryDate;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "U1Product{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", expiryDate=" + expiryDate +
                '}';
    }
}
