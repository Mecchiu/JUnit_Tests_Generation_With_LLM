// Element_4Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains one unit test case for the {@link Element#getAttributeType(int)} method.
*/
class Element_4Test {
		Element_4Test() {
		}

		@Test
		void test() throws Exception {
			// XML:
			URL url = Element_4Test.class.getResource("/xml-elem.xml");
			String result = TestUtil.read(url);
			String expected = "/&#40;&lt;!--&gt;test&#x0f;Elem Test;--&#x0f;";
			assertEquals(expected, result);
		}
}
// End Element_4Test.java