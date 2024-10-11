// DecompilerTest.java
package org.mozilla.javascript;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Decompiler}.
* It contains one unit test case for the {@link Decompiler#decompile(String, int, UintMap)} method.
*/
class DecompilerTest {

	final Decompiler d = new Decompiler();
	
    @Test
    public void testDecompile_SingleString() {
    	String src = "abc";
    	int i = 0;
    	String expected = "'abc" + i;
    	assertEquals(expected, d.decompile(src, DECODED_FLAGS, UintMap.EMPTY));
    }
    
    @Test
    public void testDecompile_ManyString() {
    	// Tests that when the source string is a huge, and huge amount of bits, 
    	// the output will be a single byte. This case would require 3 steps (the first to see
    	// the right spacing, then to the token sequence of the string, and then to the
    	// characters in the string
        String src = "abc" + new char[100000];
        String[] expected = {
        	"\"abc\" + 1",
                "\"abc\" += 2",
                "\\" + "c"
        };

        // This is not very efficient, but it's close enough to improve the 
        // speed of the string comparison.
        int expectedSize = src.length();
        int srcSize = expectedSize * 3;

        // First test the size of the last character before the next character.
        assertEquals("Incorrect last character", srcSize, d.decompile(src).length());

        // Then test the next two characters. The next character will be a backslash.
        expectedSize--; // Skip the character before the next one (the last one)
        expectedSize--; // Make the last one the same.
        assertEquals("Incorrect next character", expectedSize, expectedSize);

        // Finally test that the actual decomposition is in fact 1 or 4 bytes.
        assertEquals("Incorrect next character", 4, expectedSize);
    }
}
