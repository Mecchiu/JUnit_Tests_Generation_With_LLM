Here's the source code for the test class:

```
// InspirentoUtilities_2Test.java
package com.allenstudio.ir.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link InspirentoUtilities}.
 * It contains ten unit test cases for the {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)} method.
 */
class InspirentoUtilities_2Test {

    @Test
    void testStringReplaceAll_singleToken() {
        StringBuffer source = new StringBuffer("Hello, world!");
        StringBuffer expected = new StringBuffer("Hello, Inspirento!");
        StringBuffer actual = InspirentoUtilities.stringReplaceAll(source, 'w', "Inspirento");
        assertEquals(expected.toString(), actual.toString());
    }

    @Test
    void testStringReplaceAll_multipleTokens() {
        StringBuffer source = new StringBuffer("Hello, world! This is a test.");
        StringBuffer expected = new StringBuffer("Hello, Inspirento! This is a test.");
        StringBuffer actual = InspirentoUtilities.stringReplaceAll(source, 'w', "Inspirento");
        assertEquals(expected.toString(), actual.toString());
    }

    @Test
    void testStringReplaceAll_noToken() {
        StringBuffer source = new StringBuffer("Hello, world!");
        StringBuffer expected = new StringBuffer("Hello, world!");
        StringBuffer actual = InspirentoUtilities.stringReplaceAll(source, 'x', "Inspirento");
        assertEquals(expected.toString(), actual.toString());
    }

    @Test
    void testStringReplaceAll_emptyString() {
        StringBuffer source = new StringBuffer("");
        StringBuffer expected = new StringBuffer("");
        StringBuffer actual = InspirentoUtilities.stringReplaceAll(source, 'x', "Inspirento");
        assertEquals(expected.toString(), actual.toString());
    }

    @Test
    void testStringReplaceAll_nullString() {
        StringBuffer source = null;
        StringBuffer expected = null;
        StringBuffer actual = InspirentoUtilities.stringReplaceAll(source, 'x', "Inspirento");
        assertEquals(expected, actual);
    }

    @Test
    void testStringReplaceAll_nullReplacement() {
        StringBuffer source = new StringBuffer("Hello, world!");
        StringBuffer expected = new StringBuffer("Hello, world!");
        StringBuffer actual = InspirentoUtilities.stringReplaceAll(source, 'o', null);
        assertEquals(expected.toString(), actual.toString());
    }

    @Test
    void testStringReplaceAll_emptyReplacement() {
        StringBuffer source = new StringBuffer("Hello, world!");
        StringBuffer expected = new StringBuffer("Hell, wrld!");
        StringBuffer actual = InspirentoUtilities.stringReplaceAll(source, 'o', "");
        assertEquals(expected.toString(), actual.toString());
    }

    @Test
    void testStringReplaceAll_singleTokenAtBeginning() {
        StringBuffer source = new StringBuffer("world! Hello, world!");
        StringBuffer expected = new StringBuffer("Inspirento! Hello, Inspirento!");
        StringBuffer actual = InspirentoUtilities.stringReplaceAll(source, 'w', "Inspirento");
        assertEquals(expected.toString(), actual.toString());
    }

    @Test
    void testStringReplaceAll_singleTokenAtEnd() {
        StringBuffer source = new StringBuffer("Hello, world! world!");
        StringBuffer expected = new StringBuffer("Hello, Inspirento! Inspirento!");
        StringBuffer actual = InspirentoUtilities.stringReplaceAll(source, 'w', "Inspirento");
        assertEquals(expected.toString(), actual.toString());
    }

    @Test
    void testStringReplaceAll_multipleTokensAtBeginningAndEnd() {
        StringBuffer source = new StringBuffer("world! Hello, world! world!");
        StringBuffer expected = new StringBuffer("Inspirento! Hello, Inspirento! Inspirento!");
        StringBuffer actual = InspirentoUtilities.stringReplaceAll(source, 'w', "Inspirento");
        assertEquals(expected.toString(), actual.toString());
    }
}
```