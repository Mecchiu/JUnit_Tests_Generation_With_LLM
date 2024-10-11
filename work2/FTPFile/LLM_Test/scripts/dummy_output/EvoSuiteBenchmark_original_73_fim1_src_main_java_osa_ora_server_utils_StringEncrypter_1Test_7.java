// StringEncrypter_1Test.java
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
* It contains one unit test case for the {@link StringEncrypter#decrypt(String)} method.
*/
class StringEncrypter_1Test {
		
	/**
	 * Test constructor.
	 *
	 * @throws Exception If this fails.
	 */
	@Test
	public void test() throws Exception {
		PBEKeySpec    pbeKSpec = new PBEKeySpec(
                "pass".getBytes(), 
                "123456789".getBytes(), 256);
		PBEParameterSpec pbeParam = new PBEParameterSpec(
				1024, 256);
		Cipher pbeCipher = Cipher.getInstance("PBE");
		pbeCipher.init(Cipher.ENCRYPT_MODE, "PBE" + pbeParam, pbeKSpec);
		
		int countCiphers = 0;
		
		for(Cipher cipher : Cipher.availableCiphers()) {
			System.out.println(cipher.getClass().getName());
			if(cipher.getClass() == StringEncrypter.class) {
				countCiphers++;
			}
		}
		assertEquals(1, countCiphers);
		byte[] enc_bytes = new byte[9];
		System.arraycopy(
				pbeCipher.doFinal("1234567812345678123456781234567812345678".toCharArray()), 
				0, 
				enc_bytes, 
				0, 
				8);

		System.arraycopy(
				pbeCipher.doFinal("1111111111112222".toCharArray()), 
				0, 
				enc_bytes, 
				8, 
				8);

		int cipher = pbeCipher.getKeySize();
		byte[] key = new byte[cipher];
		pbeCipher.initialize(pbeParam);
		for(int i=0; i < enc_bytes.length; i++) {
			System.arraycopy((byte)enc_bytes[i], 0, key, i % cipher, 1);
		}
		
		pbeCipher.init(Cipher.DECRYPT_MODE, "PBE" + pbeParam, new SecretKeySpec(key, String.class));
		
		String decrypted = new String(pbeCipher.doFinal());
		assertEquals(decrypted.trim(), "0123456798");
	}
	
}