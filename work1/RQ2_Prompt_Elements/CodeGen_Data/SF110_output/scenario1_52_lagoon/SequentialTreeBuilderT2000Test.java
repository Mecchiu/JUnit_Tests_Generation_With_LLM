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

	/// <summary>Test suite start point.
		private static final String test_suite_name = "SequentialTreeBuilderTest";
		
		/// <summary>Test suite end point.</summary>
		static final String test_suite_end = "done";
		
		private final String xtreeFileLoc;
		private final String xtreeFileEnc;
		private final boolean validateNamespace;
		private final boolean validateDTD;
		
		private final boolean hasParent;
		private Element rootElement = null;

		private SequentialTreeBuilderTest(String baseUrl, String xtreeFileLoc, String xtreeFileEnc, boolean validateNamespace,
				boolean validateDTD) {
			this.xtreeFileLoc = baseUrl + File.separator + xtreeFileLoc;
			this.xtreeFileEnc = xtreeFileEnc;
			this.validateNamespace = validateNamespace;
			this.validateDTD = validateDTD;
		}

		/// <summary>
		/// Start test suite.
		/// </summary>
		public static void main(String[] args) {
			launch(
				SequentialTreeBuilderTest.class,
				args);
		}
		
		/// <summary>
		/// Setup a new suite: start from the top of the tree.
		/// </summary>
		/// <param name="parent">The parent suite.
		/// </param>
		public static void push(SequentialTreeBuilderTest parent) {
			new SequentialTreeBuilderTest(parent.getUrl(), parent.getXtreeFileLoc(), parent.getXtreeFileEnc(),
					parent.getValidateNamespace(), parent.getValidateDTD());
			new SequentialTreeBuilderTest(parent.getUrl(), parent.getXtreeFileLoc(), parent.getXtreeFileEnc(),
				!parent.getValidateNamespace(), parent.getValidateDTD()).push();
		}

		/// <summary>
		/// Pop the current suite from the tree.
		/// </summary>
		/// <param name="parent">The parent suite.
		/// </param>
		public static SequentialTreeBuilderTest pop(SequentialTreeBuilderTest parent) {
			parent.pop();
			return parent;
		}

		/// <summary>
		/// Push tests suite start at the top.
		/// </summary>
		/// <param name="skeleton">The parent suite or <code>null</code>.
		/// </param>
		public static void parent(SequentialTreeBuilderTest skeleton) {
			new SequentialTreeBuilderTest(skeleton.getUrl(), skeleton.getXtreeFileLoc(), skeleton.getXtreeFileEnc(),
						skeleton.getValidateNamespace(), skeleton.getValidateDTD());
			parent(skeleton);
			rootElement = new Element("root");
			skeleton.push(new SequentialTreeBuilder(new ElementHandler() {
				public void handleStartElement(Element e) {
					Element ele = new Element(e.getQName());
					ele.addAttributes(e.getAttributes());
					e.setTextContent(ele.get(0));
					if (hasParent) {
						assertEquals(e.getName(), "parent");
						rootElement = e;
						assertEquals(rootElement.getBackingElement(), ele);
					}
				}
			}));
		}

		/**
		 * Parses a single XML content file.
		 *
		 * @param xmlFileLoc
		 *            Location of the XML.
		 * @param xmlFileEnc
		 *            Encoding used in the file.
		 * @param validateNamespaces
		 *            If the namespaces have been declared in the original file.
		 * @param validateDTD
		 *            If the DTD should be validated.
		 * @return An XML document from the XML file.
		 */
		public Document parseXMLSequential(String xmlFileLoc, String xmlFileEnc, boolean validateNamespaces,
				boolean validateDTD) throws SAXException, IOException {

			try (FileInputStream fis = new FileInputStream(new File(xtreeFileLoc))) {
				return parseXMLSequential(new InputSource(fis), validateNamespaces, validateDTD);
			}
		}
		
		private Document parseXMLSequential(InputSource xmlInput, boolean validateNamespaces, boolean validateDTD)
			throws SAXException
		{
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			factory.setValidating(validateNamespaces);
			factory.setFeature("http://xml.org/sax/features/namespaces", validateNamespaces);
			factory.setFeature("http://xml.org/sax/features/validation", validateDTD);
			
			XMLReader xmlReader = factory.newXMLReader();
			xmlReader.setContentHandler(this);
		    xmlReader.setErrorHandler(this);
		    return xmlReader.parse(xmlInput);
		}
}
