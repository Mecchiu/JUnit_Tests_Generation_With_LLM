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
private static final String ENCRYPTED_TEXT = "testtext";

	@Test
	void encrypt_a_String_to_a_PaddedString_with_padded_PBE_Key() throws Exception {
		// Given
		final PBEKeySpec keySpec = new PBEKeySpec(new char[PBEEncryptionKeys.HIDDEN_KEY_LEN].trim().toCharArray());
		final PBEKeySpec keySpec_encrypt = new PBEKeySpec(new char[PBEEncryptionKeys.HIDDEN_KEY_LEN].trim().toCharArray());
		final SecretKey key = generateKey(keySpec_encrypt);
		final SecretKey key_enc = generateKey(keySpec);

		// When
		final String encryptedText = encrypt(ENCRYPTED_TEXT);

		// Then
		assertEquals(encryptedText, encrypt(ENCRYPTED_TEXT));
	}

	@Test
	void encrypt_returns_unencrypted_text() throws Exception {
		// Given
		final SecretKey key = (new PBESecretGenerator()).generateKey(keySpec);

		// When
		final String encryptedText = encrypt(new byte[0]);

		// Then
		assertNotNull(encryptedText.getBytes());
		assertEquals("",encryptedText);
	}

    @Test
    void encrypt_returns_null_if_key_enc_does_not_have_secret_key() throws Exception {
        // Given
        final PasswordEncryptor encryptor = new PasswordEncryptor("TestEncrypter_0Test_test_string");

        // When
        final String encryptedText = encrypt(ENCRYPTED_TEXT, "test-string");

        // Then
        assertTrue(encryptedText == null || encryptedText.length() > encryptedText.getBytes().length);
    }

    @Test
    void generate_returns_the_padded_key_used_for_encryption() throws Exception {
        // Given
        final PasswordEncryptor encryptor = new PasswordEncryptor("TestEncrypter_0Test_test_string");
        final String[] paddedText = generatePaddedText(ENCRYPTED_TEXT);
        final Cipher cipher = encryptor.encrypt(paddedText);

        // When
        final Cipher encrypted = new Cipher(kdf.encrypt(keySpec, Cipher.ENCRYPT_MODE));
        final byte[] paddedTextEncrypt = encrypted.doFinal();

        // Then
        final byte[] paddedKeyEncrypted = encryptedText.getBytes();
        final byte[][] paddedKeyHash = calculateHash(paddedKeyEncrypt);

        assertArrayEquals(paddedKeyEncrypt, paddedKeyEncrypted);
    }

	@Test
	void create_secret_keyFactory_returns_a_single_secret_key() throws Exception {
		// Given
		final SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("PBKDF2WithHashing");

		// When
		final int i = secretKeyFactory.getKeySize();
		final int keyLen = PBEKeySpec.DEFAULT_KEY_SIZE / i;
		final byte[] key = new byte[keyLen];
		final byte[] salt = new byte[keyLen];
		new Random().nextBytes(key);
		new Random().nextBytes(salt);

		// Then
		assertEquals(i, key.length);
		assertEquals(3, PBEKeySpec.DEFAULT_ITERATION_COUNT);
		assertEquals(kdf.encrypt(keySpec, salt), generateSalt());
	}

	/**
* Generates a salt, using the PBE specification
*
* <p>The PBESpecification is specified as a hex string from Appendix B of section 2.6.1 of the PBE specification.
* The byte array is then converted to a byte in base64.
*
* @param salt hex salt string, may be <code>null</code>
* @return the salt string
*/
	private byte[] generateSalt() {
		assertNotNull(salt);
		final byte[] saltedBytes = new byte[2];

		StringBuilder buf = new StringBuilder(64);
		buf.append(salt);
		final int saltLength = buf.length();
		final byte[] encodedBits = encode(buf.toString());
		byte[] saltBytes = new byte[8];
		System.arraycopy(encodedBits, saltLength, saltBytes, 0, saltLength);
		return saltBytes;
	}

	/**
* Returns the key specification used for encryption.
*
* @return the key specification used for encryption
*/
	private static KeySpec getKeySpec() {
		return new PBEKeySpec(new char[PBEEncryptionKeys.HIDDEN_KEY_LEN].trim());
	}

	/**
* Performs a PBE-256-like derivation of the provided text with the provided key specification, salts and IVs using the given key factory. The
* key factory also modifies the provided text.
*
* @param text input string
* @param keySpec PKCS#8 key specification to be used as key in the hash function
* @param salt salt to be provided in the text
* @param iterations number of iterations to attempt to use when providing salt
* @return the encrypted value
*/
	private static String encrypt(String text, KeySpec keySpec, byte[] salt, int iterations) throws Exception {
		final org.junit.jupiter.api.Assertions.AssertThrows(Exception.class, () -> {
			new PasswordEncryptor(text, keySpec, salt, iterations);
		});
		return text;
	}

	/**
* Calculates the hash value of provided text using the provided key specifications
*
* @param salt salt to be used in the hash
* @param iterations iterations to use when calculating the hash
* @return byte array containing the hash value
*/
	private static byte[] calculateHash(byte[] salt) throws Exception {
		// convert salt to byte array
		final byte[] saltArray = salt;

		// create the byte hash value
		final String hash = hash(saltArray, 0, saltArray.length);
		return hash.getBytes();
	}

	/**
* Calculates the hash value of provided text using the provided key specifications
*
* @param salt key specification to be used in the hash
* @param iteration number of iterations to use when calculating the hash
* @return byte array containing the hash value
*/
	private static byte[] hash(byte[] salt, int iteration, int saltLen) throws Exception {
		int iter;
		if (saltLen > 0) {
			iter = PBEKeySpec.getPBEKeyLength(saltLen);
		} else {
			iter = PBEKeySpec.DEFAULT_ITERATION_COUNT;
		}

		return hash(iter, salt, iteration, salt.length);
	}

	private static byte[] hash(int iterations, byte[] salt, int iteration, int saltLen) throws Exception {
		byte[] output = new byte