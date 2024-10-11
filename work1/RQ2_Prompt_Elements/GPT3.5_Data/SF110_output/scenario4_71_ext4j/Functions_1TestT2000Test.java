// Functions_1Test.java
package net.sourceforge.ext4j.taglib.tag;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link Functions}.
 * It contains ten unit test cases for the {@link Functions#addS(String)} method.
 */
class Functions_1Test {

    @Test
    void testAddS() {
        String text = "James";
        String expected = "James'";
        String actual = Functions.addS(text);
        assertEquals(expected, actual);
    }

    @Test
    void testAddSWithEmptyString() {
        String text = "";
        String expected = "'";
        String actual = Functions.addS(text);
        assertEquals(expected, actual);
    }

    @Test
    void testAddSWithNullString() {
        String text = null;
        String expected = "'";
        String actual = Functions.addS(text);
        assertEquals(expected, actual);
    }

    @Test
    void testAddSWithPluralString() {
        String text = "Apples";
        String expected = "Apples'";
        String actual = Functions.addS(text);
        assertEquals(expected, actual);
    }

    @Test
    void testAddSWithPluralStringEndingInS() {
        String text = "Buses";
        String expected = "Buses'";
        String actual = Functions.addS(text);
        assertEquals(expected, actual);
    }

    @Test
    void testAddSWithPluralStringEndingInY() {
        String text = "Parties";
        String expected = "Parties'";
        String actual = Functions.addS(text);
        assertEquals(expected, actual);
    }

    @Test
    void testAddSWithSingularStringEndingInS() {
        String text = "James";
        String expected = "James'";
        String actual = Functions.addS(text);
        assertEquals(expected, actual);
    }

    @Test
    void testAddSWithSingularStringEndingInY() {
        String text = "Party";
        String expected = "Party's";
        String actual = Functions.addS(text);
        assertEquals(expected, actual);
    }

    @Test
    void testAddSWithSingularString() {
        String text = "Daniel";
        String expected = "Daniel's";
        String actual = Functions.addS(text);
        assertEquals(expected, actual);
    }
}