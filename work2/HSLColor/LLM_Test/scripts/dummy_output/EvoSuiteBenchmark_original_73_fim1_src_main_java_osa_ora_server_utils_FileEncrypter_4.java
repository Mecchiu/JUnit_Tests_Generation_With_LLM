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
		
		private static FileEncrypter getInstance() {
			return new FileEncrypter();
		}
		
	/**
	* test initialization using default constructor and static class
	* constants for class test.
	* @throws Exception Any exception.
	*/
  @Test
    public void testInitStaticConstants() throws Exception {
		// Create test file (with one byte encrypted)
		File testFile1 = new File("./encryption.txt");
		String testFile1Content = "File 1 for testEncryptedFile";
		FileOutputStream testFile1out = new FileOutputStream(testFile1);
			FileEncryptionFile.testEncryptedFile(testFile1out,testFile1Content);
		testFile1out.close();
		
		// Create test file (with two bytes encrypted)
		File testFile2 = new File("./encryption.txt");
		String testFile2Content = "File 2 for testEncryptedFile";
		FileOutputStream testFile1out2 = new FileOutputStream(testFile2);
			FileEncryptionFile.testEncryptedFile(testFile1out2,testFile2Content);
			testFile1out2.close();
		
		// Close the test files
		testFile1out = null;
		testFile1out2 = null;
		
		try {
			// Encrypt and close test files
			FileOutputStream testFile1out = new FileOutputStream("/tmp/test1").getWrappedStream();
			FileEncryptionFile.testEncryptedFile(testFile1out,testFile1Content);
			testFile1out.close();
			
			FileOutputStream testFile1out2 = new FileOutputStream("/tmp/test2").getWrappedStream();
			FileEncryptionFile.testEncryptedFile(testFile1out2,testFile2Content);
			testFile1out2.close();
			
			// Verify same password
			FileInputStream testFile1in = new FileInputStream("/tmp/test1");
			FileInputStream testFile1in2 = new FileInputStream("/tmp/test2");
			
			// Re-Open test file for read protection
			FileOutputStream testFile1out3 = new FileOutputStream("/tmp/test1").getWrappedStream();
			FileEncryptionFile.testEncryptedFile(testFile1in3,testFile1Content);
			// File has been read correctly and it needs to check the password
			assertEquals("File 1 for testEncryptedFile is read correctly",testFile1in.readLine(),testFile1in2.readLine());
		}catch(Exception e) {
			fail("Error checking file content.");
		}
    }
	

	/**
	* test encrypt and decrypt
	* 
	* @param inFile1 file stream
	* @param inEncryptedFile content to encrypt
	*/
  @Test
    public void testEncryptDecrypt(FileInputStream inFile1, String inEncryptedFile) {
		// Create test encrypted file
		FileOutputStream testEncryptedFile = getInstance()
         .getInstance().getTestFileEncrypter().getEncryptedFile(inFile1,inEncryptedFile);
		
		assertNotNull("Encrypted file should not be null.",testEncryptedFile);
		assertEquals("Encrypted file size must be equal to file content size",
			inEncryptedFile.length(),testEncryptedFile.getTotalLength());
		
		// Encrypt and decode the encrypted file
		FileEncryptionFile.testEncryptedFile(testEncryptedFile,inEncryptedFile);
		
		// Decrypt the encrypted file
		String decryptedFileContent = FileEncryptionFile.testDecryptedFile(
			inEncryptedFile, getInstance().getInstance(), testEncryptedFile);
		assertEquals("Decrypted file content must equal encrypted content",
			inEncryptedFile,decryptedFileContent);
		assertEquals(
				"Decrypted file length must match content size.",
				inEncryptedFile.length(),
				decryptedFileContent.length() ); 
		
		testEncryptedFile.close();
		
	}
	
  @Test
    public void testFileEncrypterCreation() throws IOException {
		// Test encryption with two files and file encryption file to newFile
		File fromFile = new File("/tmp/from.txt");
		File toFile = new File("/tmp/to.txt");
		
		FileEncryptionFile.testEncryptedFile(fromFile, "Testing from file")
			.close() ;
		assertEquals(  fromFile.length(), toFile.length() );
		
		// Test encryption with two files but file encryption file to newFile 
		File fromFile2 = initFile("/tmp/from.txt");
		FileEncryptionFile.testEncryptedFile(fromFile2, "Testing from 2.txt")
			.close() ;
		assertEquals( 
				"The two files must be equal.",
				fromFile.length(),
				 toFile.length() );
		
		// Test encryption with one file and file encryption file
		FileEncryptionFile.testEncryptedFile(new File("/tmp/encrypted.txt"), "Testing encrypted.txt")
			.close() ;
		assertEquals(  new File("/tmp/encrypted.txt").length(), 
				fromFile.length() );
		
		// Clean up
		new File("/tmp/from.txt").delete();
		new File("/tmp/to.txt").delete();
		new File("/tmp/encrypted.txt").delete();
	}
}