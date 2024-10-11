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
		private Element rootElement;
		private static final URL TEST_TREEXML = SequentialTreeBuilderTest.class.getResource("/SequentialTreeBuilder.xml");
		private static final String TEST_FILE = SequentialTreeBuilderTest.class.getResource("/SequentialTreeBuilder.xml").toString();
		private static final String XMLHEADER = "<root>";
		private static final String ELEMENTLIMITPERIX = "<element limit=\"10\"/>";
		private static final String ELEMENT_TEMP = "root";
		private static final String ELEMENT_ELEM_LIMIT = "element limit=\"10\"";
		private static final String ELEMENT_ELEM0 = "elem0";
		private static final String ELEMENT_ELEM_ELEM = "elemElem";
		private static final String ELEMENT_ELEM_LIST = "elemList";
		private static final String ELEMENT_ELEM_COMMENT = "comment";
		private static final String ELEMENT_ELEM2 = "element 2";
		private static final String ELEMENT_ELEM3 = "element 3";
		private static final String ELEMENT_ELEM4 = "element 4";
		private static final String ELEMENT_ELEM5 = "element 5";
		private static final String ELEMENTTEST_ELEM0 = "elem0";
		private static final String ELEMENTTEST_ELEM1 = "elem1";
		private static final String ELEMENTSOURCE = "elementsource";
		private static final String ELEMENT_ELEMENT_LIST = "element list";
		private static final String ELEMENT_ELEMENT_COMMENT = "comment";

		/**
		 * Constructor for a SequentialTreeBuilderTest.
		 * The TestFile must be in a subdirectory named like the sequence for the test.
		 * @param testFile the path to the XML file
		 */
		private SequentialTreeBuilderTest(String testFile) throws IOException, SAXException {
			InputStream in = SequentialTreeBuilderTest.class.getResourceAsStream(testFile);
			Reader reader = new InputStreamReader(in);
			StreamSource streamSource = new StreamSource(reader);

			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();

			InputSource xml = new InputSource(xmlInput);
			Document doc;
			doc = db.parse(xml);

			rootElement = doc.getElementsByTagName(ELEMENT_ELEM_LIST)[0];
			assertNotNull(rootElement);
			assertTrue(rootElement.getNoChildren());
			
			xmlInput.reset();
		}
	    	private static Set getElements(Document doc, Element e){
			XPath xPath = XPathFactory.newInstance().newXPath();
			return (Set) xPath.evaluate(ELEMENT_ELEM_LIST, doc, XPathConstants.NODESET);
	    	}
	    	public static void runTest(Element rootElement, ElementType type) throws SAXException, IOException {
	    		// create the test document
	    		Document doc = new Document(XMLHEADER);
	    		XPathFactory xPath = XPathFactory.newInstance();

	    		// parse the document
	    		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
	    		DocumentBuilder db = dbf.newDocumentBuilder();
	    		InputSource inputSource = new InputSource(SequentialTreeBuilderTest.class.getResourceAsStream(TEST_FILE));   		
	    		RootDocument rd = db.parse(inputSource);
	    		assertNotNull("No root element in document", rd);
	    		assertTrue("Document is not a root element", rd.getRoot().getAttributes().hasAttribute(ELEMENT_ELEM_LIST) ||
	    				rd.getRootNode().getChildNodes().hasChildNodes());

	    		// get the root element, it must exist
	    		Element e = rd.getDocumentElement();
	    		assertNotNull(e);
	    		assertTrue("The element must be a root node", rd.getRoot().getFirstChild() == null);
	    		assertEquals(e.getNodeType(), type.ordinal());
	    		
	    		// build the tree from the document
	    		if (e.hasChildNodes()) {
	    			e = e.getFirstChildNode();
	    			while (e!= null) {
		    			if (e.getNodeType() == Node.ENTITY_NODE) {
		    				Element tempElement = (Element) xPath.evaluate("/elem", e, XPathConstants.NODE);
		    				assertNotNull(tempElement);
		    				System.out.println(TypeUtil.nodeToString(tempElement.toString()));
		    			}
		    			e = e.getNextSiblingNode();
					}
	    		}
	    		System.out.println(rootElement.toString());
	    	}
	    	@Test
		public void testBuilder() throws Exception {
			// get the sequence and start looping
			SequentialTreeBuilder builder = new SequentialTreeBuilder();
			Thread thread = new Thread(builder);
			thread.start();
			thread.join();

			Element rootElement = builder.build(rootElement);
	    		System.out.println(rootElement.toString());
			assertEquals(rootElement, doc.getElementsByTagName(ELEMENT_ELEM1)[0]);

			// get the sequence and start looping again
			builder = new SequentialTreeBuilder();
			thread = new Thread(builder);
			thread.start();
			thread.join();

			rootElement = builder.build(rootElement);
	    		System.out.println(rootElement.toString());
			assertEquals(rootElement, doc.getElementsByTagName(ELEMENT_ELEM0)[0]);

			// get the sequence and start looping again
			builder = new SequentialTreeBuilder();
			thread = new Thread(builder);
			thread.start();
			thread.join();

			rootElement = builder.build(rootElement);
	    		System.out.println(rootElement.toString());
			assertTrue(rootElement.getChildren().hasChildNodes());
		}
	}