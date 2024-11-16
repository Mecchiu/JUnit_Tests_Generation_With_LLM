// OutputFormat_20Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OutputFormat}.
* It contains ten unit test cases for the {@link OutputFormat#setIndent(boolean)} method.
*/
class OutputFormat_20Test {
```java
    @Test
    void testSetIndentTrue() {
        OutputFormat format = new OutputFormat();
        format.setIndent(true);
        assertEquals(OutputFormat.STANDARD_INDENT, format.getIndent());
    }

    @Test
    void testSetIndentFalse() {
        OutputFormat format = new OutputFormat();
        format.setIndent(false);
        assertNull(format.getIndent());
    }

    @Test
    void testSetIndentTrueAfterFalse() {
        OutputFormat format = new OutputFormat();
        format.setIndent(false);
        format.setIndent(true);
        assertEquals(OutputFormat.STANDARD_INDENT, format.getIndent());
    }

    @Test
    void testSetIndentFalseAfterTrue() {
        OutputFormat format = new OutputFormat();
        format.setIndent(true);
        format.setIndent(false);
        assertNull(format.getIndent());
    }

    @Test
    void testSetIndentTrueTwice() {
        OutputFormat format = new OutputFormat();
        format.setIndent(true);
        format.setIndent(true);
        assertEquals(OutputFormat.STANDARD_INDENT, format.getIndent());
    }

    @Test
    void testSetIndentFalseTwice() {
        OutputFormat format = new OutputFormat();
        format.setIndent(false);
        format.setIndent(false);
        assertNull(format.getIndent());
    }

    @Test
    void testSetIndentTrueThenFalseThenTrue() {
        OutputFormat format = new OutputFormat();
        format.setIndent(true);
        format.setIndent(false);
        format.setIndent(true);
        assertEquals(OutputFormat.STANDARD_INDENT, format.getIndent());
    }

    @Test
    void testSetIndentFalseThenTrueThenFalse() {
        OutputFormat format = new OutputFormat();
        format.setIndent(false);
        format.setIndent(true);
        format.setIndent(false);
        assertNull(format.getIndent());
    }

    @Test
    void testSetIndentWithCustomIndent() {
        OutputFormat format = new OutputFormat("    ");
        format.setIndent(true);
        assertEquals(OutputFormat.STANDARD_INDENT, format.getIndent());
    }

    @Test
    void testSetIndentWithNullIndent() {
        OutputFormat format = new OutputFormat(null);
        format.setIndent(true);
        assertEquals(OutputFormat.STANDARD_INDENT, format.getIndent());
    }
}
```

This test class `OutputFormat_20Test` contains ten unit test cases for the `setIndent(boolean)` method of the `OutputFormat` class. Each test case checks a different scenario to ensure that the method behaves as expected.