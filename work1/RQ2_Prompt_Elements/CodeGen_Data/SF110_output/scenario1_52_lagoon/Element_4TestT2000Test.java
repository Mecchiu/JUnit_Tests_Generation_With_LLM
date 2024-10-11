// Element_4Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains one unit test case for the {@link Element#getAttributeType(int)} method.
*/
class Element_4Test {

    // @Test void testConstructor()
    @Test 
    public void testConstructor() throws Exception {
        System.out.println("testConstructor");
        new Element((String) null);
        assertEquals(null, elemType);
        
        /*
        * Constructor that takes attributes 
        */
        Object result = new Element((String) null, true);
        assertEquals(null, result);
        
        // @Test void testGetAttributeString()
        System.out.println("testGetAttributeString");
        elemType = new URL("http://www.w3.org/2005/Atom");
        String attributeType = "text/html";
        
        Element result2 = new Element(attributeType, true);
        assertEquals(elemType, result2.getAttributeType(1));
        assertEquals(String.class, result2.getAttributeType(2));    
    }

    // testGetAttribute
    @SuppressWarnings("unchecked")
    @Test 
    public void testGetAttribute() throws SaxException {
        System.out.println("testGetAttribute");
        String attributeType = "text/html#myid";
        
        System.out.println("[elemGetAttribute] return a value of");
        Element result = new Element(attributeType);
        
        List children = result.children();
        assertSame(attributeType, children.getType());
        assertEquals(2, children.size());
        
        assertEquals("text/html", children.get(0).getAttributeType());
        AttributesImpl resultAttrs = new AttributesImpl((Vector) children.get(0));    
        assertEquals("myid", resultAttrs.getValue("X-Atom-Id"));
        
        assertEquals("text/html#myid", result.getAttributeType(((Integer) children.get(0)).intValue()));
        
        children = result.children();
        assertSame(attributeType, children.getType());
        assertEquals(2, children.size());
        
        assertEquals("text/html", children.get(0).getAttributeType());
        resultAttrs = new AttributesImpl((Vector) children.get(1));    
        assertEquals("myid", resultAttrs.getValue("X-Atom-Id"));
        
        System.out.println("return value: " + result);
        
    }

}