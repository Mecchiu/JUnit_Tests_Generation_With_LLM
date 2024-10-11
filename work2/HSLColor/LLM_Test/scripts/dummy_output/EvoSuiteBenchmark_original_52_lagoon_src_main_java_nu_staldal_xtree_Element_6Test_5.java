// Element_6Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains one unit test case for the {@link Element#numberOfNamespaceMappings()} method.
*/
class Element_6Test {
		
     /**
     * Verify that the methods which return the number of namespace mapping for
     * this element return this value if called.
     */
     @Test
     public void numberOfNamespaceMappings() {
		assertEquals(6, Element_6Test.numberOfNamespaceMappings());
    }

     /**
     * Verify that the methods which return at least a string attribute value
     * for this element return this value.
     */
	@Test
	public void getStringAttribute() {
		String attribute = null;
	
		// Element element = null;
		attribute = Element.getStringAttribute(null, "attributeName");
        assertNull(attribute);
        //
		attribute = Element.getStringAttribute("attributeName",null);
        assertEquals(attribute, "attributeName");

        // Element element = Element.getStringAttribute("attributeValue", null);
        attribute = Element.getStringAttribute("attributeName", Element.getStringAttribute("attributeValue", null));
        assertEquals(attribute, "attributeValue");
	}

	@Test
    public void getStringAttributeWithInvalidArgument() {
		String attribute = null;
	        
		// Element element = new Element("<test><attributeName>x</attributeName></test>");
        attribute = Element.getStringAttribute(new Integer(null), "attributeID");
        assertNull(attribute);
        //
        attribute = Element.getStringAttribute(new Integer(""), "attributeID");
        assertNull(attribute);
        //
        attribute = Element.getStringAttribute(new Integer(null), null);
        assertNull(attribute);
        //
		attribute = Element.getStringAttribute(new Integer(Integer.MAX_VALUE), "attributeID");
		assertEquals(attribute, null);
		//
		attribute = Element.getStringAttribute(new Integer(Integer.MAX_VALUE), null);
		assertEquals(attribute, null);
    }

    /**
     * Verify that the methods which return at least a double attribute value
     * for this element return this value.
     */
	@Test
	public void getDoubleAttribute() {
		double attribute = null;
	
		// Element element = null;
		attribute = Element.getDoubleAttribute(null, "attributeName");
        assertNull(attribute);
        //
		attribute = Element.getDoubleAttribute("attributeName",null);
        assertEquals(attribute, 1.5);

        // Element element = Element.getDoubleAttribute("attributeValue", null);
        attribute = Element.getDoubleAttribute("attributeName", Element.getDoubleAttribute("attributeValue", null));
        assertEquals(attribute, 1.5);

        // Element element = Element.getDoubleAttribute("attributeValue", Element.getDoubleAttribute("attributeValue", null));
        attribute = Element.getDoubleAttribute("attributeName", Element.getDoubleAttribute("attributeValue", Element.getDoubleAttribute("attributeValue", null)));
        assertEquals(attribute, 1.5);
	}

	@Test
    public void getDoubleAttributeWithInvalidArgument() {
		double attribute = null;
	        
		// Element element = new Element("<test>attributeName</test>");
		attribute = Element.getDoubleAttribute(new Integer(null), "attributeName");
        assertNull(attribute);
        //
        attribute = Element.getDoubleAttribute(new Integer(""), "attributeID");
        assertNull(attribute);
        //
        attribute = Element.getDoubleAttribute(new Integer(null), null);
        assertNull(attribute);
        //
		attribute = Element.getDoubleAttribute(new Integer(Integer.MAX_VALUE), "attributeID");
		assertEquals(attribute, null);
		//
		attribute = Element.getDoubleAttribute(new Integer(Integer.MAX_VALUE), null);
		assertEquals(attribute, null);
    }
	
	@Test
    public void getDoubleAttributeWithMissingStringAttribute() {
		double attribute = null;
	
		// Element element = new Element();
        String[] attributeNames = null;
        attribute = Element.getDoubleAttribute(new Integer(null), "attributeName", attributeNames);
        assertNull(attribute);
        //
        attribute = Element.getDoubleAttribute(new Integer(""), "attributeID", attributeNames);
        assertNull(attribute);
        //
        attribute = Element.getDoubleAttribute(new Integer(null), null, attributeNames);
        assertEquals(attribute, null);
        //
        attribute = Element.getDoubleAttribute(new Integer(Integer.MAX_VALUE), "attributeID", attributeNames);
		assertEquals(attribute, null);
        //
        attribute = Element.getDoubleAttribute(new Integer(Integer.MAX_VALUE), null, attributeNames);
		assertEquals(attribute, null);
    }

	@Test
	public void getDoubleAttributeWithUnsupportedNumberSignal() {
		double attribute = null;
        double attributeValue = null;
	
		// Double number = null;
        attribute = Element.getDoubleAttribute(new Integer(null), "attributeName", attribute, attributeValue);
        assertNull(attribute);
        //
        attribute = Element.getDoubleAttribute(new Integer(Double.MAX_VALUE), "attributeName", attribute, attributeValue);
        assertEquals(attribute, null);
        //
        attribute = Element.getDoubleAttribute(new Integer(Double.MAX_VALUE), "attributeName", attributeValue);
        assertEquals(attribute, null);
	}

    @Test
    public void getDoubleAttributeWithUnsupportedNumberSignalWithUnsupportedDoubleSignal() {

        double attribute = -1.0;
        double attributeValue = -2.3456789;
	
        // Double number = -1.0;
        attribute = Element.getDoubleAttribute(new Integer(-1), "attributeName", attribute, attributeValue);
        assertEquals(attribute, -1.0);
        //
        attribute = Element.getDoubleAttribute(new Integer(-1.5), "attributeName", attribute, attributeValue);
        assertEquals(attribute, -1.0);
        //
        attribute = Element.getDoubleAttribute(new Integer(-1.35), "attributeName", attribute, attributeValue);
        assertEquals(attribute, -1.0);
    }

    public void getStringAttribute(Attributes attributes) throws SAXException {
        String attribute = Element.getStringAttribute(null, attributes);
        assertNull(attribute);
        //
        attribute = Element.getStringAttribute(new Integer(null), attributes);
        assertEquals(attribute, "stringValue");

        // Element element = null;
        attribute = Element.getStringAttribute(null, "attributeName", null);
        assertEquals(attribute, null);
        //
        attribute = Element.getStringAttribute("attributeName", null);
        assertEquals(attribute, null);

        // Element element = new Element();
        attribute = Element.getStringAttribute(new Integer(null), "attributeID");
        assertNull(attribute);
        //
        attribute = Element.getStringAttribute(new Integer(""), "attributeID");
        assertNull(attribute);
        //
        attribute = Element.getStringAttribute(new Integer(null), null);
        assertNull(attribute);
        //
        attribute = Element.getStringAttribute(new Integer(Integer.MAX_VALUE), "attributeID");
        assertEquals(attribute, null);
        //
        attribute = Element.getStringAttribute(new Integer(Integer.MAX_VALUE), null);
        assertEquals(attribute, null);
    }

	@Test
    public void getDoubleAttributeWithUnsupportedStringAttribute() {
        double attribute = -1.0;
        double attributeValue = -2.3456789;
	
        // Double number = -1.
}
}