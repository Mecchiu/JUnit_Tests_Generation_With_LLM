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
     * Test for the {@link org.junit.jupiter.api.Test} case for the method {@link StringEncrypter#decrypt(String)}.
		* @verifies encrypt string with pbe with key-pair
	 * @since 0.21.0
		* @throws Exception should not be thrown
		*/
    @Test
    void decrypt_shouldEncrypt_stringWithPbeWithKey_providesKeySpec() throws Exception {
        String valueString = "valueString";
        String encryptedString1 = StringEncrypter.decrypt(valueString);
        String encryptedString2 = StringEncrypter.decrypt(valueString);
        assertEquals(encryptedString2,valueString);
    }
			
    /**
     * Test for the {@link org.junit.jupiter.api.Test} case for the method {@link StringEncrypter#decrypt(String)}.
		* @verifies encrypt string with PKI with PKIType_AES256-SHA-256
	 * @since 0.21.0
		* @throws Exception should not be thrown
		*/
    @Test
    void decrypt_shouldEncrypt_stringWithPKIType_AES256_SHA-256() throws Exception {
        String valueString = "valueString";
        String encryptedString = StringEncrypter.decrypt(valueString);
        PbeKeySpec pbe = new PbeKeySpec(PBEKeySpec.PBEWITHSHA256AND128BIT);
        SecretKeyFactory factory = SecretKeyFactory.getInstance("PBEWithSHAAnd128Bit.PBEWITHSHA256AND128BIT.KEYEXCHANGE");
		
        AlgorithmParameterSpec pbeParams = pbe.getAlgorithmParameters();
        PBEParameterSpec cipherSpec = new PBEParameterSpec(pbeParams);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        SecretKey key = factory.generateSecret(cipherSpec);
        cipher.init(Cipher.ENCRYPT_MODE, (key));
        byte[] buffer = cipher.doFinal(StringEncrypter.decrypt(valueString).getBytes());
        String decryptString = new String(buffer);
        assertEquals(StringEncrypter.decrypt(encryptedString).getBytes(),decryptString.getBytes());
    }
}