// Element_6Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains one unit test case for the {@link Element#numberOfNamespaceMappings()} method.
*/
class Element_6Test {
		
    	// Attributes of the element
    	private AttributesImpl attrs  = new AttributesImpl();

    	/**
    	* Test method for {@link nu.staldal.xtree.Element#Element(java.lang.String)}.
    	*/
    	@Test
    	public void testElement() throws Exception {
    		
        	Document doc = new Document();
        	Element node = new Element("nodeID", new HashMap(), doc);
        	
        	Vector nsList = node.getNamespaces();
        	assertEquals(2, nsList.size());
        	assertTrue(nsList.contains("xmlns"));
        	assertTrue(nsList.contains("xml"));
    	}
    	
    	/**
    	* Test method for {@link nu.staldal.xtree.Element#Element(java.lang.String, java.util.Vector)}.
    	* @throws Exception
    	*/
    	@Test
    	public void testElement_2() throws Exception {
    		
        	Document doc = new Document();
        	Element childNode = new Element("childNodeID", new HashMap(), doc);

        	Vector nsList = childNode.getNamespaces();
        	assertEquals(2, nsList.size());
        	assertTrue(nsList.contains("xmlns"));
        	assertTrue(nsList.contains("xml"));
    	}
    	
    	/**
    	* Test method for {@link nu.staldal.xtree.Element#Attribute(java.lang.String, java.lang.String)}. 
    	*/
    	public void testAttributeStringString() throws Exception {
    		
        	Document doc = new Document();
        	Element e = new Element("e1", new HashMap(), doc);
        	e.add(new Attribute("name", "value"));
        	
        	Vector namespaces = e.getNamespaces();

        	// Vector namespaces
        	assertEquals("namespaces", 2, namespaces.size());
        	assertTrue(namespaces.containsKey("xmlns"));
        	assertTrue(namespaces.containsKey("xml"));
    	}
    	
    	/**
    	* Test method for {@link nu.staldal.xtree.Element#Attribute(java.lang.String, java.lang.String)}.
    	* @throws Exception
    	*/
    	public void testAttributeAttribute() throws Exception {
    		
        	Document doc = new Document();
        	Element e = new Element("e1", 
				new HashMap(), 
				doc);
        	e.setNamespaceMappings();
        	e.add(new Attribute("xmlns", "xmlns"));

        	// Vector namespaces
        	assertEquals("namespaces", 2, namespaces.size());
        	assertTrue(namespaces.containsKey("xmlns"));
        	assertTrue(namespaces.containsKey("xml"));
    	}
    }