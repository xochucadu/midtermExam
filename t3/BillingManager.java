package t3;

// BillingManager class is responsible for managing billing operations
public class BillingManager {
    private String storeName;
    private double totalAmount;

    public BillingManager(String storeName) {
        this.storeName = storeName;
        this.totalAmount = 0.0;
    }

    public void addTransaction(double amount) {
        totalAmount += amount;
        System.out.println("Transaction added: Amount = " + amount + " at store " + storeName);
    }

    public void generateReceipt() {
        System.out.println("Receipt generated for store " + storeName + ": Total Amount = " + totalAmount);
    }
}
