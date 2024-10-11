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
		/**
		* test addXmlElement
		*
		*/
    @Test
    void test_addXmlElement() {
    	//test adding XmlElement
        XmlElement e = new XmlElement();
        assertNotNull(e);

		//assertThat(e.getData(), anyOf(
            //		Equals::open,
	        //		Matches::contains,
	        //		Equals::valueOf(">")
    	//));

        // test adding Attribute
        Object attribute = new Attribute("abc", "def");
        e.addAttribute("abc", "def");
        assertSame(attribute, e.getAttribute("abc"));

        e.setData("<foo>bar</foo>");
        System.out.print(e.toString());
        e.toString();

        // test overriding Attribute
        List<Object> list = new Vector<Object>();
        list.add("one");
        list.add("two");
        e.addAttribute("abc", "def");

        System.out.print(
            "The current configuration:\n->" +
            "  <foo>bar</foo>\n->" +
            "->" +
            "  <foo>one</foo>\n->" +
            "<f:abc>def</f:abc>\n->" +
            "<f:abc:def>abc</f:abc:def>\n->"
        );
        System.out.print(e.toString());
        System.out.print(list.toString());

        e = new XmlElement("foo", "bar");
        Iterator<Attribute> it = e.getAttributes();
        Attribute a1 = it.next();
        assertNotNull(a1);
        assertEquals("foo", a1.getKey());
        assertEquals("abc", a1.getValue());
        Attribute a2 = it.next();
        assertNull(a2);

        a1.getValue().toString();
        e.setData("<f:abc>def</f:abc>");
        System.out.println();
        System.out.print(e); // test XmlElement.toString
        System.out.print(list.toString());
        System.out.print(e.toString());

        System.out.println("");
        assertFalse(it.hasNext());
        System.out.println("");
    }

}