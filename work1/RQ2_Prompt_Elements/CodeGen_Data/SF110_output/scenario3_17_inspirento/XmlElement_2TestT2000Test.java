// XmlElement_2Test.java
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
* It contains one unit test case for the {@link XmlElement#addSubElement(String)} method.
*/
class XmlElement_2Test {

    /**
     * Tests the <code>addSubElement</code> method.
     */
	@Test
    public void test1() {
        XmlElement xmlElement;
        XmlElement xmlElement2 = XmlElement.addSubElement("Test");
        hashString("Test", xmlElement2);
        assertEquals("Test", xmlElement.getValue());
    }
    
    /**
     * Tests the <code>addSubElement</code> method.
     */
	@Test
    public void test2() {
        XmlElement xmlElement;
        Hashtable empty;
        Vector emptyVector;
        
        empty = new Hashtable();
        emptyVector = new Vector();
        
        // addElement tests
        xmlElement = XmlElement.addSubElement("Test", empty);
        assertNull(xmlElement);
        assertFalse(empty.containsKey("Test"));
        empty.put("Test", xmlElement);
        
        // addValues tests
        List list = XmlUtil.addValues(new XmlElement(empty));
        list = XmlUtil.addValues(list, emptyVector);
        list = XmlUtil.addValues(list, empty);
        list = XmlUtil.addValues(list, emptyVector);

        // test iterative addition
        xmlElement = XmlElement.addSubElement("Test", empty);
        assertNull(xmlElement);
        empty.put("Test", xmlElement);
        list = XmlUtil.addValues(list, emptyVector);
        list = XmlUtil.addValues(list, empty);
        list = XmlUtil.addValues(list, emptyVector);

        // test remove element
        assertTrue(XmlUtil.deleteFrom(list, "Test"));
        assertFalse(XmlUtil.deleteFrom(list, "Test".toCharArray()));
        assertNull(list);
        assertTrue(empty.containsKey("Test"));
        empty.put("Test", xmlElement2);
        list = XmlUtil.addValues(list, emptyVector);
        list = XmlUtil.addValues(list, empty);
        list = XmlUtil.addValues(list, emptyVector);


        // test remove values by path
        xmlElement = XmlElement.addSubElement("Test", empty);
        assertNull(xmlElement);
        empty.put("Test", xmlElement);
        list = XmlUtil.addValues(list, emptyVector);
        list = XmlUtil.addValues(list, empty);
        list = XmlUtil.addValues(list, emptyVector);

        // test remove values by path
        list = XmlUtil.addValues(list, empty);
        list = XmlUtil.addValues(list, emptyVector);
        list = XmlUtil.addValues(list, empty);

        assertSameValues(list);
	}
}
