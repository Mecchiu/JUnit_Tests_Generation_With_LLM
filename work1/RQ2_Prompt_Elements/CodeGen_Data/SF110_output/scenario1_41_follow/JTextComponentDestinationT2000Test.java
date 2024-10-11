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
    public void autoPositionCaretTest() {
        JTextComponent tc;
		// set the auto position caret off
        tc = new JTextComponent(JTextComponent.AUTO_POSITION_OFF);
        assertFalse(tc.getPrintableAttribute("enabled"));
        assertTrue(tc.getPrintableAttribute("enabled"));
        assertFalse(tc.getCaretPosition() == 0);
		// check the returned auto position caret position
		assertEquals(tc.getCaretPosition(), tc.getPrintableAttribute("position"));
        tc.setCaretPosition(1);
		// the position should stay unchanged
		assertEquals(tc.getPrintableAttribute("position"), tc.getCaretPosition());
    }
		
	@Test
    public void notEnableIfCaretPositionIsNull() {
        JTextComponent tc;
        // set the enabled=false flag
		tc = new JTextComponent(JTextComponent.ENABLE_CARET_WHEN_HIGHLIGHT_FALSE);
        assertTrue(tc.getPrintableAttribute("enabled"));
        assertFalse(tc.getPrintableAttribute("enabled"));
        assertFalse(tc.getCaretPosition() == 0);
		// check the returned auto position caret position for enabled=false
		try {
      	     tc.setCaretPosition(null);
      	     assertEquals(tc.getCaretPosition(), tc.getPrintableAttribute("position"));
        } catch(BadLocationException ex) {				
			assertEquals(Level.SEVERE,Logger.getLogger(this.getClass().getName()).getLevel());				
		}
		// set the enabled=false flag again, enabled is true
        tc.setPrintableAttribute("enabled",JTextComponent.ENABLE_CARET_WHEN_HIGHLIGHT_FALSE);
        assertFalse(tc.getPrintableAttribute("enabled"));
        assertFalse(tc.getPrintableAttribute("enabled"));
        assertTrue(tc.getPrintableAttribute("enabled"));
        assertFalse(tc.getCaretPosition() == 0);
		// the position should stay unchanged
		assertEquals(tc.getPrintableAttribute("position"), tc.getCaretPosition());
	}
}
