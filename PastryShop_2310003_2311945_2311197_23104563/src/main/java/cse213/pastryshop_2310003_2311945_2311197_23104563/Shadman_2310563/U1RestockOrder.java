package cse213.pastryshop_2310003_2311945_2311197_23104563.Shadman_2310563;

public class U1RestockOrder {
    public class RestockOrder {
        private int orderId;
        private String productName;
        private Boolean isUrgent;

        public int getOrderId() {
            return orderId;
        }

        public void setOrderId(int orderId) {
            this.orderId = orderId;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public Boolean getUrgent() {
            return isUrgent;
        }

        public void setUrgent(Boolean urgent) {
            isUrgent = urgent;
        }

        @Override
        public String toString() {
            return "RestockOrder{" +
                    "orderId=" + orderId +
                    ", productName='" + productName + '\'' +
                    ", isUrgent=" + isUrgent +
                    '}';
        }

        public RestockOrder(String productName, Boolean isUrgent, int orderId) {
            this.productName = productName;
            this.isUrgent = isUrgent;
            this.orderId = orderId;
        }
    }
}
