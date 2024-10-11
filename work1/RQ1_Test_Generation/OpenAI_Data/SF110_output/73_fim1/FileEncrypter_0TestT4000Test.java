// FileEncrypter_0Test.java
package osa.ora.server.utils;

// -----------------------------------------------------------------------------
// FileEncrypter.java
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
class FileEncrypter_0Test {

	/**
	* Test case for the method {@link FileEncrypter#getInstance()}.
	* @throws Exception
	*/
	@Test
	void testGetInstance() throws Exception {
		FileEncrypter result = FileEncrypter.getInstance();
		assertNotNull(result);
	}
	
	/**
	* Test case for the method {@link FileEncrypter#getInstanceInit(byte[])}.
	* @throws Exception
	*/
	@Test
	void testGetInstanceInit() throws Exception {
		byte[] strkey = "FIM".getBytes();
		FileEncrypter result = FileEncrypter.getInstanceInit(strkey);
		assertNotNull(result);
	}
	
	/**
	* Test case for the method {@link FileEncrypter#encryptBlowfish(byte[])}.
	* @throws Exception
	*/
	@Test
	void testEncryptBlowfish() throws Exception {
		FileEncrypter fixture = FileEncrypter.getInstance();
		byte[] to_encrypt = "FIM".getBytes();
		byte[] result = fixture.encryptBlowfish(to_encrypt);
		assertNotNull(result);
	}
	
	/**
	* Test case for the method {@link FileEncrypter#decryptBlowfish(byte[])}.
	* @throws Exception
	*/
	@Test
	void testDecryptBlowfish() throws Exception {
		FileEncrypter fixture = FileEncrypter.getInstance();
		byte[] to_decrypt = "FIM".getBytes();
		byte[] result = fixture.decryptBlowfish(to_decrypt);
		assertNotNull(result);
	}
	
	/**
	* Test case for the method {@link FileEncrypter#fileEncrypt(File, File)}.
	* @throws Exception
	*/
	@Test
	void testFileEncrypt() throws Exception {
		FileEncrypter fixture = FileEncrypter.getInstance();
		File file = new File("/osama2.zip");
		File file2 = new File("/osama3.zip");
		byte[] result = fixture.fileEncrypt(file, file2);
		assertNotNull(result);
	}
	
	/**
	* Test case for the method {@link FileEncrypter#fileDecrypt(byte[], File)}.
	* @throws Exception
	*/
	@Test
	void testFileDecrypt() throws Exception {
		FileEncrypter fixture = FileEncrypter.getInstance();
		byte[] inputData = "FIM".getBytes();
		File file2 = new File("/osama4.zip");
		fixture.fileDecrypt(inputData, file2);
	}
	
	/**
	* Test case for the method {@link FileEncrypter#main(String[])}.
	* @throws Exception
	*/
	@Test
	void testMain() throws Exception {
		String[] args = new String[] {"FIM"};
		FileEncrypter.main(args);
	}
	
}