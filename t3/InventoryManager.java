package t3;

// InventoryManager class is responsible for managing the inventory of each store
public class InventoryManager {
    private String storeName;
    private String[] inventoryItems;

    public InventoryManager(String storeName, String[] inventoryItems) {
        this.storeName = storeName;
        this.inventoryItems = inventoryItems;
    }

    public void addItem(String item) {
        System.out.println("Item " + item + " has been added to " + storeName + "'s inventory.");
    }

    public void removeItem(String item) {
        System.out.println("Item " + item + " has been removed from " + storeName + "'s inventory.");
    }

    public void displayInventory() {
        System.out.println("Inventory for " + storeName + ":");
        for (String item : inventoryItems) {
            System.out.println("- " + item);
        }
    }
}
