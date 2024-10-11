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
		private final List<TestableElement> elements = new ArrayList<>();
		
		/**
		 * Method to create elements.
		 * @param xmlInput the XML input
		 * @param xmlNamespace the namespace for the xmlns attribute
		 * @param handler handler to invoke for each element
		 */
		protected void populateFromXMLSequential(InputSource xmlInput, boolean xmlNamespace, ElementHandler handler) {
			DocumentBuilder db = null;
			try {
				// create a temp input source for the data.
				InputStream input = xmlInput.getCharacterStream();
				String xmlString = Util.toString(input);
				// parse the data, and return the XML tree
				Document dom = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new InputSource(new ByteArrayInputStream(xmlString.getBytes())));
				Element rootElement = dom.getDocumentElement();
				
				// parse the XML document to get all the elements.
				db = new DocumentBuilder();
				db.setErrorHandler(handler);
				
				// add elements
				for (int i = 0; i < dom.getElementsByTagNameNS(xmlNamespace, "element" ).getLength(); i++) {
					String elemType = DomUtil.getChildName((Element) dom.getElementsByTagNameNS(xmlNamespace, "element" ).item(i)).trim();
					if (!elemType.equals("test") &&!elemType.equals("testelement") &&!elemType.equals("elements")) {
						TestableElement te = null;
						try {
							te = (TestableElement) TestableElement.createTestable(new DomUtil.Element(elemType), dom);
						} catch (IllegalArgumentException iae) {
							fail();
						}
						elements.add(te);
					}
				}
				
				return;
			} catch (DocumentException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ParserConfigurationException e) {
				e.printStackTrace();
			} catch (SAXException e) {
				e.printStackTrace();
			} finally {
				closeSource(input);
			}
		}
		
	/**
	 * Test class of {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)}.
	 * A test has to create an empty element list and the elements.
	 */
	
	@Test
	public void testParsing() throws Exception {
		List<TestableElement> elements = new ArrayList<>();
		boolean xmlNamespace = false;
		// set up the test XML document.
		InputSource xmlInput = new InputSource(new File("test.xml"));
		Document dom = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
		Element rootElement = dom.getDocumentElement();
		
		// add elements
		for (int i = 0; i < dom.getElementsByTagNameNS(xmlNamespace, "element").getLength(); i++) {
			String elemType = DomUtil.getChildName((Element) dom.getElementsByTagNameNS(xmlNamespace, "element").item(i)).trim();
			if (!elemType.equals("test") &&!elemType.equals("testelement") &&!elemType.equals("elements")) {
				TestableElement te = null;
				try {
					te = (TestableElement) TestableElement.createTestable(new DomUtil.Element(elemType), dom);
				} catch (IllegalArgumentException iae) {
					fail();
				}
				elements.add(te);
			}
		}
		
		// populate the elements
		populateFromXMLSequential(xmlInput, xmlNamespace, this);
		
		// check the list
		for (int i = 0; i < elements.size(); i++) {
			assertTrue(elements.get(i).isElement());
		}
	}
	
	/**
	 * Close the source.
	 * @param input the input stream to write to
	 */
	private static void closeSource(InputStream input) {
		input.close();
	}
	
}