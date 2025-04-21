package cse213.pastryshop_2310003_2311945_2311197_23104563.Shadman_2310563;

import java.time.LocalDate;

public class U1SalesRecord {private int recordId;
    private String productName;
    private int week1Sales;
    private int week2Sales;
    private LocalDate reportDate;

    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getWeek1Sales() {
        return week1Sales;
    }

    public void setWeek1Sales(int week1Sales) {
        this.week1Sales = week1Sales;
    }

    public int getWeek2Sales() {
        return week2Sales;
    }

    public void setWeek2Sales(int week2Sales) {
        this.week2Sales = week2Sales;
    }

    public LocalDate getReportDate() {
        return reportDate;
    }

    public void setReportDate(LocalDate reportDate) {
        this.reportDate = reportDate;
    }

    @Override
    public String toString() {
        return "U1SalesRecord{" +
                "recordId=" + recordId +
                ", productName='" + productName + '\'' +
                ", week1Sales=" + week1Sales +
                ", week2Sales=" + week2Sales +
                ", reportDate=" + reportDate +
                '}';
    }

    public U1SalesRecord(int recordId, String productName, LocalDate reportDate, int week2Sales, int week1Sales) {
        this.recordId = recordId;
        this.productName = productName;
        this.reportDate = reportDate;
        this.week2Sales = week2Sales;
        this.week1Sales = week1Sales;
    }
}
