// StringToMd5Test.java
package scenario1;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringToMd5}.
* It contains ten unit test cases for the {@link StringToMd5#stringToMd5(String)} method.
*/
class StringToMd5Test {
	// Test case 1: Test for empty string
    @Test
    void testStringToMd5EmptyString() {
        String text = "";
        String expResult = null;
        String result = StringToMd5.stringToMd5(text);
        assertEquals(expResult, result);
    }
			// Test case 2: Test for string with one character
    @Test
    void testStringToMd5OneCharacter() {
        String text = "a";
        String expResult = "0cc175b9c0f1b6a831c399e269772661";
        String result = StringToMd5.stringToMd5(text);
        assertEquals(expResult, result);
    }
			// Test case 3: Test for string with two characters
    @Test
    void testStringToMd5TwoCharacters() {
        String text = "ab";
        String expResult = "187ef4436122d1cc2f40dc2b92f0eba0";
        String result = StringToMd5.stringToMd5(text);
        assertEquals(expResult, result);
    }
			// Test case 4: Test for string with three characters
    @Test
    void testStringToMd5ThreeCharacters() {
        String text = "abc";
        String expResult = "900150983cd24fb0d6963f7d28e17f72";
        String result = StringToMd5.stringToMd5(text);
        assertEquals(expResult, result);
    }
			// Test case 5: Test for string with four characters
    @Test
    void testStringToMd5FourCharacters() {
        String text = "abcd";
        String expResult = "e2fc714c4727ee9395f324cd2e7f331f";
        String result = StringToMd5.stringToMd5(text);
        assertEquals(expResult, result);
    }
			// Test case 6: Test for string with five characters
    @Test
    void testStringToMd5FiveCharacters() {
        String text = "abcde";
        String expResult = "ab56b4d92b40713acc5af89985d4b786";
        String result = StringToMd5.stringToMd5(text);
        assertEquals(expResult, result);
    }
			// Test case 7: Test for string with six characters
    @Test
    void testStringToMd5SixCharacters() {
        String text = "abcdef";
        String expResult = "e80b5017098950fc58aad83c8c14978e";
        String result = StringToMd5.stringToMd5(text);
        assertEquals(expResult, result);
    }
			// Test case 8: Test for string with seven characters
    @Test
    void testStringToMd5SevenCharacters() {
        String text = "abcdefg";
        String expResult = "7ac66c0f148de9519b8bd264312c4d64";
        String result = StringToMd5.stringToMd5(text);
        assertEquals(expResult, result);
    }
			// Test case 9: Test for string with eight characters
    @Test
    void testStringToMd5EightCharacters() {
        String text = "abcdefgh";
        String expResult = "e8dc4081b13434b45189a720b77b6818";
        String result = StringToMd5.stringToMd5(text);
        assertEquals(expResult, result);
    }
			// Test case 10: Test for string with nine characters
    @Test
    void testStringToMd5NineCharacters() {
        String text = "abcdefghi";
        String expResult = "8aa99b1f439ff71293e95357bac6fd94";
        String result = StringToMd5.stringToMd5(text);
        assertEquals(expResult, result);
    }
}
