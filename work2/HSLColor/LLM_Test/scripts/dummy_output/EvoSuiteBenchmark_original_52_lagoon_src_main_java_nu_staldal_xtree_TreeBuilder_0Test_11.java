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
		private final Document doc;

		/**
		* Create an instance of the TreeBuilder Test Class.
		* @param doc a Document
		*/
		public TreeBuilder_0Test(Document doc) {
			this.doc = doc;
		}

		/**
		* Creates an InputSource from an XML file.
		* @param filename input file
		* @return the InputSource for the input file
		* @throws Exception if an error occurs
		*/
		public InputSource fileToInputSource(String filename) throws Exception {
			List children = doc.getDocumentElement().getElementsByTagName("InputSources");
			if (children == null || children.size() == 0) {
				throw new Exception("TreeBuilder.fileToInputSource: could not get XML: no Input Sources");
			}
			String xmlDocument = children.get(0).getFirstChild().getTextContent();
			parser = XMLReaderFactory.createXMLReader(new StringReader(xmlDocument));
			List inputs = doc.getDocumentElement().getElementsByTagName("InputFile");
			if (inputs == null || inputs.size() == 0) {
				throw new Exception("TreeBuilder.fileToInputSource: could not get XML: no Input File");
			}
			return ((InputSource)inputs.get(0));
		}

		/**
		* Test case for the {@link TreeBuilder#fileToInputSource(String)} method.
		*/
		@Test
		public void testFileToInputSource() throws Exception {
				String xmlDocument = "<s2:inputSource>" + new File(TEMPLATE_FILE).getName() + "</s2:inputSource>";
				InputSource inputSource = fileToInputSource(TEMPLATE_FILE);
				TreeBuilder tb = new TreeBuilder();

				InputSource result = tb.fileToInputSource(inputSource.getPublicId());

				assert(result.getPublicId()!= null);
				assert(result.getSystemId()!= null);

                // System.out.println("result.getName() = " + result.getName() + ", result.isEncodingKnown() = " + result.isEncodingKnown());
			String errorMessage = result.toString();
			if (errorMessage.indexOf("does not have a valid encoding")!= -1) {
					assert(false);
			}
		}

		/** Test method for {@link TreeBuilder#build()}. */
		@Test
		public void testBuild_0() throws Exception {
				TreeBuilder tb = new TreeBuilder();

				tb.startDocument();
				tb.startElement("s2", "s2:input");
				tb.startElement("s2", "s2:output");
				tb.startElement("s2", "s2:parameters");
                                tb.startElement("s2", "s2:references");
				tb.endElement();
				tb.endElement();
				tb.endElement();
				tb.endElement();
				tb.endElement();
				tb.endDocument();

				Element parsedElt = tb.build();
				DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
				dbf.setValidating(true);
				Document parsedDoc = dbf.newDocumentBuilder().parse(new File(TEMPLATE_FILE));
				assert(parsedElt!= null);
				XMLReader xmlReader = new SAXReader();
				assert(parsedDoc.getDocumentElement()!= null);
				assert(parsedDoc.getDocumentElement().getNodeType() == Node.ELEMENT_NODE);
				xmlReader.setContentHandler(parsedDoc);
				xmlReader.setErrorHandler(new TreeBuilder_0Test(parsedDoc));
				xmlReader.parse(new InputSource(new StringReader(xmlDocument)));
		}

		/** Test method for {@link TreeBuilder#build()}. */
		@Test
		public void testBuild_1() throws Exception {
				File xmlFile = new File(TEMPLATE_FILE);
				String xmlDocument = xmlFile.getName();
				TreeBuilder tb = new TreeBuilder();

				tb.startDocument();
                                tb.startElement("s2", "s2:input");
				tb.startElement("s2", "s2:output");
				tb.startElement("s2", "s2:parameters");
                                tb.startElement("s2", "s2:references");
                        tb.endElement();
				tb.endElement();
				tb.endElement();
				tb.endElement();
				tb.endDocument();

				Element parsedElt = tb.build();
				DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
				dbf.setValidating(true);
				Document parsedDoc = dbf.newDocumentBuilder().parse(new InputSource(new FileInputStream(xmlFile)));
				assert(parsedElt!= null);
				XMLReader xmlReader = new SAXReader();
				assert(parsedDoc.getDocumentElement()!= null);
				assert(parsedDoc.getDocumentElement().getNodeType() == Node.ELEMENT_NODE);
				xmlReader.setContentHandler(parsedDoc);
				xmlReader.setErrorHandler(this);
				xmlReader.parse(new InputSource(new StringReader(xmlDocument)));
		}
}