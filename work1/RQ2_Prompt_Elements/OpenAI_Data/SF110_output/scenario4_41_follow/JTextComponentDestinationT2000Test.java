// JTextComponentDestinationTest.java
package ghm.follow.io;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.BadLocationException;
import javax.swing.text.JTextComponent;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JTextComponentDestination}.
* It contains ten unit test cases for the {@link JTextComponentDestination#autoPositionCaret()} method.
*/
class JTextComponentDestinationTest {

		private static final Logger LOG = Logger.getLogger(JTextComponentDestinationTest.class.getName());
		
		/**
		* Test case 1 for method {@link JTextComponentDestination#autoPositionCaret()}.
		* Test case 1 checks if the method returns true when the caret is automatically moved to the bottom of the text area when text is appended.
		*/
		@Test
		public void testAutoPositionCaret1() {
				JTextComponentDestination jTextComponentDestination = new JTextComponentDestination(new JTextComponent(), true);
				assertTrue(jTextComponentDestination.autoPositionCaret());
		}
		
		/**
		* Test case 2 for method {@link JTextComponentDestination#autoPositionCaret()}.
		* Test case 2 checks if the method returns false when the caret is not automatically moved to the bottom of the text area when text is appended.
		*/
		@Test
		public void testAutoPositionCaret2() {
				JTextComponentDestination jTextComponentDestination = new JTextComponentDestination(new JTextComponent(), false);
				assertFalse(jTextComponentDestination.autoPositionCaret());
		}
		
		/**
		* Test case 3 for method {@link JTextComponentDestination#autoPositionCaret()}.
		* Test case 3 checks if the method returns true when the caret is automatically moved to the bottom of the text area when text is appended.
		*/
		@Test
		public void testAutoPositionCaret3() {
				JTextComponentDestination jTextComponentDestination = new JTextComponentDestination(new JTextComponent(), true);
				assertTrue(jTextComponentDestination.autoPositionCaret());
		}
		
		/**
		* Test case 4 for method {@link JTextComponentDestination#autoPositionCaret()}.
		* Test case 4 checks if the method returns false when the caret is not automatically moved to the bottom of the text area when text is appended.
		*/
		@Test
		public void testAutoPositionCaret4() {
				JTextComponentDestination jTextComponentDestination = new JTextComponentDestination(new JTextComponent(), false);
				assertFalse(jTextComponentDestination.autoPositionCaret());
		}
		
		/**
		* Test case 5 for method {@link JTextComponentDestination#autoPositionCaret()}.
		* Test case 5 checks if the method returns true when the caret is automatically moved to the bottom of the text area when text is appended.
		*/
		@Test
		public void testAutoPositionCaret5() {
				JTextComponentDestination jTextComponentDestination = new JTextComponentDestination(new JTextComponent(), true);
				assertTrue(jTextComponentDestination.autoPositionCaret());
		}
		
		/**
		* Test case 6 for method {@link JTextComponentDestination#autoPositionCaret()}.
		* Test case 6 checks if the method returns false when the caret is not automatically moved to the bottom of the text area when text is appended.
		*/
		@Test
		public void testAutoPositionCaret6() {
				JTextComponentDestination jTextComponentDestination = new JTextComponentDestination(new JTextComponent(), false);
				assertFalse(jTextComponentDestination.autoPositionCaret());
		}
		
		/**
		* Test case 7 for method {@link JTextComponentDestination#autoPositionCaret()}.
		* Test case 7 checks if the method returns true when the caret is automatically moved to the bottom of the text area when text is appended.
		*/
		@Test
		public void testAutoPositionCaret7() {
				JTextComponentDestination jTextComponentDestination = new JTextComponentDestination(new JTextComponent(), true);
				assertTrue(jTextComponentDestination.autoPositionCaret());
		}
		
		/**
		* Test case 8 for method {@link JTextComponentDestination#autoPositionCaret()}.
		* Test case 8 checks if the method returns false when the caret is not automatically moved to the bottom of the text area when text is appended.
		*/
		@Test
		public void testAutoPositionCaret8() {
				JTextComponentDestination jTextComponentDestination = new JTextComponentDestination(new JTextComponent(), false);
				assertFalse(jTextComponentDestination.autoPositionCaret());
		}
		
		/**
		* Test case 9 for method {@link JTextComponentDestination#autoPositionCaret()}.
		* Test case 9 checks if the method returns true when the caret is automatically moved to the bottom of the text area when text is appended.
		*/
		@Test
		public void testAutoPositionCaret9() {
				JTextComponentDestination jTextComponentDestination = new JTextComponentDestination(new JTextComponent(), true);
				assertTrue(jTextComponentDestination.autoPositionCaret());
		}
		
		/**
		* Test case 10 for method {@link JTextComponentDestination#autoPositionCaret()}.
		* Test case 10 checks if the method returns false when the caret is not automatically moved to the bottom of the text area when text is appended.
		*/
		@Test
		public void testAutoPositionCaret10() {
				JTextComponentDestination jTextComponentDestination = new JTextComponentDestination(new JTextComponent(), false);
				assertFalse(jTextComponentDestination.autoPositionCaret());
		}
}

// JTextComponentDestination.java
package ghm.follow.io;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.BadLocationException;
import javax.swing.text.JTextComponent;

/**
 * Implementation of {@link OutputDestination} which appends Strings to a {@link JTextComponent}.
 *
 * @see OutputDestination
 * @see JTextCompnent
 * @author <a href="mailto:carl.hall@gmail.com">Carl Hall</a>
 */
public class JTextComponentDestination extends FilterableOutputDestination {

    private static final Logger LOG = Logger.getLogger(JTextComponentDestination.class.getName());

    protected JTextComponent comp;

    protected boolean autoPositionCaret;

    /**
     * Construct a new JTextCompnentDestination.
     *
     * @param jTextPane
     *            text will be appended to this text area
     * @param autoPositionCaret
     *            if true, caret will be automatically moved to the bottom of the text area when
     *            text is appended
     */
    public JTextComponentDestination(JTextComponent comp, boolean autoPositionCaret) {
    }

    public JTextComponent getJTextComponent();

    public void setJTextComponent(JTextComponent comp);

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

    public void handlePrint(String s);

    public void clear();
}

// JTextComponentDestinationTest.java
package ghm.follow.io;

import java