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
		/**
		 * Tests a sequence of XML documents.
		 *
		 * @param xmlInput test input source
		 * @param validateDTD if true validate the DTD
		 * @param handler
		 * @throws XMLStreamException if the XML input stream is invalid
		 * @throws IOException if there was any I/O error while reading the input
		 */
		@Test
		public void sequenceXMLInput (InputSource xmlInput, boolean validateDTD, ElementHandler handler) throws XMLStreamException, IOException {
				// Parser for XML data
			SAXParserFactory factory = SAXParserFactory.newInstance();
			factory.setValidating(validateDTD);
			factory.setNamespaceAugs(NamespaceAugs.XML_DECLARATION);
			XMLReader parser = factory.newSAXParser().getXMLReader();
			parser.setContentHandler(handler);
			parser.setErrorHandler(handler);
			@SuppressWarnings("unchecked")
			List<Element> elements = new ArrayList<Element>();
			parser.parse(xmlInput, elements);
			assertEquals(elements.get(0).getName(), SequentialTreeBuilder.NAME);
			assertEquals(elements.get(0), SequentialTreeBuilder.NAME);
			assertEquals(elements.get(0).getAttributeCount(), SequentialTreeBuilder.NAME);
			assertEquals(Arrays.toString(elements.get(0).getAttributes().toArray()), SequentialTreeBuilder.NAME);
			assertEquals(elements.get(0).getAttributeCount(), SequentialTreeBuilder.NAME);
            assertEquals(elements.get(0).getAttributeCount(), SequentialTreeBuilder.NAME);
			@SuppressWarnings("unchecked")
			List<Object> childNodes = new ArrayList<Object>();
			@SuppressWarnings("unchecked")
			HashMap<String, Object> xmlObjects = new HashMap<>();
			elements.forEach(xmlElement -> {
				ChildElement<?,?> childElement = xmlElement.getChildElement(SequentialTreeBuilder::NAME);
				if (childElement!= null) childNodes.add(childElement.clone());
				xmlArrayFor(xmlObjects, SequentialTreeBuilder.NAME, childElement.getName(), childElement.getClass().getSimpleName()).add(childElement);
			});
			List<Attribute> xmlAttributeList = new ArrayList<Attribute>();
			List<Element> otherElements = new ArrayList<Element>();
			otherElements.add(elements.get(0));
			xmlAttributeList.add(elements.get(0).getAttribute(SequentialTreeBuilder.NAME));
			parser.setProperty(Namespaces.MUST_BE_PULLED_IN, false);
            assertEquals(childNodes.get(0) == elements.get(0), true);
            assertEquals(childNodes.contains(SequentialTreeBuilder.NAME), true);
            assertTrue("The XML DOM is not a valid input: "+elements.get(0).toString(), ((XMLDocument)objectsToDom(parent(elements.get(0), objectToDom(objectToDom(parent(elements.get(0), objectToDom(xmlArrayFor(xmlObjects, SequentialTreeBuilder.NAME, SequentialTreeBuilder.NAME))))))).getDocumentElement().getChildNodes().length==0) );
			otherElements.add(otherElements.get(0));
			xmlAttributeList.add(otherElements.get(0).getAttribute(SequentialTreeBuilder.NAME));
			assertEquals(parser.getProperty(Namespaces.MUST_BE_PULLED_IN), true);
			parser.setProperty(Namespaces.MUST_BE_PULLED_IN, false);
            assertEquals(parser.getProperty(Namespaces.MUST_BE_PULLED_IN), false);
			SequentialTreeBuilder treeBuilder = new SequentialTreeBuilder();
			parser.parse(xmlInput, treeBuilder);
			elements.forEach(xmlElement -> {
				assertTrue("The XML DOM is not a valid input: "+ objectsToDom(xmlDom(child(elements.get(0), objectsToDom(objectToDom(xmlArrayFor(xmlObjects, SequentialTreeBuilder.NAME, SequentialTreeBuilder.NAME)))))), xmlDom(child(elements.get(0), objectsToDom(parent(elements.get(0), objectToDom(xmlDom(child(elements.get(0), objectsToDom(objectToDom(other) + SequenceTreeBuilder.NAME)))))),  SequentialTreeBuilder.NAME)));
			});
			treeBuilder.reset();
		}
		
		Element e1;
		Map<String, Object> objectsToDom;
		public void parseXMLSequential (InputSource xmlInput, boolean validateDTD, ElementHandler handler) throws XMLStreamException {
			if (xmlInput == null) {
				return;
			}
			final Object parent = objectToDom(e1 = createElement(e1, 'a'), xmlDom(e1, e1.getName()));
			elementsToDom = new HashMap<String, Object>();
			elementsToDom.put(e1.getName(), childrenToDom(e1));
			objectsToDom = new HashMap<String, Object>();
			objectsToDom.putAll(elementsToDom);
			xmlArrayFor(objectsToDom, SequentialTreeBuilder.NAME, SequentialTreeBuilder.NAME, SequentialTreeBuilder.NAME).addAll(elementsToDom);
			e1.setClass(SequentialTreeBuilder.class);			
			e1.setAttributeList(new ArrayList<Attribute>(xmlAttributeList.toArray(new Attribute[xmlAttributeList.size()])));
			Object data;
			data = new Object[]{parent, getData()};
			elementsToDom.forEach(child -> {
				childrenToDom(elementsToDom, child);
			});
			if (xmlInput instanceof Reader) {
				e1.setText(new String((Reader)xmlInput, "UTF-8"));
			} else if (xmlInput instanceof InputStream) {
				e1.setText(new String((InputStream)xmlInput, "UTF-8"));
			} else {
				throw new RuntimeException("Don't know how to parse XML with " + xmlInput.getClass());
			}
}
}