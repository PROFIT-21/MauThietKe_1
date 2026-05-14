package TheStrategyPattern;

public class Main {
    public static void main(String[] args) {
        EncryptionContext context = new EncryptionContext();

        // Sử dụng lớp cụ thể
        context.setStrategy(new AESEncryption());
        context.encryptData("MySecretPassword");

        // Thay đổi sang thuật toán khác
        context.setStrategy(new RSAEncryption());
        context.encryptData("MySecretPassword");

        // Sử dụng Lambda (Java 8+) cho các thuật toán nhanh/tạm thời
        context.setStrategy(data -> "[Base64] Simple encoding for " + data);
        context.encryptData("MySecretPassword");
    }
}