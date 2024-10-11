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
		
    @Test
	public final void testXmlElement__attributesAreAdded() {
        //@formatter:off
        XmlElement element = new XmlElement("<xml>");
        xmlElement = new XmlElement("<xml><value1>hello</value1>");
        element.addAttribute(new XmlElement_0().addAttribute("value1", "hello"));
        assertNull(xmlElement.getAttribute("value1"));
        //@formatter:on

        XmlElement_0 other = new XmlElement(xmlElement, null, new Hashtable<String, String>());
        xmlElement.setValue(other);
        assertSame(xmlElement, xmlElement.getAttribute("value1"));
    }

    @Test
	public final void testXmlElement__attributesAreChanged() {
        //@formatter:off
        XmlElement element = new XmlElement("<xml>");
        xmlElement = new XmlElement("<xml><value1>hello</value1>");
        element.addAttribute(new XmlElement_0().addAttribute("value1", "world"));
		//@formatter:on

        // TODO Auto-generated method stub
    }

    @Test
	public final void testXmlElement__attributesAreRemoved() {
        //@formatter:off
        XmlElement element = new XmlElement("<xml>");
        xmlElement = new XmlElement("<xml><value1>world</value1></xml>");
        xmlElement.addAttribute(new XmlElement_0().addAttribute("value1", "world"));
        List<XmlElement_0> result = element.clearAttributes();
        assertEquals(0, result.size());
        //@formatter:on

    }

    @Test
	public final void testCopy() {
        //@formatter:off
        XmlElement element = new XmlElement("<xml>");
        xmlElement = new XmlElement("<xml><value1>world</value1></xml>");
        xmlElement = (XmlElement) xmlElement.clone();
        //@formatter:on

        assertNotSame(xmlElement.getValue(), xmlElement); //TODO: if not same return null
        Element result = xmlElement.getValue();
        //@formatter:off

        XmlElement_0 other = new XmlElement_0(xmlElement);
        other.addAttribute(new XmlElement_0().addAttribute("value1", "world"));
        //@formatter:on
        System.out.println("TEST: " + result.toString());
        xmlElement.setChanged();

        result = xmlElement.getValue();
        //@formatter:off

        assertNotSame(xmlElement, result); //TODO: if not same return null
        result = (XmlElement)((XmlElement)xmlElement).getValue();
        //@formatter:on

        XmlElement_0 other2 = new XmlElement_0(xmlElement);
        assertTrue(other2.isChanged());
        other2.setChanged(false);
        List<String> attributeNames = result.getAttributeNames();
        Vector<String> attributes = new Vector<String>();
        Hashtable<String, String> namesAndValues = new Hashtable<>();
        for(Enumeration<String> i = attributeNames; i.hasMoreElements(); ) {
            String att = i.nextElement();
            attributes.addElement(att);
            namesAndValues.put(att, i.nextElement());
            }
        //@formatter:off
        System.out.println(attributeNames);
        //@formatter:on

        //@formatter:off
        System.out.println(attributes);
        //@formatter:on

        assertNotSame(result, other2);
        xmlElement.setChanged();

        result2 = xmlElement.getValue();
        //@formatter:off
        System.out.println("TEST: " + result.toString());
        result2.setChanged();
        System.out.println("TEST: " + other2);
        other = (XmlElement_0)((XmlElement)xmlElement).clone(); //TODO: assertNotSame(other2);
        other.setValue(result);
        xmlElement.setChanged();
        result = xmlElement.getValue();
        //@formatter:off

        assertNotSame(result, other);
        if(other.getValue()!= null) {
            xmlElement.setValue(result);
            result = xmlElement.getValue();
            assertEquals(1, result.getAttributeNames().size());
        }
        xmlElement.setChanged();

        result = xmlElement.getValue();
    }

    @Test
	public void testSubtree() {
		//@formatter:off
        XmlElement m = new XmlElement("<xml>");
        XmlElement child = new XmlElement(m);
        XmlElement child2 = new XmlElement(m);
        child2.addAttribute(new XmlElement_0().addAttribute("xmlns", "http://example.com"));

        System.out.println("TEST: " + child.subtree().toString());
        System.out.println("TEST: " + child2.subtree().toString());
        //@formatter:on

        assertEquals(child, m);

        if(xmlElement.contains(child.subtree())) {
            assertEquals(child.subtree(), xmlElement.subtree());
            assertEquals(m, child.subtree());
        }

        System.out.println("TEST: " + xmlElement.subtree().toString());
        System.out.println("TEST: " + xmlElement.subtree().subtree().toString());
        //@formatter:off

        System.out.println("TEST: " + xmlElement.getValue().subtree().toString());
        System.out.println("TEST: " + xmlElement.getValue().subtree().subtree().toString());
        //@formatter:on
    }

    @Test
	public void testObservable() {
}
}