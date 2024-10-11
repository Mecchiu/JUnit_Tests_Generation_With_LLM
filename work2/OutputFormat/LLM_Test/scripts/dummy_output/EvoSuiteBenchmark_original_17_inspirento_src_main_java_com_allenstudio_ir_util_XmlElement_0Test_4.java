// XmlElement_0Test.java
package com.allenstudio.ir.util;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XmlElement}.
* It contains one unit test case for the {@link XmlElement#addAttribute(String, String)} method.
*/
class XmlElement_0Test {
		
	/** The name of the xml element. */
    @Test
    public void testAddAttribute() {
		
        xmlElem = xmlElem.clone();
        xmlElem.addAttribute("test", "add attribute");
        assertEquals(1, xmlElem.getAttributes().size());
		assertEquals("add attribute", xmlElem.getAttributes().getName(0));
        xmlElem.removeAttribute("test");
        assertNull(xmlElem.getAttributes().getName(0));

    }
    
	/** The name of the xml element. */
    @Test
    public void testAddAttribute_noSuchAttr() {
        xmlElem = xmlElem.clone();
        xmlElem.addAttribute("test", "add attribute");
        assertNull(xmlElem.getAttributes().getName(0));
        assertNull(xmlElem.getAttribute("test2"));
        
    }
    
	/** Test for {@link XmlElement#addAttribute(String, String)}. */
    @Test
    public void testAddAttribute_1() {
        xmlElem = xmlElem.clone();
        xmlElem.addAttribute("test", "add attribute");
        assertFalse(checkValue(xmlElem.getAttribute("test")).equals("add attribute"));
        
    }

	/** Test for {@link XmlElement#addAttribute(String, String)}. */
    @Test
    public void testAddAttribute_2() {
        xmlElem = xmlElem.clone();
        xmlElem.addAttribute("test", "add attribute");
        assertTrue(checkValue(xmlElem.getAttribute("test")).equals("add attribute"));

        /** @todo - see Test.testAttributesInXml() method for details */
        
        /** Test for {@link XmlElement#addAttribute(String, String)}. */
        if (xmlElem instanceof XmlElement) {
        	assertFalse(checkValue(xmlElem.getAttribute("test3")).equals("add attribute"));
        }
        
    }
	
    @Test
    public void testAddAttribute_3() {
        xmlElem = xmlElem.clone();
        xmlElem.addAttribute("test", "add attribute");
        assertTrue(checkValue(xmlElem.getAttribute("test")).equals("add attribute"));
        
        /** @todo - see Test.testAttributesInXml() method for details */
        
        /** Test for {@link XmlElement#addAttribute(String, String)}. */
        if (xmlElem instanceof XmlElement) {
        	assertFalse(checkValue(xmlElem.getAttribute("test3")).equals("add attribute"));
        }

    }
	
    @Test
    public void testAddAttribute_4() {
        xmlElem = xmlElem.clone();
        xmlElem.addAttribute("test", "add attribute");
        xmlElem.addAttribute("test", "add attribute2");
        assertFalse(checkValue(xmlElem.getAttribute("test")).equals("add attribute2"));
        
        /**
        * Test for {@link XmlElement#addAttribute(String, String)}.
        */
        if (xmlElem instanceof XmlElement) {
        	assertTrue(checkValue(xmlElem.getAttribute("test3")).equals("add attribute2"));
        }

    }

	/** Test class for {@link Vector} */
    public static class VectorTest {
        /** Vector class. */
        Vector v;

        /** Constructor. */
        VectorTest (Vector v) {
            this.v = v;
        }
        
        VectorTest (String data) { this( new Vector(data)); }
        VectorTest () { this( new Vector("data") ); }

        Vector getVector() { return v; }

        Vector testElement(Vector data) { return v.clone(); }

        Vector testElement(String data) { return v.clone(); }

        Vector testElement(int data) { return v.clone(); }
        Vector testElement(Object data) { return v.clone(); }
    }

	/** Test class for {@link Vector} */
    public static class XmlVectorTest {
        /** XmlElement object. */
        XmlElement xmlElem;

        /** Constructor. */
        XmlVectorTest (XmlElement xmlElem) { this.xmlElem = xmlElem; }
        XmlVectorTest (String data) { this.xmlElem = xmlElem.clone(); this.xmlElem.getElement(); }
        XmlVectorTest () { this.xmlElem = xmlElem; }

        Vector getVector() { return xmlElem.getElement();  }

        Vector testElement(String data) { return xmlElem.getElement(); }
        
 		Vector testElement(Vector data) { return xmlElem.getElement(); }

		Vector testElement(XmlElement xmlElem) { return xmlElem.getElement(); }

		Vector testElement(int data) { return xmlElem.getElement(); }
		Vector testElement(Object data) { return xmlElem.getElement(); }
    }

	/** Test class for {@link Vector} */
    public static class XmlElementVectorTest {
        /** XmlElement object. */
        XmlElement xmlElem;
		/** Vector object; {@link XmlElement}, {@link XmlElementVector}, or {@link Vector} */
        Vector<XmlElement> v;

        /** Constructor. */
        XmlElementVectorTest(XmlElement xmlElem, Vector v) {
            this.xmlElem = xmlElem;
            this.v = v;
        }

        XmlElementVectorTest(String data) {
            this.xmlElem = xmlElem.clone();
            this.v = xmlElem.createVector();
        }
        
        XmlElementVectorTest () { this( xmlElem ); }

        XmlElementVectorTest (String data) {
            this.xmlElem = xmlElem.clone();
            this.v = xmlElem.createVector();
        }
}
}