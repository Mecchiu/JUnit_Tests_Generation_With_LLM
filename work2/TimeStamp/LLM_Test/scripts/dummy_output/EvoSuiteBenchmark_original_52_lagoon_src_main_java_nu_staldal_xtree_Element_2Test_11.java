// Element_2Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains one unit test case for the {@link Element#getAttributeNamespaceURI(int)} method.
*/
class Element_2Test {
		Element element;

        @Test
        public void test() throws SAXException {
			AttributesImpl attributes = new AttributesImpl();
			String url = "http://www.exslt.org/";
				attributes.addValue("", "url", url);
				
				URL url1 = 		new URL("https://www.exslt.org/");
				attributes.addValue("", "url1", url1);
				
				String url2 = 	"http://www.exslt.org/";
				attributes.addValue("", "url2", url2);
				
				Vector<String> urls = new Vector<String>();
				urls.add(url1.toExternalForm());
				urls.add(url2.toExternalForm());
			element = new Element(urls);
			
			assertSame(urls.get(0), element.getAttribute("url"));
			assertSame(urls.get(1), element.getAttribute("url1"));
			assertEquals(urls.get(2), element.getAttribute("url2"));
      	}
}