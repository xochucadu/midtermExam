package t3;

public class Main {
    public static void main(String[] args) {
        // Creating a StoreManager instance
        StoreManager storeManager = new StoreManager("Fashion Store", "John Doe", "Ground Floor");
        storeManager.registerStore();

        // Creating a CustomerManager instance
        CustomerManager customerManager = new CustomerManager("Alice", "alice@email.com");
        customerManager.registerCustomer();

        // Adding items to the store's inventory
        InventoryManager inventoryManager = new InventoryManager("Fashion Store", new String[]{"Shirt", "Jeans", "Jacket"});
        inventoryManager.addItem("Shoes");

        // Adding a transaction to the billing system
        BillingManager billingManager = new BillingManager("Fashion Store");
        billingManager.addTransaction(200.00);
        billingManager.generateReceipt();

        // Using the new promotion feature
        PromotionManager promotionManager = new PromotionManager("Winter Sale", "30% off on all items", 30);
        promotionManager.applyPromotion(storeManager);
        promotionManager.endPromotion();
    }
}
