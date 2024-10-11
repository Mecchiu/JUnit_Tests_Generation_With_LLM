// Element_5Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains one unit test case for the {@link Element#getAttributeValue(int)} method.
*/
class Element_5Test {
		
    /**
     * XML Element with name Test.
     */
    static final String TEST_LOCATION = Element.class
       .getResource("Element_5test.xml").toExternalForm();
		
	/**
	 * Test the method {@link Element#getAttributeValue(int)}.
	 */
	@Test
	void testGetAttributeValue() {
		String value;
		Element element;

		value = null;
		try {
			element = (Element) XMLDocument.createDocument(); 
		    element.appendAttribute("test", "test");
			error expected = null;
			try {
				value = element.getAttributeValue(0);
			} catch (Exception ex) {
				expected = ex;
			}
			assertTrue(expected);
		} catch (Exception ex) {
			fail(ex.getMessage());
		}

		value = "TEST";
		try {
			element = (Element) XMLDocument.createDocument(); 
		    element.appendAttribute("test", value);
			error expected = null;
			try {
				value = element.getAttributeValue(0);
			} catch (Exception ex) {
				expected = ex;
			}
			assertNotNull(value);
			assertTrue("Unexpected value.", value.startsWith("TEST="));
		} catch (Exception ex) {
			fail(ex.getMessage());
		}

		error expected = null;
		try {
			element = (Element) XMLDocument.createDocument(); 
		    element.appendAttribute("test", "test");
			Vector values = element.attributes("test");
			assertNotNull(values);
			assertTrue("Unexpected size.", values.size() == 1);

			value = null;
			try {
				value = (String) values.get(0).getValue();
			} catch (Exception ex) {
				expected = ex;
			}
			assertTrue("Unexpected value.", value instanceof String);
			assertTrue("Unexpected content.", value!= null);
			assertTrue("Unexpected content.", value.startsWith("test="));
			assertTrue("Unexpected content.", value.endsWith("="));

		} catch (Exception ex) {
			fail(ex.getMessage());
		}

		value = "TEST";
		try {
			element = (Element) XMLDocument.createDocument(); 
		    element.appendAttribute("test", value);
			Vector values = element.attributes("test");
			assertNotNull(values);
			assertTrue("Unexpected size.", values.size() == 1);

			value = null;
			try {
				value = (String) values.get(0).getValue();
			} catch (Exception ex) {
				expected = ex;
			}
			assertTrue("Unexpected value.", value instanceof String);
			assertTrue("Unexpected content.", value!= null);
			assertTrue("Unexpected content.", value.startsWith("test="));
			assertTrue("Unexpected content.", value.endsWith("="));

		} catch (Exception ex) {
			fail(ex.getMessage());
		}
	}
	
    /**
     * XML empty test.
     */
    static final String TEST_LOCATION_EMPTY = Element.class
       .getResource("Element_5test.xml").toExternalForm();
	
	/**
	 * Test the method {@link Element#appendAttribute(String,String)}.
	 */
	@Test
	void testAppendAttribute() {
		String value;
		Element element;
		
		value = "TEST";
		try {
			element = (Element) XMLDocument.createDocument();
		    element.appendAttribute("test", value);
			Vector values = element.attributes("test");
			assertNotNull(values);
			assertTrue("Unexpected size.", values.size() == 1);
			value = null;
			try {
				value = (String) values.get(0).getValue();
			} catch (Exception ex) {
				value = "TEST";
			}
			assertTrue("Unexpected value.", value.startsWith("test="));
			assertTrue("Unexpected value.", value.endsWith("="));
		} catch (Exception ex) {
			fail(ex.getMessage());
		}
		
		value = "NON_EXISTENT", 
		value = "TEST", 
		value = "TEST", 
		value = "TEST";
		try {
			element = (Element) XMLDocument.createDocument();
		    element.appendAttribute("test", value);
			Vector values = element.attributes("test");
			assertNotNull(values);
			assertTrue("Unexpected size.", values.size() == 0);
		} catch (Exception ex) {
			fail(ex.getMessage());
		}

	}
}