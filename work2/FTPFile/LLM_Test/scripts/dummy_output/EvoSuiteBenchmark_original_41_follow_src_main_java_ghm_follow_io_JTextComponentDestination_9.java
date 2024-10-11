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
		
	final JTextComponentDummy dummy = new JTextComponentDummy("I am a text component"); 
	
    ////<testsuite classname="ghm.follow.io.JTextComponentDestinationTest"/>
    /**
     * Test {@link #autoPositionCaret()}.
     */
    @Test
    void testAuto() {
    	dummy.setAutoPosCaret(!dummy.autoPositionCaret());
    	LOG.log(Level.INFO,"Auto position Caret: "+dummy.autoPositionCaret());
    }

    /**
     * Test the {@link #addFilteredView()} method.
     */

    @Test
    void testAddFilteredView() {
    	dummy.append("");
    	JTextComponentDummy filtered = new JTextComponentDummy("");
    	LOG.log(Level.INFO,"Filtered: "+filtered.toHtml());
    	dummy.setAutoPosCaret(true);
    	LOG.log(Level.INFO,"Filtered: "+filtered.toHtml());

    	dummy.setAutoPosCaret(!filtered.autoPositionCaret());
    	filtered.append("");
    	LOG.log(Level.INFO,"Filtered: "+filtered.toHtml());
	}
	
	/**
	 * Test the {@link #clear()} method.
	 */

	@Test
	void testClear() {
    	dummy.append("");
    	JTextComponentDummy filtered = new JTextComponentDummy("");
    	LOG.log(Level.INFO,"Filtered: "+filtered.toHtml());
	}

	/**
	 * Test the {@link #removeFilteredView()} method.
	 */
	@Test
    void testRemoveFilteredView() {
        dummy.append("");
        JTextComponentDummy filtered = new JTextComponentDummy("");
        dummy.setAutoPosCaret(true);
        LOG.log(Level.INFO,"Filtered: "+filtered.toHtml());

        dummy.setAutoPosCaret(!filtered.autoPositionCaret());
        filtered.append("");
        LOG.log(Level.INFO,"Filtered: "+filtered.toHtml());

        // Test that we remove the filtered view
        dummy.getJTextComponent().removeAll();
        LOG.log(Level.INFO,"The text area has been cleared");
        assertEquals(dummy.getJTextComponent().getText(), "");
    }
	
	// JTextComponentDummyTest.java JTextComponentDestinationTest

    ////<testsuite classname="ghm.follow.io.JTextComponentDestinationTest"/>
}


class JTextComponentDummy extends JTextComponent {

    public JTextComponentDummy(String string) {
    	super(string);
    }

	public void setText(String string) {
		setText(string, -1, string.length());
	}

    public void setText(String s, int start, int end) {
        try {
        	setFont(super.getFont());
        	super.setText(s.substring(start, end));
        } catch (BadLocationException e) {
            return;
        }
    }
}