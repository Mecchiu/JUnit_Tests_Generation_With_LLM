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

    private static FileEncrypter fileEncrypter = null;

    private Cipher enCipher;

    private Cipher deCipher;

    /**
     * Singleton
     */
    public static FileEncrypter getInstance() {
        if (fileEncrypter == null) {
            fileEncrypter = new FileEncrypter(null);
        }
        return fileEncrypter;
    }

    public static FileEncrypter getInstanceInit(byte[] strkey) {
        if (fileEncrypter == null) {
            fileEncrypter = new FileEncrypter(strkey);
        }
        return fileEncrypter;
    }

    /**
     * private Constructor used to create this object.  Responsible for setting
     * and initializing this object's encrypter and decrypter Cipher instances
     * given a Pass Phrase and algorithm.
     * @param strkey Pass the key used to initialize both the encrypter and
     *                   decrypter instances.
     */
    private FileEncrypter(byte[] strkey) {
        try {
            String algorithm = "Blowfish";
            SecretKeySpec key = new SecretKeySpec(strkey, algorithm);
            enCipher = Cipher.getInstance(algorithm);
            enCipher.init(Cipher.ENCRYPT_MODE, key);
            deCipher = Cipher.getInstance(algorithm);
            deCipher.init(Cipher.DECRYPT_MODE, key);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * to encrypt a box of byte array
     * @param to_encrypt
     * @return byte[]
     */
    private byte[] encryptBlowfish(byte[] to_encrypt) {
        try {
            return enCipher.doFinal(to_encrypt);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * to decrypt a box of byte array
     * @param to_decrypt
     * @return byte[]
     */
    private byte[] decryptBlowfish(byte[] to_decrypt) {
        try {
            return deCipher.doFinal(to_decrypt);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * to encrypt file using temp file and return the data into byte[]
     * and delete the temp file
     * @param file
     * @param file2
     * @return byte[] of encrypted file
     */
    public byte[] fileEncrypt(File file, File file2) {
        try {
            FileInputStream fis = new FileInputStream(file);
            FileOutputStream fos = new FileOutputStream(file2);
            byte[] buffer = new byte[1024];
            int noOfBytes = 0;
            while ((noOfBytes = fis.read(buffer)) != -1) {
                byte[] encryptedBuffer = encryptBlowfish(buffer);
                fos.write(encryptedBuffer, 0, noOfBytes);
            }
            fis.close();
            fos.close();
            byte[] encryptedData = new byte[(int) file2.length()];
            FileInputStream fis2 = new FileInputStream(file2);
            fis2.read(encryptedData);
            fis2.close();
            file2.delete();
            return encryptedData;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * to decrypt array of bytes and create an output file
     * @param inputData
     * @param file2 the decrypted file.
     */
    public void fileDecrypt(byte[] inputData, File file2) {
        try {
            FileOutputStream fos = new FileOutputStream(file2);
            byte[] buffer = new byte[1024];
            int noOfBytes = 0;
            byte[] decryptedBuffer = null;
            for (int i = 0; i < inputData.length; i += 1024) {
                if (i + 1024 < inputData.length) {
                    decryptedBuffer = decryptBlowfish(buffer);
                    fos.write(decryptedBuffer, 0, decryptedBuffer.length);
                } else {
                    byte[] remainingBytes = new byte[inputData.length - i];
                    System.arraycopy(inputData, i, remainingBytes, 0, remainingBytes.length);
                    decryptedBuffer = decryptBlowfish(remainingBytes);
                    fos.write(decryptedBuffer, 0, decryptedBuffer.length);
                }
            }
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * main test method
     * @param args
     */
    public static void main(String[] args) {
        // TODO: Implement main method for testing
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
    @Test
    void testGetInstance() {
        FileEncrypter fileEncrypter1 = FileEncrypter.getInstance();
        FileEncrypter fileEncrypter2 = FileEncrypter.getInstance();
        assertSame(fileEncrypter1, fileEncrypter2);
    }

    @Test
    void testGetInstanceInit() {
        byte[] key = "testkey".getBytes();
        FileEncrypter fileEncrypter1 = FileEncrypter.getInstanceInit(key);
        FileEncrypter fileEncrypter2 = FileEncrypter.getInstanceInit(key);
        assertSame(fileEncrypter1, fileEncrypter2);
    }

    // TODO: Implement remaining test cases
}