package sdaia.courses.designpatterns.strategy.strategies;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class BlowfishEncryptionStrategy implements EncryptionStrategy{
    @Override
    public void encryptData(String plaintext) {
        System.out.println("\n-------Encrypting data using Blowfish algorithm-------");
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("Blowfish");
            keyGenerator.init(128);
            SecretKey secretKey = keyGenerator.generateKey();
            byte[] plaintTextByteArray = plaintext.getBytes("UTF8");

            Cipher cipher = Cipher.getInstance("Blowfish");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] cipherText = cipher.doFinal(plaintTextByteArray);

            System.out.println("Original data: " + plaintext);
            System.out.println("Encrypted data:");
            for (byte b : cipherText) {
                System.out.print(b + " ");

            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
