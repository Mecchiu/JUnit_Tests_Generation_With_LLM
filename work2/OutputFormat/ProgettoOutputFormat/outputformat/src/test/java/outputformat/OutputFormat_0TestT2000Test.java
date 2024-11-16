// OutputFormat_0Test.java

package outputformat;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OutputFormat}.
* It contains ten unit test cases for the {@link OutputFormat#getLineSeparator()} method.
*/
class OutputFormat_0Test {
    /**
     * Test case for default line separator.
     */
    @Test
    void testDefaultLineSeparator() {
        OutputFormat format = new OutputFormat();
        assertEquals("\n", format.getLineSeparator(), "Default line separator should be \\n");
    }

    /**
     * Test case for setting line separator to system line separator.
     */
    @Test
    void testSystemLineSeparator() {
        OutputFormat format = new OutputFormat();
        String systemLineSeparator = System.getProperty("line.separator");
        format.setLineSeparator(systemLineSeparator);
        assertEquals(systemLineSeparator, format.getLineSeparator(), "Line separator should match system line separator");
    }

    /**
     * Test case for setting line separator to custom value.
     */
    @Test
    void testCustomLineSeparator() {
        OutputFormat format = new OutputFormat();
        String customSeparator = "\r\n";
        format.setLineSeparator(customSeparator);
        assertEquals(customSeparator, format.getLineSeparator(), "Line separator should match custom value");
    }

    /**
     * Test case for setting line separator to empty string.
     */
    @Test
    void testEmptyLineSeparator() {
        OutputFormat format = new OutputFormat();
        format.setLineSeparator("");
        assertEquals("", format.getLineSeparator(), "Line separator should be empty string");
    }

    /**
     * Test case for setting line separator to null.
     */
    @Test
    void testNullLineSeparator() {
        OutputFormat format = new OutputFormat();
        format.setLineSeparator(null);
        assertNull(format.getLineSeparator(), "Line separator should be null");
    }

    /**
     * Test case for setting line separator to a single space.
     */
    @Test
    void testSingleSpaceLineSeparator() {
        OutputFormat format = new OutputFormat();
        format.setLineSeparator(" ");
        assertEquals(" ", format.getLineSeparator(), "Line separator should be a single space");
    }

    /**
     * Test case for setting line separator to a tab character.
     */
    @Test
    void testTabLineSeparator() {
        OutputFormat format = new OutputFormat();
        format.setLineSeparator("\t");
        assertEquals("\t", format.getLineSeparator(), "Line separator should be a tab character");
    }

    /**
     * Test case for setting line separator to a custom string with special characters.
     */
    @Test
    void testSpecialCharacterLineSeparator() {
        OutputFormat format = new OutputFormat();
        String specialSeparator = "###";
        format.setLineSeparator(specialSeparator);
        assertEquals(specialSeparator, format.getLineSeparator(), "Line separator should match special character string");
    }

    /**
     * Test case for setting line separator to a long custom string.
     */
    @Test
    void testLongCustomLineSeparator() {
        OutputFormat format = new OutputFormat();
        String longSeparator = "ThisIsALongLineSeparator";
        format.setLineSeparator(longSeparator);
        assertEquals(longSeparator, format.getLineSeparator(), "Line separator should match long custom string");
    }

    /**
     * Test case for setting line separator to a multi-line string.
     */
    @Test
    void testMultiLineStringLineSeparator() {
        OutputFormat format = new OutputFormat();
        String multiLineSeparator = "Line1\nLine2";
        format.setLineSeparator(multiLineSeparator);
        assertEquals(multiLineSeparator, format.getLineSeparator(), "Line separator should match multi-line string");
    }
}