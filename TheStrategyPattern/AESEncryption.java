package TheStrategyPattern;

public class AESEncryption implements EncryptionStrategy {
    @Override
    public String encrypt(String data) {
        return "[AES] Encrypting '" + data + "' using Advanced Encryption Standard.";
    }
}
