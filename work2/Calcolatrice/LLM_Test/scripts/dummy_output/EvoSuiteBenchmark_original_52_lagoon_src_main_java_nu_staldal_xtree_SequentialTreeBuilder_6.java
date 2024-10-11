// SequentialTreeBuilderTest.java
package nu.staldal.xtree;

import java.util.*;
import java.io.*;
import java.net.URL;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SequentialTreeBuilder}.
* It contains one unit test case for the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method.
*/
class SequentialTreeBuilderTest {
		
	private static Set<String> rootElements;

	private static String getRootElement() {
		
		XMLInputSource xis = new XMLInputSource(
			null,
			XMLInputSource.LANGUAGE_NAMESPACE_AWARE,
			"/xml/",
			false) {
			
			@Override
			public boolean accept() {
				return super.accept();
			}
		};
		
		Document xdDoc;
	
		try {
			xdDoc = JDOMUtil.loadDocument(xis);
		} catch (JDOMException je) {
			return null;
		}
		
		ArrayList<Document> docs = new ArrayList<>(xdDoc.getElementsByTagName(XTreeBuilder.TAG_ROOT));
		assertEquals(1, docs.size());
				
		return docs.get(0).getDocumentElement().getNodeName();
		
	}
	
	
  // private void assertElement(Element expected, Element actual) {
  // 	assertEquals(expected.getNodeValue(), actual.getNodeValue());
  // }

  // @Test
  // public void testGetRootElement() throws Exception {
  // 	// Get the root element from the parsed XML
  // 	String rootElement = getRootElement();
  // 	if(rootElement == null) {
  // 		fail("Could not get root element");
  // 	} 
  // 
  // 	// Assert the root element when the XML is a simple XML document
  // 	assertElement(XTreeBuilder.TAG_ROOT, getRootElement());
  // 
  // 	// Assert the root element when the XML has a root element child
  // 	Element rootActual = getRootElement().getChild(getRootElement());
  // 	assertNotNull(rootActual);
  // 	
  // 	// Assert the root element when a node is a complex tag
  // 	List<String> children = childNames(getRootElement());
  // 	assertEquals(2, children.size());
  // 	
  // 	// Assert the root element that has the expected child
  // 	Element result = getRootElement().getChild(children.get(0));
  // 	assertEquals(children.get(0), result.getNodeValue());
  // }
	

	interface ElementHandler<E extends XMLTreeBuilder.Element> extends ErrorHandler {

    /**
     * Invoked for each new element in the XML data.
     * @param newElement the new element
     * @throws SAXException if an error occurs
     * @throws IOException if we receive an I/O exception during parsing
     */
	void handle(E newElement) throws SAXException, IOException;
	
		
	}

	@Test
	public void testCreateSequentialTree() throws Exception {
		
		// We will test parsing a sequence of elements by testing a tree builder
		// for each one, by adding child elements to the subtree, and calling
		// the parent.
		try {
			
			String rootElement = getRootElement();
			
			List<String> childNames = childNames(rootElement);
			
			// The first element has the root element, the second has it's children and
			// the third without it.
			XMLTreeBuilder.SequentialTreeBuilder tb = XMLTreeBuilder.createSequentialTreeBuilder();
						
			tb.root(rootElement);
			tb.start();
			tb.end();
			tb.endElement();
				
			// Assert the root element that has the root element
			assertEquals(getRootElement(), tb.elemName());
			
			// Create the sequence of elements
			List<E> elementList = tb.getSequentialTrees();
			
			assertEquals(1, elementList.size()); // root element
			
			// Assert the expected root element, and the sequence
			assertEquals(rootElement, elementList.get(0).getDocumentElement().getNodeValue());
			
			// The next element has children, which are added in the subtree.
			tb = XMLTreeBuilder.createSequentialTreeBuilder();

			// Assert the sequence of elements
			elementList = tb.getSequentialTrees();
			assertEquals(2, elementList.size());
			
			// Assert that the first element has its subtree, and the second has its
			// children (and so on).
			assertEquals(elementList.get(0).getDocumentElement().getNodeValue(), getRootElement());
			
			// Assert that the children of the last child, with one child at the end. 
			// We can't assert that in XML, because the XML has two tags in a row.
			// To avoid this, we can add a fake child element, which is located at the root
			// tag and is a list. The first element has the root element, and the second
			// has it's children, with one dummy child.
			List<String> fakeElementList = Arrays.asList(new String[] {
				XTreeBuilder.TAG_ROOT, 
				XTreeBuilder.TAG_CHILDREN,
				XTreeBuilder.TAG_PROPERTY});
			
			assertEquals(2, fakeElementList.size());
			assertEquals(fakeElementList.get(0), elementList.get(0).getChild(fakeElementList.get(1)));
			assertEquals(fakeElementList.get(1), elementList.get(1).getChild(fakeElementList.get(2)));
		
		} catch (SAXException | IOException e) {
			fail(e);
		}
		
	}
	
	private List<String> childNames(String actual) {
		
		String[] childrenNames = actual.getSubstring(0, actual.indexOf(XTreeBuilder.TAG_CONTROL)).split("/");
		List<String> childNames = new ArrayList<>(childrenNames.length);
		
		for(String item: childrenNames) {
			childNames.add(item);
		}
	
		return childNames;
	}
	
}