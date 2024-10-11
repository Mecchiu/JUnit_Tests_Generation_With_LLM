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
		
	/**
	 * A test case for {@link Element#numberOfNamespaceMappings()}.
	 * @jvms 5/16/16 11:22:59 CET 11 Feb 2011
	 */
	@Test
    public void testNumberOfNamespaceMappings_calls()
    {   
        assertEquals(1, Element.numberOfNamespaceMappings());  
    }

	/**
	 * A test case for {@link Element#namespaceMapping(String)}.
	 * @jvms 4/15/16 11:26:27 CET 11 Mar 2011
	 */
	@Test
    public void testNamespaceMapping_calls()
    {   
        Element e = new Element("c");   
        assertEquals("c", e.namespaceMapping("c"));  
        assertNull(e.namespaceMapping(null));  
    }

	/**
	 * A test case for {@link Element#namespaceMapping(String)}.
	 * @jjvms 10/13/16 11:13:58 CET 11 Jan 2011
	 */
	@Test
    public void testEmptyNameSpaceMapping_calls()
    {   
        Element e = new Element("c");   
        e.namespaceMapping(null);  
        assertNull(e.namespaceMapping(null));  
    }

	/**
	 * A test case for {@link Element#childNodes()} and children.
	 */
	@Test
    public void testChildNodes_2() throws SAXException, ParserConfigurationException {    
            
        Element e = new Element("c");   
        Vector<Attibute> attributes = new Vector<Attibute>();    
        e.getAttributes(attributes);   
        e.append(e.childNodes()[0]);  
        Vector<Node> n = e.children();   
        assertTrue(e.name().equals("c"));  
        
        AttributesImpl a = new AttributesImpl();  
        a.addAttribute("", "", "c");  
        e.setAttributes(a);  
        e.append(e.childNodes()[0]);  
        List<Node> c = e.children();  
        assertEquals(1, c.size());  
        a         =  c.get(0).getAttributes();  
        assertNull(a.getNamedItem(""));  
        assertEquals(2, a.getLength());  
        
    }
	/**
	 * A test case for {@link Element#childNodes()} and children.
	 */
	@Test
    public void testChildNodes_3() throws SAXException, ParserConfigurationException {    
            
        Element e = new Element("c");   
        Vector<Attibute> attributes = new Vector<Attibute>();    
        e.getAttributes(attributes);   
        e.append(e.childNodes()[0]);  
        Vector<Node> n = e.children();   
        assertTrue(e.name().equals("c"));  
        
        AttributesImpl a = new AttributesImpl();  
        a.addAttribute("", "", "c");  
        e.setAttributes(a);  
        e.append(e.childNodes()[0]);  
        List<Node> c = e.children();  
        assertEquals(1, c.size());  
        a         =  c.get(0).getAttributes();  
        assertNull(a.getNamedItem(""));  
        assertEquals(2, a.getLength());  
    }
	/**
	 * A test case for {@link Element#childNodes()} and children.
	 */
	@Test
    public void testChildNodes_4() throws SAXException, ParserConfigurationException {    
            
        Element e = new Element("c");   
        Vector<Attibute> attributes = new Vector<Attibute>();    
        e.getAttributes(attributes);   
        e.append(e.childNodes()[0]);  
        Vector<Node> n = e.children();   
        assertTrue(e.name().equals("c"));  
        
        AttributesImpl a = new AttributesImpl();  
        a.addAttribute("", "", "c");  
        e.setAttributes(a);  
        e.append(e.childNodes()[0]);  
        List<Node> c = e.children();  
        assertEquals(1, c.size());  
        e         =  c.get(0).getAttributes();  
        assertNull(e.getAttributes());  
        assertEquals(2, e.getLength());  
    }
    
    /**
     * Test whether we accept an empty string names which are used for a namespace mapping.
     */
    @Test 
    public void testChildNodes_5() throws SAXException, ParserConfigurationException {        
        HashMap<String,String> namespaces = new HashMap<String, String>();
        namespaces.put("", "http://www.xml.org/test"       );
        namespaces.put("c", "http://www.xml.org/test");       
        
        Element e = new Element("C");   
        Vector<Attibute> attributes = new Vector<Attibute>();    
        e.getAttributes(attributes);   
        a = new AttributesImpl();  
        e.setAttributes(a);  
        e.append(e);        


	assertTrue(e.childNodes().length > 0);
	Vector<Node> c = e.children();  
	assertEquals(1, c.size());  
	e         =  c.get(0).getAttributes();  
	c   =  e.getAttributes();  
	Assert.assertEquals("\"c\"",  e.getAttributes().getNamedItem("").getNodeValue().trim());   

	assertEquals("\"http://www.xml.org/test\"",  namespaces.get("c"));   
        

    }
	/**
	 * Test whether the namespace mapping of an element matches the expected value. 
	 */
	@Test  
    public void testNamespaceMapping_11() throws ParserConfigurationException, SAXException {   
            
        HashMap<String,String> attrs = new HashMap<String, String>();
        attrs.put("", "http://www.xml.org/test");   
        attrs.put("xml", "http://xml.org/sax/properties/xml-notation");   
        attrs.put("xmlns:y", "http://xml.org/sax/properties/xml-namespace-uri");   
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();   
        dbf.setNamespaceAware(true);   
        Document doc = dbf.newDocumentBuilder().newDocument();   
        Element e = new Element(new QName("C", null, null));   
        e.setAttributes(attrs);   
        
        AttributesImpl a = new AttributesImpl();   
        e.setAttributes(a);    
        e.append(e.childNodes()[0]);   
        assertEquals(1, e.childNodes().length);
        e             =  e.childNodes()[0];   
        a             =  e.getAttributes();   
        assertEquals(3, a.getLength());  
}
}