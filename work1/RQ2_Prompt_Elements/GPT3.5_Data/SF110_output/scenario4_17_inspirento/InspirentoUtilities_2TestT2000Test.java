// Test class of InspirentoUtilities
package com.allenstudio.ir.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link InspirentoUtilities}.
 * It contains ten unit test cases for the {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)} method.
 */
class InspirentoUtilitiesTest {

    @Test
    void testStringReplaceAll() {
        // Test case 1: Empty string
        StringBuffer sb1 = new StringBuffer("");
        InspirentoUtilities.stringReplaceAll(sb1, 'a', "b");
        assertEquals("", sb1.toString());

        // Test case 2: No occurrence of token
        StringBuffer sb2 = new StringBuffer("hello world");
        InspirentoUtilities.stringReplaceAll(sb2, 'a', "b");
        assertEquals("hello world", sb2.toString());

        // Test case 3: Single occurrence of token
        StringBuffer sb3 = new StringBuffer("hello world");
        InspirentoUtilities.stringReplaceAll(sb3, 'o', "a");
        assertEquals("hella warld", sb3.toString());

        // Test case 4: Multiple occurrences of token
        StringBuffer sb4 = new StringBuffer("hello world");
        InspirentoUtilities.stringReplaceAll(sb4, 'l', "a");
        assertEquals("heao worad", sb4.toString());

        // Test case 5: Token at beginning of string
        StringBuffer sb5 = new StringBuffer("hello world");
        InspirentoUtilities.stringReplaceAll(sb5, 'h', "a");
        assertEquals("aello world", sb5.toString());

        // Test case 6: Token at end of string
        StringBuffer sb6 = new StringBuffer("hello world");
        InspirentoUtilities.stringReplaceAll(sb6, 'd', "a");
        assertEquals("hello worla", sb6.toString());

        // Test case 7: Token is the only character in string
        StringBuffer sb7 = new StringBuffer("a");
        InspirentoUtilities.stringReplaceAll(sb7, 'a', "b");
        assertEquals("b", sb7.toString());

        // Test case 8: Token is the first and last character in string
        StringBuffer sb8 = new StringBuffer("aaba");
        InspirentoUtilities.stringReplaceAll(sb8, 'a', "b");
        assertEquals("bbbb", sb8.toString());

        // Test case 9: Token is a whitespace character
        StringBuffer sb9 = new StringBuffer("hello world");
        InspirentoUtilities.stringReplaceAll(sb9, ' ', "_");
        assertEquals("hello_world", sb9.toString());

        // Test case 10: Token is a special character
        StringBuffer sb10 = new StringBuffer("hello world!");
        InspirentoUtilities.stringReplaceAll(sb10, '!', "?");
        assertEquals("hello world?", sb10.toString());
    }
}