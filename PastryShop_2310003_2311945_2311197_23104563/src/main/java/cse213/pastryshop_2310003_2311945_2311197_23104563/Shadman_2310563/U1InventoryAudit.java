package cse213.pastryshop_2310003_2311945_2311197_23104563.Shadman_2310563;

import java.time.LocalDate;

public class U1InventoryAudit {
    private int auditId;
    private int shopId;
    private String shopName;
    private int recordedStock;
    private int actualStock;
    private LocalDate auditDate;

    public int getAuditId() {
        return auditId;
    }

    public void setAuditId(int auditId) {
        this.auditId = auditId;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public int getRecordedStock() {
        return recordedStock;
    }

    public void setRecordedStock(int recordedStock) {
        this.recordedStock = recordedStock;
    }

    public int getActualStock() {
        return actualStock;
    }

    public void setActualStock(int actualStock) {
        this.actualStock = actualStock;
    }

    public LocalDate getAuditDate() {
        return auditDate;
    }

    public void setAuditDate(LocalDate auditDate) {
        this.auditDate = auditDate;
    }

    @Override
    public String toString() {
        return "U1InventoryAudit{" +
                "auditId=" + auditId +
                ", shopId=" + shopId +
                ", shopName='" + shopName + '\'' +
                ", recordedStock=" + recordedStock +
                ", actualStock=" + actualStock +
                ", auditDate=" + auditDate +
                '}';
    }

    public U1InventoryAudit(int auditId, int shopId, String shopName, int recordedStock, int actualStock, LocalDate auditDate) {
        this.auditId = auditId;
        this.shopId = shopId;
        this.shopName = shopName;
        this.recordedStock = recordedStock;
        this.actualStock = actualStock;
        this.auditDate = auditDate;
    }
}
