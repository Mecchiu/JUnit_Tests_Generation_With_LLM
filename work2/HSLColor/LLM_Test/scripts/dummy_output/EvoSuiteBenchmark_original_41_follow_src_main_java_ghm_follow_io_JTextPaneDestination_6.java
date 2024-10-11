// JTextPaneDestinationTest.java
package ghm.follow.io;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JTextPaneDestination}.
* It contains one unit test case for the {@link JTextPaneDestination#autoPositionCaret()} method.
*/
class JTextPaneDestinationTest {
		public final void testAutoPositionCaret() {
			JTextPane tPane = new JTextPane();
			OutputDestination oDest = new OutputDestinationImpl();
		tPane.setEditable(true);
		tPane.setViewportView(oDest);
		
        assertFalse(oDest.autoPositionCaret());
		}
		
		public final void testClear() {
			JTextPane tPane = new JTextPane();
			OutputDestination oDest = new OutputDestinationImpl();
		tPane.setEditable(true);
		tPane.setViewportView(oDest);
		
        assertFalse(oDest.autoPositionCaret());
		tPane.setAutoClear(true);
		// clear() method shouldn't raise an Exception
		tPane.clear();
		assertTrue(oDest.autoPositionCaret());

        // Clear() method should have no effect if Viewport has changed state
        tPane.setViewportView(new OutputDestinationImpl());
		new JTextPane();
		oDest.addViewportViewFactory(oDest);
		tPane.setViewportView(oDest);
		// clear() method should not raise an Exception
		tPane.clear();
		assertTrue(oDest.autoPositionCaret());
		}
		
		public final void testPrint() {
			JTextPane tPane = new JTextPane();
			OutputDestination oDest = new OutputDestinationImpl();
		tPane.setEditable(true);
		// add a ViewFactory which does not produce the TextArea 
		ViewFactory f = new ViewFactory();
		tPane.setViewportViewFactory(oDest);
		tPane.setViewportView(f);
		View v = new TextArea();
		new JTextPane();
		JTextPane jtp = new JTextPane();
		jtp.setEditable(tPane instanceof JTextPane);
		jtp.addView(v);
		tPane.removeView(v);
		// add ViewFactory that generates a TextArea
		// this shouldn't change the view
		ViewFactory f0 = new ViewFactory();
		// no need to assert tPane.setViewportViewFactory() but
		// assert view factory is not a text area
		jtp.setViewportViewFactory(oDest);
		tPane.setViewportView(f0);
		View v2 = new TextArea();
		tPane.addView(v2);
		f0.addView(jtp);
		// clear() method should not raise an Exception
		tPane.clear();
		assertFalse(oDest.autoPositionCaret());
		}
}

/**
 * Test class of {@link JTextPaneDestination}.
 * It contains one unit test case for the {@link JTextPaneDestination#addFilteredView()}
 * method.
*/
class JTextPaneDestinationTest2 extends JTextPaneDestinationTest {
		public final void testAddFilteredView() {
			JTextPane tPane = new JTextPane();
			OutputDestination oDest = new OutputDestinationImpl();
		tPane.setEditable(true);
		// addView factory which generates a text area
		ViewFactory f = new ViewFactory() {
				public View createView(Document doc) {
					return new TextArea();
				}
		};
		tPane.setViewportViewFactory(oDest, f);
    // no need to assert tPane.setViewportViewFactory() but assert ViewFactory is not a text area
		OutputDestination oDest2 = new OutputDestinationImpl();
		oDest2.addView(f);
		new JTextPane();
		new JTextPane();
		
		// Clear() method should not raise an Exception
		tPane.clear();
		assertFalse(oDest2.autoPositionCaret());
	}
}

/**
 * Test class of {@link JTextPaneDestination}.
 * It contains one unit test case for the {@link JTextPaneDestination#removeFilteredView()}
 */
class JTextPaneDestinationTest3 extends JTextPaneDestinationTest {
		public final void testRemoveFilteredView() {
			JTextPane tPane = new JTextPane();
			OutputDestination oDest = new OutputDestinationImpl();
		tPane.setEditable(true);
		ViewFactory f = new ViewFactory() {
				public View createView(Document doc) {
					return new TextArea();
				}
		};
		tPane.setViewportViewFactory(oDest, f);
    // no need to assert tPane.setViewportViewFactory() but assert ViewFactory is not a text area
		OutputDestination oDest2 = new OutputDestinationImpl();
		oDest2.removeView(f);
		new JTextPane();
		new JTextPane();
		
		// Clear() method should not raise an Exception
		tPane.clear();
		
		// RemoveView factory which does not produce a text area should leave the
		// view in the text area
		View view = new TextArea();
		new JTextPane();
		f = new ViewFactory() {
				public View createView(Document doc) {
					return view;
				}
		};
		new JTextPane();
		tPane.setViewportViewFactory(oDest2, f);
		tPane.removeView(view);
		
		new JTextPane();
}
}