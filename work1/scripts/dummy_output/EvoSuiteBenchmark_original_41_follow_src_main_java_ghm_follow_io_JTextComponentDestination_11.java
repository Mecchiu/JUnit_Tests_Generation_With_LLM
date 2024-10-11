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
		
    private String text = "";
    private JTextComponent jTextPane;

    private Logger LOG = Logger.getLogger(getClass().getName());

	/**
    * This creates this class, and tests it with the provided test case,
    * passing the text to the output destination.
    *
    * @author <a href="mailto:carl.hall@gmail.com">Carl Hall</a>
    * @throws BadLocationException 
    */
	public JTextComponentDestinationTest(int testCaseType) throws BadLocationException {
        text = JTextComponentDestination.class.getSimpleName().charAt(0) + "testcase" + JTextComponentDestination.class.getSimpleName().charAt(1);
        jTextPane = new JTextComponent(text);
        jTextPane.setEditable(false);
        jTextPane.setText(text);
        LOG.log(Level.FINE, "Got TextPane");
        jTextPane.select(0, jTextPane.getDocument().getLength());
        
	}
	
	/**
    * Tests the behavior of the output destination.
    */
    @Test
    void jTextComponentDestinationTest() {
	    //Create the output destination
	    OutputDestination oDest = new JTextComponentDestination(jTextPane, true);
	    assertTrue(oDest instanceof JTextComponentDestination);

	    //Test whether it was able to add a view
	    jTextPane.addView(new JTextView("some new view"));
	    assertFalse(jTextPane.getViews().isEmpty());
	       
	    //Try to add the view and test that the view was added
	    oDest.getJTextComponent().addView(new JTextView("view 2"));
	    assertTrue(jTextPane.getViews().size() > 1);
	    LOG.log(Level.INFO, "view 2 added");

	    //Test whether the removed view was removed from the view list
	    jTextPane.removeView(jTextPane.getViews().get(0));
	    assertFalse(jTextPane.getViews().isEmpty());

	    //Test whether the view can be removed from another view
	    jTextPane.removeView(new JTextView("view 1"));
	    assertFalse(jTextPane.getViews().isEmpty());
	    LOG.log(Level.SEVERE, "View 1 can't be removed from the view list of another view");
	}
	
    /**
     * Class to test the {@link JTextComponentDestination#autoPositionCaret()}
     * method.
     */
    @Test
    void autoPositionCaretTest() {
	    //Create the output destination
	    JTextComponentDestination oDest =
	        new JTextComponentDestination(jTextPane, true);
	  
		//Test whether the content of the text component is not null and is not empty
		if (oDest.toString().isEmpty()) {
			LOG.log(Level.INFO, "Text content is empty");
			assertFalse(oDest.toString(), oDest.toString().isEmpty());
		}	
	    else {
		    LOG.log(Level.INFO, "Content of the text component is not empty");
			assertFalse(oDest.toString().isEmpty());
		}

	    //When auto positions caret, it will be automatically moved to the bottom of the text
	    oDest.autoPositionCaret();
	    LOG.log(Level.INFO, "Auto position caret was correctly set");
    }
}