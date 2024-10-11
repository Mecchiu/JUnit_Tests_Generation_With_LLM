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

    /**
     * Tests the {@link SearchableTextPane#search(String, int) constructor}.
     * This constructor checks that the 
     * {@link SearchableTextPane#search(String, int) search(String, int)} 
     * method returns the proper value.
     */
    @Test
    public void testSearch_0_Constructor() {
        
        {
            // An empty text
            DefaultHighlighter highlighter = new DefaultHighlighter();
            Element elementText = highlighter.getHighlightPainter().getStart();
            Document doc = highlighter.createDefaultHighlighter().createDocument(0L, document);
            DefaultHighlightPainter.Level[] newLevels = new DefaultHighlightPainter.Level[0];
            Element[] newText = newElementArray(doc.getRootElement().getDocumentElement(), newLevels);
            DefaultHighlightPainter.Level[] prevLevels = new DefaultHighlightPainter.Level[1];
            Element[] prevText = newElementArray(document.getRootElement(), prevLevels);
            
            assertTrue(elementText.getStartOffset() == 0);
            assertEquals(newText[0], elementText);
            
            {
                doc.setText(elementText.getText());
                DefaultHighlighter highlighter = new DefaultHighlighter();
                Element newRoot = highlighter.createDefaultHighlighter().createDocument(0L, doc);
                Document doc2 = newRoot.getDocument();
                Element newText2 = getText(doc2, 1L);
                DefaultHighlightPainter.Level newLevel = new DefaultHighlightPainter.Level(0, 0, 0, 0, 0, 0);
                highlighter.addExtraRange(prevText[0], newText[0], newLevel);
                highlighter.addExtraRange(newText2, newRoot.getDocument().getText(1, newText2.getEndOffset()-1), newLevel);
                
                Element newText3 = getText(doc2, 4L);
                highlighter.addExtraRange(newText3, newText2, newLevel);
                checkText(doc, newText2);
            }
            
            for (int i = 0; i < 3; i++) {
                Element newElement = highlighter.createDefaultHighlighter().createDocument(0L, doc);
                
                int newOffset1 = Utilities.getText(newElement, 0L).length();
                int newOffset2 = Utilities.getText(newElement, 1L).length();
                assertTrue(newOffset1 > 0);
                assertEquals(newOffset1, newOffset2);
                
                int newOffset5 = Utilities.getText(newElement, 5L).length();
                int newOffset6 = Utilities.getText(newElement, 6L).length();
                assertTrue(newOffset5 > 0);
                assertEquals(newOffset5, newOffset6);
                
                defaultHighlighter.removeExtraRange(prevText[0], prevText[1]);
                
                setText(doc, newText, newElement);
                checkText(doc, newText);
            }
            
            int newOffset1 = Utilities.getText(newElement, 0L).length();
            int newOffset2 = Utilities.getText(newElement, 1L).length();
            assertTrue(newOffset1 > 0);
            assertEquals(newOffset1, newOffset2);
            
            int newOffset5 = Utilities.getText(newElement, 5L).length();
            int newOffset6 = Utilities.getText(newElement, 6L).length();
            assertTrue(newOffset5 > 0);
            assertEquals(newOffset5, newOffset6);
        }
        
        {
            // A good text
            DefaultHighlighter highlighter = new DefaultHighlighter();
            Element elementText = highlighter.getHighlightPainter().getStart();
            Document doc = highlighter.createDefaultHighlighter().createDocument(0L, doc);
            DefaultHighlightPainter.Level[] newLevels = new DefaultHighlightPainter.Level[0];
            Element[] newText = newElementArray(doc.getRootElement().getDocumentElement(), newLevels);
            DefaultHighlightPainter.Level[] prevLevels = new DefaultHighlightPainter.Level[1];
            Element[] prevText = newElementArray(document.getRootElement(), prevLevels);
            
            assertTrue(elementText.getStartOffset() == 0);
            assertEquals(newText[0], elementText);
            
            checkText(doc, newText[0], true);
                
            Element newRoot = highlighter.createDefaultHighlighter().createDocument(0L, doc);
 
            Element newText2 = new Element("NEW");
            Element textElement = newRoot.addElement(newText2);
                
            final List<Element> textSubTree = new ArrayList<Element>();
            StringBuffer textBuffer = new StringBuffer();
            try {
                textBuffer.append(newRoot.getElement(1).getStartElement().getEndOffset()-1);
            } catch (BadLocationException e) {
                e.printStackTrace();
            }
            while (newText2.getEndOffset()-1 > 0) {
                    textSubTree.add(newRoot.getElement(newText2.getEndOffset()-1));
                }
            
            int newOffset1 = Utilities.getText(newText).length();
            int newOffset2 = Utilities.getText(textSubTree).length();
            assertTrue(newOffset1 > 0);
            assertEquals(newOffset1, newOffset2);
            
            String newText3 = newRoot.getElement(2).getStartElement().getNormalizedContent();
            checkText(doc, newText2, true, textBuffer);
            checkLanguages(newText2);
            
            int newOffset5 = Utilities.getText(newText3).length();
            int newOffset6 = Utilities.getText(textSubTree).length();
            assertTrue(newOffset5 > 0);
            assertEquals(newOffset5, new