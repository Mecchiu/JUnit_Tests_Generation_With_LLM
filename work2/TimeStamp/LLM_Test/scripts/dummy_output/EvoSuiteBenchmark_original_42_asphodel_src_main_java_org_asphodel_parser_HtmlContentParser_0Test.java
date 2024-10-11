package org.asphodel.parser;
java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HtmlContentParser_0Test {

    @Test
    void testExtractPlainText() {
        // Test cases for HtmlContentParser.extractPlainText(String)
        HtmlContentParser parser = new HtmlContentParser();

        // Test case 1
        String input1 = "<html><body><h1>Hello World!</h1></body></html>";
        String expectedOutput1 = "Hello World!";
        assertEquals(expectedOutput1, parser.extractPlainText(input1));

        // Test case 2
        String input2 = "<p>This is a paragraph.</p>";
        String expectedOutput2 = "This is a paragraph.";
        assertEquals(expectedOutput2, parser.extractPlainText(input2));

        // Add more test cases as needed
    }
}
