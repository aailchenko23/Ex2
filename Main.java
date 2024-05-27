public class Main {
    public static void main(String[] args) {
            Store store = new Store();

            Customer customer = new Customer(store, "Покупець:");

            Thread thread = new Thread(customer);
            thread.start();
    }
}