package Factory_Method;

public class CandyApp {
	public static void main(String[] args) {
        // Khởi tạo factory
        CandyFactory factory = new CandyFactory();
        
        // Khởi tạo store với factory đó
        CandyStore store = new CandyStore(factory);

        System.out.println("--- Khach hang A mua Chocolate ---");
        store.orderCandy("chocolate");

        System.out.println("\n--- Khach hang B mua Keo cung ---");
        store.orderCandy("hard");
    }

}
