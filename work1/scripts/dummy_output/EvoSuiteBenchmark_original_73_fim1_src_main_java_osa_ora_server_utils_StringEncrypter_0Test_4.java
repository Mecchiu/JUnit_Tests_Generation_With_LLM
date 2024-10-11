// StringEncrypter_0Test.java
package osa.ora.server.utils;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import java.security.spec.KeySpec;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEParameterSpec;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringEncrypter}.
* It contains one unit test case for the {@link StringEncrypter#encrypt(String)} method.
*/
class StringEncrypter_0Test {
		
	@Test
	void testEncrypt() {
		String str = "test string";

		String encrype = "test";
		

		byte[] salt1 = new byte[5];
		String salt2 = decrypt(encrype, salt1);
		assertNotNull(salt2);
		
		String[] encrypted = encrypt(encrype, salt1);
		assertArrayEquals(encrypted, salt2);

		// Check the method call when no pass phrase has been provided.
		
		salt2 = decrypt(encrype, new byte[0]);
		assertNull(encrype);
		encrypted = encrypt(encrype, salt2);
		assertArrayEquals(encrypted, new byte[0]);

		salt2 = decrypt(encrype, salt2);
		assertNotNull(salt2);
		encrypted = encrypt(encrype, salt2);
		assertArrayEquals(encrypted, salt2);
	}

	/**
	 * Decrypts a plain text and return the provided hashString as its value.
	 *
	 * @param text provided String.
	 * @param salt
	 * @return String that encrypted the text with your own salt.
	 */
	private String decrypt(String text, byte[] salt);

	/**
	 * Encrypts a plain text encrypted with the passed in salt value.
	 *
	 * TODO: use a different algorithm
	 *
	 * @param text
	 * @param salt
	 *
	 * @return
	 */
	private String encrypt(String text, byte[] salt);

	/**
	 * AESDecrypter is a class designed to decrypt a ciphertext with AES.
	 *
	 * @author pabloalcao
	 * @param <P>
	 class P <T extends PBEKeySpec>
	 * @param <T extends AlgorithmParameters>
	 class <T extends AlgorithmParameterSpec>
	 */
	@SuppressWarnings({"rawtypes", "unchecked"})
	public static class AESDecrypter
		extends org.apache.felix.jca.provider.provider.EncryptDeskey
		implements org.apache.felix.jca.provider.EncryptDeskeyEncryptor {
	
		
	/**
	 * Constructor
	 *
	 * @param passPhrase
	 * @param saltValues
	 */
	public AESDecrypter(byte[] passPhrase, byte[][] saltValues) {
	}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String en1 = "This is the first encrypted string!";
		String en2 = "This is the first encrypted string 2!";

		String encrype = "test";

		StringBuilder buf1 = new StringBuilder();
		buf1.append(en1);
		buf1.append(en2);

		StringBuilder buf2 = new StringBuilder();
		buf2.append(en2);
		buf2.append(en1);

		StringBuilder encrypt2 = new StringBuilder();
		encrypt2.append(en2);
		encrypt2.append("This is the second encrypted string!");

		StringBuilder encrypt1 = new StringBuilder();
		encrypt1.append(en1);
		encrypt1.append("Another encrypted string!");

		// Pass a new String to be encrypted and return the provided HashString
		byte[] salt1 = new byte[5];
		String salt1a = decrypt(buf1, salt1);
		assertNotNull(salt1);
		assertArrayEquals(salt1a, salt1);

		// Pass an encrypted string and another string to be encrypted and also get the hash
		byte[] salt2 = new byte[5];
		String salt2a = encrypt(buf2, salt2);
		assertNotNull(salt1);
		assertArrayEquals(salt2a, salt2);

		// Pass two new String and a new String to be encrypted and also get the hash
		byte[] salt3 = new byte[5];
		String salt3a = encrypt(buf1, new StringBuilder(buf1.toString()));
		assertNotNull(salt2);
		assertArrayEquals(salt3a, salt3);
	}
}

/**
 * Returns a string version of the provided hashString.
 *
 * @param strHashString
 * @param salt
 *
 * @return
 */
private String encrypt(String strHashString, byte[] salt) {
	// Create an AESCipher object using the provided salt.
	AESEncryptor encrypter = new AESEncryptorBuilder().build(salt);
	
	String encryptedString = strHashString;
	byte[] hashAlgorithm = null;
	try {
		AlgorithmParameterSpec params = 
			PBEParameterSpec.getInstance(PBEParameterSpec.PBEWithSHAAnd3KeyTripleDES_CBC, 
					PBESecretKeySpec.getInstance(params, 
							PBEKeySpec.getInstance(parameters, encrypt(strHashString, salt))));
	} catch (Exception e) {
		e.printStackTrace();
		return null;
	}
	try {
		SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithSHA", "BC");
		SecretKey key = skf.generateSecret("password", params);
		return encryptedString.getBytes("UTF-8");
	} catch (Exception e) {
		e.printStackTrace();
		return null;
	}
}

/**
 * Returns a string version of the provided hashString.
 *
 * This function supports passing a String of type <code>byte[]