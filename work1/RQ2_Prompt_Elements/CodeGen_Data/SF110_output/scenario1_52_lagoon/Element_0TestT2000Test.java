// Element_0Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains one unit test case for the {@link Element#lookupAttribute(String, String)} method.
*/
class Element_0Test {


	@Test
    public void checkLookupAttribute1() throws Exception {
        // test for attribute value and name
        String localName = "foo";
		int attrNamePos = lookupAttribute(null, localName);
		assertEquals(1, attrNamePos);
        AttributesImpl attrs = new AttributesImpl();
        assertEquals("", atts.getURI(attrNamePos));
        assertEquals("", localName);
        assertEquals("foo", atts.getName(attrNamePos));
        assertEquals("", atts.getValue(attrNamePos));
        assertEquals(0, attrNamePos);

        // test for attribute value and name
        String value = "hello";
        String name = "text";
		int attrNamePos = lookupAttribute(value, name);
		assertEquals(0, attrNamePos);
        assertEquals(0, atts.getLength());
        assertEquals(1, attrs.getLength());
        assertEquals(value, atts.getValue(attrNamePos));
        assertEquals(name, atts.getName(attrNamePos));
        assertEquals(0, attrNamePos);

        // test for attribute not-existsed-value and name
        String value2 = "hello 2";
        String name2 = "i use 2";
		int attrNamePos2 = lookupAttribute(value2, name2);
		assertEquals(-1, attrNamePos2);
        assertEquals(0, attrNamePos2);
        assertEquals(0, atts.getLength());
        assertEquals(0, attrNamePos2);
    }

	@Test
    public void checkLookupAttribute2() throws Exception {
        // test for attribute not-existsed-value and name
        String localName = "foo";
		int attrNamePos = lookupAttribute(null, localName);
        assertEquals(-1, attrNamePos);
        Vector names = new Vector();
        names.add(localName);
		AttributesImpl attrs = new AttributesImpl(names);
        assertEquals(-1, attrNamePos);
        assertEquals(0, attrs.getLength());
        assertEquals(-1, attrNamePos);
        assertEquals(0, attrs.getLength());
        Vector attrs2 = new Vector();
		try {
			attrs2.removeElementAt(0);
			fail();
		}
		catch (java.util.NoSuchElementException nse) {
			// expect to fail if attrs2 is empty, hence this line.
		}
        assertEquals(names.size(), attrs2.size());
        assertTrue(names.contains(localName));
        assertEquals(0, attrNamePos);

		// test for attribute not-existsed-value and name
		String value = "hello";
		String name = "text";
		int attrNamePos = lookupAttribute(value, name);
		assertEquals(-1, attrNamePos);
        assertEquals(0, attrNamePos);
        assertEquals(0, attrs2.size());
        Vector names2 = new Vector();
		names2.add(value);
		names2.add(name);
		attrs2 = new AttributesImpl(names2);
        assertEquals(-1, attrNamePos);
        assertEquals(0, attrs2.getLength());
        Vector attrs2a = new Vector();
        attrs2a.addElement(value);
        attrs2a.addElement(name);
        attrs2 = new AttributesImpl(attrs2a);
        assertEquals(-1, attrNamePos);
        assertEquals(0, attrs2.getLength());
        assertEquals(0, attrs2a.size());
        assertEquals(0, attrs2.hashCode());
    }
	@Test
    public void checkLookupAttribute3(){
         // test for attribute value and name
        String localName = "attrValue";
		Vector attrs = new Vector();
        Vector names = new Vector();
       
        // test for one attribute
		int attrNamePos = lookupAttribute(localName, null);
		assertTrue(attrNamePos >= 0);
        assertEquals(0, attrNamePos); // attribute value
		attrs.addElement(localName);
		
        // test for two attributes
        attrs.addElement(localName);
       
        // test for attribute not-existsed-value and name
        assertEquals(0, attrNamePos);
        attrs.addElement(localName);
        attrs.addElement(name);
        assertEquals(0, attrNamePos);
        
        // test for attribute value and name
        attrs.addElement(localName, value);
        attrs.addElement(name);
        Vector names2 = new Vector();
		names2.add(localName);
		names2.add(name);
		attrs2 = new AttributesImpl(names2);
        assertEquals(0, attrNamePos);
        assertEquals(1, attrs2.getLength());
        assertEquals(value, attrs2.getValue(0));
        assertEquals(name, attrs2.getName(0));
        assertEquals(0, attrNamePos);
       
        // test for attribute value and name
        attrs.addElement(localName, value);
        attrs.addElement(name);
        attrs2 = new AttributesImpl(attrs);
        assertEquals(1, attrNamePos);
        assertEquals(2, attrs2.getLength());
        assertEquals(value, attrs2.getValue(0));
        assertEquals(name, attrs2.getName(0));
        assertEquals(1, attrNamePos);
       
        // test for attribute not-existsed-value and name
        attrs.addElement(localName);
        attrs.addElement(name);
        assertEquals(0, attrNamePos);
        assertEquals(0, attrs.getLength());
        Vector names2a = new Vector();
        names2a.add(localName);
        names2a.add(name);
        attrs2a = new AttributesImpl(names2a);
        assertEquals(0, attrNamePos);
        assertEquals(0, attrs2.getLength());
        assertEquals(0, attrNamePos);
        assertEquals(0, attrs.hashCode());
	}
}
