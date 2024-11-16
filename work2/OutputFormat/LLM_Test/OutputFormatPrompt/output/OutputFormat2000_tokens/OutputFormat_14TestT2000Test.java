// OutputFormat_14Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OutputFormat}.
* It contains ten unit test cases for the {@link OutputFormat#isTrimText()} method.
*/
class OutputFormat_14Test {
```java
    /**
     * Test case for default value of trimText.
     */
    @Test
    void testDefaultTrimText() {
        OutputFormat format = new OutputFormat();
        assertFalse(format.isTrimText(), "Default trimText should be false");
    }

    /**
     * Test case for setting trimText to true.
     */
    @Test
    void testSetTrimTextTrue() {
        OutputFormat format = new OutputFormat();
        format.setTrimText(true);
        assertTrue(format.isTrimText(), "trimText should be true after setting it to true");
    }

    /**
     * Test case for setting trimText to false.
     */
    @Test
    void testSetTrimTextFalse() {
        OutputFormat format = new OutputFormat();
        format.setTrimText(true);
        format.setTrimText(false);
        assertFalse(format.isTrimText(), "trimText should be false after setting it to false");
    }

    /**
     * Test case for trimText with pretty print format.
     */
    @Test
    void testPrettyPrintTrimText() {
        OutputFormat format = OutputFormat.createPrettyPrint();
        assertTrue(format.isTrimText(), "Pretty print format should have trimText set to true");
    }

    /**
     * Test case for trimText with compact format.
     */
    @Test
    void testCompactFormatTrimText() {
        OutputFormat format = OutputFormat.createCompactFormat();
        assertTrue(format.isTrimText(), "Compact format should have trimText set to true");
    }

    /**
     * Test case for trimText after parsing options with -trimText.
     */
    @Test
    void testParseOptionsTrimText() {
        OutputFormat format = new OutputFormat();
        String[] args = {"-trimText"};
        format.parseOptions(args, 0);
        assertTrue(format.isTrimText(), "trimText should be true after parsing -trimText option");
    }

    /**
     * Test case for trimText after parsing options without -trimText.
     */
    @Test
    void testParseOptionsWithoutTrimText() {
        OutputFormat format = new OutputFormat();
        String[] args = {"-indentSize", "4"};
        format.parseOptions(args, 0);
        assertFalse(format.isTrimText(), "trimText should remain false if -trimText option is not parsed");
    }

    /**
     * Test case for trimText with custom constructor.
     */
    @Test
    void testCustomConstructorTrimText() {
        OutputFormat format = new OutputFormat("    ", true, "UTF-8");
        assertFalse(format.isTrimText(), "Custom constructor should have trimText set to false by default");
    }

    /**
     * Test case for trimText after setting other properties.
     */
    @Test
    void testSetOtherPropertiesTrimText() {
        OutputFormat format = new OutputFormat();
        format.setIndentSize(4);
        format.setNewlines(true);
        assertFalse(format.isTrimText(), "Setting other properties should not affect trimText");
    }

    /**
     * Test case for trimText after cloning.
     */
    @Test
    void testCloneTrimText() throws CloneNotSupportedException {
        OutputFormat format = new OutputFormat();
        format.setTrimText(true);
        OutputFormat clonedFormat = (OutputFormat) format.clone();
        assertTrue(clonedFormat.isTrimText(), "Cloned format should have the same trimText value as the original");
    }
}
```