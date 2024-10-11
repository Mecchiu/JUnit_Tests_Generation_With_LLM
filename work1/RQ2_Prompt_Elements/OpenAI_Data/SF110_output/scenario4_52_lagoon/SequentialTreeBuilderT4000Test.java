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
* It contains ten unit test cases for the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method.
*/
class SequentialTreeBuilderTest {

	@Test
	void testParseXMLSequential() throws Exception {
		SequentialTreeBuilderTest.testParseXMLSequential("test1.xml", false);
		SequentialTreeBuilderTest.testParseXMLSequential("test2.xml", false);
		SequentialTreeBuilderTest.testParseXMLSequential("test3.xml", false);
		SequentialTreeBuilderTest.testParseXMLSequential("test4.xml", false);
		SequentialTreeBuilderTest.testParseXMLSequential("test5.xml", false);
		SequentialTreeBuilderTest.testParseXMLSequential("test6.xml", false);
		SequentialTreeBuilderTest.testParseXMLSequential("test7.xml", false);
		SequentialTreeBuilderTest.testParseXMLSequential("test8.xml", false);
		SequentialTreeBuilderTest.testParseXMLSequential("test9.xml", false);
		SequentialTreeBuilderTest.testParseXMLSequential("test10.xml", false);
	}

	private static void testParseXMLSequential(String fileName, boolean validateDTD) throws Exception {
		InputSource xmlInput = new InputSource(new FileInputStream(fileName));
		xmlInput.setSystemId(fileName);
		SequentialTreeBuilderTest.testParseXMLSequential(xmlInput, validateDTD);
	}

	private static void testParseXMLSequential(InputSource xmlInput, boolean validateDTD) throws Exception {
		SequentialTreeBuilderTest.testParseXMLSequential(xmlInput, validateDTD, new ElementHandler() {
			public void handleElement(Element el) throws SAXException {
				System.out.println(el.toXML());
			}
		});
	}

	private static void testParseXMLSequential(InputSource xmlInput, boolean validateDTD, ElementHandler handler) throws Exception {
		SequentialTreeBuilder builder = new SequentialTreeBuilder(handler);
		SAXParserFactory factory = SAXParserFactory.newInstance();
		factory.setNamespaceAware(true);
		factory.setValidating(validateDTD);
		SAXParser parser = factory.newSAXParser();
		parser.parse(xmlInput, builder);
		Element root = builder.getRootElement();
		System.out.println(root.toXML());
	}
}

// TreeBuilder.java
package nu.staldal.xtree;

import java.util.*;
import java.io.*;
import java.net.URL;
import javax.xml.parsers.*;
import org.xml.sax.*;

/**
 * Build an XTree from a SAX2 event stream, or by parsing an XML document.
 * <p>
 * The TreeBuilder ensures that the tree will not have two adjacent Text nodes.
 */
public class TreeBuilder implements ContentHandler, ErrorHandler {

    public static final boolean DEBUG = false;

    private static final String XML_NS = "http://www.w3.org/XML/1998/namespace";

    private URL baseURI;

    private Locator locator = null;

    private Element rootElement;

    private TreeBuilder subTreeBuilder;

    private Vector nsPrefix = null;

    private Vector nsURI = null;

    private int inSubTree = 0;

    /**
     * Parse an XML document into an XTree.
     * Uses JAXP to find a parser.
     * Will not support xml:base.
     *
     * @param xmlInput    the input to parse
     * @param validateDTD validate using DTD
     *
     * @return the root element
     *
     * @throws SAXParseException if the XML data is not valid
     * @throws SAXException if any other error occurs while parsing the XML data
     * @throws IOException  if there was some I/O error while reading the input.
     */
    public static Element parseXML(InputSource xmlInput, boolean validateDTD) throws SAXParseException, SAXException, IOException;

    /**
     * Constructs a TreeBuilder, ready to receive SAX events.
     * Will not support xml:base.
     */
    public TreeBuilder() {
    }

    /**
     * Constructs a TreeBuilder, ready to receive SAX events.
     *
     * @param base      base URL for the document, to support xml:base.
     */
    public TreeBuilder(URL base) {
    }

    /**
     * Obtain the root Element
     *
     * @throws IllegalStateException  if the SAX events received so far
     * doesn't constitues a well-formed XML document.
     */
    public Element getRootElement() throws IllegalStateException;

    public void setDocumentLocator(Locator locator);

    public void startDocument() throws SAXException;

    public void endDocument() throws SAXException;

    public void startElement(String namespaceURI, String localName, String qName, Attributes atts) throws SAXException;

    public void endElement(String namespaceURI, String localName, String qName) throws SAXException;

    public void startPrefixMapping(String prefix, String uri) throws SAXException;

    public void endPrefixMapping(String prefix) throws SAXException;

    public void characters(char[] ch, int start, int length) throws SAXException;

    public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException;

    public void processingInstruction(String target, String data) throws SAXException;

    public void skippedEntity(String name) throws SAXException;

    public void fatalError(SAXParseException e) throws SAXParseException;

    public void error(SAXParseException e) throws SAXParseException;

    public void warning(SAXParseException e);
}

// TreeBuilderTest.java
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
* It contains ten unit test cases for the {@link TreeBuilder#parseXML(InputSource, boolean)} method.
*/
class TreeBuilderTest {
		
	@Test
	void testParseXML() throws Exception {
		TreeBuilderTest.testParseXML("test1.xml", false);
		TreeBuilderTest.testParseXML("test2.xml", false);
		TreeBuilderTest.testParseXML("test3.xml", false);
		TreeBuilderTest.testParseXML("test4.xml", false);
		TreeBuilderTest.testParseXML("test5.xml", false);
		TreeBuilderTest.testParseXML("test6.xml", false);
		TreeBuilderTest.testParseXML("test7.xml", false);
		TreeBuilderTest.testParseXML("test8.xml", false);
		TreeBuilderTest.testParseXML("test9.xml", false);
		TreeBuilderTest.testParseXML("test10.xml", false);
	}

	private static void testParseXML(String fileName, boolean validateDTD) throws Exception {
		InputSource xmlInput = new InputSource(new FileInputStream(fileName));
		xmlInput.setSystemId(fileName);
		TreeBuilderTest.testParseXML(xmlInput, validateDTD);
	}

	private static void testParseXML(InputSource xmlInput, boolean validateDTD) throws Exception {
		TreeBuilder builder = new TreeBuilder();
		SAXParserFactory factory = SAXParserFactory.newInstance();
		factory.setNamespaceAware(true);
		factory.setValidating(validateDTD);
		SAXParser parser = factory.newSAXParser();
		parser.parse(xmlInput, builder);
		Element root = builder.getRootElement();
		System.out.println(root.toXML());
	}
}

// XTree.java
package nu.staldal.xtree;

import java.util.*;
import java.io.*;
import java.net.URL;
import javax.xml.parsers.*;
import org.xml.sax.*;

/**
 * An XML tree.
 * <p>
 * The tree is a list of nodes.
 * <p>
 * The tree is immutable.
 */
public class XTree implements Serializable {

    private static final long serialVersionUID = -8279909812098120981L;

    private final Node[] nodes;

    private final int root;

    private final int[] parent;

    private final int[] firstChild;

    private final int[] nextSibling;

    private final int[] prevSibling;

    private final int[] firstAttribute;

    private final int[] lastAttribute;

    private final int[] firstNamespace;

    private final int[] lastNamespace;

    private final int[] firstText;

    private final int[] lastText;

    private final int[] firstComment;

    private final int[] lastComment;

    private final int[] firstPI;

    private final int[] lastPI;

    private final int[] firstEntityRef;

    private final int[] lastEntityRef;

    private final int[] firstSubtree;

    private final int[] lastSubtree;

    private final int[] firstSubtreeRoot;

    private final int[] lastSubtreeRoot;

    private final int[] firstSubtreeRootParent;

    private final int[] lastSubtreeRootParent;

    private final int[] firstSubtreeRootPrevSibling;

    private final int[] lastSubtreeRootPrevSibling;

    private final int[] firstSubtreeRootNextSibling;

    private final int[] lastSubtreeRootNextSibling;

    private final int[] firstSubtreeRootFirstChild;

    private final int[] lastSubtreeRootFirstChild;

    private final int[] firstSubtreeRootLastChild;

    private final int[] lastSubtreeRootLastChild;

    private final int[] firstSubtreeRootFirstAttribute;

    private final int[] lastSubtreeRootFirstAttribute;

    private final int[] firstSubtreeRootLastAttribute;

    private final int[] lastSubtreeRootLastAttribute;

    private final int[] firstSubtreeRootFirstNamespace;

    private final int[] lastSubtreeRootFirstNamespace;

    private final int[] firstSubtreeRootLastNamespace;

    private final int[] lastSubtreeRootLastNamespace;

    private final int[] firstSubtreeRootFirstText;

    private final int[] lastSubtreeRootFirstText;

    private final int[] firstSubtreeRootLastText;

    private final int[] lastSubtreeRootLastText;

    private final int[] firstSubtreeRootFirstComment;

    private final int[] lastSubtreeRootFirstComment;

    private final int[] firstSubtreeRootLastComment;

    private final int[] lastSubtreeRootLastComment;

    private final int[] firstSubtreeRootFirstPI;

    private final int[] lastSubtreeRootFirstPI;

    private final int[] firstSubtreeRootLastPI;

    private final int[] lastSubtreeRootLastPI;

    private final int[] firstSubtreeRootFirstEntityRef;

    private final int[] lastSubtreeRootFirstEntityRef;

    private final int[] firstSubtreeRootLastEntityRef;

    private final int[] lastSubtreeRootLastEntityRef;

    private final int[] firstSubtreeRootFirstSubtree;

    private final int[] lastSubtreeRootFirstSubtree;

    private final int[] firstSubtreeRootLastSubtree;

    private final int[] lastSubtreeRootLastSubtree;

    private final int[] firstSubtreeRootFirstSubtreeRoot;

    private final int[] lastSubtreeRootFirstSubtreeRoot;

    private final int[] firstSubtreeRootLastSubtreeRoot;

    private final int[] lastSubtreeRootLastSubtreeRoot;

    private final int[] firstSubtreeRootFirstSubtreeRootParent;

    private final int[] lastSubtreeRootFirstSubtreeRootParent;

    private final int[] firstSubtreeRootLastSubtreeRootParent;

    private final int[] lastSubtreeRootLastSubtreeRootParent;

    private final int[] firstSubtreeRootFirstSubtreeRootPrevSibling;

    private final int[] lastSubtreeRootFirstSubtreeRootPrevSibling;

    private final int[] firstSubtreeRootLastSubtreeRootPrevSibling;

    private final int[] lastSubtreeRootLastSubtreeRootPrevSibling;

    private final int[] firstSubtreeRootFirstSubtreeRootNextSibling;

    private final int[] lastSubtreeRootFirstSubtreeRootNextSibling;

    private final int[] firstSubtreeRootLastSubtreeRootNextSibling;

    private final int[] lastSubtreeRootLastSubtreeRootNextSibling;

    private final int[] firstSubtreeRootFirstSubtreeRootFirstChild;

    private final int[] lastSubtreeRootFirstSubtreeRootFirstChild;

    private final int[] firstSubtreeRootLastSubtreeRootFirstChild;

    private final int[] lastSubtreeRootLastSubtreeRootFirstChild;

    private final int[] firstSubtreeRootFirstSubtreeRootLastChild;

    private final int[] lastSubtreeRootFirstSubtreeRootLastChild;

    private final int[] firstSubtreeRootLastSubtreeRootLastChild;

    private final int[] lastSubtreeRootLastSubtreeRootLastChild;

    private final int[] firstSubtreeRootFirstSubtreeRootFirstAttribute;

    private final int[] lastSubtreeRootFirstSubtreeRootFirstAttribute;

    private final int[] firstSubtreeRootLastSubtreeRootFirstAttribute;

    private final int[] lastSubtreeRootLastSubtreeRootFirstAttribute;

    private final int[] firstSubtreeRootFirstSubtreeRootLastAttribute;

    private final int[] lastSubtreeRootFirstSubtreeRootLastAttribute;

    private final int[] firstSubtreeRootLastSubtreeRootLastAttribute;

    private final int[] lastSubtreeRootLastSubtreeRootLastAttribute;

    private final int[] firstSubtreeRootFirstSubtreeRootFirstNamespace;

    private final int[] lastSubtreeRootFirstSubtreeRootFirstNamespace;

    private final int[] firstSubtreeRootLastSubtreeRootFirstNamespace;

    private final int[] lastSubtreeRootLastSubtreeRootFirstNamespace;

    private final int[] firstSubtreeRootFirstSubtreeRootLastNamespace;

    private final int[] lastSubtreeRootFirstSubtreeRootLastNamespace;

    private final int[] firstSubtreeRootLastSubtreeRootLastNamespace;

    private final int[] lastSubtreeRootLastSubtreeRootLastNamespace;

    private final int[] firstSubtreeRootFirstSubtreeRootFirstText;

    private final int[] lastSubtreeRootFirstSubtreeRootFirstText;

    private final int[] firstSubtreeRootLastSubtreeRootFirstText;

    private final int[] lastSubtreeRootLastSubtreeRootFirstText;

    private final int[] firstSubtreeRootFirstSubtreeRootLastText;

    private final int[] lastSubtreeRootFirstSubtreeRootLastText;

    private final int[] firstSubtreeRootLastSubtreeRootLastText;

    private final int[] lastSubtreeRootLastSubtreeRootLastText;

    private final int[] firstSubtreeRootFirstSubtreeRootFirstComment;

    private final int[] lastSubtreeRootFirstSubtreeRootFirstComment;

    private final int[] firstSubtreeRootLastSubtreeRootFirstComment;

    private final int[] lastSubtreeRootLastSubtreeRootFirstComment;

    private final int[] firstSubtreeRootFirstSubtreeRootLastComment;

    private final int[] lastSubtreeRootFirstSubtreeRootLastComment;

    private final int[] firstSubtreeRootLastSubtreeRootLastComment;

    private final int[] lastSubtreeRootLastSubtreeRootLastComment;

    private final int[] firstSubtreeRootFirstSubtreeRootFirstPI;

    private final int[] lastSubtreeRootFirstSubtreeRootFirstPI;

    private final int[] firstSubtreeRootLastSubtreeRootFirstPI;

    private final int[] lastSubtreeRootLastSubtreeRootFirstPI;

    private final int[] firstSubtreeRootFirstSubtreeRootLastPI;

    private final int[] lastSubtreeRootFirstSubtreeRootLastPI;

    private final int[] firstSubtreeRootLastSubtreeRootLastPI;

    private final int[] lastSubtreeRootLastSubtreeRootLastPI;

    private final int[] firstSubtreeRootFirstSubtreeRootFirstEntityRef;

    private final int[] lastSubtreeRootFirstSubtreeRootFirstEntityRef;

    private final int[] firstSubtreeRootLastSub