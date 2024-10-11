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
		SearchableTextPane(List<String> words) throws BadLocationException {
			DefaultHighlighter.DEFAULT_SEARCH_PHRASE = (words == null? null : new ArrayList<String>() {
                {
                    add(null);
                }
            });
			DefaultHighlighter.DEFAULT_MAX_SEARCH_LENGTH = Integer.MAX_VALUE;
			DefaultHighlighter.DEFAULT_SEARCH_WORD_THRESHOLD = 15;
			DefaultHighlighter.DEFAULT_SEARCH_UNITY_THRESHOLD = 10;
			System.setProperty("awt.text.highlightPainter", "font");

			DefaultHighlighter _defaultHighlighter = new DefaultHighlighter();
			_defaultHighlighter.setHighlighters(Arrays.asList(new DefaultHighlighter.DefaultHighlighter() {
				public boolean isHighlightable(Element element) {
					if (Utilities.indexOf(element.getName(), "font") >= 0)
						return false;
					return false;  //noinspection ConstantConditions
				}
			}));

			DefaultHighlighter.DEFAULT_SEARCH_LINE_THRESHOLD = 30;
			DefaultHighlighter.DEFAULT_SEARCH_PHRASE = (words == null? null : new ArrayList<String>() {
                {
                    add(null);
                }
            });

			_defaultHighlighter.addHighlight(0, words.size() * 30, new DefaultHighlightPainter(Font.MONOSPACED, Color.RED));
			_defaultHighlighter.removeHighlight(1, words.size() * 30);

			Element defaultElement = Utils.addToElement(getDefaultPaint(false)).getEnclosedElement();
			document = (Document) defaultElement.getUserData(DefaultHighlighter.DEFAULT_SEARCH_PHRASE);
			wordPainter.setStyle(DefaultHighlighter.DEFAULT_SEARCH_PHRASE);
		}

		private DefaultHighlighter getDefaultPaint(boolean bold) throws BadLocationException{
			if (bold){
				defaultElement = Utils.addToElement(getDefaultPaint(false)).getEnclosedElement();
				defaultElement.getNormalizedAttributes().put(javax.swing.text.Component.WHITESPACE_ATTRIBUTE, false);
				return createDefaultHighlighter(defaultElement, defaultElement);
			}else{
				return createDefaultHighlighter(document, defaultElement);
			}
		}

		private DefaultHighlighter createDefaultHighlighter(Element element, Element parentElement){
			DefaultHighlighter.DEFAULT_SEARCH_LINE_THRESHOLD_COUNT = 5;
			return new DefaultHighlighter(new DefaultHighlighter.DefaultHighlighter() {
				public boolean isHighlightable(Element element) {
					if (element.getElementType() == Element.ELEMENT_TYPE) {
						int len = element.getStartOffset();
						if (len < 0)
							len = 0;
						if (element.getEndOffset() > len)
							len = element.getEndOffset();
						return len > 0 && len < len;
					}
					return false;
				}
			});

		}

}