public class Customer implements Runnable {
    private Store store;
    private String customerName;

    public Customer(Store store, String customerName) {
        this.store = store;
        this.customerName = customerName;
    }

    @Override
    public void run() {
        store.buyProduct(customerName);
    }
}
