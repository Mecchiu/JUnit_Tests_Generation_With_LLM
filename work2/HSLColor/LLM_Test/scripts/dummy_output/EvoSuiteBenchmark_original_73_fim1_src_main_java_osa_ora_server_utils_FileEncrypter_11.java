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
		
    /**
     * Test method for {@link FileEncrypter#getInstance()}.
     */
    @Test
    public void testGetInstance() {
        assertNotNull(FileEncrypter.getInstance());
    }
		
    /**
     * Test method for {@link FileEncrypter#encode(java.io.File)}.
     */
    @Test
    public void testEncode() throws IOException {
        FileInputStream fis = null;
        try {
            File f = new File(FileEncrypterTest.class.getResource("Input" + File.separator + "FileEncrypterTest.txt").toURI());
            fis = new FileInputStream(f);
            FileOutputStream fos = new FileOutputStream(f);

            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(new byte[16], "AES"));
            byte[] byteArray = cipher.doFinal(fis);
            byteArray = cipher.doFinal(byteArray);
            byteArray = cipher.doFinal(byteArray);

            assertNotNull(byteArray);
            byte[] res = FileEncrypter.getInstance().encode(org.junit.jupiter.api.TestUtils.fileWithContent(new File("Input" + File.separator + "Output" + File.separator + "FileEncrypterTest.tmp")));
            assertNotNull(res);
            assertEquals(res.length, byteArray.length);
            assertArrayEquals(res, byteArray);
        } finally {
            if(fis!=null) {
                fis.close();
            }
        }
    }
		
}