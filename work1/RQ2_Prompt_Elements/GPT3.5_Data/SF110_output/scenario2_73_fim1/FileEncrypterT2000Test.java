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

    private static FileEncrypter fileEncrypter;
    private byte[] key;

    /**
     * Constructor
     */
    private FileEncrypter(byte[] key) {
        this.key = key;
    }

    /**
     * Singleton
     */
    public static FileEncrypter getInstance() {
        if (fileEncrypter == null)
            fileEncrypter = new FileEncrypter("FIM".getBytes());
        return fileEncrypter;
    }

    /**
     * Encrypts a file using AES encryption algorithm.
     * @param inputFile the file to be encrypted
     * @param outputFile the encrypted file
     * @throws IOException if an I/O error occurs
     */
    public void encrypt(File inputFile, File outputFile) throws IOException {
        FileInputStream inputStream = new FileInputStream(inputFile);
        FileOutputStream outputStream = new FileOutputStream(outputFile);
        try {
            byte[] iv = new byte[16];
            IvParameterSpec ivParameterSpec = new IvParameterSpec(iv);
            SecretKeySpec secretKeySpec = new SecretKeySpec(key, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, ivParameterSpec);
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                byte[] output = cipher.update(buffer, 0, bytesRead);
                if (output != null)
                    outputStream.write(output);
            }
            byte[] output = cipher.doFinal();
            if (output != null)
                outputStream.write(output);
        } catch (Exception e) {
            throw new IOException("Error encrypting file", e);
        } finally {
            inputStream.close();
            outputStream.close();
        }
    }

    /**
     * Decrypts a file using AES encryption algorithm.
     * @param inputFile the encrypted file
     * @param outputFile the decrypted file
     * @throws IOException if an I/O error occurs
     */
    public void decrypt(File inputFile, File outputFile) throws IOException {
        FileInputStream inputStream = new FileInputStream(inputFile);
        FileOutputStream outputStream = new FileOutputStream(outputFile);
        try {
            byte[] iv = new byte[16];
            IvParameterSpec ivParameterSpec = new IvParameterSpec(iv);
            SecretKeySpec secretKeySpec = new SecretKeySpec(key, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec, ivParameterSpec);
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                byte[] output = cipher.update(buffer, 0, bytesRead);
                if (output != null)
                    outputStream.write(output);
            }
            byte[] output = cipher.doFinal();
            if (output != null)
                outputStream.write(output);
        } catch (Exception e) {
            throw new IOException("Error decrypting file", e);
        } finally {
            inputStream.close();
            outputStream.close();
        }
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
     * Test case for singleton pattern.
     */
    @Test
    void testSingleton() {
        FileEncrypter fileEncrypter1 = FileEncrypter.getInstance();
        FileEncrypter fileEncrypter2 = FileEncrypter.getInstance();
        assertSame(fileEncrypter1, fileEncrypter2);
    }

    /**
     * Test case for encrypting and decrypting a file.
     */
    @Test
    void testEncryptDecrypt() throws IOException {
        File inputFile = new File("input.txt");
        File encryptedFile = new File("encrypted.txt");
        File decryptedFile = new File("decrypted.txt");
        String inputText = "This is a test.";
        FileOutputStream outputStream = new FileOutputStream(inputFile);
        outputStream.write(inputText.getBytes());
        outputStream.close();
        FileEncrypter fileEncrypter = FileEncrypter.getInstance();
        fileEncrypter.encrypt(inputFile, encryptedFile);
        fileEncrypter.decrypt(encryptedFile, decryptedFile);
        FileInputStream inputStream = new FileInputStream(decryptedFile);
        byte[] buffer = new byte[1024];
        int bytesRead = inputStream.read(buffer);
        String decryptedText = new String(buffer, 0, bytesRead);
        inputStream.close();
        assertEquals(inputText, decryptedText);
    }
}