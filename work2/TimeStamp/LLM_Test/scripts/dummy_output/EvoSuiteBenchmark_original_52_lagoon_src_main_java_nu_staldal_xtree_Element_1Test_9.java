// Element_1Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains one unit test case for the {@link Element#numberOfAttributes()} method.
*/
class Element_1Test {
		/**
    * Test of numberOfAttributes method, of class Element.
    */
    @Test
    public void testNumberOfAttributes() {
		Element el = new Element();
        String xml = "<element><attribute></attribute></element>";
        AttributesImpl atts = new AttributesImpl();
        assertEquals(0,el.numberOfAttributes() );
        el.addAttributes(atts);
        assertEquals(1,el.numberOfAttributes());
    }
    
        /**
    * Test of addAttribute method, of class Element.
    */
    @Test
    public void testAddAttribute() {
        URL url = ElementTest_1Test.class.getResource("element.xml");
		String document = "";
        try {
            SAXParser sp = SAXParserFactory.newInstance().newSAXParser();
            SParser sp2 = SparseDocumentBuilderFactory.newInstance().newSParser(url, spf);
            Document d = new TextDocument(document);
            d.load(url);
            Element el = (Element)el.addAttribute("", "", "", d.getRootElement());
        } catch (Exception e) {
            fail(e.getMessage());
        }
        assertEquals((Attributes)atts.cloneContents(),atts);
    }
    
        /**
    * Test of getAttributes method, of class Element.
    */
    @Test
    public void testGetAttributes() {
        Node node = new Element();
		Vector vAttrs = new Vector();
		Vector xml = this.getNamedChildNames(node);
        for (int i = 0; i < xml.size(); i++) {
        Node n = (Node)xml.get(i);
        String name = (String)n.getName();
        String value = (String)n.getValue();
        vAttrs.addElement(new AttributesImpl().addAttribute(name, value, name, value, value));
        }
        
        for (int i = 0; i < vAttrs.size(); i++) {
        String a = (String)vAttrs.get(i);
        assertEquals(xml.get(i).getName(), a);
        String b = ((Element)node.getChildAt(i)).getName();
        assertEquals(xml.get(i), b);
        String c = ((Element)node.getChildAt(i)).getValue();
        assertEquals(xml.get(i), c);
        String d = ((Element)node.getChildAt(i)).getTextContent();
        assertEquals(xml.get(i), d);
        String e = ((Element)node.getChildAt(i)).getSource();
        assertEquals(xml.get(i), e);
        }
    }
    
        /**
    * Test of getFirstChild method, of class Element.
    */
    @Test
    public void testGetFirstChild() {
        Node node = new Element();
        Node child = new Element.Child_1Test();
        Node child2 = new Element.Child_2Test();
        node.addChild(child);
        node.addChild(child2);
        assertEquals(0, node.getFirstChild().getName().compareTo(""));
        child.addChild(child2);
        child2.addChild(child);
        assertEquals(1, node.getFirstChild().getName().compareTo(""));
    }
    
        /**
    * Test of getNamedChildName method, of class Element.
    */
    @Test
    public void testGetNamedChildName() {
        Vector xml = new Vector();
    String name;
        assertEquals("Name", 0, ((Element)new Element("", "Name", "", xml)).getNamedChildName(0).compareTo(""));
    name = "Name";
        assertEquals("Name", 0, ((Element)new Element("", name, "", xml)).getNamedChildName(0).compareTo(name));

    }

    /**
    * Test of setChildElementName method, of class Element.
    */
    @Test
    public void testSetChildElementName() {
        Element el = new Element();
        Node child1 = new Element.Child_1Test();
        Vector childNames;
        assertEquals("Name", 0, ((Element)child1.getChildAt(0)).getChildName().compareTo(""));
    String name;
        childNames = new Vector();
        name = "Name";
        childNames.addElement(name);
        ((Element)el.getChildAt(0)).setChildElementName(0, childNames.get(0));
        assertEquals("Name", 0, ((Element)child1.getChildAt(0)).getChildName().compareTo(name));
    name = "OtherName";
        childNames = new Vector();
        childNames.addElement(name);
        el.setChildElementName(0, childNames.get(0));
        assertEquals("OtherName", 0, ((Element)child1.getChildAt(0)).getChildName().compareTo(name));

    }
    
    /**
    * Test of addChild method, of class Element.
    */
    @Test
    public void testAddChild() {
        Element el = new Element();
        Node child = new Element.Child_1Test();
        el.addChild(child);
        assertEquals(5, el.getNumChildren());
    }
    
    /**
    * Test of removeChild method, of class Element.
    */
    @Test
    public void testRemoveChild() {
        Element el = new Element();
        Node child = new Element.Child_1Test();
        el.addChild(child);
        assertEquals(5, el.getNumChildren());
        el.removeChild(child);
        assertEquals(4, el.getNumChildren());
    }
    
// Element_2Test.java
}