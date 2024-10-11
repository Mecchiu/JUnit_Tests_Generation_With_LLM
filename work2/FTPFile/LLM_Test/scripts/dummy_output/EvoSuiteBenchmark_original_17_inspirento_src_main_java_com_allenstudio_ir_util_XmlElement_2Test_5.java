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
		private Vector<String> v;
		private Vector<String> childV;
	@Test
	public void testAddAndSubElements() {
        v = new Vector<String>();
        childV = new Vector<>();
        assertTrue("Element's path was not correctly set", v.equals(childV));
        v.add("element");
        assertNotEquals(v.size(), childV.size());

        v.add(childV);
        assertNotEquals(v.size(), childV.size());
        v.add("first");
        childV.remove("first");
        assertEquals(childV.size(), 0);
        assertEquals(v.size(), 1);
        assertEquals(v.get(0), "first");
        assertEquals(v.get(0), v.get(1));
        assertEquals(v.get(1), "element");
	}
}