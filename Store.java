public class Store {
    private int productCount = 10; // Початкова кількість товарів

    public synchronized void buyProduct(String customerName) {
        System.out.println(customerName + "купівля товару");

        productCount--; // Зменшення кількості товарів
        System.out.println("Інші продукти : " + productCount);

        try {
            Thread.sleep(2000); // Симулювати деяку роботу під час покупки
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
