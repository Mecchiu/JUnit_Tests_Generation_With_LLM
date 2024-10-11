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
	 *
	* Test for text area.
	*/
	@Test
	void search_1() {
		
		try {
		Document doc = new Document("text-area");
		doc.add(new Element("p"));
		doc.add(new Element("h2"));
		doc.add(new Element("br"));
		doc.add(new Element("br"), Element.TEXT_NODE);
		JTextArea textArea = new JTextArea(doc);
		textArea.setText("text");
		textArea.setBackground(Color.BLACK);
		textArea.setFont(new Font("Times New Roman", 0, 23));
		JTextArea editor=new JTextArea(doc);
		SearchableTextPane pane = new SearchableTextPane(editor, 23, false);
		List<LineResult> lines = new ArrayList<>(2);
		lines.add(lineFromTextarea(textArea));
		lines.add(lineFromTextarea(pane));
		JScrollPane scrollPane = new JScrollPane(textArea);
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setForeground(new Color(0,0,0,0));
		PanelLayoutLayout layout = new PanelLayout();
		layout.setOrientation(PanelLayout.VERTICAL);
		panel_1.setLayout(layout);
		JScrollPane panel = new JScrollPane(scrollPane);
		search(scrollPane, searchResults(lines, panel_1));
		assertEquals(2, searchResults(lines, panel_1).size());
		}
		catch (BadLocationException e) {
			e.printStackTrace();
			assertTrue(false);
		}
		catch(Exception e) {
			e.printStackTrace();
			fail();
		}
		
	}

	private List<LineResult> searchResults(List<LineResult> lines, JPanel panel) {
		return lines.stream().filter((l)->l.getLine() == 0).map(l->l.getText()).collect(Collectors.toList());
	}

	/**
	 *
	* Test for text area.
	*/
	@Test
	void search_2() {
}
}