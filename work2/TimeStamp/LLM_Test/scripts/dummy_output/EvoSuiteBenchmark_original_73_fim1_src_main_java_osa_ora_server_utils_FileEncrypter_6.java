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
		
	// -----------------------------------------------------------------------------
	/**
	 * Test method for {@link osa.ora.server.utils.FileEncrypter#FileEncrypter(java.io.File, java.lang.String)}.
	*/
	@Test
    public void testFileEncrypter() {
		
		final String sourcefile = "/Users/cx6/openstack/projects/OSB/configs/sourcefile";
		final File file = new File(sourcefile);
		
		final String ciphertext =
			FileEncrypter.getInstance().getInstance().encryptFileText(file);
		
		assertTrue(file.exists() && file.isFile() &&!file.isHidden() &&!file.canRead());
		
		assertTrue(ciphertext, ciphertext.equals(
			FileEncrypter.getInstance().getInstance().decryptFileText(file)) 
		);		
    }
	
	// -----------------------------------------------------------------------------
	/**
	 * Test method for {@link osa.ora.server.utils.FileEncrypter#initCipher(java.io.File, int)}.
	*/
	@Test
	public void testInitCipher() {

		final Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
		
		final String originalFile = "/Users/cx6/openstack/projects/OSB/configs/sourcefile";
		final File file = new File(originalFile);
		final String ciphertext = FileEncrypter.getInstance().getInstance().encryptFileText(file);
		
		assertTrue("File"+file+" has not been created.", file.exists());

		assertTrue("File"+file+" is already encrypted. Use --retrain to decrypt it again.", file.isFile() && file.canWrite() &&!file.isHidden() &&!file.canRead());
		
		assertNotEquals("A ciphertext has unexpected value.", ciphertext, FileEncrypter.getInstance().getInstance().decryptFileText(file));
		
		assertTrue("Error has happened during file initialization.", cipher.init(new IvParameterSpec(new byte[] { 0 }), cipher.getBlockSize()) == 1);

		final String ciphertext2 = FileEncrypter.getInstance().getInstance().decryptFileText(file);
		
		assertTrue("A different ciphertext is already written.", ciphertext.equals(ciphertext2));
		
    }
	
	// -----------------------------------------------------------------------------
	/**
	 * Test method for {@link osa.ora.server.utils.FileEncrypter#encryptFileText(java.io.File, java.lang.String)}.
	*/
	@Test
    public void testEncryptFileText() {

		// Generate initial ciphertext.
		final String encryptOriginal = 
			FileEncrypter.getInstance().getInstance().encryptFileText(new File("test")) 
			;
		
		// Generate ciphertext for test from the encrypted file.
		final String ciphertext =
			FileEncrypter.getInstance().getInstance().encryptFileText(new File("test"));

		assertTrue("Returned ciphertext from encryption is wrong", encryptOriginal.equals(ciphertext));
		
    }
	
	// -----------------------------------------------------------------------------
	/**
	 * Test method for {@link osa.ora.server.utils.FileEncrypter#decryptFileText(java.io.File)}.
	*/
	@Test
    public void testDecryptFileText() {

		// Generate new ciphertext.
		final String plaintext =
			FileEncrypter.getInstance().getInstance().encryptFileText(new File("test"));

		// Compare encrypted file with file provided as secret key.
		final File encryptedFileOriginal = new File(FileEncrypter.getInstance().getInstance().getInstance().getSecretKey().toString());
		final File encryptedFile = new File(FileEncrypter.getInstance().getInstance().getInstance().getEncryptedKey().toString());

		assertTrue("A plaintext must be encrypted at the same time as the encrypted key.", 
			FileUtils.compareFiles(encryptedFileOriginal, encryptedFile));

		// Compare encrypted file with file provided as ciphertext.
		final String ciphertext =
			FileEncrypter.getInstance().getInstance().decryptFileText(encryptedFile);

		assertTrue("A plaintext must be decrypted at the same time as the decrypted key.", 
			FileUtils.compareFiles(encryptedFileOriginal, ciphertext));		
    }

	// -----------------------------------------------------------------------------
	/**
	 * Test method for {@link osa.ora.server.utils.FileEncrypter#FileEncrypter(java.io.File, java.lang.String)}.
	*/
	public FileEncrypter(File file, String suffix) {
		
		// File encrypted.
		final File encryptedFile = new File(file.getAbsolutePath()+File.separator+suffix);
		
		// File original.
		final File originalFile = new File(file.getAbsolutePath()+File.separator+"sourcefile_original.txt");
		
		// Output stream from file encrypted.
		final FileOutputStream out = new FileOutputStream(encryptedFile);
		
		// Input stream from original.
		final FileInputStream in = new FileInputStream(originalFile);
		
		// Cipher context.
		Cipher context = null;
		
		try {
			context = Cipher.getInstance("AES");
		} 
		
		catch (IOException e) {
			fail("Error during creation of Cipher.");
		}
		
		
		try {
			context.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(new byte[] { 0 }), new IvParameterSpec(new byte[] { 0 }));
		} 
		
		catch (Exception ignored) {
			fail("Invalid data provided as part of the encrypted data.");
		}
		
		// Write encrypted data into output stream.
		context.doFinal(in);
		
		assertTrue("File "+encryptedFile+" should have been read successfully.", encryptedFile.exists());
		
		assertTrue("OutputStream from encrypted  file is not correct.", encryptedFile.isFile() && encryptedFile.canRead());

	}
	
}