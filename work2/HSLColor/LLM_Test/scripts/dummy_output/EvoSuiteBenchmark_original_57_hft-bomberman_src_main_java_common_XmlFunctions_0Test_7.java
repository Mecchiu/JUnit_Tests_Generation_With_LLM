// XmlFunctions_0Test.java
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
* It contains one unit test case for the {@link XmlFunctions#getXmlValue(String)} method.
*/
class XmlFunctions_0Test {
		
    /**
     * test for the get XML Value method
     */
    @Test
    void when_callingGetXmlValue_itShouldReturnString() {
        File srcFile = File.createTempFile("target_", "_" + getPackageNumber());
        srcFile.deleteOnExit();
        try {
            OpenXmlFile(srcFile);
        } catch (IOException ex) {
            fail("An exception occurs");
        } catch (ParserConfigurationException ex) {
            fail("An exception occurs");
        }
        String result = XmlFunctions.getXmlValue(srcFile.getCanonicalPath());
        assertEquals("XML is not found", result);
    }

    /**
     * test for the search in the DOM tree
     */
    @Test
    void when_searching_the_same_element_in_the_Dom_tree_itShouldReturnItself() {
        File srcFile = File.createTempFile("target_", "_" + getPackageNumber());
        srcFile.deleteOnExit();
        String result = XmlFunctions.findXmlNode(srcFile.getCanonicalPath());
        assertEquals(srcFile.getName(), result);
    }

    /**
     * test for the get XML Name method
     */
    @Test
    void when_calling_getXmlName_itShouldReturnString() {
        String result = XmlFunctions.getXmlName("xml-file.xml");
        assertEquals("It should return the XML file name", "xml-file.xml", result);
    }

    /**
     * test for the get DOM Node by a specific XPath
     */
    @Test
    void when_calling_getXmlNodeByXPathSearching_itShouldReturnItself() {
        OpenXmlFile(new File("target/src/test/resources/target_20160518_00.xml"));
        String result = XmlFunctions.getXmlNodeByXPath(srcFile.getCanonicalPath(), "//node");
        assertEquals(srcFile.getName() + " is returned for "+srcFile.getName(), "node", result);
    }

    /**
     * test for the get Node by a specific XPath
     */
    @Test
    void when_calling_getXmlNodeByXPathSearching_itShouldReturnItself() {
        OpenXmlFile(new File("target/src/test/resources/target_20160518_00.xml"));
        Node result = XmlFunctions.getXmlNodeByXPath(srcFile.getCanonicalPath(), "//node[@package='XMLFunctions']");
        assertEquals(srcFile.getName() + " is returned for "+srcFile.getName(), "node", result);
    }

    /**
     * test for the get DOM Node by a specific XPath and return result
     */
    @Test
    public void when_calling_getXmlNodeByXPath_itShouldReturnResult() {
        XmlFunctions.setXmlValue(new File("target/src/test/resources/target_20160518_00.xml"), "E1");
        XmlFunctions.setXmlValue(new File("src/test/resources/target_20160518_00.xml"), "E2");
        XmlFunctions.setXmlValue(new File("src/test/resources/target_20160518_00.xml"), "E3");
}
}