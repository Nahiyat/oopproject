package cse213.pastryshop_2310003_2311945_2311197_23104563.Shadman;

import java.time.LocalDate;

public class U1Shipment {
    private int shipmentId;
    private String status; // "In Transit", "Delivered", "Delayed"
    private String productName;
    private LocalDate estimatedDelivery;

    public int getShipmentId() {
        return shipmentId;
    }

    public void setShipmentId(int shipmentId) {
        this.shipmentId = shipmentId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public LocalDate getEstimatedDelivery() {
        return estimatedDelivery;
    }

    public void setEstimatedDelivery(LocalDate estimatedDelivery) {
        this.estimatedDelivery = estimatedDelivery;
    }

    @Override
    public String toString() {
        return "U1Shipment{" +
                "shipmentId=" + shipmentId +
                ", status='" + status + '\'' +
                ", productName='" + productName + '\'' +
                ", estimatedDelivery=" + estimatedDelivery +
                '}';
    }

    public U1Shipment(int shipmentId, String status, String productName, LocalDate estimatedDelivery) {
        this.shipmentId = shipmentId;
        this.status = status;
        this.productName = productName;
        this.estimatedDelivery = estimatedDelivery;
    }

}