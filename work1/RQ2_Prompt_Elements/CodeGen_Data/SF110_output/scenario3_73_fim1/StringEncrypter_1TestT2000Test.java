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

    @Test
    public void encrypt_one_string() {
        String encoded = decrypt("one");
        assertEquals("one", encoded);
    }
    
    @Test
    public void encrypt_string_with_one_plaintext_key() {
        String enc = encrypt("password", "one");
        assertEquals("password", enc);
    }
            
    @Test
    public void encrypt_string_with_wrong_encryption_algonet_and_plaintext_key() {
        String enc = encrypt("password", "wrong", "plain");
        assertEquals("wrong", enc);
    }


   
    @Test
    public void decrypt_string_one_string_encrypting() {
        String plaintext = decrypt("password");
        assertEquals("decrypted", plaintext);
    }

}