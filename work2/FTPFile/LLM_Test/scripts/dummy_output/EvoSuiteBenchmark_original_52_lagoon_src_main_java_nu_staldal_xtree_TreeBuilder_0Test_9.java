// TreeBuilder_0Test.java
package nu.staldal.xtree;

import java.util.*;
import java.io.*;
import java.net.URL;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TreeBuilder}.
* It contains one unit test case for the {@link TreeBuilder#fileToInputSource(File)} method.
*/
class TreeBuilder_0Test {
		
	/**
	 * Test for a bug reported by
	 * <a href="https://www.w3.org/TR/1999/REC-xml-names-19990114/">XML Names and Namespaces</a>.
	 * <p>
	 * This bug was reported by an implementation developer who
	 * had previously decided to use the {@link TreeBuilder} interface
	 * to store, and used XML namespaces in its public methods to specify
	 * namespace URIs. It turned out to be dangerous, because the
	 * Namespace prefix on Namespaces in the XML element itself is
	 * no longer namespace URIs. This assertion will test this issue by
	 * creating a subtree with a prefix and namespace namespace URI
	 * matching such a prefix and namespace URI.
	 * <p>
	 * We have no known method to avoid this, but we need to test the behaviour
	 * by constructing a new TreeBuilder by calling the tree build implementation
	 * for that prefix, calling the {@link #build} method and then adding a
	 * subtree with that prefix, then getting the {@link #getRoot} method to return
	 * an existing root node.
	 */		
    @Test
	public void testBug() {
		try {
			TreeBuilder builder = new TreeBuilder();
			// Make a new top-level text node with a prefix
			Document document = createExpectedDocument();
			Element result = createResultNode();
			Text text = result.getOwnerDocument().createTextNode("test");
			result.appendChild(text);			
			// Attach the text node
			text.setValue("This is test text!");
			builder.add(document, result, "test");
			// Attempt to build the node
			builder.build();
			// We should still have the expected result
			XMLUnit.compareXMLs(result, createExpectedResult());
		} catch (Exception ex) {
			fail("An unexpected exception should not have been thrown.");
		}
	}

	/**
	 * Tests that SAX error events are correctly reported.
	 */
	public void testError() {
//		Builder builder = new Builder();
//		builder.build();

		InputStream in = fileToInputSource("sap/foo/bar/tests/test-tree-builder-error.xml");
		SAXParser saxParser = null;
		try {
			XMLReader parser = XMLReaderFactory.createXMLReader();
			parser.setFeature("http://xml.org/sax/features/external-general-entities", true);
			parser.setFeature("http://xml.org/sax/features/external-parameter-entities", true);
			parser.setFeature("http://apache.org/xml/features/nonvalidating/load-dtd-grammar", true);
			parser.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", true);
			parser.setFeature("http://apache.org/xml/features/cache-grammar", true);
			parser.setFeature("http://apache.org/xml/features/nonvalidating/load-internal-dtd", false);
			saxParser = XMLReaderFactory.createXMLReader();
			SAXParserHandler saxParserHandler = new SAXParserHandler();
			parser.setContentHandler(saxParserHandler);
			parser.parse(in);
			fail("Did not throw an XML Parse Exception.");
		} catch (Exception e) {
			String s = e.getStackTrace();
			for (int i = start - 1; i < start; i++) {
				s = s.substring(0, s.indexOf(''+ i.toString()));
			}
			if (i < start) {
				fail(s);
			}
			for (int i = start; i <= end; i++) {
//				System.out.print(s.substring(0, s.indexOf('\'') - 1).toString() + "\n");
			}
		} finally {
			if (saxParser!= null) {
				saxParser.close();
			}
			in.close();
		}
	}

    private Document createExpectedDocument() {
		Document document = new Document("test");
		Element root = document.createElement("root");
		Element text1 = document.createElement("text1");
		Element text2 = document.createElement("text2");
		Text text = document.createTextNode("This is test text!");
		text.setValue("XML 2.0");
		root.appendChild(text1);
		text.setValue("This is text.");
		text1.appendChild(text2);
//		System.out.print(root.toString("pre-defined-form"));
		return document;
    }

    private XMLUnit.Scope getScope() {
		return XMLUnit.newText(TEST_RESULT);
	}

	private static String createResultNode() {
		return "<test/>";
	}
	
    private void assertSameXMLString(XMLUnit.Scope scope, String expectedString) {
		XMLUnit.setIgnoreWhitespace(true);
		File testFile = new File("sap/foo/bar/tests/test-tree-builder-error.xml");
		String actualString = XMLUnit.format(scope, testFile);
		assertEquals(
				"XML units should be equal under the " + scope.toString() + " scope",
				expectedString, actualString
		);
	}

	/**
	 * Sets up the XMLTreeBuilder object by passing in the DOM factory.
	 *
	 * @param factory the XML DOM factory
	 */
    private static void setUp(final Factory f) {
		setUp(f, new Document());
	}

	/**
	 * Sets up the XMLTreeBuilder object by passing in the DOM factory, a
	 * document, and settings.
	 *
	 * @param factory the XML DOM factory
	 * @param document the XML document
	 */
    private static void setUp(final Factory f, final Document document) {
		try {
//		f = XMLUnit.newControlParser();
			f = new DOMBuilder().setDOMFactory(new W3CDOMFactories.W3CDOMElementFactory()).setNamespaces(true)
					.setXPathNamespaces(true).setVersion(XMLUnit.VERSION_1_09_OR_ABOVE).build(document);
		} catch (TransformerConfigurationException e) {
			fail("Could not create a DOMBuilder at the supplied location:" + e.toString());
		}
    }
}