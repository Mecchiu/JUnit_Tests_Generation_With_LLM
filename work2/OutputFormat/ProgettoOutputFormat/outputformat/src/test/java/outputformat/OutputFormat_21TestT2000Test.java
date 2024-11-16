// OutputFormat_21Test.java

package outputformat;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OutputFormat}.
* It contains ten unit test cases for the {@link OutputFormat#setIndentSize(int)} method.
*/
class OutputFormat_21Test {
    /**
     * Test case for setting indent size to a positive value.
     */
    @Test
    void testSetIndentSizePositive() {
        OutputFormat format = new OutputFormat();
        format.setIndentSize(4);
        assertEquals("    ", format.getIndent());
    }

    /**
     * Test case for setting indent size to zero.
     */
    @Test
    void testSetIndentSizeZero() {
        OutputFormat format = new OutputFormat();
        format.setIndentSize(0);
        assertNull(format.getIndent());
    }

    /**
     * Test case for setting indent size to a negative value.
     * Expecting no change in indent.
     */
    @Test
    void testSetIndentSizeNegative() {
        OutputFormat format = new OutputFormat();
        format.setIndentSize(-3);
        assertNull(format.getIndent());
    }

    /**
     * Test case for setting indent size to a large value.
     */
    @Test
    void testSetIndentSizeLarge() {
        OutputFormat format = new OutputFormat();
        format.setIndentSize(10);
        assertEquals("          ", format.getIndent());
    }

    /**
     * Test case for setting indent size after setting a specific indent string.
     */
    @Test
    void testSetIndentSizeAfterSettingIndent() {
        OutputFormat format = new OutputFormat();
        format.setIndent("  ");
        format.setIndentSize(3);
        assertEquals("   ", format.getIndent());
    }

    /**
     * Test case for setting indent size multiple times.
     */
    @Test
    void testSetIndentSizeMultipleTimes() {
        OutputFormat format = new OutputFormat();
        format.setIndentSize(2);
        assertEquals("  ", format.getIndent());
        format.setIndentSize(5);
        assertEquals("     ", format.getIndent());
    }

    /**
     * Test case for setting indent size to a value and then disabling indent.
     */
    @Test
    void testSetIndentSizeThenDisableIndent() {
        OutputFormat format = new OutputFormat();
        format.setIndentSize(3);
        assertEquals("   ", format.getIndent());
        format.setIndent(false);
        assertNull(format.getIndent());
    }

    /**
     * Test case for setting indent size to a value and then enabling standard indent.
     */
    @Test
    void testSetIndentSizeThenEnableStandardIndent() {
        OutputFormat format = new OutputFormat();
        format.setIndentSize(3);
        assertEquals("   ", format.getIndent());
        format.setIndent(true);
        assertEquals(OutputFormat.STANDARD_INDENT, format.getIndent());
    }

    /**
     * Test case for setting indent size to a value and then setting a specific indent string.
     */
    @Test
    void testSetIndentSizeThenSetSpecificIndent() {
        OutputFormat format = new OutputFormat();
        format.setIndentSize(3);
        assertEquals("   ", format.getIndent());
        format.setIndent("    ");
        assertEquals("    ", format.getIndent());
    }

    /**
     * Test case for setting indent size to a value and then setting it to zero.
     */
    @Test
    void testSetIndentSizeThenSetToZero() {
        OutputFormat format = new OutputFormat();
        format.setIndentSize(3);
        assertEquals("   ", format.getIndent());
        format.setIndentSize(0);
        assertNull(format.getIndent());
    }
}