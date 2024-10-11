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
		
	private static final int TEST_VALUE = 100;
	private static final int MAX_ROWS = 5;
	private static final int MAX_COLUMNS = 6;

    private final JTextArea textView = new JTextArea();

    private List<WordResult> wordResultsToHighlightList
            = new ArrayList<WordResult>();
    private List<LineResult> lineResults = new ArrayList<LineResult>();
    private ComponentUI ui = TextPaneUI.createUI(textView);

    private TestPane() {
       this(null);
    }
    /**
     * The constructor of {@link SearchableTextPane_1Test} is used as a placeholder constructor
     *
     */
    private SearchableTextPane_1Test(final Document doc) {
       textView.setWrapStyleWord(true);
       textView.addWrapStyleWord(true);

       for (int i = 0; i < MAX_ROWS; i++) {
          lineResults.add(new LineResult(
                  new DefaultHighlightPainter()));
       }
    }

    /**
     * Creates all test objects for this {@link SearchableTextPane}.<br>
     * <br>
     * If a test object is created for this test, it is added to the list of all test objects.
     *
     */
    public void initTextPane() {
       final DefaultHighlighter h = new DefaultHighlighter();
       h.setHighlightPainter(wordPainter);
       ui.loadUI(h);
       
       textView.setDocument(doc);
       textView.select(0, 0);

       addAllHighlightsInTextArea(textView, wordResultsToHighlightList);
    }

    /**
     * Creates all test objects for this {@link SearchableTextPane} and adds text highlights.
     * This should be called after {@link #initTextPane()}.
     */
    public void addAllHighlightsToTextArea() {
       List<WordResult> hiHighlighted = new ArrayList<WordResult>(wordResultsToHighlightList);
       Collections.sort(hiHighlighted);
       for (int i = 0; i < MAX_ROWS; i++) {
           ui.addHighlightsToTextArea(hiHighlighted, textView);
           highlight(0, hiHighlighted.size());
       }
       setText(getWord());
       textView.select(0, textView.getDocument().getLength());
       highlight(0, textView.getDocument().getLength() - textView.getMark());
       
       wordResultsToHighlightList = null;
       lineResults = null;
       ui = null;
    }

    private void highlight(int begin, int end) {
        for (int i = 0; i < end; i++) {
            int i1 = textView.getSelectionEnd();
            if (i1 < 0) return;
            int i2 = textView.getSelectionStart();
            updateWordResult(new WordResult(textView.getText().substring(i1, i2)), lineResults.get(i));
        }
    }

    private void updateWordResult(WordResult wordResult, LineResult lineResult) throws BadLocationException {
        //Update the element containing the wordResult value
        List<Element> e = textView.getSegmentContainer().getElementList();
}
}