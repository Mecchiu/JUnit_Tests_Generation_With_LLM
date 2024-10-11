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
		
    private Segmenter segmenter ;
    
    /**
	* Test constructor
	*/
    public SequentialTreeBuilderTest() {
    }

    /**
     * Test method for {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)}.
	*/
	@Test
	public void testParseXMLSequential() {
	    final String file = "Sample.xml";
	    final String url = "http://nu.staldal.net/sample.xml";
		// get a Document object from the file on the wiki
		Document doc;
		try {
			InputSource source = new InputSource(new BufferedInputStream(new FileInputStream(file)));
			doc = segmenter.parse(source);
		} catch (Exception e) {
			assertFalse(true);
		}

		// get an Element with the same ID
		Element result = (Element) doc.getElementsByTagName("element-list").item(0);

		// get the List of Elements under the root element
		List resultEles = result.getElementsByTagName("element");

		// add the XML to the Segmenter
		try {
			segmenter.handle(doc);
			fail("Able to handle the document without the root-element");
		} catch (Exception e) {
			// Ok, that works fine.
		}

		// Test if the parsing of an XML does not produce more than one tree-node
		Document resultDoc = segmenter.getFirstChild(result, true);
		if (resultDoc == null) {
			fail("Able to obtain the First-Child element while segmentering the document");
		}

		// build a List of XTree:s from a single XML
		List resultXmlList = new ArrayList();
		List resultXmlListResult = new ArrayList();

		Element resultElement = SegmenterTest.addXElement(result, resultXmlList);

		// build a Vector of XMLs (all child-elements of the root-element)
		XMLVector list = new XMLVector(file);
		list.setElements(resultEles);
		resultXmlList.addAll(list.getVector());

		// and test if the parsing of an XML produces
		// more than one tree-node
		resultDoc = segmenter.getFirstChild(result, true);
		/*
		assertNotNull(resultDoc);
		resultDoc.getDocumentElement().normalize();
		Node child = resultDoc.getDocumentElement().getFirstChild();
		assertNotNull(child); // This can not happen without some exception
		if (child.getNodeType()!= Node.ELEMENT_NODE) {
			fail("Able to obtain the First-Child element while segmentering the document");
		}
		*/

		resultDoc = segmenter.getFirstChild(result, true);
		assertNull(resultDoc);
		*/

		// build a List of XMLs (all child-elements of the root-element)
		list = new XMLVector(url);
		list.setElements(resultEles);
		resultXmlList.addAll(list.getVector());

		// and test if the parsing of an XML produces
		// more than one tree-node
		resultDoc = segmenter.getFirstChild(result, true);
		/*
		assertNotNull(resultDoc);
		resultDoc.getDocumentElement().normalize();
		Node child = resultDoc.getDocumentElement().getFirstChild();
		assertNotNull(child); // This can not happen without some exception
		if (child.getNodeType()!= Node.ELEMENT_NODE) {
			fail("Able to obtain the First-Child element while segmentering the document");
		}
		*/

		resultDoc = segmenter.getFirstChild(result, true);
		assertNull(resultDoc);
		*/

		// Test passing to ElementHandler
		ElementHandler resultHandler = new ElementHandler() {
				public void handle(Element e) {
					resultXmlListResult.add((XML) e);
				}
			};

		// Build a Segmenter from an XML file
		segmenter = new Segmenter();

		// build a ContentHandler object from the Segmenter
		ContentHandler contentHandler = segmenter;

		// set the ContentHandler to handle XML data, or parse it by SAX2
		contentHandler = new SequentialTreeBuilderContentHandler(contentHandler, resultHandler, new DefaultHandler());

		// parse the XML data using SaxUtil
		try {
			SaxUtil.parser.parse(xmlInput.getSystemId());
			assertEquals(true, true);
		} catch (SAXException e) {
			assertTrue(true);
		} catch (IOException e) {
			assertTrue(false);
		}

		// Parse the XML data by using DTD, using an existing schema
		try {
			segmenter.parse(new DTDHandler(), handler);
			assertEquals(true, false);
		} catch (SAXException e) {
			assertTrue(false);
		} catch (IOException e) {
			assertTrue(false);
		}


		// Parse the XML data by using DTD (and XML Schema)
		try {
			segmenter.parse(new DTDHandler(), handler);
			assertEquals(true, false);
		} catch (SAXException e) {
			assertTrue(false);
		} catch (IOException e) {
			assertTrue(false);
		}
	}
}