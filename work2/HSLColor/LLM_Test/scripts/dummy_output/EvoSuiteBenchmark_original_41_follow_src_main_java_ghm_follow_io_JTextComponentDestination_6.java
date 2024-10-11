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
		
	private static final Logger LOG = Logger.getLogger(JTextComponentDestinationTest.class.getName());

	// ==================================================================================
	
	/**
     * Test the method  {@link JTextComponentDestination#JTextComponentDestination()} for the clone method
     *
     * @since 1.9.3
     */
    @Test
	public void testClone() {
		
		JTextComponentDestination jTcDest = new JTextComponentDestination(null);
		JTextComponent jTc = jTcDest.getJTextComponent();
		
		try {
			OutputDestination clone = jTcDest.clone();
		} catch (CloneNotSupportedException e) {
			LOG.log(Level.SEVERE, null, e);
			// TODO Auto-generated catch block
			fail("Clone not supported exception caught!");
		}
	}
	
}