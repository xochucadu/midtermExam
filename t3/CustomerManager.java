package t3;

// CustomerManager class is responsible for managing customer data
public class CustomerManager {
    private String customerName;
    private String customerEmail;

    public CustomerManager(String customerName, String customerEmail) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
    }

    public void registerCustomer() {
        System.out.println("Customer " + customerName + " has been registered with email: " + customerEmail);
    }

    public void updateCustomerDetails(String newEmail) {
        this.customerEmail = newEmail;
        System.out.println("Customer email updated to: " + newEmail);
    }

    public void deleteCustomer() {
        System.out.println("Customer " + customerName + " has been deleted.");
    }
}
