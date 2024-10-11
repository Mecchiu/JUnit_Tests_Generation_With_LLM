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
		
	/**
	 * Test method for
	 * {@link nu.staldal.xtree.Element#getAttributeValue(int)}
	 * with string as attribute element attribute element.
	 * 
	 * @throws Exception
	 */	
	@Test
	public final void testGetAttributeValueWithString() throws Exception {
		Vector<TestAttribute> v = new Vector<TestAttribute>();
		v.add(new TestAttribute("attr1", "a", null, "a"));
		//System.setProperty("nu.staldal.xtree.Element.attr1","a2");
		//System.setProperty("nu.staldal.xtree.Element.attr1", "a2");
		v.add(new TestAttribute("attr2", "a", null, "b"));
		v.add(new TestAttribute("attr3", "a", null, "c"));
		new Element("attr1", v).lookupAttribute("attr2");
		assertEquals(v.toString(), 2, v.size());
		assertEquals(v.get(0).c, new TestAttribute("attr1", "a", null, "a2").c);
		assertEquals(v.get(1).c, new TestAttribute("attr2", "a", null, "b").c);
		
		v.clear();
		new Element("other attribute", v);
		assertEquals(new Element("other attribute", v).getAttributeValue("other attribute"), "b");
		
	}

}

/**
 * Test class of {@link Element}.
 * It contains one unit test case for the {@link Document} type.
*/
class Document_5Test extends Element_5Test {
    
		/**
	 * Test method for {@link nu.staldal.xtree.Element#getAttribute(java.lang.String)}.
	 */
	@Test
    public final void testGetAttribute() throws SAXException, IOException {
                
		Document d = new Document("<root>"
                			+ "<elem1>hi</elem1>"
                			+ "<elem2>bye</elem2>"
                			+ "<elem3>caf</elem3>"
                			+ "<fmt>Fmt</fmt>"
                			+ "<fmt2/>"
                			).setText("<a/>"),
                 		new URL(getClass().getResource("/xml/"
                        					+ "elementTest2.xml")),
                 		new URL(getClass().getResource("/xml/"
                        					+ "elementTest3.xml")),
				null);
                
		AttributesImpl attributeImpl = new AttributesImpl();
		attributeImpl.addValue("elem1", new TestAttribute("attr1", "a", null, "a"));
		attributeImpl.addValue("elem2", new TestAttribute("attr1", "b", null, "b"));
				attributeImpl.addValue("elem3", new TestAttribute("", null, null, ""));
				attributeImpl.addValue("fmt", new TestAttribute("", null, "Fmt", "Fmt"));
				attributeImpl.addValue("fmt2", new TestAttribute("", null, "Fmt2", "Fmt2"));
				attributeImpl.addValue("fmt3", new TestAttribute("", null, "Fmt3", "Fmt3"));
				attributeImpl.addValue("fmt2", null);
				attributeImpl.addValue("fmt3", null);
				
		Document result = new Element(null, new Vector<TestAttribute>()).unwrap(d);     
        
		assertEquals(result.getDocumentElement().getPrefix(), "root");
		assertNull("elem1", result.getDocumentElement().getFirstChild());
		assertNull("elem2", result.getDocumentElement().getLastChild());
		assertNull("elem3", result.getDocumentElement().getFirstChild());
		assertEquals(attributeImpl, result.getDocumentElement()
				.getAttributes().getItem("attr1"));
		assertEquals(attributeImpl, result.getDocumentElement()
				.getAttributes().getItem("attr2"));
		assertNull("elem3", result.getDocumentElement().getFirstChild());
		assertNull("elem2", result.getDocumentElement().getParent());
		
		StringBuilder sb = new StringBuilder();
		sb.append("<root><elem1>hi</elem1><elem2>bye</elem2><elem3>caf<elem3>caf</elem3></elem3></root>");
		
		assertEquals(sb.toString(), "<root>\r\n"
				+ "    <elem1>hi</elem1>\r\n"
				+ "    <elem2>bye</elem2>\r\n"
				+ "    <elem3>caf</elem3>\r\n"
				+ "</root>\r\n", result.getDocumentElement().toString());
		
	}	
	
	public Document testXMLWithNodesAndDocs() throws Exception {
		return new Document(new ArrayList()).setText("<root>text</root>");
	}	
	
}