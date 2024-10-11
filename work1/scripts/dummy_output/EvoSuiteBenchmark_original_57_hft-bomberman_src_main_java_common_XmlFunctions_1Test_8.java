// XmlFunctions_1Test.java
package common;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import org.apache.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XmlFunctions}.
* It contains one unit test case for the {@link XmlFunctions#findXmlNodes(String)} method.
*/
class XmlFunctions_1Test {
		String xPath;
		Document d;
		String name;
		String content; 

	/**
	 * @throws ParserConfigurationException -
	 * @throws XPathExpressionException -
	 */
	@Test
	public void test01() throws ParserConfigurationException, XPathExpressionException {
		File inFile = new File("../data/logins/");
		//System.out.println(inFile.getAbsolutePath());

		openXmlFile(inFile.getAbsolutePath());
		d = createDocument();
		d.setTextContent("<" + name + " " + inFile.getAbsolutePath() + "></" + name + ">");
		findXmlNode(name);
//		System.out.println("File name = "+name+ " has been found in Document XML");
//		findAllXmlNodes();

		NodeList test;
		test = findXmlNodes("<" + name + ">");
		assertListEquals("Found node list <" + name + ">", createDocument().getElementsByTagName("" + name), test);
	}

	// @Test(expected= SAXException.class)
	// public void test02() throws ParserConfigurationException {
//		String path = "../sample/xml_login/xml";
//		File inFile = new File("../data/logins/");
//		
//		if (isXmlFile(path)) {
//			System.out.println("Can find XML file <" + inFile.getAbsolutePath() + ">");
//			openXmlFile(inFile.getAbsolutePath());
//			d = createDocument();
//			d.setTextContent("<" + name + " " + inFile.getAbsolutePath() + "></" + name + ">");
//			
//			findXmlNode(name);
//			fail("Expected failure for <" + name + "> because it has already been parsed");
//		}
//	}
	
	private Document createDocument() {
		try {
			DocumentBuilderFactory xmlFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder xmlFactoryBuilder = xmlFactory.newDocumentBuilder();
			InputSource is = new InputSource(new BufferedReader(new FileReader("data/logins/xml_login/xml")));
			InputSource is2 = new InputSource(new BufferedReader(new FileReader("data/logins/xml_file/xml")));
			return xmlFactoryBuilder.newDocumentBuilder().parse(is);
		} catch(ParserConfigurationException | SAXException| IOException e) {
			e.printStackTrace();
			fail("Error occurs while creating DocumentFactory for xml: "+e.getMessage());
		}
		return null;
	}

	// @Test(expected= SAXException.class)
	// public void test03() throws ParserConfigurationException, SAXException {
//		String xml = XmlFunctions.findXmlNode("<" + name + " " + inFile.getAbsolutePath() + ">").toString();
//		assertTrue("Exception expected", true);
//		
//	}
	
	/**
	 * create Document in case a test file is not found.
	 * Test for the case when there is no xml file
	 */
	@Test
	public void test04() {
}
}