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

    protected JText