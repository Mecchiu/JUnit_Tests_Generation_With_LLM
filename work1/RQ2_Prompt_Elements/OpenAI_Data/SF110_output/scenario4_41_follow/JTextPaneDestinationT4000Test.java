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
* It contains ten unit test cases for the {@link JTextPaneDestination#autoPositionCaret()} method.
*/
class JTextPaneDestinationTest {

		private Logger log = Logger.getLogger(JTextPaneDestinationTest.class.getName());
		
		private JTextPane jTextPane;
		
		private boolean autoPositionCaret;
		
		private JTextPaneDestination jTextPaneDestination;
		
		/**
		* Construct a new JTextPaneDestinationTest.
		*/
		public JTextPaneDestinationTest() {
				jTextPaneDestination = new JTextPaneDestination(jTextPane, autoPositionCaret);
		}
		
		/**
		* Test case for {@link JTextPaneDestination#autoPositionCaret()} method.
		* Test case for {@link JTextPaneDestination#setAutoPositionCaret(boolean)} method.
		*/
		@Test
		public void testAutoPositionCaret() {
				jTextPaneDestination.setAutoPositionCaret(true);
				assertTrue(jTextPaneDestination.autoPositionCaret());
				jTextPaneDestination.setAutoPositionCaret(false);
				assertFalse(jTextPaneDestination.autoPositionCaret());
		}
		
		/**
		* Test case for {@link JTextPaneDestination#autoPositionCaret()} method.
		* Test case for {@link JTextPaneDestination#setAutoPositionCaret(boolean)} method.
		*/
		@Test
		public void testAutoPositionCaret2() {
				jTextPaneDestination.setAutoPositionCaret(true);
				assertTrue(jTextPaneDestination.autoPositionCaret());
				jTextPaneDestination.setAutoPositionCaret(false);
				assertFalse(jTextPaneDestination.autoPositionCaret());
		}
		
		/**
		* Test case for {@link JTextPaneDestination#autoPositionCaret()} method.
		* Test case for {@link JTextPaneDestination#setAutoPositionCaret(boolean)} method.
		*/
		@Test
		public void testAutoPositionCaret3() {
				jTextPaneDestination.setAutoPositionCaret(true);
				assertTrue(jTextPaneDestination.autoPositionCaret());
				jTextPaneDestination.setAutoPositionCaret(false);
				assertFalse(jTextPaneDestination.autoPositionCaret());
		}
		
		/**
		* Test case for {@link JTextPaneDestination#autoPositionCaret()} method.
		* Test case for {@link JTextPaneDestination#setAutoPositionCaret(boolean)} method.
		*/
		@Test
		public void testAutoPositionCaret4() {
				jTextPaneDestination.setAutoPositionCaret(true);
				assertTrue(jTextPaneDestination.autoPositionCaret());
				jTextPaneDestination.setAutoPositionCaret(false);
				assertFalse(jTextPaneDestination.autoPositionCaret());
		}
		
		/**
		* Test case for {@link JTextPaneDestination#autoPositionCaret()} method.
		* Test case for {@link JTextPaneDestination#setAutoPositionCaret(boolean)} method.
		*/
		@Test
		public void testAutoPositionCaret5() {
				jTextPaneDestination.setAutoPositionCaret(true);
				assertTrue(jTextPaneDestination.autoPositionCaret());
				jTextPaneDestination.setAutoPositionCaret(false);
				assertFalse(jTextPaneDestination.autoPositionCaret());
		}
		
		/**
		* Test case for {@link JTextPaneDestination#autoPositionCaret()} method.
		* Test case for {@link JTextPaneDestination#setAutoPositionCaret(boolean)} method.
		*/
		@Test
		public void testAutoPositionCaret6() {
				jTextPaneDestination.setAutoPositionCaret(true);
				assertTrue(jTextPaneDestination.autoPositionCaret());
				jTextPaneDestination.setAutoPositionCaret(false);
				assertFalse(jTextPaneDestination.autoPositionCaret());
		}
		
		/**
		* Test case for {@link JTextPaneDestination#autoPositionCaret()} method.
		* Test case for {@link JTextPaneDestination#setAutoPositionCaret(boolean)} method.
		*/
		@Test
		public void testAutoPositionCaret7() {
				jTextPaneDestination.setAutoPositionCaret(true);
				assertTrue(jTextPaneDestination.autoPositionCaret());
				jTextPaneDestination.setAutoPositionCaret(false);
				assertFalse(jTextPaneDestination.autoPositionCaret());
		}
		
		/**
		* Test case for {@link JTextPaneDestination#autoPositionCaret()} method.
		* Test case for {@link JTextPaneDestination#setAutoPositionCaret(boolean)} method.
		*/
		@Test
		public void testAutoPositionCaret8() {
				jTextPaneDestination.setAutoPositionCaret(true);
				assertTrue(jTextPaneDestination.autoPositionCaret());
				jTextPaneDestination.setAutoPositionCaret(false);
				assertFalse(jTextPaneDestination.autoPositionCaret());
		}
		
		/**
		* Test case for {@link JTextPaneDestination#autoPositionCaret()} method.
		* Test case for {@link JTextPaneDestination#setAutoPositionCaret(boolean)} method.
		*/
		@Test
		public void testAutoPositionCaret9() {
				jTextPaneDestination.setAutoPositionCaret(true);
				assertTrue(jTextPaneDestination.autoPositionCaret());
				jTextPaneDestination.setAutoPositionCaret(false);
				assertFalse(jTextPaneDestination.autoPositionCaret());
		}
		
		/**
		* Test case for {@link JTextPaneDestination#autoPositionCaret()} method.
		* Test case for {@link JTextPaneDestination#setAutoPositionCaret(boolean)} method.
		*/
		@Test
		public void testAutoPositionCaret10() {
				jTextPaneDestination.setAutoPositionCaret(true);
				assertTrue(jTextPaneDestination.autoPositionCaret());
				jTextPaneDestination.setAutoPositionCaret(false);
				assertFalse(jTextPaneDestination.autoPositionCaret());
		}
}

// JTextPaneDestination.java
package ghm.follow.io;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;

/**
 * Implementation of {@link OutputDestination} which appends Strings to a {@link JTextPane}.
 *
 * @see OutputDestination
 * @see JTextPane
 * @author <a href="mailto:carl.hall@gmail.com">Carl Hall</a>
 */
public class JTextPaneDestination implements OutputDestination {

    private Logger log = Logger.getLogger(JTextPaneDestination.class.getName());

    protected JTextPane jTextPane;

    protected boolean autoPositionCaret;

    /**
     * Construct a new JTextPaneDestination.
     *
     * @param jTextPane
     *            text will be appended to this text area
     * @param autoPositionCaret
     *            if true, caret will be automatically moved to the bottom of the text area when
     *            text is appended
     */
    public JTextPaneDestination(JTextPane jTextPane, boolean autoPositionCaret) {
    }

    public JTextPane getJTextPane();

    public void setJTextArea(JTextPane jTextPane);

    /**
     * Add a filtered view to this destination. Filtered views show only a subset of the total
     * output based on filter conditions.
     *
     * @since 1.8.0
     */
    public void addFilteredView();

    /**
     * Remove a filtered view
     *
     * @since 1.8.0
     */
    public void removeFilteredView();

    /**
     * @return whether caret will be automatically moved to the bottom of the text area when text is
     *         appended
     */
    public boolean autoPositionCaret();

    /**
     * @param autoPositionCaret
     *            if true, caret will be automatically moved to the bottom of the text area when
     *            text is appended
     */
    public void setAutoPositionCaret(boolean autoPositionCaret);

    public void print(String s);

    public void clear();
}

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
* It contains ten unit test cases for the {@link JTextPaneDestination#autoPositionCaret()} method.
*/
class JTextPaneDestinationTest {
		
		private Logger log = Logger.getLogger(JTextPaneDestinationTest.class.getName());
		
		private JTextPane jTextPane;
		
		private boolean autoPositionCaret;
		
		private JTextPaneDestination jTextPaneDestination;
		
		/**
		* Construct a new JTextPaneDestinationTest.
		*/
		public JTextPaneDestinationTest() {
				jTextPaneDestination = new JTextPaneDestination(jTextPane, autoPositionCaret);
		}
		
		/**
		* Test case for {@link JTextPaneDestination#autoPositionCaret()} method.
		* Test case for {@link JTextPaneDestination#setAutoPositionCaret(boolean)} method.
		*/
		@Test
		public void testAutoPositionCaret() {
				jTextPaneDestination.setAutoPositionCaret(true);
				assertTrue(jTextPaneDestination.autoPositionCaret());
				jTextPaneDestination.setAutoPositionCaret(false);
				assertFalse(jTextPaneDestination.autoPositionCaret());
		}
		
		/**
		* Test case for {@link JTextPaneDestination#autoPositionCaret()} method.
		* Test case for {@link JTextPaneDestination#setAutoPositionCaret(boolean)} method.
		*/
		@Test
		public void testAutoPositionCaret2() {
				jTextPaneDestination.setAutoPositionCaret(true);
				assertTrue(jTextPaneDestination.autoPositionCaret());
				jTextPaneDestination.setAutoPositionCaret(false);
				assertFalse(jTextPaneDestination.autoPositionCaret());
		}
		
		/**
		* Test case for {@link JTextPaneDestination#autoPositionCaret()} method.
		* Test case for {@link JTextPaneDestination#setAutoPositionCaret(boolean)} method.
		*/
		@Test
		public void testAutoPositionCaret3() {
				jTextPaneDestination.setAutoPositionCaret(true);
				assertTrue(jTextPaneDestination.autoPositionCaret());
				jTextPaneDestination.setAutoPositionCaret(false);
				assertFalse(jTextPaneDestination.autoPositionCaret());
		}
		
		/**
		* Test case for {@link JTextPaneDestination#autoPositionCaret()} method.
		* Test case for {@link JTextPaneDestination#setAutoPositionCaret(boolean)} method.
		*/
		@Test
		public void testAutoPositionCaret4() {
				jTextPaneDestination.setAutoPositionCaret(true);
				assertTrue(jTextPaneDestination.autoPositionCaret());
				jTextPaneDestination.setAutoPositionCaret(false);
				assertFalse(jTextPaneDestination.autoPositionCaret());
		}
		
		/**
		* Test case for {@link JTextPaneDestination#autoPositionCaret()} method.
		* Test case for {@link JTextPaneDestination#setAutoPositionCaret(boolean)} method.
		*/
		@Test
		public void testAutoPositionCaret5() {
				jTextPaneDestination.setAutoPositionCaret(true);
				assertTrue(jTextPaneDestination.autoPositionCaret());
				jTextPaneDestination.setAutoPositionCaret(false);
				assertFalse(jTextPaneDestination.autoPositionCaret());
		}
		
		/**
		* Test case for {@link JTextPaneDestination#autoPositionCaret()} method.
		* Test case for {@link JTextPaneDestination#setAutoPositionCaret(boolean)} method.
		*/
		@Test
		public void testAutoPositionCaret6() {
				jTextPaneDestination.setAutoPositionCaret(true);
				assertTrue(jTextPaneDestination.autoPositionCaret());
				jTextPaneDestination.setAutoPositionCaret(false);
				assertFalse(jTextPaneDestination.autoPositionCaret());
		}
		
		/**
		* Test case for {@link JTextPaneDestination#autoPositionCaret()} method.
		* Test case for {@link JTextPaneDestination#setAutoPositionCaret(boolean)} method.
		*/
		@Test
		public void testAutoPositionCaret7() {
				jTextPaneDestination.setAutoPositionCaret(true);
				assertTrue(jTextPaneDestination.autoPositionCaret());
				jTextPaneDestination.setAutoPositionCaret(false);
				assertFalse(jTextPaneDestination.autoPositionCaret());
		}
		
		/**
		* Test case for {@link JTextPaneDestination#autoPositionCaret()} method.
		* Test case for {@link JTextPaneDestination#setAutoPositionCaret(boolean)} method.
		*/
		@Test
		public void testAutoPositionCaret8() {
				jTextPaneDestination.setAutoPositionCaret(true);
				assertTrue(jTextPaneDestination.autoPositionCaret());
				jTextPaneDestination.setAutoPositionCaret(false);
				assertFalse(jText