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
		private JTextComponentDestination dest;
		private JTextComponent testTextComponent;

		private static final String TEST = "Hello world!";
		private static final String INVALID_TEST_STRING = "Hello world!";
		private static final String TEST_CONTENTS = "a" + INVALID_TEST_STRING + "\nb" + TEST_CONTENTS;
	
		public JTextComponentDestinationTest() { }

		@Test
		public void test() {
			// set up source
			StringBuilder sb = new StringBuilder();
			for (int i=0;i<10;i++) {
				sb.append(TEST_CONTENTS);
			}
			testTextComponent = new JTextComponent(sb.toString());
			dest = new JTextComponentDestination(testTextComponent, false);
			assertEquals(TEST, dest.appendText(TEST_CONTENTS));
			assertEquals("" + TEXT + "\n" + invalidDestinationTEST_CONTENTS + "\n", dest.getFullContent());
			assertFalse(dest.getAutoPositionCaret());
			dest.clear();
			assertEquals("" + TEXT + "\n" + invalidDestinationTEST_CONTENTS + "\n", dest.getFullContent());
		}
// JTextComponentDestinationTest.java ends here
}