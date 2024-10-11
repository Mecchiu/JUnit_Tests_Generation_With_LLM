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
// XmlElement.java
package com.allenstudio.ir.util;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.Vector;

/**
 * The XmlElement is a generic containment class for elements within an XML
 * file.
 * <p>
 *
 * It extends Observable which should be used for gui elements which are
 * interested in configuration changes.
 * <p>
 *
 * Show interested in:
 *
 * <pre>
 * xmlElement.addObserver(yourObserver);
 * </pre>
 *
 * <p>
 * When making bigger changes on XmlElement and probably its subnodes and/or a
 * greater number of attributes at once, you should just change XmlElement
 * directly and manually notify the Observers by calling:
 * <p>
 *
 * <pre>
 * xmlElement.setChanged();
 * xmlElement.notifyObservers();
 * </pre>
 *
 * <p>
 * There a good introduction for the Observable/Observer pattern in
 * Model/View/Controller based applications at www.javaworld.com: -
 * {@link http://www.javaworld.com/javaworld/jw-10-1996/jw-10-howto.html}
 *
 * @author fdietz
 */
public class XmlElement extends Observable implements Cloneable {

    public Object addAttribute(String name, String value) {
        if ((value!= null) && (name!= null)) {
            Object returnValue = attributes.put(name, value);
            return returnValue;
        }
        return null;
    }
}

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
		
    @java.lang.SuppressWarnings("all")
    private static final org.junit.jupiter.api.Assertions ON =  //
            new org.junit.jupiter.api.Assertions();
	
    @Test
    public void addAttribute()
        throws Exception
    {
        // TODO write a test that will check for an uninitialized element
        // in a case other than an Attribute has been added to the
        // Observable (probably the same Attribute).
        // TODO write a test that will create multiple new
        // Attributers (but only one)
    }

    /**
    * Test method for {@link com.allen.xml.XmlElement#createXml()}.
    * Check that an XML document can be created and loaded correctly.
    */
    @Test
    public void getXml() throws Exception
    {
/*
        // TODO write a test that will create and load a new
        // Document.
*/
        System.out.println("Test Document: " +
            this.getXml("XmlDocument"));
    }

    /**
    * Test method for {@link com.allen.xml.XmlElement#createXmlFragments()}.
    * Check that an XML document can be created and loaded correctly.
    */
    @Test
    public void getXmlFragments() throws Exception
    {
        System.out.println("Testing an XML fragment: " + this.getXml("XML fragment"));
    }

    @Test
    public void testGetAttribute()
        throws Exception { /*
        try {
            XmlElement xmlElement = XML.newXmlElement("XmlElement");
            assertNotNull(xmlElement);
        }
        catch (XmlCreationException ex
/*
            ex.addAction("foo")
        */
        ;
    }

}

