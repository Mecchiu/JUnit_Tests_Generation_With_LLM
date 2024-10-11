// Element_2Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains one unit test case for the {@link Element#getAttributeNamespaceURI(int)} method.
*/
class Element_2Test {

    public Element_2Test() throws Exception {
        super(false);
    }
    
    public static void main(String[] args) throws Exception {
        junit.swingui.TestRunner.run(Element_2Test.class);
    }
    
    /**
     * The element in HTML that should be parsed as XML without any namespace.
     */
    @Test
    public void testElement_getAttributeNamespaceFromNil() throws Exception {
        Element el = new Element();
        el.setDoc(null);
        
        assertEquals("XML namespace", xsNamespace);
        
		Vector v;
		v = null;
        el.setNSContext(v);
        
        AttributesImpl attr = new AttributesImpl();
        el.getAttributeNamespace(0);
        
        assertNull("XML namespace should be null", v);
        
    }

    /**
     * The element in HTML that should be parsed as XML, with non-default namespace.
     * This XML namespace should not be set.
     */
    @Test
    public void testElement_getAttributeNamespaceWithDefaultNamespace() throws Exception {
        Element el = new Element();
        el.setDoc(null);
        
        AttributesImpl attr = new AttributesImpl();
        el.getAttributeNamespace(0);
        
        assertTrue("XML namespace should be used",!attr.isEmpty());
    }
}

// Element_3Test.java
