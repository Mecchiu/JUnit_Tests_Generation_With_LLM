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
	 * Test constructor.
	 */
	@Test
	public void testConstructors() {
		assertNotNull(new Text("<test>Some text content</test>"));
		assertNull(new Text("<test>Non-xml content</test>"));
	}
	
	/**
	 * Test the {@link Text#asCharArray()} method.
	 */
	@Test
	public void testAsCharArray() {
		assertSame(new Text("<test>Some text content</test>"), Text.asCharArray());
	}
}