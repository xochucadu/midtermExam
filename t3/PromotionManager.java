package t3;

public class PromotionManager {
    private String promotionName;
    private String description;
    private double discountPercentage;
    private boolean isActive;

    public PromotionManager(String promotionName, String description, double discountPercentage) {
        this.promotionName = promotionName;
        this.description = description;
        this.discountPercentage = discountPercentage;
        this.isActive = true;
    }

    public void applyPromotion(StoreManager store) {
        // Accessing storeName through the getter method
        System.out.println("Applying promotion " + promotionName + " to store " + store.getStoreName());
    }

    public void endPromotion() {
        this.isActive = false;
        System.out.println("Promotion " + promotionName + " has ended.");
    }
}
