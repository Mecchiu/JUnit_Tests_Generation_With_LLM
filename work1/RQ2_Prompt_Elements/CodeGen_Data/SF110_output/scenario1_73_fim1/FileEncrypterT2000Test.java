// FileEncrypterTest.java
package osa.ora.server.utils;

// -----------------------------------------------------------------------------
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.crypto.Cipher;
import java.io.IOException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileEncrypter}.
* It contains one unit test case for the {@link FileEncrypter#getInstance()} method.
*/
class FileEncrypterTest {

	@Test
    public void testEncrypterClass() throws IOException {
        String iv = "00";
        FileEncrypter enc = new FileEncrypter(iv);

        byte[] data = new byte[10];
        data[0] = 0;
        for (int i = 1; i < 10; i++) {
            byte byte2 = 0;
            if (i % 2 == 0)
                byte2 = i;
            data[i] = byte2;// 0 for little-endian
        }

        try {
            enc.encrypter(data, 0, data.length);
            fail("Should throw IllegalArgumentException");
            
        } catch (IllegalArgumentException | IOException e) {
            // this is expected
        }

        File file = File.createTempFile("FIM".getBytes(), "tmp");

        try (FileOutputStream fileOut = new FileOutputStream(file)) {
            enc.encrypter(data, 0, data.length);
        }
        try (FileInputStream fileIn1 = new FileInputStream(file)) {
            byte[] dataIn = new byte[10];
            fileIn1.read(dataIn);
            assertTrue(Arrays.equals(data, dataIn));
        }
    }
	
}