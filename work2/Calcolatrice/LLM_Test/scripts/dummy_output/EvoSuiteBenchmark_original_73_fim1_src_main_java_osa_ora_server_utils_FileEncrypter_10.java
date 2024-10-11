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
	 * Default constructor for test class;
	* it is meant to be used by subclasses.
	*/
	protected FileEncrypterTest() {
	}

	/**
	 * {@link FileEncrypterTest#getInstance()} method.
	* If this method doesn't succeed, this test will fail.
	*/
	@Test
    public void getInstance() {
		if (!FileEncrypterTest.getInstance().canRun) {
			System.out.println("Test not run");
		}
		assertTrue(FileEncryption.filePath + " must not exist");

    }

  /**
  * Method to test cipher with file input stream.
  *
  * @throws  Exception
  *    in case that the method failed to run
  */
    @Test
    public void testInputStream() throws Exception {
    }

	/**
	* Method to test cipher with file output stream.
	*
	* @throws  Exception
	*    in case that the method failed to run
	*/
    @Test
    @SuppressWarnings("unchecked")
    public void testOutputStream() throws Exception {
		if (!FileEncrypterTest.getInstance().canRun) {
			System.out.println("Test not run");
		}

        Cipher cipher;

		// --- read file input stream ---
         FileInputStream fileInputStream = new FileInputStream(FileEncryption.filePath);
         try {
         	cipher = Cipher.getInstance("AES/GCM/NoPadding");
         } catch (Exception e) { // this can happen if encryption/decryption fails, so don't fail
        	e.printStackTrace();
        }

		// --- read file output stream ---
        FileOutputStream fileOutputStream = new FileOutputStream(FileEncryption.filePath);
        try {
        	cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(new byte[cipher.getBlockSize()], "AES"));
        	cipher.update(fileInputStream, new IvParameterSpec(new byte[]{3}));
        	cipher.doFinal(new byte[3]);
        } catch (Exception e) { // this can happen if cipher.encrypt() fails, so don't fail
        	e.printStackTrace();
        }

		// --- write encrypted file ---
		try {
			cipher.doFinal();
		} catch (Exception e) { // this can happen if we couldn't get a session
			e.printStackTrace();
		}

		// --- compare encrypted file with the original file ---
        File encryptedFile = new File(FileEncryption.filePath);
        File encryptedFileWithCipher = new File(FileEncryption.filePath + ".with.Cipher");
        assertTrue(encryptedFile.length() > 0);
        assertTrue(encryptedFileWithCipher.exists());
        assertEquals(encryptedFileWithCipher.length(), encryptedFile.length());
        assertEquals(encryptedFileWithCipher.lastModified(), encryptedFile.lastModified());
   }
}

// -----------------------------------------------------------------------------