// EncryptTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Encrypt}.
* It contains one unit test case for the {@link Encrypt#encrypt(String)} method.
*/
class EncryptTest {

    /**
     * Test encrypt.
     * For a plain string s it returns 'lm'
     * For a non-plain string s it returns 'hf'
     */
    @Test
    void testEncrypt() {
        assertEquals("lm", Encrypt.encrypt("hi"));
        assertEquals("ef", Encrypt.encrypt("f"));
    }
	
}