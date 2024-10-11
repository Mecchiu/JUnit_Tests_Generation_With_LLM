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
	void test() {
      LOG.log(Level.INFO, "testing JTextComponentDestinationTest");
		
		JTextComponentDestination testcase = new  JTextComponentDestination(new JTextComponent(), true);
	    //System.out.println ("before: ");
	    JTextComponent dest = testcase.getJTextComponent();
	    String msg = null;
	    try {
	    while (testcase.autoPositionCaret()) {
	      Thread.sleep(60000); // wait a while for the JTextComponent to finish auto positioning
	    }
	    msg = dest.getText();
	    //System.out.println ("after: ");
	    if (testcase.getJTextComponent() instanceof JTextField) {
	    assertNotNull("Should not be null.",msg);
	    }
	    else {
	      assertNull("Should be null",msg);
	    }
	  }
	    catch (Exception e){
		  fail("Unexpected exception: " + e);
	    }
	  fail("Test failed.");
	}
}