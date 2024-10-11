package outputformat;
// OutputFormat_19Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OutputFormat}.
* It contains ten unit test cases for the {@link OutputFormat#setIndent(String)} method.
*/
class OutputFormat_19Test {
    /**
     * Test case for setting a valid indent string.
     */
    @Test
    void testSetIndentValid() {
        OutputFormat format = new OutputFormat();
        format.setIndent("    "); // 4 spaces
        assertEquals("    ", format.getIndent());
    }

    /**
     * Test case for setting an empty indent string.
     * Expecting no indentation (null).
     */
    @Test
    void testSetIndentEmpty() {
        OutputFormat format = new OutputFormat();
        format.setIndent("");
        assertNull(format.getIndent());
    }

    /**
     * Test case for setting a null indent string.
     * Expecting no indentation (null).
     */
    @Test
    void testSetIndentNull() {
        OutputFormat format = new OutputFormat();
        format.setIndent(null);
        assertNull(format.getIndent());
    }

    /**
     * Test case for setting a single space indent string.
     */
    @Test
    void testSetIndentSingleSpace() {
        OutputFormat format = new OutputFormat();
        format.setIndent(" ");
        assertEquals(" ", format.getIndent());
    }

    /**
     * Test case for setting a tab character as indent.
     */
    @Test
    void testSetIndentTab() {
        OutputFormat format = new OutputFormat();
        format.setIndent("\t");
        assertEquals("\t", format.getIndent());
    }

    /**
     * Test case for setting a mixed whitespace indent string.
     */
    @Test
    void testSetIndentMixedWhitespace() {
        OutputFormat format = new OutputFormat();
        format.setIndent(" \t ");
        assertEquals(" \t ", format.getIndent());
    }

    /**
     * Test case for setting a long indent string.
     */
    @Test
    void testSetIndentLongString() {
        OutputFormat format = new OutputFormat();
        String longIndent = "          "; // 10 spaces
        format.setIndent(longIndent);
        assertEquals(longIndent, format.getIndent());
    }

    /**
     * Test case for setting a non-whitespace indent string.
     */
    @Test
    void testSetIndentNonWhitespace() {
        OutputFormat format = new OutputFormat();
        format.setIndent("abc");
        assertEquals("abc", format.getIndent());
    }

    /**
     * Test case for setting a special character indent string.
     */
    @Test
    void testSetIndentSpecialCharacters() {
        OutputFormat format = new OutputFormat();
        format.setIndent("!@#");
        assertEquals("!@#", format.getIndent());
    }

    /**
     * Test case for setting a numeric character indent string.
     */
    @Test
    void testSetIndentNumericCharacters() {
        OutputFormat format = new OutputFormat();
        format.setIndent("123");
        assertEquals("123", format.getIndent());
    }
}