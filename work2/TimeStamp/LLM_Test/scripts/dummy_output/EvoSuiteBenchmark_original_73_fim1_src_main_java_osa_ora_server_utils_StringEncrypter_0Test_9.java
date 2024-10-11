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
		private static final String password = "mypassword";

	/**
	 * Tests <code>StringEncrypter.encrypt(String)</code> with no parameters
	 * if no parameters is passed.
	 *
	 * @throws Exception Thrown if the {@link StringEncrypter.encrypt(String)} method can't be executed.
	 * @since 1.4
	 */
    @Test
    public void testEncryptWithoutPadding_EmptyString() throws Exception {
        assertNull(StringEncrypter.encrypt(null, null));
    }

	/**
	 * Tests <code>StringEncrypter.encrypt(String,String)</code> with parameters.
	 *
	 * @throws Exception Thrown if the {@link StringEncrypter.encrypt(String,String)} method could not encrypt.
	 *     The encrypting and decryption will use the same algorithm parameters.
	 * @since 1.4
	 */
    @Test
    public void testEncryptWithoutPadding_SecureSecretKey() throws Exception {
        PBEKeySpec spec = new PBEKeySpec("foobarbaz".toCharArray());

        SecretKeyFactory factory = SecretKeyFactory.getInstance("PBEWithSHA256AndDESede");
        AlgorithmParameterSpec specAlg = new PBESecretKeySpec(new SecretKeySpec(password.getBytes(), "PBEwithSHA256andDESede".toCharArray(), 0), "MD5withRSA");

        // We must generate a new SecretKey and encrypt it that way
        SecretKey secretKey = factory.generateSecret(specAlg);
        final int nonceSize = Cipher.getPad(1) + Cipher.getDigestSize(4);
        byte[] nonce = new byte[nonceSize];
        for (int i = 0; i < nonceSize; ++i) {
            nonce[i] = (byte)('0' + i % 10);
        }
        Cipher cipher = Cipher.getInstance("PBEScrypt");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey, specAlg);

        // The padding to the beginning of the cipher message should be removed
        final int messageSize = Cipher.getPad(40) + Cipher.getDigestSize(4);
        byte[] message = new byte[messageSize];
        AlgorithmParameterSpec spec = AlgorithmParameterSpec.getInstance("DESede/CBC/PKCS7Padding");
        spec.setParameter(AlgorithmParameterSpec.FIELDS, message);

        byte[] cipherBuffer = cipher.doFinal(message);
        int maxLength = cipherBuffer.length;
        byte[] cipherCopy = new byte[maxLength];
        System.arraycopy(cipherBuffer, 0, cipherCopy, 0, maxLength);

        assertEquals("Message length of cipher text does not match the original byte array.", 0, checkStringSize(cipherCopy));
        byte[] encryptedBuffer = StringDecrypter.encrypt(cipherCopy);
        assertEquals("Encrypted length is not correct.", maxLength, encryptedBuffer.length);
        final String encrypted = "FOO" + new String(encryptedBuffer);

        assertTrue("Encrypted should end with a zero padding.", encrypted.startsWith("UNPADDED"));

        assertArrayEquals("Encrypted byte array does not match original", cipherCopy, encrypted.getBytes());
    }

	/**
	 * Tests <code>StringEncrypter.encrypt(String,String)</code> with parameters and padded with zeros.
	 *
	 * @throws Exception Thrown if the {@link StringEncrypter.encrypt(String,String)} method could not encrypt.
	 * @since 1.4
	 */
    @Test
    public void testEncryptPaddedWithZeros() throws Exception {
        PBEKeySpec spec = new PBEKeySpec("foobarbaz".toCharArray());

        SecretKeyFactory factory = SecretKeyFactory.getInstance("PBEwithSHA256andDESede");
        AlgorithmParameterSpec specAlg = new PBEParameterSpec(new SecretKeySpec(password.getBytes(), "PBEwithSHA256andDESede".toCharArray(), 0), "MD5withRSA");
        key = factory.generateSecret(specAlg);
        final int nonceSize = Cipher.getPad(1) + Cipher.getDigestSize(4);
        byte[] nonce = new byte[nonceSize];
        final int nonceSizeLimit = Cipher.getDigestSize(4) - 1;
        for (int i = 0; i < nonceSizeLimit; ++i) {
            nonce[i] = (byte)('0' + i % 10);
        }
        Cipher cipher = Cipher.getInstance("PBEScrypt");
        cipher.init(Cipher.ENCRYPT_MODE, key, specAlg, new SecureRandom());

        byte[] cipherBuffer = cipher.doFinal(cipher.doFinal(new byte[32]));
        final int maxLength = cipherBuffer.length;
        byte[] cipherCopy = new byte[maxLength];
        System.arraycopy(cipherBuffer, 0, cipherCopy, 0, maxLength);

        assertEquals("Message length of cipher text does not match the original byte array.", 0, checkStringSize(cipherCopy));
        byte[] encryptedBuffer = StringDecrypter.encrypt(cipherCopy, password);
        int maxLength2 = cipherCopy.length;
        final String encrypted = "FOOP" + new String(encryptedBuffer);

        assertTrue("Encrypted should end with a zero padding.", encrypted.startsWith("UNPADDED"));
        assertTrue("Expected length of encrypted does not match actual length.", encrypted.length() >= maxLength2);

        byte[] raw = (cipher.getBlockSize() == 128? new byte[0] : new byte[32]);
        System.arraycopy(cipherCopy, 0, raw, 0, cipherCopy.length);
        final String rawString = new String(raw);

        assertTrue("Encrypted should end with a zero padding.", encrypted.startsWith("UNPADDED"));
        assertTrue("Expected length of encrypted does not match actual length.", encrypted.length() >= maxLength2);
        assertTrue("Failed expected: " + encrypted, rawString.startsWith("foobawp"));
    }
}