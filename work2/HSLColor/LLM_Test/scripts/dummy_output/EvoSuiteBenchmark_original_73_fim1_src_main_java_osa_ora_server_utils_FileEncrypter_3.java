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
		public void test() throws IOException {
			assertNotNull("File shall be initialized.", FileEncrypter.getInstance());
			assertNotNull("Cipher shall be initialized.", Crypto.getInstance().getCipher());
			
			// Write encrypted data to a file.
			File encryptedfile = File.createTempFile("test-data", ".in");
			FileOutputStream outputStream = new FileOutputStream(encryptedfile);
			FileInputStream encryptedInputStream = new FileInputStream(encryptedfile);
			assertNotNull("Encrypted data shall be read from.".length() > 0, "Encrypted data shall be read from.".length() > 0);
			int length = encryptedInputStream.read();
			assertEquals("Encypted data shall be read from.", 0, length);
			
			// Write plain data to a file.
			File encryptedfile1 = File.createTempFile("test-data-1", ".in");
			FileOutputStream outputStream1 = new FileOutputStream(encryptedfile1);
			FileInputStream encryptedInputStream1 = new FileInputStream(encryptedfile1);
			assertNotNull("Plain data shall be written to.".length() > 0, "Plain data shall be written to.".length() > 0);
			int length1 = encryptedInputStream1.read();
			assertEquals("Plain data shall be written to.", 0, length1);
			
			// Get the encrypted file contents from fileInputStream
			encryptedInputStream1.close();
			encryptedInputStream.close();
			
			assertEquals("Encrypted and written data shall be equal.", encryptedfile1, encryptedfile);
			assertEquals("Encrypted and written data shall be equal.", encryptedfile1, encryptedfile1);
			assertEquals("Not equal.", encryptedfile, encryptedfile1);
			
			// Create a fresh cipher instance.
			Cipher encryptedCipher = Crypto.getInstance().getCipher();
			
			// Write encrypted data to a file.
			String enc = "test";
			File encryptedfile2 = File.createTempFile("test-data-2", ".in");
			FileOutputStream outputStream2 = new FileOutputStream(encryptedfile2);
			FileInputStream encryptedInputStream2 = new FileInputStream(encryptedfile2);
			encryptedInputStream2.write(enc.getBytes());
			encryptedInputStream2.close();
			
//			assertEquals("Encrypted length shall be equal.", 3, encryptedCipher.getBlockSize());
			
			// Create an array with one byte of the first character
			byte byte1 = (byte) enc.charAt(0);
			int count1 = encryptedCipher.processBlock(new byte[]{ byte1 }, 0);
			assertEquals("Encrypted length shall be equal.", 1, count1);
			
			byte byte2 = encryptedCipher.processBlock(new byte[]{ enc.charAt(0) }, 1);
			assertEquals("Encrypted length shall be equal.", 1, count1);
			
			// Get the plain text from fileInputStream
			String plaintext = new String(enc.getBytes(), Crypto.getInstance().getEncoding()).toUpperCase();
			assertTrue("Not equal.", plaintext == enc);
			
			// Set IV (IV)
			Cipher newCipher = Crypto.getInstance().getCipher();
			newCipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(new byte[64], "DES"), new IvParameterSpec(new byte[] { new byte(enc.length()) }));
			encryptedCipher = newCipher;
			encryptedCipher.setMode(Cipher.ENCRYPT_MODE);
			
			// Write encrypted data to a file.
			File encryptedfile3 = File.createTempFile("test-data-3", ".in");
			encryptedInputStream2 = new FileInputStream(encryptedfile3);
			encryptedInputStream2.read(new byte[(encryptedFile.length() - encryptedFile.getName().length() - encryptionKey.getIV().length) >> 2], encryptedFile.getName().length());
			encryptedFile.delete();
			encryptedFile.deleteOnExit();
		}
}