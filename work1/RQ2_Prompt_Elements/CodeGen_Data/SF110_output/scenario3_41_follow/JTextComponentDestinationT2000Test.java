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
* It contains one unit test case for the {@link JTextComponentDestination#autoPositionCaret()} method.
*/
class JTextComponentDestinationTest {
/**
		 * Sets given parameter as argument for {@link JTextComponentDestination#autoPositionCaret()} method.
		*
		* @param autoPositionCaret argument
		 */
		public JTextComponentDestinationTest(final boolean autoPositionCaret) {
			this.autoPositionCaret = autoPositionCaret;
		}
		
		/**
		 * Tester for when {@link JTextComponentDestination#getOutputType()} is {@link OutputType#TEXT}.
		 */
        @Test
        public void autoPositionCaretTEXT() {
                assertTrue("The result of autoPositionCaret() test should be true", this.autoPositionCaret);
        }
}

// UnitTest.java
// Copyright (c) 1999-2004 The University of Sheffield. See the file
// "file.html" in the edu-most-released subversion at
// http://gate.ac.uk/gate/dotgnu/
