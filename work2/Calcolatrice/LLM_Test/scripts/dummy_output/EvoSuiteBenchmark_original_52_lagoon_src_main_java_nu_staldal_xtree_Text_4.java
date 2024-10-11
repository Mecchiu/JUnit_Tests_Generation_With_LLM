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
		
    @Test void testGetCharArray() throws Exception {
		Text t = new Text("hello");
		
		char[] value = t.asCharArray();
        assertEquals(new char[] {'h', 'e', 'l', 'l', 'o','', 'l', 'o','', 'l', 'o','', 'r', 'a',
                'l', 'e'}, value);
    }
}