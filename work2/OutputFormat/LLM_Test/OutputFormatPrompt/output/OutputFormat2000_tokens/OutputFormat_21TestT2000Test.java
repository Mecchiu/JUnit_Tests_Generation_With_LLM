package outputformat;
// OutputFormat_21Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OutputFormat}.
* It contains ten unit test cases for the {@link OutputFormat#setIndentSize(int)} method.
*/
class OutputFormat_21Test {
    @Test
    void testSetIndentSizeZero() {
        OutputFormat format = new OutputFormat();
        format.setIndentSize(0);
        assertEquals("", format.getIndent());
    }

    @Test
    void testSetIndentSizeOne() {
        OutputFormat format = new OutputFormat();
        format.setIndentSize(1);
        assertEquals(" ", format.getIndent());
    }

    @Test
    void testSetIndentSizeTwo() {
        OutputFormat format = new OutputFormat();
        format.setIndentSize(2);
        assertEquals("  ", format.getIndent());
    }

    @Test
    void testSetIndentSizeThree() {
        OutputFormat format = new OutputFormat();
        format.setIndentSize(3);
        assertEquals("   ", format.getIndent());
    }

    @Test
    void testSetIndentSizeFour() {
        OutputFormat format = new OutputFormat();
        format.setIndentSize(4);
        assertEquals("    ", format.getIndent());
    }

    @Test
    void testSetIndentSizeFive() {
        OutputFormat format = new OutputFormat();
        format.setIndentSize(5);
        assertEquals("     ", format.getIndent());
    }

    @Test
    void testSetIndentSizeTen() {
        OutputFormat format = new OutputFormat();
        format.setIndentSize(10);
        assertEquals("          ", format.getIndent());
    }

    @Test
    void testSetIndentSizeNegative() {
        OutputFormat format = new OutputFormat();
        format.setIndentSize(-1);
        assertEquals("", format.getIndent());
    }

    @Test
    void testSetIndentSizeLarge() {
        OutputFormat format = new OutputFormat();
        format.setIndentSize(100);
        assertEquals(" ".repeat(100), format.getIndent());
    }

    @Test
    void testSetIndentSizeChange() {
        OutputFormat format = new OutputFormat();
        format.setIndentSize(2);
        assertEquals("  ", format.getIndent());
        format.setIndentSize(4);
        assertEquals("    ", format.getIndent());
    }
}