// EncryptTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Encrypt}.
* It contains ten unit test cases for the {@link Encrypt#encrypt(String)} method.
*/
class EncryptTest {
			// Test case 1
    @Test
    void testEncrypt1() {
        String input = "abc";
        String expected = "cde";
        String actual = Encrypt.encrypt(input);
        assertEquals(expected, actual);
    }

    // Test case 2
    @Test
    void testEncrypt2() {
        String input = "xyz";
        String expected = "zab";
        String actual = Encrypt.encrypt(input);
        assertEquals(expected, actual);
    }

    // Test case 3
    @Test
    void testEncrypt3() {
        String input = "hello";
        String expected = "jgnnq";
        String actual = Encrypt.encrypt(input);
        assertEquals(expected, actual);
    }

    // Test case 4
    @Test
    void testEncrypt4() {
        String input = "world";
        String expected = "yqtnf";
        String actual = Encrypt.encrypt(input);
        assertEquals(expected, actual);
    }

    // Test case 5
    @Test
    void testEncrypt5() {
        String input = "java";
        String expected = "lcxc";
        String actual = Encrypt.encrypt(input);
        assertEquals(expected, actual);
    }

    // Test case 6
    @Test
    void testEncrypt6() {
        String input = "programming";
        String expected = "rtwppqnhkpi";
        String actual = Encrypt.encrypt(input);
        assertEquals(expected, actual);
    }

    // Test case 7
    @Test
    void testEncrypt7() {
        String input = "computer";
        String expected = "eqoguvgt";
        String actual = Encrypt.encrypt(input);
        assertEquals(expected, actual);
    }

    // Test case 8
    @Test
    void testEncrypt8() {
        String input = "science";
        String expected = "uekgpeg";
        String actual = Encrypt.encrypt(input);
        assertEquals(expected, actual);
    }

    // Test case 9
    @Test
    void testEncrypt9() {
        String input = "technology";
        String expected = "vgzvkuqfa";
        String actual = Encrypt.encrypt(input);
        assertEquals(expected, actual);
    }

    // Test case 10
    @Test
    void testEncrypt10() {
        String input = "engineering";
        String expected = "gpetarngvcn";
        String actual = Encrypt.encrypt(input);
        assertEquals(expected, actual);
    }
}