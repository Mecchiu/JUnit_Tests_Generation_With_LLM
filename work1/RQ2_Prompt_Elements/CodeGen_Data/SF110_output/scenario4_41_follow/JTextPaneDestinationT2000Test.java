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
private JTextPane p;

		@BeforeAll
		public static void init() {
				initLogger();
		}
		
		@Test
		public void test() {
				assertNotNull(p);
				
				p.print("Hello World");
				
				assertEquals(new Integer((int) p.getText().indexOf("Hello World")), new Integer((int) p.getDocument().getNumOfUncachedChars()));
				
				p.clear();
				
				assertEquals(String.valueOf(p.getText()).length(), 0);
				
				assertFalse(p.getText().contains("?"));
				
				p.print(null);
				
				p.clear();
				
				assertEquals(String.valueOf(p.getText()).length(), 0);
				
				assertTrue(p.getText().indexOf("Hello World")!= 0);
				
				
		}
	private void initLogger() {
		final Logger logger = Logger.getLogger("hm.follow.io");
		
		logger.setLevel(Level.INFO);
		
		autoPositionCaret = true;
		
		p = new JTextPane("Test JTextPaneDestinationTest");
		
	}
}// end of class JTextPaneDestinationTest
