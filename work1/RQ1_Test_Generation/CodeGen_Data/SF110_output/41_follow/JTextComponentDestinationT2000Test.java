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
private final static Logger LOG = Logger.getLogger(JTextComponentDestinationTest.class.getName());
		
	// JTextComponentDestinationTest.java
		@Test
	public void test() {
			JTextComponentDestination jttoDest = new JTextComponentDestination(JTextCompnent.fromString("MyTextToBeAppended"), true);
			jttoDest.addFilteredView();
			assertTrue("Expected a FilteredView", jttoDest.getJTextComponent().getContentType()  ==JTextComponent.ContentType.FILTERED_VIEW);
    }
}