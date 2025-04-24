package t3;

public class StoreManager {
    private String storeName;
    private String storeOwner;
    private String storeLocation;

    public StoreManager(String storeName, String storeOwner, String storeLocation) {
        this.storeName = storeName;
        this.storeOwner = storeOwner;
        this.storeLocation = storeLocation;
    }

    public void registerStore() {
        System.out.println("Store " + storeName + " has been registered in location: " + storeLocation);
    }

    public void updateStoreDetails(String newOwner, String newLocation) {
        this.storeOwner = newOwner;
        this.storeLocation = newLocation;
        System.out.println("Store details updated: Owner - " + newOwner + ", Location - " + newLocation);
    }

    public void deleteStore() {
        System.out.println("Store " + storeName + " has been deleted.");
    }

    // Getter method to access the storeName field
    public String getStoreName() {
        return storeName;
    }
}
