package TheStrategyPattern;

public class RSAEncryption implements EncryptionStrategy {
    @Override
    public String encrypt(String data) {
        return "[RSA] Encrypting '" + data + "' using Rivest–Shamir–Adleman.";
    }
}
