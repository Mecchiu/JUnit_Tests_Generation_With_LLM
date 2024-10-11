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
     * Test add attribute method.
     *
     * @throws Exception the exception
     */
     @Test
    public void testAddAttribute() throws Exception {
        XmlElement_0Test testcase = new XmlElement_0Test();
        XmlElement element = new XmlElement("element", null);

        List<Object> attributes = new Vector<Object>();
        attributes.add(new MyAttribute("value1", "valuea"));
        attributes.add(new MyAttribute("value2", "valueb"));
        attributes.add(new MyAttribute("value3", "valuec"));
        element.addAttribute(MyXml.ATTRIBUTE_NAME, "value1");
        element.addAttribute(MyXml.ATTRIBUTE_NAME, "value2");
        element.addAttribute(MyXml.ATTRIBUTE_NAME, "value3");
        assertTrue(element.addAttribute("value4", "valueb"));
        assertTrue(element.addAttribute("value4", "valuec"));
        assertFalse(element.addAttribute("value5", "valued"));
        assertFalse(element.indexOf("value6")!= -1);
        assertFalse(element.removeAttribute("value6"));
        assertTrue(element.hasAttribute("value6"));
        assertTrue(element.hasAttribute("value_2"));
        assertFalse(element.hasAttribute("wrongname"));
        
        attributes = new Vector<Object>();
        attributes.add(new MyAttribute("value2", "valuec"));
        attributes.add(new MyAttribute("element", "child"));
        attributes.add(new MyAttribute("other", "value"));
        attributes.add(new MyAttribute("value2", "valuec3"));
        assertTrue(element.removeAttribute("value2"));
        assertTrue(element.hasAttribute("value2"));
        assertTrue(element.hasAttribute("value_2"));
        assertFalse(element.hasAttribute("value_3"));
        assertEquals(3, element.getAttribute("other").size());
        assertFalse(element.hasAttribute("wrongname"));

        Vector<Object> elementContents = new Vector<Object>();
        elementContents.add(new MyChildElement(new MyChildElement("child", "parent"), "child1"));
        elementContents.add("Value1");
        elementContents.add("Value2");
        elementContents.add(new MyChildElement(new MyChildElement("child", "parent"), "child2"));
        elementContents.add("Value3");
        elementContents.add(new MyChildElement(new MyChildElement("child", "parent"), "child3"));
        elementContents.add("Value4");
        elementContents.add(new MyChildElement(new MyChildElement("child", "wrongparent"), "child4"));
        assertTrue(element.setAttribute("value2", "value3"));
        assertTrue(element.hasAttribute("value2"));
        assertTrue(element.hasAttribute("value_1"));
        elementContents.set(0, elementContents.get(0));
        assertEquals(3, elementContents.size());
    }

    /**
     * Test to create an XML element from a list of XML elements in the same element.
     *
     * @param elementElements a list of XML elements
     * @return an XML element
     */
    public static XmlElement createElementFromList(final List<XmlElement> elementElements) {
        XmlElement anInstance = new XmlElement("foo", null);
        for (XmlElement element : elementElements) {
            anInstance.addAttribute("property", element.getAttribute(MyXml.ATTRIBUTE_NAME));
        }
        return anInstance;
    }

    /** A class for testing XmlElement.prototype.getAttribute. */
    public static class MyChildElement extends XmlElement {
        public Vector<String> attributeValuesVector;
        public Vector<XmlElement> childElementsVector;
        public Vector<XmlElement> parentElementsVector;
        public Vector<XmlElement> otherElementsVector;

        /**
         * The constructor.
         *
         * @param attributeName a name of the attribute
         * @param attributeValue a value of the attribute
         * @see XmlElement#AttributeObject
         */
        public MyChildElement(String attributeName, String attributeValue) {
            addAttribute(attributeName, attributeValue);
        }

        /**
         * The constructor.
         *
         * @param attributeName a name of the attribute
         * @param attributeValue a value of the attribute
         * @param childElements a Vector where the element of that name is a child of this node
         * @see XmlElement#AttributeObject
         */
        public MyChildElement(String attributeName, String attributeValue, Vector<XmlElement> childElements) {
            addAttribute(attributeName, attributeValue);
            this.parentElementsVector = childElements;
        }

        /*
         * The constructor.
         *
         * @param attributeName a name of the attribute
         * @param attributeValue a value of the attribute
         * @param childElements a vector where the element of that name is a child of this node
         * @param childElementsVector a Vector where the elements of that name are children of this node
         * @see XmlElement#AttributeObject
         */
        public MyChildElement(String attributeName, String attributeValue, Vector<XmlElement> childElements, Vector<XmlElement> childElementsVector) {
            addAttribute(attributeName, attributeValue);
            this.childElementsVector = childElementsVector;
            this.parentElementsVector = childElementsVector;
        }

        /*
         * The setAttribute method.
         *
         * @param attributeName a name of the attribute
         * @param attributeValue a value of the attribute
         * @see XmlElement#setAttributeObject
         */
        public void setAttribute(String attributeName, String attributeValue) {
            addAttribute(attributeName, attributeValue);
        }

}
}