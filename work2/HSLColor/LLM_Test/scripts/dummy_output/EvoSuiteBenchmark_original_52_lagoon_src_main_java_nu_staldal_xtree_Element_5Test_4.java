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
		private XmlNode rootNode;
		private XmlNode child = null;
	
		@Test
    	public void testDefaultConstructor() throws Exception {
        rootNode = ElementFactory.createElement(new URL("http://www.foo").toExternalForm(), null);
        assertEquals(new URL("http://www.foo"), rootNode.getAttributeValue("name"));
    }

    
	@Test
    	public void testSetAttribute() throws Exception {
        assertNull(child.getAttributeValue("value"));
        child = ElementFactory.createElement(new URL("http://www.foo").toExternalForm(), "something_else");
        assertEquals("something_else", child.getAttributeValue("value"));
    }
	
    @Test
    public void testCreateChild() throws Exception {
        child = ElementFactory.createElement(new URL("http://www.foo").toExternalForm(), "test");
        assertEquals("test", child.getAttributeValue("value"));
        assertNotNull(child.getContent());
		
        Vector<XmlNode> nodes = child.getChildren();
		assertNotNull(nodes);
		assertTrue(nodes.size() == 1);
		ElementFactory.createElement(new URL("http://www.foo").toExternalForm(), "test2");
		assertEquals("test2", child.getAttributeValue("value"));
		assertNotNull(child.getContent());
		
        child = rootNode.createChild("test");
        assertEquals("test", child.getAttributeValue("value"));
//        assertEquals("test", child.lookupAttribute("value"));
		
		childrenUpdated();
		
		nodes = child.getChildren();
		assertNotNull(nodes);
		assertTrue(nodes.size() == 1);
		assertEquals("test2", child.getAttributeValue("value"));
		assertNotNull(child.getContent());
        
        child = rootNode.createChild("test");
        assertEquals("test", child.getAttributeValue("value"));
//        assertEquals("test", child.lookupAttribute("value"));
	}
	
	private void childrenUpdated() {
		rootNode.addChild("test3");
		rootNode.addChild("test1");
	}
	
	@Test
    public void testAddChild() throws Exception {
        Element child = rootNode.createChild("test1");
		assertNotNull(child);
//		assertEquals("test1", child.getAttributeValue("value"));
		childrenUpdated();
		
		Vector<XmlNode> nodes = child.getChildren();
		assertNotNull(nodes);
		assertTrue(nodes.size() == 2);
		assertEquals("test1", child.getAttributeValue("value"));
		assertNotNull(child.getContent());
		
		rootNode.addChild("test2");
		Vector<XmlNode> nodes2 = child.getChildren();
		assertNotNull(nodes2);
		assertTrue(nodes2.size() == 2);
		assertEquals("test2", child.getAttributeValue("value"));
		assertNotNull(child.getContent());
		
		rootNode.addChild("not_exist");
		nodes2 = child.getChildren();
		assertFalse(nodes.size() == 2);
		assertFalse("not_exist" + child + "is_exist(" + rootNode.getAttributeValue("name") + ")", nodes.contains(rootNode)? true : false);
		assertEquals("Test 2, but only one element found.", child.getAttributeValue("value"));
		assertNotNull(child.getContent());
	}

	@Test
    public void testRemoveChild() throws Exception {
        Element parent = ElementFactory.createElement(new URL("http://www.foo").toExternalForm(), null);
        Element child = ElementFactory.createElement(new URL("http://www.foo").toExternalForm(), "test");
        rootNode.addChild(child);
        
        Vector<XmlNode> nodes = child.getChildren();
        assertNotNull(nodes);
        assertTrue(nodes.size() == 1);
        rootNode.removeChild(child);
//        assertEquals("test2", child.getAttributeValue("value"));
        assertNull(rootNode.getAttributeValue("name"));
		
		child = rootNode.getChild(child.getName());
		assertNotNull(child);
		assertEquals("test1", child.getAttributeValue("value"));
		assertNull(child.getContent());
		
		parent.removeChild(child);
		child = rootNode.getChild(child.getName());
		assertNull(child);
		
		Vector<XmlNode> nodes2 = rootNode.getChildren(parent.getName());
		assertNotNull(nodes2);
		assertTrue(nodes2.size() == 0);
		
		child = rootNode.getChild(child.getName());
		assertNull(child);
	}

	@Test
    public void testReplaceChild() throws Exception {
        Vector<XmlNode> nodes = new Vector<XmlNode>();
        rootNode.addChild(ElementFactory.createElement(new URL("http://www.foo").toExternalForm(), "test"));
        nodes.add(rootNode.getChild(rootNode.getName()));
        rootNode.removeChild(rootNode.getChild(rootNode.getName()));
//        assertTrue(Element.isElement(rootNode.getChild(rootNode.getName()))? false : true);
//        Element parent = rootNode.getChild(Element.getElementName(rootNode, "test"));
//        parent.child = rootNode;
//        Element parentRoot = rootNode.child = parent;
//
//        assertTrue(parentRoot.isElement(Element.getElementName(parentRoot, "test"))? false : true);
//        
//        rootNode = null;
//        nodes.clear();
	}
	
	private boolean isElement(XmlNode node) {
		Vector<XmlNode> nodes = node.getChildren();
		
		assertNotNull(nodes);

        if(nodes.size() == 0) {
            return false;
            
        } else {
            Class<?> nodeClass = node.getAttributeValue("class").getClass();
            return true;
        }
		
		return true;
	}
	
	@Test
    public void testAddText() throws Exception {
        Vector<String> texts = new Vector<String>();
        rootNode.addText(new ElementValue("text", new URL("http://www.foo").toExternalForm()));
        rootNode.addText(new ElementValue("text2", new URL("http://www.bar").toExternalForm()));
        rootNode.addText(new ElementValue("text3", new URL("http://www.foobar.baz").toExternalForm()));
        rootNode.addText(new ElementValue("text4", new URL("http://www.baz").toExternalForm()));
        rootNode.addText(new ElementValue("test", new URL("http://www.bar").toExternalForm()));
}
}