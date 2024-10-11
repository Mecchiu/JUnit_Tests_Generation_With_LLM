// FileEncrypter.java
package osa.ora.server.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.crypto.Cipher;
import java.io.IOException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class FileEncrypter {

    private static FileEncrypter instance;

    /**
     * Private constructor to prevent instantiation from outside the class.
     */
    private FileEncrypter() {}

    /**
     * Singleton method to get the instance of the FileEncrypter class.
     * @return the instance of the FileEncrypter class.
     */
    public static FileEncrypter getInstance() {
        if (instance == null) {
            instance = new FileEncrypter();
        }
        return instance;
    }

    /**
     * Encrypts a file using AES encryption.
     * @param inputFile the file to be encrypted.
     * @param outputFile the encrypted file.
     * @param key the encryption key.
     * @param initVector the initialization vector.
     * @throws Exception if an error occurs during encryption.
     */
    public void encryptFile(File inputFile, File outputFile, String key, String initVector) throws Exception {
        IvParameterSpec iv = new IvParameterSpec(initVector.getBytes("UTF-8"));
        SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");

        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
        cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);

        FileInputStream inputStream = new FileInputStream(inputFile);
        byte[] inputBytes = new byte[(int) inputFile.length()];
        inputStream.read(inputBytes);

        byte[] outputBytes = cipher.doFinal(inputBytes);

        FileOutputStream outputStream = new FileOutputStream(outputFile);
        outputStream.write(outputBytes);

        inputStream.close();
        outputStream.close();
    }

    /**
     * Decrypts a file using AES decryption.
     * @param inputFile the file to be decrypted.
     * @param outputFile the decrypted file.
     * @param key the decryption key.
     * @param initVector the initialization vector.
     * @throws Exception if an error occurs during decryption.
     */
    public void decryptFile(File inputFile, File outputFile, String key, String initVector) throws Exception {
        IvParameterSpec iv = new IvParameterSpec(initVector.getBytes("UTF-8"));
        SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");

        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
        cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);

        FileInputStream inputStream = new FileInputStream(inputFile);
        byte[] inputBytes = new byte[(int) inputFile.length()];
        inputStream.read(inputBytes);

        byte[] outputBytes = cipher.doFinal(inputBytes);

        FileOutputStream outputStream = new FileOutputStream(outputFile);
        outputStream.write(outputBytes);

        inputStream.close();
        outputStream.close();
    }
}

// FileEncrypterTest.java
package osa.ora.server.utils;

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
     * Test case to check if the getInstance() method returns the same instance.
     */
    @Test
    public void testGetInstance() {
        FileEncrypter instance1 = FileEncrypter.getInstance();
        FileEncrypter instance2 = FileEncrypter.getInstance();
        assertSame(instance1, instance2);
    }

    /**
     * Test case to check if the encryptFile() method encrypts a file correctly.
     */
    @Test
    public void testEncryptFile() throws Exception {
        File inputFile = new File("input.txt");
        File encryptedFile = new File("encrypted.txt");
        String key = "Bar12345Bar12345";
        String initVector = "RandomInitVector";

        FileEncrypter.getInstance().encryptFile(inputFile, encryptedFile, key, initVector);

        assertTrue(encryptedFile.exists());
        assertTrue(encryptedFile.length() > 0);
    }

    /**
     * Test case to check if the decryptFile() method decrypts a file correctly.
     */
    @Test
    public void testDecryptFile() throws Exception {
        File inputFile = new File("encrypted.txt");
        File decryptedFile = new File("decrypted.txt");
        String key = "Bar12345Bar12345";
        String initVector = "RandomInitVector";

        FileEncrypter.getInstance().decryptFile(inputFile, decryptedFile, key, initVector);

        assertTrue(decryptedFile.exists());
        assertTrue(decryptedFile.length() > 0);
    }

    /**
     * Test case to check if the encryptFile() method throws an exception when the input file is null.
     */
    @Test
    public void testEncryptFileWithNullInputFile() {
        File inputFile = null;
        File encryptedFile = new File("encrypted.txt");
        String key = "Bar12345Bar12345";
        String initVector = "RandomInitVector";

        assertThrows(Exception.class, () -> {
            FileEncrypter.getInstance().encryptFile(inputFile, encryptedFile, key, initVector);
        });
    }

    /**
     * Test case to check if the encryptFile() method throws an exception when the output file is null.
     */
    @Test
    public void testEncryptFileWithNullOutputFile() {
        File inputFile = new File("input.txt");
        File encryptedFile = null;
        String key = "Bar12345Bar12345";
        String initVector = "RandomInitVector";

        assertThrows(Exception.class, () -> {
            FileEncrypter.getInstance().encryptFile(inputFile, encryptedFile, key, initVector);
        });
    }

    /**
     * Test case to check if the decryptFile() method throws an exception when the input file is null.
     */
    @Test
    public void testDecryptFileWithNullInputFile() {
        File inputFile = null;
        File decryptedFile = new File("decrypted.txt");
        String key = "Bar12345Bar12345";
        String initVector = "RandomInitVector";

        assertThrows(Exception.class, () -> {
            FileEncrypter.getInstance().decryptFile(inputFile, decryptedFile, key, initVector);
        });
    }

    /**
     * Test case to check if the decryptFile() method throws an exception when the output file is null.
     */
    @Test
    public void testDecryptFileWithNullOutputFile() {
        File inputFile = new File("encrypted.txt");
        File decryptedFile = null;
        String key = "Bar12345Bar12345";
        String initVector = "RandomInitVector";

        assertThrows(Exception.class, () -> {
            FileEncrypter.getInstance().decryptFile(inputFile, decryptedFile, key, initVector);
        });
    }

    /**
     * Test case to check if the encryptFile() method throws an exception when the key is null.
     */
    @Test
    public void testEncryptFileWithNullKey() {
        File inputFile = new File("input.txt");
        File encryptedFile = new File("encrypted.txt");
        String key = null;
        String initVector = "RandomInitVector";

        assertThrows(Exception.class, () -> {
            FileEncrypter.getInstance().encryptFile(inputFile, encryptedFile, key, initVector);
        });
    }

    /**
     * Test case to check if the decryptFile() method throws an exception when the key is null.
     */
    @Test
    public void testDecryptFileWithNullKey() {
        File inputFile = new File("encrypted.txt");
        File decryptedFile = new File("decrypted.txt");
        String key = null;
        String initVector = "RandomInitVector";

        assertThrows(Exception.class, () -> {
            FileEncrypter.getInstance().decryptFile(inputFile, decryptedFile, key, initVector);
        });
    }

    /**
     * Test case to check if the encryptFile() method throws an exception when the initialization vector is null.
     */
    @Test
    public void testEncryptFileWithNullInitVector() {
        File inputFile = new File("input.txt");
        File encryptedFile = new File("encrypted.txt");
        String key = "Bar12345Bar12345";
        String initVector = null;

        assertThrows(Exception.class, () -> {
            FileEncrypter.getInstance().encryptFile(inputFile, encryptedFile, key, initVector);
        });
    }

    /**
     * Test case to check if the decryptFile() method throws an exception when the initialization vector is null.
     */
    @Test
    public void testDecryptFileWithNullInitVector() {
        File inputFile = new File("encrypted.txt");
        File decryptedFile = new File("decrypted.txt");
        String key = "Bar12345Bar12345";
        String initVector = null;

        assertThrows(Exception.class, () -> {
            FileEncrypter.getInstance().decryptFile(inputFile, decryptedFile, key, initVector);
        });
    }
}