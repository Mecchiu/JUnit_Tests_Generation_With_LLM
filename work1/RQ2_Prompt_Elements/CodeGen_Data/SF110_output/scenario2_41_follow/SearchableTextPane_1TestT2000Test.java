// SearchableTextPane_1Test.java
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
* It contains one unit test case for the {@link SearchableTextPane#search(String, int)} method.
*/
class SearchableTextPane_1Test {

    /// Logger for Test cases
    private static final Logger log = Logger.getLogger("SearchableTextPane_1Test");
    private static final int CHARS_IN_TEXT = 10;
    
    
    @Test
    void testSearch_emptyText() {
        assertEquals("Empty text should match nothing",
                "", getStringSearch().toLowerCase());
        assertEquals("Nothing should match empty text",
                "", search(",,","));

        assertEquals("Empty text should match nothing",
                "", search("", 0));
        assertEquals("Nothing should match empty text",
                "", search(",,", 0));
    }
    
    @Test
    void testSearchForOneCharacter() {
        assertEquals("Search for one character",
        		"hello world", search("hello world"));
        assertEquals("Search for a character that's different from anything that's different",
        		"hello world", search("w", 2));
        assertEquals("Search for everything but 'w'",
        		"hello world", search("", 3));
    }
    
    @Test
    void testSearchForSpace() throws BadLocationException {
        StringBuilder searchResult = new StringBuilder();
        StringBuilder text = new StringBuilder();
        
        Element element = null;
        Element next = null;

        List<Element> resultList = new ArrayList<>();
        for (Element e : getDocument().getRootElements()) {
            if (Utilities.isBreakingNewLineCharacter(e.getEndOffset())) {
                next = e;
            } else {
                next = e;
            }
            
            Element nextRoot = next.getNextSibling();
            if (nextRoot!= null) {
                element = nextRoot;
                if (Utilities.isBreakingNewLineCharacter(element.getEndOffset())) {
                    text.append(element.getText());
                    resultList.add(element);
                } else {
                    for (int i = 0; i < CHARS_IN_TEXT; i++) {
                        int x = e.getStartOffset() + i;
                        if (x >= next.getStartOffset() &&
                                x <= next.getEndOffset()) {
                            searchResult.append(e.getText());
                            searchResult.append(" ");
                            searchResult.append(element.getText());
                            resultList.add(element);
                            break;
                        }
                    }
                }
            }
        }
        if (resultList.size() == 1) {
            assertEquals("Searching text that's a line in the middle",
                    "w", searchResult.toString());
            assertEquals("Searching text for a space",
                    " w", text.toString());
        }
    }
    
    @Test
    void testSearchForManyCharacters() throws BadLocationException {
        StringBuilder searchResult = new StringBuilder();
        StringBuilder text = new StringBuilder();
        
        Element left = null;
        Element right = null;

        List<Element> resultList = new ArrayList<>();
        for (Element leftRoot : getDocument().getRootElements()) {
            if (Utilities.isBreakingNewLineCharacter(leftRoot.getEndOffset())) {
                left = leftRoot;
            } else {
                left = leftRoot;
            }
            
            List<Element> leftList = new ArrayList<>();
            for (int i = 0; i < CHARS_IN_TEXT; i++) {
                Element e = left.nextSibling();
                if (Utilities.isBreakingNewLineCharacter(e.getEndOffset())) {
                    text.append(e.getText());
                    leftList.add(e);
                } else if (i >= 1) {
                    leftList.add(left);
                    if (left.getEndOffset() < e.getStartOffset()) {
                        leftList.add(e);
                        left = e;
                    }
                    else {
                        right = e;
                    }
                }
            }
            if (leftList.size() == CHARS_IN_TEXT && right!= null) {
                searchResult.append(" ");
                searchResult.append(leftList.get(0).getText());
                searchResult.append(" ");
                searchResult.append(right.getText());
                resultList.add(leftList.get(0));
            }
        }
        if (resultList.size() == CHARS_IN_TEXT && left!= null) {
            assertEquals("Searching text that's a line in the middle",
                    "w", searchResult.toString());
            assertEquals("Searching text for a space",
                    " w", text.toString());
        }
    }

}
