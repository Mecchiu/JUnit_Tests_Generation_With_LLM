// OutputFormat_26Test.java

package outputformat;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OutputFormat}.
* It contains ten unit test cases for the {@link OutputFormat#getAttributeQuoteCharacter()} method.
*/
class OutputFormat_26Test {
    @Test
    void testDefaultAttributeQuoteCharacter() {
        OutputFormat format = new OutputFormat();
        assertEquals('"', format.getAttributeQuoteCharacter(), "Default attribute quote character should be double quote (\").");
    }

    @Test
    void testSetAttributeQuoteCharacterToSingleQuote() {
        OutputFormat format = new OutputFormat();
        format.setAttributeQuoteCharacter('\'');
        assertEquals('\'', format.getAttributeQuoteCharacter(), "Attribute quote character should be single quote (').");
    }

    @Test
    void testSetAttributeQuoteCharacterToDoubleQuote() {
        OutputFormat format = new OutputFormat();
        format.setAttributeQuoteCharacter('"');
        assertEquals('"', format.getAttributeQuoteCharacter(), "Attribute quote character should be double quote (\").");
    }

    @Test
    void testSetAttributeQuoteCharacterInvalid() {
        OutputFormat format = new OutputFormat();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            format.setAttributeQuoteCharacter('`');
        });
        assertEquals("Invalid attribute quote character (`)", exception.getMessage());
    }

    @Test
    void testSetAttributeQuoteCharacterInvalidNumber() {
        OutputFormat format = new OutputFormat();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            format.setAttributeQuoteCharacter('1');
        });
        assertEquals("Invalid attribute quote character (1)", exception.getMessage());
    }

    @Test
    void testSetAttributeQuoteCharacterInvalidSymbol() {
        OutputFormat format = new OutputFormat();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            format.setAttributeQuoteCharacter('&');
        });
        assertEquals("Invalid attribute quote character (&)", exception.getMessage());
    }

    @Test
    void testSetAttributeQuoteCharacterInvalidSpace() {
        OutputFormat format = new OutputFormat();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            format.setAttributeQuoteCharacter(' ');
        });
        assertEquals("Invalid attribute quote character ( )", exception.getMessage());
    }

    @Test
    void testSetAttributeQuoteCharacterInvalidNewline() {
        OutputFormat format = new OutputFormat();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            format.setAttributeQuoteCharacter('\n');
        });
        assertEquals("Invalid attribute quote character (\n)", exception.getMessage());
    }

    @Test
    void testSetAttributeQuoteCharacterInvalidTab() {
        OutputFormat format = new OutputFormat();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            format.setAttributeQuoteCharacter('\t');
        });
        assertEquals("Invalid attribute quote character (\t)", exception.getMessage());
    }

    @Test
    void testSetAttributeQuoteCharacterInvalidBackslash() {
        OutputFormat format = new OutputFormat();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            format.setAttributeQuoteCharacter('\\');
        });
        assertEquals("Invalid attribute quote character (\\)", exception.getMessage());
    }
}