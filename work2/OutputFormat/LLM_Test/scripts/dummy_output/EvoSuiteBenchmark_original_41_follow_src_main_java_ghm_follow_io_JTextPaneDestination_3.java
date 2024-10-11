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
		
    /**
     * Test if text area auto position.
     * The following conditions will be met depending on the environment:
     *  - JTextArea not set.
     *  - JTextPane not set.
     * @throws java.lang.Throwable
     */
       @Test // FUTURE - allow to test JTextArea and javax.swing.JTextPane
       void JTextPaneDestinationAutoPosition() throws Throwable {
            JTextPane jTextPane = null;
            JTextArea jTextArea = null;
            long timeBefore = 0;
            long timeAfter = 0;
            int i = 0;
            boolean result = false;
            
            timeBefore = System.currentTimeMillis();
            
            jTextPane = new JTextPane();
            jTextPane.setEditable(false);
            result = true;
            
            
            timeAfter = System.currentTimeMillis();
            
            if (timeAfter >= timeBefore){
                System.err.println("expected: " + timeBefore + "  actual: " + timeAfter);
                return;
            }
        }
        
        @Test // FUTURE - allow to test JTextPane and javax.swing.JTextPane
        void JTextPaneDestinationAutoPositionCheckWithJTextArea() throws Throwable {
            JTextPane jTextPane = null;
            JTextArea jTextArea = new JTextArea();
            jTextPane = new JTextPane(jTextArea);

            long timeBefore = 0;
            long timeAfter = 0;
            int result = true;
            
            timeBefore = System.currentTimeMillis();
            
            if (timeAfter >= timeBefore){
                //System.err.println("expected: " + timeBefore + "  actual: " + timeAfter);
                return;
            }            
            result = false;
        }

}