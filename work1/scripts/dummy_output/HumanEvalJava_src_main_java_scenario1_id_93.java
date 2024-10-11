// EncodeTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Encode}.
* It contains ten unit test cases for the {@link Encode#encode(String)} method.
*/
class EncodeTest {
			// Test case 1: Test for empty string
    @Test
    void testEncodeEmptyString() {
        String message = "";
        String expResult = "";
        String result = Encode.encode(message);
        assertEquals(expResult, result);
    }
			// Test case 2: Test for string with only one character
    @Test
    void testEncodeOneCharacter() {
        String message = "a";
        String expResult = "C";
        String result = Encode.encode(message);
        assertEquals(expResult, result);
    }
			// Test case 3: Test for string with only one character
    @Test
    void testEncodeOneCharacter2() {
        String message = "Z";
        String expResult = "x";
        String result = Encode.encode(message);
        assertEquals(expResult, result);
    }
			// Test case 4: Test for string with only one character
    @Test
    void testEncodeOneCharacter3() {
        String message = "5";
        String expResult = "5";
        String result = Encode.encode(message);
        assertEquals(expResult, result);
    }
			// Test case 5: Test for string with only one character
    @Test
    void testEncodeOneCharacter4() {
        String message = "!";
        String expResult = "!";
        String result = Encode.encode(message);
        assertEquals(expResult, result);
    }
			// Test case 6: Test for string with only one character
    @Test
    void testEncodeOneCharacter5() {
        String message = " ";
        String expResult = " ";
        String result = Encode.encode(message);
        assertEquals(expResult, result);
    }
			// Test case 7: Test for string with only one character
    @Test
    void testEncodeOneCharacter6() {
        String message = "a";
        String expResult = "C";
        String result = Encode.encode(message);
        assertEquals(expResult, result);
    }
			// Test case 8: Test for string with only one character
    @Test
    void testEncodeOneCharacter7() {
        String message = "A";
        String expResult = "c";
        String result = Encode.encode(message);
        assertEquals(expResult, result);
    }
			// Test case 9: Test for string with only one character
    @Test
    void testEncodeOneCharacter8() {
        String message = "z";
        String expResult = "X";
        String result = Encode.encode(message);
        assertEquals(expResult, result);
    }
			// Test case 10: Test for string with only one character
    @Test
    void testEncodeOneCharacter9() {
        String message = "Z";
        String expResult = "x";
        String result = Encode.encode(message);
        assertEquals(expResult, result);
    }
			// Test case 11: Test for string with only one character
    @Test
    void testEncodeOneCharacter10() {
        String message = "5";
        String expResult = "5";
        String result = Encode.encode(message);
        assertEquals(expResult, result);
    }
			// Test case 12: Test for string with only one character
    @Test
    void testEncodeOneCharacter11() {
        String message = "!";
        String expResult = "!";
        String result = Encode.encode(message);
        assertEquals(expResult, result);
    }
			// Test case 13: Test for string with only one character
    @Test
    void testEncodeOneCharacter12() {
        String message = " ";
        String expResult = " ";
        String result = Encode.encode(message);
        assertEquals(expResult, result);
    }
			// Test case 14: Test for string with only one character
    @Test
    void testEncodeOneCharacter13() {
        String message = "a";
        String expResult = "C";
        String result = Encode.encode(message);
        assertEquals(expResult, result);
    }
			// Test case 15: Test for string with only one character
    @Test
    void testEncodeOneCharacter14() {
        String message = "A";
        String expResult = "c";
        String result = Encode.encode(message);
        assertEquals(expResult, result);
    }
			// Test case 16: Test for string with only one character
    @Test
    void testEncodeOneCharacter15() {
        String message = "z";
        String expResult = "X";
        String result = Encode.encode(message);
        assertEquals(expResult, result);
    }
			// Test case 17: Test for string with only one character
    @Test
    void testEncodeOneCharacter16() {
        String message = "Z";
        String expResult = "x";
        String result = Encode.encode(message);
        assertEquals(expResult, result);
    }
			// Test case 18: Test for string with only one character
    @Test
    void testEncodeOneCharacter17() {
        String message = "5";
        String expResult = "5";
        String result = Encode.encode(message);
        assertEquals(expResult, result);
    }
			// Test case 19: Test for string with only one character
    @Test
    void testEncodeOneCharacter18() {
        String message = "!";
        String expResult = "!";
        String result = Encode.encode(message);
        assertEquals(expResult, result);
    }
			// Test case 20: Test for string with only one character
    @Test
    void testEncodeOneCharacter19() {
        String message = " ";
        String expResult = " ";
        String result = Encode.encode(message);
        assertEquals(expResult, result);
    }
}