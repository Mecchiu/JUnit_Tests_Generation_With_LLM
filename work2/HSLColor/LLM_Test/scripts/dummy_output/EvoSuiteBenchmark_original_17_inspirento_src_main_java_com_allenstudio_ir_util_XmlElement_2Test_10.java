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
     * Test the {@link XmlElement#addSubElement(String) addSubElement(String)} method.
     * The name should be empty since it is an Element-within-A-Element,
     * and no name attribute.
     */
    @Test
    public void shouldAddSubElementWithEmptyName() {
		
        String pathToItem = new XmlElement(null,null).addSubElement(null);
        assertEquals("element was added and the path has been changed and the attribute was updated correctly",null,pathToItem);
    }
    
    /**
     * Test the {@link XmlElement#addSubElement(String) addSubElement(String)} method.
     * The name should be empty since it is an Element-within-A-Element,
     * and no name attribute.
     * 
     * @throws Exception if it cannot be added
     */
    @Test(expected=IllegalArgumentException.class)
    public void shouldThrowNoNameExceptionWhenNameIsNull() throws Exception {
        String path=new XmlElement(new XmlElement_2TestClass(),new Hashtable().clear()).addSubElement(null);
    }

    /**
     * Test the {@link XmlElement#addSubElement(String) addSubElement(String)} method.
     * The path should give the same value as the path of the
     * contained element.
     * 
     * @throws Exception if it cannot be added
     */
    @Test(expected=IllegalArgumentException.class)
    public void shouldThrowErrorWhenPathBelongsToAlreadyHasPathOfSameElement() throws Exception {
        String path=new XmlElement(new XmlElement_2TestClass(),new Hashtable()).addSubElement(new XmlElement_2TestClass_2());
    }
    
    /**
     * Test the {@link XmlElement#addSubElement(String) addSubElement(String)} method.
     * If the Element has not been added using {@link XmlElement#addSubElement(String)}, false is returned.
     * The returned value must also hold the path of an element which
     * is an Element-within-A-Element, regardless of whether it is actually contained inside.
     *
     * @throws Exception if it cannot be added
     */
    @Test
    public void shouldNotAddSubElementIfAlreadyInside() throws Exception {
}
}