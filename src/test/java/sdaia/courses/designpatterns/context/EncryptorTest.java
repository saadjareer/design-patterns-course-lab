package sdaia.courses.designpatterns.context;

import org.junit.Test;
import sdaia.courses.designpatterns.strategy.context.Encryptor;
import sdaia.courses.designpatterns.strategy.strategies.AesEncryptionStrategy;
import sdaia.courses.designpatterns.strategy.strategies.BlowfishEncryptionStrategy;
import sdaia.courses.designpatterns.strategy.strategies.EncryptionStrategy;


public class EncryptorTest {

    @Test
    public void testEncrypt() throws Exception {
      EncryptionStrategy aesStrategy=new AesEncryptionStrategy();
      Encryptor aesEncryptor=new Encryptor(aesStrategy);
      aesEncryptor.setPlainText("This is plain text");
      aesEncryptor.encrypt();

        EncryptionStrategy blowfishStrategy=new BlowfishEncryptionStrategy();
        Encryptor blowfishEncryptor=new Encryptor(blowfishStrategy);
        blowfishEncryptor.setPlainText("This is plain text");
        blowfishEncryptor.encrypt();
    }
}
