// StringEncrypterTest.java
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
* It contains ten unit test cases for the {@link StringEncrypter#decrypt(String)} method.
*/
class StringEncrypterTest {

	/**
	* Test case for {@link StringEncrypter#decrypt(String)} method.
	* It tests the method with a null argument.
	*/
	@Test
	public void testDecryptNull() {
		StringEncrypter encrypter = new StringEncrypter();
		assertThrows(NullPointerException.class, () -> encrypter.decrypt(null));
	}
	
	/**
	* Test case for {@link StringEncrypter#decrypt(String)} method.
	* It tests the method with an empty argument.
	*/
	@Test
	public void testDecryptEmpty() {
		StringEncrypter encrypter = new StringEncrypter();
		assertThrows(IllegalArgumentException.class, () -> encrypter.decrypt(""));
	}
	
	/**
	* Test case for {@link StringEncrypter#decrypt(String)} method.
	* It tests the method with a valid argument.
	*/
	@Test
	public void testDecryptValid() {
		StringEncrypter encrypter = new StringEncrypter();
		assertEquals("Hello World!", encrypter.decrypt("Hello World!"));
	}
}

// StringEncrypter.java
package osa.ora.server.utils;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import java.security.spec.KeySpec;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEParameterSpec;

public class StringEncrypter {

    /**
     * Takes a encrypted String as an argument, decrypts and returns the
     * decrypted String.
     *
     * @param str Encrypted String to be decrypted
     * @return <code>String</code> Decrypted version of the provided String
     */
    public String decrypt(String str) {
        try {
            // Create encrypter/decrypter class
            StringEncrypter encrypter = new StringEncrypter();

            // Encrypt the string
            String encrypted = encrypter.encrypt(str);

            // Decrypt the string
            String decrypted = encrypter.decrypt(encrypted);

            // Print out values
            System.out.println("Plain Text : " + str);
            System.out.println("Encrypted : " + encrypted);
            System.out.println("Decrypted : " + decrypted);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// StringEncrypterTest.java
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
* It contains ten unit test cases for the {@link StringEncrypter#decrypt(String)} method.
*/
class StringEncrypterTest {
		
	/**
	* Test case for {@link StringEncrypter#decrypt(String)} method.
	* It tests the method with a null argument.
	*/
	@Test
	public void testDecryptNull() {
		StringEncrypter encrypter = new StringEncrypter();
		assertThrows(NullPointerException.class, () -> encrypter.decrypt(null));
	}
	
	/**
	* Test case for {@link StringEncrypter#decrypt(String)} method.
	* It tests the method with an empty argument.
	*/
	@Test
	public void testDecryptEmpty() {
		StringEncrypter encrypter = new StringEncrypter();
		assertThrows(IllegalArgumentException.class, () -> encrypter.decrypt(""));
	}
	
	/**
	* Test case for {@link StringEncrypter#decrypt(String)} method.
	* It tests the method with a valid argument.
	*/
	@Test
	public void testDecryptValid() {
		StringEncrypter encrypter = new StringEncrypter();
		assertEquals("Hello World!", encrypter.decrypt("Hello World!"));
	}
}

// StringEncrypter.java
package osa.ora.server.utils;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import java.security.spec.KeySpec;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEParameterSpec;

public class StringEncrypter {

    /**
     * Takes a encrypted String as an argument, decrypts and returns the
     * decrypted String.
     *
     * @param str Encrypted String to be decrypted
     * @return <code>String</code> Decrypted version of the provided String
     */
    public String decrypt(String str) {
        try {
            // Create encrypter/decrypter class
            StringEncrypter encrypter = new StringEncrypter();

            // Encrypt the string
            String encrypted = encrypter.encrypt(str);

            // Decrypt the string
            String decrypted = encrypter.decrypt(encrypted);

            // Print out values
            System.out.println("Plain Text : " + str);
            System.out.println("Encrypted : " + encrypted);
            System.out.println("Decrypted : " + decrypted);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// StringEncrypterTest.java
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
* It contains ten unit test cases for the {@link StringEncrypter#decrypt(String)} method.
*/
class StringEncrypterTest {
		
	/**
	* Test case for {@link StringEncrypter#decrypt(String)} method.
	* It tests the method with a null argument.
	*/
	@Test
	public void testDecryptNull() {
		StringEncrypter encrypter = new StringEncrypter();
		assertThrows(NullPointerException.class, () -> encrypter.decrypt(null));
	}
	
	/**
	* Test case for {@link StringEncrypter#decrypt(String)} method.
	* It tests the method with an empty argument.
	*/
	@Test
	public void testDecryptEmpty() {
		StringEncrypter encrypter = new StringEncrypter();
		assertThrows(IllegalArgumentException.class, () -> encrypter.decrypt(""));
	}
	
	/**
	* Test case for {@link StringEncrypter#decrypt(String)} method.
	* It tests the method with a valid argument.
	*/
	@Test
	public void testDecryptValid() {
		StringEncrypter encrypter = new StringEncrypter();
		assertEquals("Hello World!", encrypter.decrypt("Hello World!"));
	}
}
