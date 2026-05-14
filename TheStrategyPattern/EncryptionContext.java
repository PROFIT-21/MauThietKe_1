package TheStrategyPattern;

public class EncryptionContext {
    private EncryptionStrategy strategy;

    // Cho phép thay đổi thuật toán lúc đang chạy
    public void setStrategy(EncryptionStrategy strategy) {
        this.strategy = strategy;
    }

    public void encryptData(String data) {
        if (strategy == null) {
            System.out.println("No encryption strategy set!");
        } else {
            System.out.println(strategy.encrypt(data));
        }
    }
}
