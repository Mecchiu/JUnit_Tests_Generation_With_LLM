// Element_3Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains one unit test case for the {@link Element#getAttributeLocalName(int)} method.
*/
class Element_3Test {
		private static final int SIZE = 5;
		
		static private final AttributesImpl NODE_ATTRIBUTES = new AttributesImpl();
		
		static {
			getNodeAttributes("#/nodes", NODE_ATTRIBUTES);
		}
		
		@Test
		public void getStringAttributeLocalName() throws SAXException {
			final URL url = Element_3Test.class.getResource("index.xml");
			final String expected = "indexes";
			final String result = Elements_1Test.getAttribute("nodes#" + expected);
			assertEquals("Expected result for attribute '" + expected + "', but got '" + result + "'", expected, result);
			
			final AttributesImpl attr = (AttributesImpl)NODE_ATTRIBUTES.getLocalName("nodes#" + expected);
			assertEquals("Node with name '" + expected + "' does not reference the '" + expected + "' attribute value.", result, attr.getValue("/nodes#" + expected));
		}
	
		@Test
		public void getStringAttributeLocalName1() throws SAXException {
			final AttributesImpl attr = NODE_ATTRIBUTES.getLocalName("" + System.currentTimeMillis());
			assertNull("Expecting null as result for unknown attribute with name '" + attr.getValue() + "'.", attr);
			
			final Vector<String> attrs = new Vector<>(1);
			NODE_ATTRIBUTES.getLocalName(attrs);
			assertEquals("Node with name '" + attrs.get(0) + "' does not reference the '" + attrs.get(0) + "' attribute value.", "", attrs.get(0));
			
			attrs = new Vector<>(1);
			attr.getValue(attrs);
			assertEquals("Nodes without a '" + attrs.get(0) + "' attribute value.", "", attrs.get(0));
		}
}