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

        Encryption encryption = new EncryptionApp(alg).getEncryption();
        String cryptedText = encryption.crypt(text, key);

    }
}
