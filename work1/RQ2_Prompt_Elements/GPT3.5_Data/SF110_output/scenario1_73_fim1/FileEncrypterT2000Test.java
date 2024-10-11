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
* It contains ten unit test cases for the {@link FileEncrypter#getInstance()} method.
*/
class FileEncrypterTest {

    /**
     * Test case for checking if getInstance() method returns the same instance.
     */
    @Test
    void testGetInstanceReturnsSameInstance() {
        FileEncrypter fileEncrypter1 = FileEncrypter.getInstance();
        FileEncrypter fileEncrypter2 = FileEncrypter.getInstance();
        assertSame(fileEncrypter1, fileEncrypter2);
    }

    /**
     * Test case for checking if getInstance() method returns a non-null instance.
     */
    @Test
    void testGetInstanceReturnsNonNullInstance() {
        FileEncrypter fileEncrypter = FileEncrypter.getInstance();
        assertNotNull(fileEncrypter);
    }

    /**
     * Test case for checking if getInstance() method returns an instance of FileEncrypter.
     */
    @Test
    void testGetInstanceReturnsInstanceOfFileEncrypter() {
        FileEncrypter fileEncrypter = FileEncrypter.getInstance();
        assertTrue(fileEncrypter instanceof FileEncrypter);
    }

    /**
     * Test case for checking if getInstance() method returns an instance with a non-null cipher.
     */
    @Test
    void testGetInstanceReturnsInstanceWithNonNullCipher() {
        FileEncrypter fileEncrypter = FileEncrypter.getInstance();
        assertNotNull(fileEncrypter.getCipher());
    }

    /**
     * Test case for checking if getInstance() method returns an instance with a cipher initialized for encryption.
     */
    @Test
    void testGetInstanceReturnsInstanceWithCipherInitializedForEncryption() {
        FileEncrypter fileEncrypter = FileEncrypter.getInstance();
        assertEquals(Cipher.ENCRYPT_MODE, fileEncrypter.getCipher().getMode());
    }

    /**
     * Test case for checking if getInstance() method returns an instance with a non-null initialization vector.
     */
    @Test
    void testGetInstanceReturnsInstanceWithNonNullInitializationVector() {
        FileEncrypter fileEncrypter = FileEncrypter.getInstance();
        assertNotNull(fileEncrypter.getInitializationVector());
    }

    /**
     * Test case for checking if getInstance() method returns an instance with a non-null secret key.
     */
    @Test
    void testGetInstanceReturnsInstanceWithNonNullSecretKey() {
        FileEncrypter fileEncrypter = FileEncrypter.getInstance();
        assertNotNull(fileEncrypter.getSecretKey());
    }

    /**
     * Test case for checking if getInstance() method returns an instance with a secret key of length 16.
     */
    @Test
    void testGetInstanceReturnsInstanceWithSecretKeyOfLength16() {
        FileEncrypter fileEncrypter = FileEncrypter.getInstance();
        assertEquals(16, fileEncrypter.getSecretKey().getEncoded().length);
    }

    /**
     * Test case for checking if getInstance() method returns an instance with a non-null algorithm.
     */
    @Test
    void testGetInstanceReturnsInstanceWithNonNullAlgorithm() {
        FileEncrypter fileEncrypter = FileEncrypter.getInstance();
        assertNotNull(fileEncrypter.getAlgorithm());
    }

    /**
     * Test case for checking if getInstance() method returns an instance with the correct algorithm.
     */
    @Test
    void testGetInstanceReturnsInstanceWithCorrectAlgorithm() {
        FileEncrypter fileEncrypter = FileEncrypter.getInstance();
        assertEquals("AES/CBC/PKCS5Padding", fileEncrypter.getAlgorithm());
    }
}