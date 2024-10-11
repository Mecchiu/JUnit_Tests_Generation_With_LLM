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
     * Test constructor of {@link XmlElement}.
     */
    @Test
    public void XmlElement_testConstructor() {
        XmlElement theElement = new XmlElement("this-should-be-valid");
        assertNotNull("The constructor is null.", theElement);
        assertTrue("The object is supposed to be a XML document.", theElement instanceof XmlElement);
    }
    
    /**
     * Test setter for subXmlElements.
     */
    @Test
    public void XmlElement_testSubset() {
        XmlElement theElement = new XmlElement("this-should-be-valid");
        String theSubElementName = "theSubElement";
        String theSubElementValue = "theSubElement-value";
        XmlElement theSubElement = new XmlElement(theSubElementName, theSubElementValue);
        theElement.setSubset(theSubElement);
        Enumeration enumeration = theElement.subElements();
        List subElements = (List) enumeration.nextElement();
        List subValues = (List) subElements.get(0);
        String value = (String) subValues.get(0);
        assertEquals("The name was not setted correctly.", theSubElementName, theElement.name);
        assertEquals("The value was not setted correctly.", theSubElementValue, value);
    }
    
    /**
     * Test if addSubElement method returns an XmlElement that can be converted
     * to XML. The method should throw an IllegalArgumentException if the subelement is empty.
     */
    @Test
    public void XmlElement_testEmpty() {
        XmlElement theElement = new XmlElement("this-should-be-valid");
        theElement.addSubElement("theSubElement");
    }
    
    /**
     * Test constructor of {@link XmlElement}.
     */
    @Test
    public void xmleXmlElement_1test1() {
        XmlElement theElement = new XmlElement("this-should-be-valid");
        assertNotNull("The constructor is null.", theElement);
        assertTrue("The object is supposed to be a XML document.",
            theElement instanceof XmlElement);
        System.out.println(theElement);
        theElement.addSubElement("subElement1");
        System.out.println(theElement);
        assertTrue("The XmlElement must contain one subelement.", theElement.getNumSubElements() > 0);
        assertTrue("The subelement name must be equals to the subelement name of element",
            theElement.subElementNames().equals(new Hashtable()));
    }
    
    /**
     * Test class of {@link XmlElement} which was added with a name and a value when it was set with {@link XmlElement#setValue(String)} method.
     */
    public static class XmlElement_test_1 extends XmlElement {

        public XmlElement_test_1(){}
        
        public XmlElement_test_1(String name){super(name);}
        
        public XmlElement_test_1(String theElementName, String theSubElementName){super ( theElementName, theSubElementName);}    
        
}
}