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
	 * Test case where the document is empty.
	 *
	 * @return
	 */
	@Test
	void testSearchEmptyDoc() {
		DefaultHighlighter hw = new DefaultHighlighter();
		try {
			Document doc = new Document(0);
			doc.addDocumentListener(new SearchableTextPane_0Test.DocListener());
			doc.addUndoableEditListener(new SearchableTextPane_0Test.UndoableEditListener());
	 
			String[] words = { "", "", "" };
			List<WordResult> wordResults = new ArrayList<WordResult>(words.length);
	 
			for (int i = 0; i < words.length; i++) {
	 
				wordResults.add(new WordResult(words[i]));
			}
			
			String queryTerm = ""; 
			SearchableTextPane sp = new SearchableTextPane();
			sp.setFont(new Font("DejaVu Sans", Font.PLAIN, 23)); 
	  
			int[] result = s -> sp.search(queryTerm, s, wordResults);
	 
			assertTrue(result[0] == 0);
			assertTrue(result[1] == 0);
			assertTrue(result[2] == 0);
			assertTrue(doc.getLength() == 0);
						
		} catch (Exception ex) {
			fail(ex.getMessage());
		} 
	}
	
	private class DocListener extends ElementListener {
	  
		 @Override
		public Shape getElementBounds(Element element) {
			int len = Utilities.measureString(element.getText(), wordPainter);
			if ((len < 5) || (len > 30)) {
				throw new BadLocationException("Cannot display string: length is incorrect");
			}
			Point2D pt = new Point2D.Double(len, -len);
			return new Rectangle2D.Double(pt.getX(), pt.getY(), pt.getX() + 1, pt.getY() + 1);
		}
		
		 public void elementDeleted(Element deletedElement) {
		  // TODO Auto-generated method stub
		 }
		  
	  @Override
		public void elementAdded(Element addedElement) {
			// TODO Auto-generated method stub
			
		}
		
	  @Override
		public void elementChanged(Element changedElement) {
			try {
				Document.read(new java.io.StringReader("The quick brown fox jumped over the lazy brown dog.")).
						insertString(0, "<b>fox</b> jumped over");
				
			} catch (Exception ex) {
				//fail(ex.getMessage());
				System.out.println(ex.getMessage());
			}
		 }
		 
	  @Override
		public void changeVisible(Element e) {
			// TODO Auto-generated method stub
			
		}
		 
	 }
	 
	 private class UndoableEditListener implements UndoableEditListener {
		 /**
	  * @see org.javaml.utils.undo.UndoableEditListener#undoUndo(org.javaml.utils.undo.UndoableEdit)
	  *      
	 
			 @Override
				public void undoUndo(UndoableEdit edit) {
				   
				}
				 
			 /**
			  * @see java.util.undo.UndoableEditListener#undoDelete(org.javaml.utils.undo.UndoableEdit)
			  *  
			 */
	 
			 @Override
				public void undoDelete(UndoableEdit edit) {
				
				}
				 
		 }
}