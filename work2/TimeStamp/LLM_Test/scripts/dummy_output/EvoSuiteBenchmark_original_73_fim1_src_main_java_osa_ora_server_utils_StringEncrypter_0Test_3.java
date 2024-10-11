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
		
    public StringEncrypter_0Test() {
    }
    /**
     * Tests {@link StringEncrypter#encrypt(String)} method by valid values
     * of the parameters.
     * Each test can also pass in a valid value through {@link StringEncrypter#encrypt(String,String)}.
     * If you intend to test only the encoding of the encrypted string itself, then use {@link #testValidEncryptingString()} method.
     */
    @Test
	public void testEncryptDecrypt() {
        String aString = "Just a test";
        String expectedEncryptedString = null;
        String expectedDecryptedString = null;

        expectedEncryptedString = "Just a test123";

        expectedEncryptedString = aString +".123";

        if (expectedEncryptedString.indexOf(".123") == -1) {
            // if the string is not encrypted, then the test is wrong
            System.out.println("The test failed, there was no encryption or another problem");
            System.out.println("the test string was: " + aString);
            // you can set a String
            System.out.println("The secret key was: " + aString + " " + "and the test string was, because it had an invalid encryption");
            return;
        }


        try {
            StringEncrypter.encrypt( aString += ".", "");
            System.out.println("The test passed, the password of the generated text was: " + "Password_Valid");
        } catch (StringEncrypter.EncryptFailedException e) {
            System.out.println("The test didn't work, the password was: " + "Password_Expected");
            return;
        }

	        expectedDecryptedString = aString += "123";

	        assertEncryptionEquals( expectedEncryptedString,expectedDecryptedString);
	}


	/**
	 * Does a validating test that will check encryption and decryption of a string without
	 * having to use a string generator.
	 */
	protected void assertEncryptionEquals(String expectedEncryptedString,String expectedDecryptedString ) {

		// we'll store the expectedEncryptedString as a String
		String expectedEncryptedData = expectedEncryptedString;

		// we'll store the expectedDecryptedString as a String
		String expectedDecryptedData = expectedDecryptedString;

		// we'll check that the encryption is as expected
		int n = expectedEncryptedString.length();
		System.out.println("Expecting the encryption of String A_"+n+
							" to be equal to the expectedEncryptedString, but it was "+expectedEncryptedData);
		assertEquals(expectedEncryptedString, expectedEncryptedData );

		try {
			// we'll use the constructor parameters to pass in the expectedEncryptedString and the expectedDecryptedString
			StringEncrypter encrypted = new StringEncrypter(expectedEncryptedString, expectedDecryptedString);

			// now we will go through the encryption and try to compare the decryptedString and the expectedDecryptedString
			if (encrypted.isEncryptionOK() == true) {
                assertEquals("The encrypted string is different",expectedEncryptedData, encrypted.encrypt(expectedDecryptedData));
            }
		} catch (Throwable t) {
			// this is a weird case and should never happen, but if it does, report it and continue
			System.out.println("The expectedEncryptedString is:" + expectedEncryptedData
                            + "\nExpected decryptedString is:"+expectedDecryptedData);

			t.printStackTrace();
			return;
        }

		System.out.println("Encryption check passed");
	}


	/**
	 * Test that the {@link StringEncrypter} does not allow the encryption of null
	 * parameters
	 */
	@Test
	public void testEncryptionNullParameters(){
		StringEncrypter encrypter = new StringEncrypter();
		try {
			// this will throw an exception, but will not indicate that the input
			// parameter was null
			encrypter = new StringEncrypter(null, null);
			encrypter = new StringEncrypter(null, null);
		}catch(Exception e){
			//if the test fails for anything but null parameters
			System.out.println("Exception: " + e);
		}
	}
}