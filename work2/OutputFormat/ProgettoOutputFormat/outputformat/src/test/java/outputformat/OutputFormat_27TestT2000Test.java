package outputformat;
// OutputFormat_27Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OutputFormat}.
* It contains ten unit test cases for the {@link OutputFormat#setAttributeQuoteCharacter(char)} method.
*/
class OutputFormat_27Test {
    /**
     * Test case for setting a valid attribute quote character (double quote).
     */
    @Test
    void testSetAttributeQuoteCharacter_ValidDoubleQuote() {
        OutputFormat format = new OutputFormat();
        format.setAttributeQuoteCharacter('"');
        assertEquals('"', format.getAttributeQuoteCharacter());
    }

    /**
     * Test case for setting a valid attribute quote character (single quote).
     */
    @Test
    void testSetAttributeQuoteCharacter_ValidSingleQuote() {
        OutputFormat format = new OutputFormat();
        format.setAttributeQuoteCharacter('\'');
        assertEquals('\'', format.getAttributeQuoteCharacter());
    }

    /**
     * Test case for setting an invalid attribute quote character (backtick).
     */
    @Test
    void testSetAttributeQuoteCharacter_InvalidBacktick() {
        OutputFormat format = new OutputFormat();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            format.setAttributeQuoteCharacter('`');
        });
        assertEquals("Invalid attribute quote character (`)", exception.getMessage());
    }

    /**
     * Test case for setting an invalid attribute quote character (space).
     */
    @Test
    void testSetAttributeQuoteCharacter_InvalidSpace() {
        OutputFormat format = new OutputFormat();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            format.setAttributeQuoteCharacter(' ');
        });
        assertEquals("Invalid attribute quote character ( )", exception.getMessage());
    }

    /**
     * Test case for setting an invalid attribute quote character (number).
     */
    @Test
    void testSetAttributeQuoteCharacter_InvalidNumber() {
        OutputFormat format = new OutputFormat();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            format.setAttributeQuoteCharacter('1');
        });
        assertEquals("Invalid attribute quote character (1)", exception.getMessage());
    }

    /**
     * Test case for setting an invalid attribute quote character (letter).
     */
    @Test
    void testSetAttributeQuoteCharacter_InvalidLetter() {
        OutputFormat format = new OutputFormat();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            format.setAttributeQuoteCharacter('a');
        });
        assertEquals("Invalid attribute quote character (a)", exception.getMessage());
    }

    /**
     * Test case for setting an invalid attribute quote character (special character).
     */
    @Test
    void testSetAttributeQuoteCharacter_InvalidSpecialCharacter() {
        OutputFormat format = new OutputFormat();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            format.setAttributeQuoteCharacter('!');
        });
        assertEquals("Invalid attribute quote character (!)", exception.getMessage());
    }

    /**
     * Test case for setting an invalid attribute quote character (tab).
     */
    @Test
    void testSetAttributeQuoteCharacter_InvalidTab() {
        OutputFormat format = new OutputFormat();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            format.setAttributeQuoteCharacter('\t');
        });
        assertEquals("Invalid attribute quote character (\t)", exception.getMessage());
    }

    /**
     * Test case for setting an invalid attribute quote character (newline).
     */
    @Test
    void testSetAttributeQuoteCharacter_InvalidNewline() {
        OutputFormat format = new OutputFormat();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            format.setAttributeQuoteCharacter('\n');
        });
        assertEquals("Invalid attribute quote character (\n)", exception.getMessage());
    }

    /**
     * Test case for setting an invalid attribute quote character (carriage return).
     */
    @Test
    void testSetAttributeQuoteCharacter_InvalidCarriageReturn() {
        OutputFormat format = new OutputFormat();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            format.setAttributeQuoteCharacter('\r');
        });
        assertEquals("Invalid attribute quote character (\r)", exception.getMessage());
    }
}