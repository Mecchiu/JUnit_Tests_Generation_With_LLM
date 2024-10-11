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
	public void testCipherText() {
		StringEncrypter encrypter = new StringEncrypter("testString");
		byte[] cipherText = encrypter.encrypt("testString");
		
		assertNotNull(cipherText);
		assertNotNull(cipherText.length);
	}

	@Test
	public void testPBECText() {
			StringEncrypter encypt = new StringEncrypter();
			byte[] cipherText = encypt.encrypt("testString".getBytes());
			byte[] plainText = encypt.encrypt("testString".getBytes(),new SecretKey() );
			assertTrue(cipherText.length == plainText.length);
	}

	@Test
	public void testPBEKeys() {
			StringEncrypter encypt = new StringEncrypter();
			byte[] cipherText = encypt.encrypt("testString".getBytes());
			byte[] plainText = encypt.encrypt("testString".getBytes(),new SecretKey(), new PBEParameterSpec(2));
			assertTrue(cipherText.length == plainText.length);
			encypt.clear();
	}

	@Test
	public void testEncryptionOfBytesNoKey() {
		StringEncrypter encypt = new StringEncrypter();
		byte[] plainText = encypt.encrypt(new byte[0]);
		assertTrue(plainText.length == 0);
	}

	@Test
	public void testEncryptionOfBytesWithOneSalt() {
		StringEncrypter encypt = new StringEncrypter();
		byte[] plainText = encypt.encrypt(new byte[]{0},new PBEParameterSpec(PKCSEncryptionKey.SHA256,1024));
		assertTrue(plainText.length == 0);
		assertTrue(plainText.length == 8);
	}

	@Test
	public void testEncryptionOfBytesWithOneSaltAndKey() {
		StringEncrypter encypt = new StringEncrypter();
		byte[] plainText = encypt.encrypt(new byte[]{0},new PBEParameterSpec(
		                                    PKCSEncryptionKey.SHA256,1024,
		                                    new PBEKeySpec(1)));
		assertTrue(plainText.length == 9);
		assertTrue(plainText.length == 9);
	}

	@Test
	public void testEncrypter() {
		StringEncrypter ed = new StringEncrypter(new byte[][] {
				{10},
				{9}
		});

		byte[] cipherText = ed.encrypt(new byte[] {10,100});
		byte[] plainText = ed.encrypt(new byte[] { 9,100});

		assertTrue(cipherText.length == plainText.length);
		assertTrue(cipherText.length == 8);

		byte[] decodedPlainText = ed.decrypt(cipherText);
		assertTrue(plainText.length == decodedPlainText.length);
		assertTrue(plainText.length == decodedPlainText.length);
		for(int i = 0; i < plainText.length; i++) {
			assertTrue(decodedPlainText[i] == plainText[i]);
		}

		ed = new StringEncrypter();
		ed.setKey(new byte[][]{1});
		cipherText = ed.encrypt(new byte[] {10,100});
		plainText = ed.encrypt(new byte[] { 9,100});
		assertTrue(cipherText.length == 8);
		assertTrue(plainText.length == 9);

		decodedPlainText = ed.decrypt(cipherText);
		assertTrue(plainText.length == decodedPlainText.length);
		assertTrue(plainText.length == decodedPlainText.length);
		for(int i = 0; i < plainText.length; i++) {
			assertTrue(decodedPlainText[i] == plainText[i]);
		}
	}

	@Test
	public void testEncrypter_testEmptyKey() {
		StringEncrypter ed = new StringEncrypter(new byte[][] {
				{10},
				{11}
		});
		ed.clear();
		byte[] cipherText = ed.encrypt(new byte[] { 10,100 });
		byte[] plainText = ed.encrypt(new byte[] { 9,100 });
		ed.clear();
		ed = new StringEncrypter();
		ed.setKey(new byte[][] {
				{ 1},
				{ 2}
		});
		cipherText = ed.encrypt(new byte[] { 10,100 });
		plainText = ed.encrypt(new byte[] { 9,100 });
		assertTrue(cipherText.length == plainText.length);
		assertTrue(cipherText.length == 8);

		ed = new StringEncrypter();
		ed.clear();
		cipherText = ed.encrypt(new byte[] { 1 });
		plainText = ed.encrypt(new byte[] { 2 });
		assertTrue(plainText.length == 8);
	}

	@Test
	public void testDecrypter_testNullParam() {
		StringEncrypter ed = new StringEncrypter(new byte[][] {
				{10},
				{11}
		});
		ed.clear();
		String expectedEncrypt = new byte[][] {};
		byte[] cipherText = ed.encrypt(new byte[] { 10,100 });
		byte[] plainText = ed.decrypt(cipherText);
		assertTrue(plainText.length == 8);

		ed = new StringEncrypter();
		ed.clear();
		cipherText = ed.encrypt(new byte[] { 1 });
		plainText = ed.encrypt(new byte[] { 2 });
		assertTrue(plainText.length == 8);
		
		ed = new StringEncrypter(new byte[][] {});
		ed.clear();
		plainText = ed.decrypt(cipherText);
		assertTrue(plainText.length == 8);
	}
	
	public String[] testAllKey() {
		String[] enctParms = new String[] {
		            "Key1"
		   ,"Key2"
		,   // Key1 key2
		    "Salt1",
		     // Key1 key2
		    "Salt2"
		};
		return enctParms;
	}
}