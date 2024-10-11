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
		
	@Test
	@SuppressWarnings("unchecked")
	public void init() throws Exception {
		
		JTextComponent text = JTextUtils.createTextPane();
		JTextComponentDestination source = (JTextComponentDestination) TextUtils.createDestination(text, "Source");
		assertNotNull("No JTextPane", text);
		assertTrue("No JTextComponent", source instanceof JTextComponent);

		TextUtils.showText(text);
		assertTrue("Text should be shown", text.isShown());
		text.getCaret().setVisible(true);

		source.remove();

		// Test auto-positioning

		assertFalse("Auto-position should not be shown", text.isDisplayed());

		assertTrue("Auto-position should show", text.isShown() == Boolean.TRUE);

		text.setCaretPosition(0);
		assertTrue("Auto-position should show", text.isShown() == Boolean.TRUE);
		
		
		// Test that a JTextComponent will not be visible when filtered

		text = JTextUtils.createTextPane();
		source = (JTextComponentDestination) TextUtils.createDestination(text, "Source");
		assertTrue("no result", source.getLastError()!= null);
		
		source.clear();

		assertTrue("No result", source.getLastError()!=null);		

		// Test the position of a filtered view		
		JTextComponent jTextComponent = JTextUtils.createTextPane();
		jTextComponent.getCaret().setVisible(true);
		source = (JTextComponentDestination) TextUtils.createDestination(jTextComponent, "Source");
		assertTrue("No result", source.getLastError()!=null);
		assertTrue("Result should be shown", text.isShown());
	}
}

// EOF