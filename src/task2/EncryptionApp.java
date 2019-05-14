package task2;

/**
 * Created by VSB on 11.05.2019.
 * task2
 */
public class EncryptionApp {
    private Encryption encryption;

    public EncryptionApp(Integer i) {
        if (i == 0) encryption = new DEScrypt();
        if (i == 1) encryption = new RSAcrypt();
        if (i == 1) encryption = new GOSTcrypt();
    }

    public Encryption getEncryption() {
        return encryption;
    }

    public void setEncryption(Encryption encryption) {
        this.encryption = encryption;
    }
}
