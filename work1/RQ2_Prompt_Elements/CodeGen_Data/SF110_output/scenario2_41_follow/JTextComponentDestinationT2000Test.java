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

    private final Logger logger = Logger.getLogger(this.getClass().getName());
    private static final boolean autoPositionCaret = true;
  
    @Test
    void testAutoPositionCaret() throws BadLocationException {
    	
    	StringBuilder componentStrBuilder = new StringBuilder();
        JTextComponent component = new JTextComponent("Test");
        componentStrBuilder.append(component);        
        
        // Auto position caret and remove
        // componentStrBuilder.append(componentStrBuilder.toString());
        String componentStr = componentStrBuilder.toString();

        int offset = component.getSelectionStart();

        componentStrBuilder.setLength(0);
        componentStrBuilder.append(componentStr.substring(0,offset));

        assertEquals(0,componentStrBuilder.length());
        assertEquals(offset, component.getSelectionStart());
        assertEquals(offset, component.getSelectedText().length());

        // No caret
        
        componentStrBuilder.setLength(1);
        componentStrBuilder.append(componentStr);

        assertEquals("Test\tNo caret", componentStrBuilder.toString());
        assertEquals(0, component.getSelectionEnd());
        assertEquals(component.getSelectedText().length(), component.getSelectedText().replace(componentStr.substring(0,offset), componentStr));
        
    }
        
    @Test
    void testCustomPositionCaretWithExpandedLineDelimiter() throws BadLocationException {
    	
        StringBuilder componentStrBuilder = new StringBuilder();
        JTextComponent component = new JTextComponent("Test");
        componentStrBuilder.append(component);        
        
        // Auto position caret and remove
        String componentStr = componentStrBuilder.toString();

        int offset = component.getSelectionStart();

        componentStrBuilder.setLength(1);
        componentStrBuilder.append("\t");
        componentStrBuilder.append(componentStr);

        assertEquals("\tTest\tNo caret", componentStrBuilder.toString());
        assertEquals("1\t", componentStrBuilder.substring(0,offset));
        assertEquals(offset+1, component.getSelectionStart());
        assertEquals(offset+1, component.getSelectedText().length());

        componentStrBuilder.setLength(1);
        componentStrBuilder.append("\t");
        componentStrBuilder.append(componentStr.substring(0,offset));

        assertEquals("\tTest\tNo caret", componentStrBuilder.toString());
        assertEquals("2\t", componentStrBuilder.substring(0,offset));
        assertEquals(offset+2, component.getSelectionStart());
        assertEquals(offset+2, component.getSelectedText().length());
        
        componentStrBuilder.setLength(1);
        componentStrBuilder.append("\n");
        
        assertEquals("\nTest\tNo caret\n", componentStrBuilder.toString());
        assertEquals("2\t", componentStrBuilder.substring(0,offset));
        assertEquals(offset+2, component.getSelectionStart());
        assertEquals(offset+2, component.getSelectedText().length());



    }

    @Test
    void testCustomPositionCaret() throws BadLocationException {
    	
    	StringBuilder componentStrBuilder = new StringBuilder();


        int firstOffset = 0;        
        int secondOffset = firstOffset+1;
        int secondLineDelimiterCount = 0;
        JTextComponent component = new JTextComponent("Test");
        componentStrBuilder.append(component);        
        
        // Auto position caret and remove
        String componentStr = componentStrBuilder.toString();

        int offset = component.getSelectionStart();

        componentStrBuilder.setLength(1);
        componentStrBuilder.append("\t");
        componentStrBuilder.append(componentStr.substring(0,firstOffset));

        assertEquals(firstOffset+1, componentStrBuilder.length());
        assertEquals("\tTest\tNo caret", componentStrBuilder.toString());
        assertEquals(firstOffset+1, component.getSelectionStart());
        assertEquals(firstOffset+1, component.getSelectedText().length());
        
        componentStrBuilder.setLength(1);
        componentStrBuilder.append("\t");
        componentStrBuilder.append(componentStr.substring(firstOffset, secondOffset));
        
        assertEquals("\tTest\tNo caret\n\t\t", componentStrBuilder.toString());
        
        componentStrBuilder.setLength(1);
        componentStrBuilder.append("\n");
        
        assertEquals("\nTest\tNo caret\n\t", componentStrBuilder.toString());
        
        componentStrBuilder.setLength(1);
        componentStrBuilder.append("\n\t");
        componentStrBuilder.append(componentStr.substring(firstOffset, secondOffset));
        
        assertEquals("\nTest\tNo caret\n\t\t\t", componentStrBuilder.toString());

        firstOffset= secondOffset+1;
        componentStrBuilder.setLength(1);
        componentStrBuilder.append("\t");
        componentStrBuilder.append(componentStr.substring(firstOffset, secondOffset));

        assertEquals("\tTest\tNo caret\n\t\t", componentStrBuilder.toString());


        firstOffset= secondOffset+1;
        componentStrBuilder.setLength(1);
        componentStrBuilder.append("\t\t");
        componentStrBuilder.append(componentStr.substring(firstOffset, secondOffset));

        assertEquals("\t\tTest\tNo caret", componentStrBuilder.toString());
        
        // Auto position caret is not supported by any format, nor is it supported by this test
        firstOffset= 0;
        componentStrBuilder.setLength(1);
        componentStrBuilder.append("\n\t\t");
        componentStrBuilder.append(componentStr.substring(firstOffset, secondOffset));

        assertEquals("\n\t\tTest\tNo caret\n\n\t", componentStrBuilder.toString());
        

        // Auto position caret is not supported by any format, nor is it supported by this test
        firstOffset= 0;
        secondOffset= firstOffset+1;
        secondLineDelimiterCount= 1;
        
        componentStrBuilder.setLength(1);
       // componentStrBuilder.append("<div>\n");
        componentStrBuilder.append("<div style=\"line-height:1px\">\n");
        componentStrBuilder.append("<label style=\"line-height:0px\">");
        componentStrBuilder.append("<div style=\"display:inline\">");

        componentStrBuilder.append("<div style=\"color:rgb(0,0,0)\">");
        componentStrBuilder.append("<div class='line' style=\"background