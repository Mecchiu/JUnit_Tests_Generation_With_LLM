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
     * Test method for 'nu.staldal.xtree.Element.Element_5Test.getAttributeValue()'.
     */
    @Test
    public void getAttributeValue() throws Exception {
        Element elem = new Element("test");
        assertNotSame(null, elem.lookupAttribute(ATTR_NAME));
    }
    
    /**
     * Test method for 'nu.staldal.xtree.Element.Element_5Test.lookupAttribute(nu.staldal.xtree.Element, String)'
     */
    @Test
    public void lookupAttribute__String() throws Exception {
        Vector tests = new Vector();
        tests.add("test");
        tests.add("test2");
        tests.add("test3");
        tests.setLength(10);
        Vector attributes = Element.lookupAttribute(tests, "pk1");
        assertNotNull(attributes);
        assertTrue(attributes.size() == 10);
	
        tests.remove(1);
        Vector attributes2 = Element.lookupAttribute(tests, "pk1");
        assertFalse("The returned attribute does not exist", attributes2.contains(null));
        assertNotNull(attributes2);
        assertTrue(attributes2.size() == 7);
        
        tests.add("test2");
        tests.add("test");
        Vector attribute_element = Element.lookupAttribute(tests, "pk1");
        assertTrue(attribute_element.size() == 7);
    }
    
    /**
     * Test method for 'nu.staldal.xtree.Element.Element_5Test.lookupAttribute(nu.staldal.xtree.Element, String, int)'
     */
    @Test
    public void lookupAttribute__String__intDefault() throws Exception {
        Vector tests = new Vector();
        tests.add("test");
        tests.add("test2");
        tests.add("test3");
        tests.setLength(10);
        Vector attributes = Element.lookupAttribute(tests, "pk1", 0);
        assertNotNull(attributes);
        assertTrue(attributes.size() == 2);
	
        attributes2 = Element.lookupAttribute(tests, "pk1", 2);
        assertNotNull(attributes2);
        assertTrue(attributes2.size() == 2);
        assertEquals(null, attributes2.get(0));
        
        tests.remove(1);
        attributes2 = Element.lookupAttribute(tests, "pk1", 0);
        assertSame(attributes, attributes2);
        assertNotNull(attributes2);
        assertTrue(attributes2.size() == 5);
        
        tests.remove(4);
        Vector attributes3 = Element.lookupAttribute(tests, "pk1", 2);
        assertNotNull(attributes3);
        assertTrue(attributes3.size() == 3);
        
        Vector attributes4 = Element.lookupAttribute(tests, "pk1", 2);
        assertNotNull(attributes4);
        assertFalse(attributes4.size() == 8);
        
        tests.add("test2");
        Vector attribute_element = Element.lookupAttribute(tests, "pk1", 0);
        assertTrue(attribute_element.size() == 0);
    }
    
    /**
     * Test method for 'nu.staldal.xtree.Element.Element_5Test.lookupAttribute(nu.staldal.xtree.Element, String, boolean)'
     */
    @Test
    public void lookupAttribute__String__booleanDefault() throws Exception {
        Vector tests = new Vector();
        tests.add("test");
        tests.add("test2");
        tests.add("test3");
        tests.setLength(10);
        Vector attributes = Element.lookupAttribute(tests, "pk1", false);
        assertNotNull(attributes);
        assertTrue(attributes.size() == 2);
	
        attributes2 = Element.lookupAttribute(tests, "pk1", true);
        assertNotNull(attributes2);
        assertTrue(attributes2.size() == 2);
        
        tests.remove(1);
        attributes2 = Element.lookupAttribute(tests, "pk1", false);
        assertTrue(!attributes2.get(0).equals("test"));
        
        tests.remove(4);
        Vector attributes3 = Element.lookupAttribute(tests, "pk1", true);
        assertEquals("test", attributes3.get(0));
        
        Vector attributes4 = Element.lookupAttribute(tests, "pk1", true);
        assertFalse("The returned attribute does not exist", attributes4.get(0).equals("test"));
        
        tests.add("test2");
        attributes3 = Element.lookupAttribute(tests, "pk1", false);
        assertTrue(attributes3.get(0).equals("test"));
    }
    
    /**
     * Test method for 'nu.staldal.xtree.Element.Element_5Test.lookupAttribute(nu.staldal.xtree.Element, String, java.net.URL)'
        @throws Exception 
     */
    @Test
    public void lookupAttribute__String__URLDefault() throws Exception {
        Vector tests = new Vector();
        tests.add("test");
        tests.add("test2");
        tests.add("test3");
        tests.setLength(10);
	
        Vector attributes = Element.lookupAttribute(tests, "pk1", new URL("http://www.nus.edu/staldal/xtree/tests/test.html"));
        assertNotNull(attributes);
        assertTrue(attributes.size() == 2);
	
        attributes2 = Element.lookupAttribute(tests, "pk1", new URL("http://www.nus.edu/staldal/xtree/tests/test.html"));
        assertNotNull(attributes2);
        assertTrue(attributes2.size() == 2);
	
        tests.remove(1);
        attributes2 = Element.lookupAttribute(tests, "pk1", new URL("http://www.nus.edu/staldal/xtree/tests/test.html"));
        assertSame(attributes, attributes2);
        assertNotNull(attributes2);
        assertTrue(attributes2.size() == 8);
        
        tests.add("test2");
        Vector test_element = Element.lookupAttribute(tests, "pk1", new URL("http://www.nus.edu/staldal/xtree/tests/test.html"));
        assertTrue(test_element.size() == 0);
    }

    /**
     * Test method for 'nu.staldal.xtree.Element.Element_5Test.printXML()'
     */
    @Test
    public void printXML() {
        try {
            Element.XMLOutput.printXML(null);
            fail("Expected NullPointerException not thrown");
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
}
}