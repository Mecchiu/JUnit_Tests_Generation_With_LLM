// XmlElement_1Test.java
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
* It contains one unit test case for the {@link XmlElement#getElement(String)} method.
*/
class XmlElement_1Test {
		/**
		 * Unit test for <code>getElement(String)</code>
		 */
    @Test
    public void testGetElement() {
        String path = "test";
        XmlElement element = new XmlElement(path);
        assertTrue(element.getElement("test")!= null);
    }

    /**
     * Unit test for <code>notifyObservers()</code>
     */
    @Test
    public void testNotifyObservers() {
        String path = "test";
        XmlElement element = new XmlElement(path);
        element.setChanged();
        assertEquals(2, element.getNumObservers());
        assertEquals("test", element.getChanged().getProperty(0).getValue());
        assertTrue("Observers should be notified.",
                    element.notifyObservers());
        assertFalse(element.containsNodesThatHaveChanged());
    }

    /**
     * Unit test for <code>containsNodesThatHaveChanged()</code>
     */
    @Test
    public void testContainsNodesThatHaveChanged() {
        String path = "test";
        XmlElement element = new XmlElement(path);
        element.addObserver(new Observer());
        element.setChanged();
        assertFalse(element.containsNodesThatHaveChanged());
        assertTrue(element.containsNodesThatHaveChanged());
        element.setChanged();
        assertTrue(element.containsNodesThatHaveChanged());
        element.resetChanged();
        assertFalse(element.containsNodesThatHaveChanged());
    }

    /**
     * Unit test for <code>getNodesThatHaveChanged()</code>
     */
    @Test
    public void testGetNodesThatHaveChanged() {
        String path = "test";
        XmlElement element = new XmlElement(path);
        element.addObserver(new Observer());
        element.setChanged();
        assertFalse(element.getNodesThatHaveChanged());
        element.setChanged();
        assertTrue(element.getNodesThatHaveChanged());
        element.resetChanged();
        element.setChanged();
        assertTrue(element.getNodesThatHaveChanged());
    }

    /**
     * Unit test for <code>getAllChildren()</code>
     */
    @Test
    public void testGetAllChildren() {
        String path = "test";
        XmlElement element = new XmlElement(path);
        Enumeration enumeration = element.getAllChildren();
        while (enumeration.hasMoreElements()) {
            XmlElement child = (XmlElement) enumeration.nextElement();
            System.out.println(path + " -> " + child.getName());
        }
    }

    /**
     * Unit test for <code>appendChild()</code>
     */
    @Test
    public void testAppendChild() {
        Vector<String> names = new Vector<String>();
        names.add("test");
        names.add("tst");
        names.add("stx");
        names.add("testx");
        XmlElement element = new XmlElement("test");
        try {
            element.appendChild(names, "tst");
            assertEquals(1, names.size());
            assertEquals("test", names.elementAt(0));
        } finally {
            names.setSize(0);
        }
    }

    /**
     * Unit test for <code>extractNodes()</code>
     */
    @Test
    public void testExtractNodes() {
        Vector<String> names = new Vector<String>();
        names.add("test");
        names.add("tst");
        names.add("stx");
        names.add("testx");
        names.add("tst2");
        names.add("stx2");
        names.add("");
        XmlElement element = new XmlElement("test");
        List<XmlElement> elements = element.extractNodes("test");
        assertEquals(2, elements.size());
        assertEquals(names.toString(), elements.get(0).getName());
        assertEquals(names.toString(), elements.get(1).getName());
        Element value = elements.get(0).getElementAt(0);
        assertEquals(names.toString(), value.getValue());

        Element child1 = elements.get(0).getElementAt(0);
        Element child2 = elements.get(1).getElementAt(0);
        assertEquals(names.toString(), child1.getValue());
        assertEquals(names.toString(), child2.getValue());
    }

    /**
         * Unit test for <code>extractElements()</code>
         */
    @Test
    public void testExtractElements() {
        Vector<XmlElement> names = new Vector<XmlElement>();
        names.add("test");
        names.add("tst");
        names.add("stx");
        names.add("testx");
        names.add("tst2");
        names.add("stx2");
        names.add("");
        names.add("test2");
        names.add("tst3");
        names.add("stx3");

        XmlElement element = new XmlElement("test");
        List<XmlElement> elements = element.extractElements("test2");
        assertEquals(2, elements.size());
        List<XmlElement> elements2 = element.getAllElements("test");
        assertEquals(2, elements.size());
        assertTrue("names.size()", names.size() == elements2.size());
        Iterator<XmlElement> iteratorElement = elements2.iterator();
}
}