package cse213.pastryshop_2310003_2311945_2311197_23104563.Shadman;

import java.time.LocalDate;

public class U1ReturnDispute {private int disputeId;
    private int productId;
    private String productName;
    private LocalDate returnDate;
    private String status; // "Pending", "Approved", "Rejected"
    private String reason;

    public int getDisputeId() {
        return disputeId;
    }

    public void setDisputeId(int disputeId) {
        this.disputeId = disputeId;
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

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "U1ReturnDispute{" +
                "disputeId=" + disputeId +
                ", productId=" + productId +
                ", productName='" + productName + '\'' +
                ", returnDate=" + returnDate +
                ", status='" + status + '\'' +
                ", reason='" + reason + '\'' +
                '}';
    }

    public U1ReturnDispute(int disputeId, int productId, String productName, LocalDate returnDate, String status, String reason) {
        this.disputeId = disputeId;
        this.productId = productId;
        this.productName = productName;
        this.returnDate = returnDate;
        this.status = status;
        this.reason = reason;
    }
}
