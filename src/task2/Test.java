package task2;

/**
 * Created by VSB on 11.05.2019.
 * task2
 */
public class Test {
    public static void main(String[] args) {
        String key = "key";
        String text = "text";
        int alg = 1;

        EncryptionApp encryptionApp = new EncryptionApp(alg);
        Encryption encryption = encryptionApp != null ? encryptionApp.getEncryption() : null;

        String cryptedText = null;
        if (encryption != null) cryptedText = encryption.crypt(text, key);

    }
}
