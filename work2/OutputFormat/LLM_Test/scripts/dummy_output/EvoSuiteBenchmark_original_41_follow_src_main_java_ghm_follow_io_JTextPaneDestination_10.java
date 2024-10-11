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
		public JTextPaneDestinationTest() {
		}

	@Test
    public void test() {
				final JTextPane destination = new JTextPane();
				destination.setText("this is a test");
				destination.setEditable(false);
				destination.setTextInset(0, 0, 0, 0);
				destination.setEnabled(false);
				destination.setScrollType(JTextPane.NO_SCROLL);
				destination.setAutoscrolls(true);
				destination.setContentType("text/plain");
				destination.setCaretPosition(0);

				destination.addLineSeparator("\n");

				boolean result = destination.getText(0, 0, destination, 0, 1) == "{\"text\":";
						assertEquals(result, true);

				result = destination.getText(0, destination.getDocument()
						.getLength(), destination, 0, 1) == "{\"text\":\"\\n\"";
						assertEquals(result, true);

				result = destination.getText(0, destination.getDocument().getLength(), destination, 0, 1) == "{\"text\"\n";
						assertEquals(result, true);

				result = destination.getText(0, destination.getDocument().getLength(), destination, 0, 1) == "{\"text\"\n";
						assertEquals(result, true);
	}
}