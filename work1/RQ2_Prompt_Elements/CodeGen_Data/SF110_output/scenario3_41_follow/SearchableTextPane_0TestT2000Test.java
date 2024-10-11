// SearchableTextPane_0Test.java
package ghm.follow.search;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;
import javax.swing.plaf.ComponentUI;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.Utilities;
import javax.swing.text.DefaultHighlighter.DefaultHighlightPainter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SearchableTextPane}.
* It contains one unit test case for the {@link SearchableTextPane#search(String)} method.
*/
class SearchableTextPane_0Test {

    /**
     * Test method for 'SearchableTextPane.search(String)'
     */
    @Test
    public void testSearchString() {
        // Arrange

        String s = "abcd";
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        // Assert

        // Act

        // Assert
        
        // Act
        assertEquals("abcd", search("Abcd"));
        // assertEquals("aAb", search(" aAb"));
        // assertEquals("AaB", search("Ab"));
        // assertEquals("aDa", search("Da"));
        assertEquals("aBc", search("bc"));
        assertEquals("aDc", search("dc"));
        assertEquals("aDd", search("d"));
        assertEquals("", search(""));
        assertEquals("", search(" "));
        assertEquals("", search("\n"));
        assertEquals("", search("\r"));
        assertEquals("", search("\t"));
        assertEquals("", search(" \t "));
    }
}

// SearchableTextPane_0Test_1Test.java
