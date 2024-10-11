// XTreeUtil_1Test.java
package nu.staldal.xtree;

import java.util.*;
import java.io.*;
import java.net.URL;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.sax.*;
import javax.xml.transform.stream.StreamResult;
import org.xml.sax.*;
import org.iso_relax.verifier.*;
import nu.staldal.xmlutil.ContentHandlerFixer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XTreeUtil}.
* It contains one unit test case for the {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)} method.
*/
class XTreeUtil_1Test {
// XTreeUtil.java
package nu.staldal.xtree;

import java.util.*;
import java.io.*;
import java.net.URL;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.sax.*;
import javax.xml.transform.stream.StreamResult;
import org.xml.sax.*;
import org.iso_relax.verifier.*;
import nu.staldal.xmlutil.ContentHandlerFixer;

/**
 * Some utility methods for XTree. All methods in this class are static.
 */
public final class XTreeUtil {

    public static Element parseXMLSequential(InputSource xmlInput, boolean validateDTD, String schemaType, InputSource schema, ElementHandler handler) throws SAXParseException, SAXException, IOException {
        try {
            SAXParserFactory parserFactory = SAXParserFactory.newInstance();
            parserFactory.setNamespaceAware(true);
            parserFactory.setValidating(validateDTD);
            XMLReader xmlReader = parserFactory.newSAXParser().getXMLReader();
            SequentialTreeBuilder tb = new SequentialTreeBuilder(handler);
            if (schema!= null) {
                VerifierFactory vf = VerifierFactory.newInstance(schemaType);
                Verifier verifier = vf.newVerifier(schema);
                VerifierFilter filter = verifier.getVerifierFilter();
                filter.setParent(xmlReader);
                xmlReader = filter;
            }
            xmlReader.setContentHandler(tb);
            xmlReader.setErrorHandler(tb);
            xmlReader.parse(xmlInput);
            if ((schema!= null) &&!((VerifierFilter) xmlReader).isValid()) {
                throw new SAXParseException("Invalid XML data", null, null, -1, -1);
            }
            return tb.getRootElement();
        } catch (javax.xml.parsers.ParserConfigurationException e) {
            throw new Error("XML parser configuration error: " + e.getMessage());
        } catch (VerifierConfigurationException e) {
            throw new Error("XML verifier configuration error: " + e.getMessage());
        }
    }
}

// XTreeUtil_1Test.java
package nu.staldal.xtree;

import java.util.*;
import java.io.*;
import java.net.URL;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.sax.*;
import javax.xml.transform.stream.StreamResult;
import org.xml.sax.*;
import org.iso_relax.verifier.*;
import nu.staldal.xmlutil.ContentHandlerFixer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XTreeUtil}.
* It contains one unit test case for the {@link XTreeUtil#parseXMLSequential(InputSource, boolean, String, InputSource, ElementHandler)} method.
*/
class XTreeUtil_1Test {
		private File dataDir;
		private XMLResource xmlDataFile;
	 				
		XTreeUtil_1Test(XTreeUtil xmlUtil, File dataDir, InputSource xDataFile, InputSource xmlDataFile) throws Exception {
			this.dataDir = dataDir;
			this.xmlDataFile = new XMLResource(xmlDataFile);
			this.dataDir.mkdirs();
		}
		
		/**
		 * This method tests that the XML dataFile will be correctly parsed and the data will be correctly retrieved.
		 */
		@Test
		public void test_parseXML() throws Exception {
			Element rootElement = parseXML(this.xmlDataFile, false, null);
			assertEquals("Root element should be the root element", XTreeImpl.ROOT_ELEMENT, rootElement);
			
			setInputText("test_parseXML", "This is just testing the parsing of XML data file.");
			ArrayList<Element> parsedElements = new ArrayList<Element>();
			rootElement.traverse(new AllElementsTraverser(parsedElements, true));
			assertEquals("Parsed list not equal to the parsed list", parsedElements, Collections.synchronizedList(XTreeUtil.asList(rootElement)));
		}
		
		/**
		 * This method also tests that the root element will be correctly retrieved.
		 */
		@Test
		public void test_getRootElement() throws Exception {
			Parser parser = XMLReaderFactory.createXMLReader(this.xmlDataFile);
			XTreeUtil util = new XTreeUtil(parser);
			Element rootElement = util.getRootElement();
			assertEquals("Root element should be the root element.", XTreeImpl.ROOT_ELEMENT, rootElement);
			
		}
		
		/**
		 * This method also tests that the root element will be correctly retrieved.
		 */
		@Test
		public void test_getRootPara() throws Exception {
			Parser parser = XMLReaderFactory.createXMLReader(this.xmlDataFile);
			XTreeUtil util = new XTreeUtil(parser);
			util.addElementHandler(new ContentHandlerFixer() {
				public void handleContent(Element element) throws SAXException, IOException {
					assertEquals("Nodes should have correct child nodes.", XParser.ROOT_MARKUP, element.getNodeName());
				}
			});
			
			ArrayList<Element> parsedElements = new ArrayList<Element>();
			rootElement.traverse(new AllParaElementsTraverser(parsedElements, false));
			assertEquals("Parsed list not equal to the parsed list", parsedElements, Collections.synchronizedList(XTreeUtil.asList(rootElement)));
		}
	 	
		/**
		 * This method tests that XML datafiles are provided by the {@link ContentHandlerFilter} and parsed.
		 */
		@Test
		public void test_ContentHandlerFilter_and_Parsing() throws Exception {
			URL contentFile = getClass().getResource("ContentHandlerFilterTest_1.xml");
			XMLResource dataFile = new XMLResource(contentFile);
			
			this.xmlDataFile = dataFile;
			Parser factory = XMLFactory.newInstance();
			Parser parser = factory.newSAXParser().getXMLReader();
			ArrayList<Element> elements = new ArrayList<Element>();
			parser.setContentHandler(elements);
//			parser.parse( new InputSource( dataFile.getContent() ) );
			parser.parse(dataFile.getContent());
			assertNotNull("Missing content handler after parsing.", elements);
			assertTrue("There should be at least one node.", elements.size() > 0);
			assertTrue("The root node should be the root element.", elements.get(0) == 
				XMLUtils.getRootElement( parser ));
			
			parser.setFeature("http://apache.org/xml/features/validation", false);
			
			XMLReaderFilter filter = new XMLReaderFilter();
			filter.setContentHandler(elements);
//			filter.setDocumentHandler( elements );
			parser.addFilters(filter);
			parser.parse( new InputSource( dataFile.getContent() ) );
			assertNotNull("Missing content handler after parsing.", elements);
			assertTrue("There should be at least one node.", elements.size() > 0);
			assertTrue("The root node should be the root element.", elements.get(0) == 
				XMLUtils.getRootElement(parser));
		}
	 	
		private void setInputText(String functionName, String value) throws IOException {
			File f = new File(this.dataDir + File.separator + "test_" + functionName + ".xml" ) ;
			try {
				StreamResult streamResult = new StreamResult( f );
				StreamHandler streamHandler = new StreamHandler( streamResult ) ;
				streamHandler.startDocument();
				streamHandler.startElement( "XTree", "", "", ContentHandlerFixer.getInstance().getXMLNS());
                
				streamHandler.startElement( "XString", "", "", new StringBuilder("hello"));
                
				streamHandler.endElement( "XTree", "", "");

				streamHandler.endElement(