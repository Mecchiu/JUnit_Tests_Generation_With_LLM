// OutputFormat_29Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OutputFormat}.
* It contains ten unit test cases for the {@link OutputFormat#createPrettyPrint()} method.
*/
class OutputFormat_29Test {
```java
    @Test
    void testPrettyPrintIndentSize() {
        OutputFormat format = OutputFormat.createPrettyPrint();
        assertEquals("  ", format.getIndent(), "Indent size should be 2 spaces");
    }

    @Test
    void testPrettyPrintNewlines() {
        OutputFormat format = OutputFormat.createPrettyPrint();
        assertTrue(format.isNewlines(), "Newlines should be enabled");
    }

    @Test
    void testPrettyPrintTrimText() {
        OutputFormat format = OutputFormat.createPrettyPrint();
        assertTrue(format.isTrimText(), "Trim text should be enabled");
    }

    @Test
    void testPrettyPrintPadText() {
        OutputFormat format = OutputFormat.createPrettyPrint();
        assertTrue(format.isPadText(), "Pad text should be enabled");
    }

    @Test
    void testPrettyPrintXHTML() {
        OutputFormat format = OutputFormat.createPrettyPrint();
        assertFalse(format.isXHTML(), "XHTML should be disabled");
    }

    @Test
    void testPrettyPrintOmitEncoding() {
        OutputFormat format = OutputFormat.createPrettyPrint();
        assertFalse(format.isOmitEncoding(), "Omit encoding should be disabled");
    }

    @Test
    void testPrettyPrintSuppressDeclaration() {
        OutputFormat format = OutputFormat.createPrettyPrint();
        assertFalse(format.isSuppressDeclaration(), "Suppress declaration should be disabled");
    }

    @Test
    void testPrettyPrintExpandEmptyElements() {
        OutputFormat format = OutputFormat.createPrettyPrint();
        assertFalse(format.isExpandEmptyElements(), "Expand empty elements should be disabled");
    }

    @Test
    void testPrettyPrintLineSeparator() {
        OutputFormat format = OutputFormat.createPrettyPrint();
        assertEquals("\n", format.getLineSeparator(), "Line separator should be newline");
    }

    @Test
    void testPrettyPrintAttributeQuoteCharacter() {
        OutputFormat format = OutputFormat.createPrettyPrint();
        assertEquals('"', format.getAttributeQuoteCharacter(), "Attribute quote character should be double quote");
    }
}
```

This test class `OutputFormat_29Test` contains ten unit test cases for the `OutputFormat#createPrettyPrint()` method. Each test case checks a specific property of the `OutputFormat` object created by the `createPrettyPrint()` method to ensure it matches the expected default pretty printing format.