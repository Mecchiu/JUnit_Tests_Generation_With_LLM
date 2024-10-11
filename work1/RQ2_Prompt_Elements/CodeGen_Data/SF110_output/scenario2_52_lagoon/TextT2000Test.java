// TextTest.java
package nu.staldal.xtree;

import org.xml.sax.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Text}.
* It contains one unit test case for the {@link Text#asCharArray()} method.
*/
class TextTest {
/**
		* {@link Text#asCharArray()} method.
		*/
		@Test
		 void testAsCharArray() {
			assertNull(Text.asCharArray() == null);
        assertTrue(Text.asCharArray().length == 0);
			assertArrayEquals(new char[] {  }, Text.asCharArray());
			assertNotNull(Text.asCharArray());
			final Text t1 = new Text();
			assertArrayEquals(new char[] {  }, t1.asCharArray());
			assertNotNull(new Text(t1, "xml"));
			final Text t1 = new Text(new XMLDocument(), "xml");
			assertArrayEquals(new char[] {  }, t1.asCharArray());
		}
        
}

