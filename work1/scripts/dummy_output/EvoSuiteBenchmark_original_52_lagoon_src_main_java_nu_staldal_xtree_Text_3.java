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
		@Test
    public void testAsCharArray() {
	assertNotNull(Text.asCharArray());
	assertArrayEquals(
		new char[] {'d', 'c','', 'c', ',','', 'l', 'i', 'f','', 'i', 'n',
			//,
			'r', 'a','', 'l', 't', 'p', 'a','', 'r', 'e','', 'r', 'd',
			',','', 'l', 'o','s',
		},
		Text.asCharArray()
	);
    }
}