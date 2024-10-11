// Element_5Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains one unit test case for the {@link Element#getAttributeValue(int)} method.
*/
class Element_5Test {


    @Test
    public void test1() {
        // System.out.println("Test Element with attribute");
        Element element = new Element("Test");
        assertNotNull(element);
        assertNotSame("The returned element is not null.", element, Element.getInstance(element));
    }
    
    @Test
    public void testStringAttribute() throws Exception {
        String test = "Test";
        Element element = new Element(test);

        assertNotNull(element);
        assertEquals(test.toString(), element.getAttribute(test));
    }
    
}

