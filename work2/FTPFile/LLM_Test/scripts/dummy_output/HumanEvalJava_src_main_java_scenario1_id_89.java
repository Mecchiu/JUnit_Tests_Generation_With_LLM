// EncryptTest.java
package scenario1;


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
        String input = "ABC";
        String expected = "CDE";
        String actual = Encrypt.encrypt(input);
        assertEquals(expected, actual);
    }
			// Test case 4
    @Test
    void testEncrypt4() {
        String input = "XYZ";
        String expected = "ZAB";
        String actual = Encrypt.encrypt(input);
        assertEquals(expected, actual);
    }
			// Test case 5
    @Test
    void testEncrypt5() {
        String input = "aBc";
        String expected = "cDe";
        String actual = Encrypt.encrypt(input);
        assertEquals(expected, actual);
    }
			// Test case 6
    @Test
    void testEncrypt6() {
        String input = "xYz";
        String expected = "zAb";
        String actual = Encrypt.encrypt(input);
        assertEquals(expected, actual);
    }
			// Test case 7
    @Test
    void testEncrypt7() {
        String input = "AbC";
        String expected = "CdE";
        String actual = Encrypt.encrypt(input);
        assertEquals(expected, actual);
    }
			// Test case 8
    @Test
    void testEncrypt8() {
        String input = "XyZ";
        String expected = "ZaB";
        String actual = Encrypt.encrypt(input);
        assertEquals(expected, actual);
    }
			// Test case 9
    @Test
    void testEncrypt9() {
        String input = "a1b";
        String expected = "c1d";
        String actual = Encrypt.encrypt(input);
        assertEquals(expected, actual);
    }
			// Test case 10
    @Test
    void testEncrypt10() {
        String input = "x9z";
        String expected = "z9b";
        String actual = Encrypt.encrypt(input);
        assertEquals(expected, actual);
    }
}