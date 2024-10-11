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

    @Test
    public void testGetAttributeNamespaceURI_2() {
        Element rootNode = 
                new Element("element_test_1", 
                        false, 
                        Element.NAMESPACE, 
                        "http://www.w3.org/XML/1998/namespace");

        URI nameSpace = rootNode.getAttributeNamespace();
        assertEquals(nameSpace.toString(), 
                "http://www.w3.org/XML/1998/namespace", 
                "Element namespace URI");
        
        int index = rootNode.lookupAttributeIndex("namespaceURI");
        checkIndex(index, 0);
        
        nameSpace = rootNode.lookupChild(null);
        assertEquals(nameSpace.toString(), 
                "http://www.w3.org/1999/xhtml", 
                "Namespace URI");
        
        nameSpace = rootNode.lookupChild(null, null);
        assertEquals(nameSpace.toString(), 
                "", 
                "Attributem namespace URI");
    }

    @Test
    public void testLookupChild() {
        Element rootNode = 
                new Element("element_test_1", 
                        false, 
                        Element.NAMESPACE, 
                        "http://www.w3.org/XML/1998/namespace");

        int index = rootNode.lookupAttributeIndex("namespace");
        
        AttributeTest childWithNamespace = new AttributeTest("child_namespace");
        rootNode.addAttribute(index, childWithNamespace);
        checkAttribute(index++, childWithNamespace);
        
        int index2 = rootNode.lookupAttributeIndex("namespace");
        checkIndexBetween(index, index2, index2 - 1);
        
        int index2WithNamespace =
                rootNode.lookupAttributeIndex("namespace");
        checkIndex(index2WithNamespace, index2WithNamespace - 1);
    }



    public static class AttributeTest extends Attribute {
        String namespacedName;
        String _unassigned;
    }

    public int getAttributeIndex() {
    /*
    * This test is not so simple.  It verifies that 
    * 
    */
        int index = 1;
        int test = Element_2Test.this.lookupAttributeIndex("namespacedName");
        assertEquals(test++, index++);
        test = Element_2Test.this.lookupAttributeIndex("_unassigned");
        assertEquals(test++, index++);
    
        return index;
    }

    @Override
    public Attributes getAttributes() {
        AttributesImpl attributes = new AttributesImpl();
        attributes.addAttribute(new QName("", "namespacedName"), 
                new NMTOKEN(" "), 0);
        attributes.addAttribute(new QName("", "unassigned"), 
                new NMTOKEN(" "), 0);
        return attributes;
    }
}
