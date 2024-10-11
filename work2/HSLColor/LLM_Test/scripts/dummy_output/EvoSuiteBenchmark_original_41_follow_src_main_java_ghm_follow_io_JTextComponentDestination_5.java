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
		
    public JTextComponentDestinationTest() {
    }
    @SuppressWarnings("unchecked")
    @Test
    public void testAutoPositiveOffsetOfTextComponent() {
        assertEquals(10,
                new JTextComponentDestination(null, true).autoPositionCaret());
        assertEquals(0,
                new JTextComponentDestination((JTextComponent)null, true).autoPositionCaret());
        assertEquals(10,
                new JTextComponentDestination(null, false).autoPositionCaret());
        assertEquals(0,
                new JTextComponentDestination((JTextComponent)null, false).autoPositionCaret());

        assertEquals(10,
                new JTextComponentDestination(new JTextComponent(2*10)),
                new JTextComponentDestination(new JTextComponent(2*10), true));
        assertEquals(20,
                new JTextComponentDestination(new JTextComponent(2*10)),
                new JTextComponentDestination(new JTextComponent(2*10, 1), true));
    }
    
    @Test
    public void testInvalidInitialPosition() {
        try {
            new JTextComponentDestination(new JTextComponent(1*10), true);
            fail("The constructor of JTextComponentDestination should throw a <bad location> when called with a value > length that can't be represented");
        } catch (NumberFormatException e) {
            assertTrue(e.getMessage().contains("invalid offset ") || e.getMessage().contains("illegal offset") || e.getMessage().contains("malformed offset"));
        }
        assertEquals(20,
                new JTextComponentDestination((JTextComponent)null, false).getPosition(),
                new JTextComponentDestination((JTextComponent)null, true).getPosition());
        assertEquals(10,
                new JTextComponentDestination(new JTextComponent(2*10), false).getPosition(),
                new JTextComponentDestination((JTextComponent)null, true).getPosition());
    }
}