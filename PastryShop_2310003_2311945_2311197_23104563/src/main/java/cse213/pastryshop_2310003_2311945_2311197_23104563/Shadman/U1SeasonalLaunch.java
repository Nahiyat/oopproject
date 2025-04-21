package cse213.pastryshop_2310003_2311945_2311197_23104563.Shadman;

import java.time.LocalDate;

public class U1SeasonalLaunch { private int launchId;
    private String productName;
    private LocalDate plannedDate;
    private LocalDate productionStart;

    public U1SeasonalLaunch(int launchId, String productName, LocalDate plannedDate, LocalDate productionStart, String status) {
        this.launchId = launchId;
        this.productName = productName;
        this.plannedDate = plannedDate;
        this.productionStart = productionStart;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getProductionStart() {
        return productionStart;
    }

    public void setProductionStart(LocalDate productionStart) {
        this.productionStart = productionStart;
    }

    public LocalDate getPlannedDate() {
        return plannedDate;
    }

    public void setPlannedDate(LocalDate plannedDate) {
        this.plannedDate = plannedDate;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getLaunchId() {
        return launchId;
    }

    public void setLaunchId(int launchId) {
        this.launchId = launchId;
    }

    @Override
    public String toString() {
        return "U1SeasonalLaunch{" +
                "launchId=" + launchId +
                ", productName='" + productName + '\'' +
                ", plannedDate=" + plannedDate +
                ", productionStart=" + productionStart +
                ", status='" + status + '\'' +
                '}';
    }

    private String status;

}
