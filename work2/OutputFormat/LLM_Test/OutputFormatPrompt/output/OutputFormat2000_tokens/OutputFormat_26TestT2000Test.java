package outputformat;
// OutputFormat_26Test.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OutputFormat}.
* It contains ten unit test cases for the {@link OutputFormat#getAttributeQuoteCharacter()} method.
*/
class OutputFormat_26Test {
    /**
     * Test case for default attribute quote character.
     */
    @Test
    void testDefaultAttributeQuoteCharacter() {
        OutputFormat format = new OutputFormat();
        assertEquals('"', format.getAttributeQuoteCharacter(), "Default attribute quote character should be double quote.");
    }

    /**
     * Test case for setting attribute quote character to single quote.
     */
    @Test
    void testSetAttributeQuoteCharacterSingleQuote() {
        OutputFormat format = new OutputFormat();
        format.setAttributeQuoteCharacter('\'');
        assertEquals('\'', format.getAttributeQuoteCharacter(), "Attribute quote character should be single quote.");
    }

    /**
     * Test case for setting attribute quote character to double quote.
     */
    @Test
    void testSetAttributeQuoteCharacterDoubleQuote() {
        OutputFormat format = new OutputFormat();
        format.setAttributeQuoteCharacter('"');
        assertEquals('"', format.getAttributeQuoteCharacter(), "Attribute quote character should be double quote.");
    }

    /**
     * Test case for setting attribute quote character to an invalid character.
     */
    @Test
    void testSetAttributeQuoteCharacterInvalid() {
        OutputFormat format = new OutputFormat();
        assertThrows(IllegalArgumentException.class, () -> {
            format.setAttributeQuoteCharacter('`');
        }, "Setting an invalid attribute quote character should throw IllegalArgumentException.");
    }

    /**
     * Test case for setting attribute quote character to a valid character after an invalid attempt.
     */
    @Test
    void testSetAttributeQuoteCharacterValidAfterInvalid() {
        OutputFormat format = new OutputFormat();
        try {
            format.setAttributeQuoteCharacter('`');
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
        format.setAttributeQuoteCharacter('\'');
        assertEquals('\'', format.getAttributeQuoteCharacter(), "Attribute quote character should be single quote after setting a valid character.");
    }

    /**
     * Test case for setting attribute quote character to single quote and then back to double quote.
     */
    @Test
    void testSetAttributeQuoteCharacterSingleThenDouble() {
        OutputFormat format = new OutputFormat();
        format.setAttributeQuoteCharacter('\'');
        format.setAttributeQuoteCharacter('"');
        assertEquals('"', format.getAttributeQuoteCharacter(), "Attribute quote character should be double quote after setting back from single quote.");
    }

    /**
     * Test case for setting attribute quote character to double quote and then back to single quote.
     */
    @Test
    void testSetAttributeQuoteCharacterDoubleThenSingle() {
        OutputFormat format = new OutputFormat();
        format.setAttributeQuoteCharacter('"');
        format.setAttributeQuoteCharacter('\'');
        assertEquals('\'', format.getAttributeQuoteCharacter(), "Attribute quote character should be single quote after setting back from double quote.");
    }

    /**
     * Test case for setting attribute quote character to single quote multiple times.
     */
    @Test
    void testSetAttributeQuoteCharacterSingleMultiple() {
        OutputFormat format = new OutputFormat();
        format.setAttributeQuoteCharacter('\'');
        format.setAttributeQuoteCharacter('\'');
        assertEquals('\'', format.getAttributeQuoteCharacter(), "Attribute quote character should remain single quote after setting it multiple times.");
    }

    /**
     * Test case for setting attribute quote character to double quote multiple times.
     */
    @Test
    void testSetAttributeQuoteCharacterDoubleMultiple() {
        OutputFormat format = new OutputFormat();
        format.setAttributeQuoteCharacter('"');
        format.setAttributeQuoteCharacter('"');
        assertEquals('"', format.getAttributeQuoteCharacter(), "Attribute quote character should remain double quote after setting it multiple times.");
    }

    /**
     * Test case for setting attribute quote character to single quote, then invalid, then double quote.
     */
    @Test
    void testSetAttributeQuoteCharacterSingleInvalidDouble() {
        OutputFormat format = new OutputFormat();
        format.setAttributeQuoteCharacter('\'');
        try {
            format.setAttributeQuoteCharacter('`');
        } catch (IllegalArgumentException e) {
            // Expected exception
        }
        format.setAttributeQuoteCharacter('"');
        assertEquals('"', format.getAttributeQuoteCharacter(), "Attribute quote character should be double quote after setting invalid and then valid character.");
    }
}