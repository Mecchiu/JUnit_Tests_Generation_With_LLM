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
	 * Test of getInstance method, of class FileEncrypter.
	 */
	@Test
	public void testGetInstance() {
		System.out.println("getInstance");
		FileEncrypter expResult = null;
		FileEncrypter result = FileEncrypter.getInstance();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of getInstanceInit method, of class FileEncrypter.
	 */
	@Test
	public void testGetInstanceInit() {
		System.out.println("getInstanceInit");
		byte[] strkey = null;
		FileEncrypter expResult = null;
		FileEncrypter result = FileEncrypter.getInstanceInit(strkey);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of encryptBlowfish method, of class FileEncrypter.
	 */
	@Test
	public void testEncryptBlowfish() {
		System.out.println("encryptBlowfish");
		byte[] to_encrypt = null;
		FileEncrypter instance = null;
		byte[] expResult = null;
		byte[] result = instance.encryptBlowfish(to_encrypt);
		assertArrayEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of decryptBlowfish method, of class FileEncrypter.
	 */
	@Test
	public void testDecryptBlowfish() {
		System.out.println("decryptBlowfish");
		byte[] to_decrypt = null;
		FileEncrypter instance = null;
		byte[] expResult = null;
		byte[] result = instance.decryptBlowfish(to_decrypt);
		assertArrayEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of fileEncrypt method, of class FileEncrypter.
	 */
	@Test
	public void testFileEncrypt() {
		System.out.println("fileEncrypt");
		File file = null;
		File file2 = null;
		FileEncrypter instance = null;
		byte[] expResult = null;
		byte[] result = instance.fileEncrypt(file, file2);
		assertArrayEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of fileDecrypt method, of class FileEncrypter.
	 */
	@Test
	public void testFileDecrypt() {
		System.out.println("fileDecrypt");
		byte[] inputData = null;
		File file2 = null;
		FileEncrypter instance = null;
		instance.fileDecrypt(inputData, file2);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}

	/**
	 * Test of main method, of class FileEncrypter.
	 */
	@Test
	public void testMain() {
		System.out.println("main");
		String[] args = null;
		FileEncrypter.main(args);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
	
}