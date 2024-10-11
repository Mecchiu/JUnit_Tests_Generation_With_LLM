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
		
//   @Test
//	public void test1() throws Exception {
//		String testCasePath = "Test1.test";
//		OutputStream originalOutputStream = null;
//		try {
//			URL resource = XMLTreeTest.class.getResource(testCasePath);
//			ResourceAccessor resourceAccessor = new ResourceAccessor(resource);
//
//			// set a temporary folder
//
//			Resource folder = null;
//
//			// write the original file
//			int originalFileCount = 0;
//			while(null!= (folder = resourceAccessor.useResource(resource))) {
//				originalFileCount++;
//				File file =
//						new File(folder,
//								testUtil.toString(TEMP_DIR + File.separator
//										+ originalFileCount
//										+ ".xml")
//							);
//				if(file.getParentFile().isDirectory()) {
//					break;
//				}
//				file.delete();
//				OutputStream newOutputStream = null;
//				try {
//					newOutputStream = new FileOutputStream(file);
//				}
//				catch (FileNotFoundException e) {
//					// this should not happen
//				}
//				finally {
//					if(newOutputStream!= null) {
//						newOutputStream.close();
//					}
//				}
//				originalOutputStream = newOutputStream;
//			}
//			fileCount = originalFileCount;
//
//
//			// get the file to parse
//			URL xmlURL =
//					XMLTreeTest.class.getResource(testCasePath);
//			XMLInputSource xmlSource =
//					new XMLInputSource(xmlURL.openStream());
//			Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(xmlSource);
//			Element root = doc.getDocumentElement();
//
//			// replace the file with a XML output
//			root.removeChild(root.getChildNodes().item(0));
//			root.getChildNodes().addItem(
//					doc.createElementNS(XTreeTest.XMLNS, "schema").setAttribute("type", "http://relaxng.org/ns/rng")
//							);
//
//			// transform the xml contents into an XML output file with fix for the problem noted above
//			if(validateDTD) {
//				StreamResult streamResult = new StreamResult(new File(originalOutputStream.toString()));
//				transform(doc, streamResult, new ContentHandlerFixer(root));
//			}
//			else {
//				transform(doc, new StreamResult(originalOutputStream), new ContentHandlerFixer(root));
//			}
//
//			// verify the modified file; will not write the modified file to stdout if that is the case.
//			XTreeUtil_1Test classUnderTest = new XTreeUtil_1Test();
//			assertEquals("Error at " + testCasePath + ".class", "1 test case", classUnderTest.classNumber);
//
//			verifyXMLFile(fileCount, originalFileCount, classUnderTest);
//		}
//		finally {
//			// if we didn't remove anything from the resource
//			if(null!= originalOutputStream) {
//				originalOutputStream.close();
//			}
//		}
//	}

//	private static int classNumber = 7;
//	private static int fileNumber = 9;
//	private int originalFileCount;
//	private int[] fileNumbers;
//	private String tempDTDSource;
//	private String tempDTDTarget;
//	private String schemaType = ContentHandlerFixer.SCHEMA;
//	private boolean validateDTD;
//	private boolean fixedXml;
//	private String tempSchemaSource;
//	private String tempSchemaTarget;
//	private String schemaRootElementName;
//	private ElementHandler elementHandler = new ContentHandlerFixer(classUnderTest);
//
//	private void verifyXMLFile(int expectedFileCount, int originalFileCount, XTreeUtil_1Test classUnderTest) throws IOException {
//		// this test file is expected to have one subelement
//		// for each element under the root of the XML file. The root
//		// element of the XML file must contain only one
//		// subelement
//
//		assertEquals("Error at " + testCasePath + ".verifyXMLFile", expectedFileCount, fileNumbers[0]);
//
//		// for each element under the root of the xml
//		for(int i=0; i<originalFileCount; i++) {
//			assertEquals("Error at " + testCasePath + ".expectedFile[0][i]", fileNumbers[i], fileNumbers[i+1]);
//		}
//
//		// get the root element
//		fileNumbers = classUnderTest.fileNumbers;
//		originalFileCount = fileNumbers[fileNumber];
//		fileNumber++;
//
//		// get the element under the root
//		assertEquals("Error at " + testCasePath + ".expectedElementUnderRoot[1]", 1, fileNumbers[fileNumber++]);
//		Element rootElement = classUnderTest.rootElement;
//
//		assertTrue("No root element under the root in " + testCasePath,
//				rootElement.getLocalName().equals(XTreeTest.SCHEMA_ROOT_ELEMENT_NAME)
//					? true
//					: false);
//
//		// for each element under the root of the XML file
//		for(int i=fileNumber-1; i>=fileNumber-1-originalFileCount; i--) {
//			assertEquals("Error at " + testCasePath + ".expectedFile[
}