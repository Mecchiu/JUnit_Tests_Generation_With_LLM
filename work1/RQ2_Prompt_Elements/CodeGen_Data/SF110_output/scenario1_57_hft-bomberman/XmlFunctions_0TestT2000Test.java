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

    private static final String PATH = "log4j.logger.path";
    public static Logger logger = Logger.getLogger(XmlFunctions_0Test.class);
	
    @Test
    public void testGetXmlValueWithoutParameter() {
        logger.info("testGetXmlValueWithoutParameter");
        
        String result = XmlFunctions.getXmlValue("/faketest/files/files/file#nofa");
        assertTrue("file doesn't exist or it's not a file",
                result.equals("<file>"));
    }
	
    @Test
    public void testGetXmlValueWithEmptyParameter() {
        logger.info("testGetXmlValueWithEmptyParameter");
        
        String result = XmlFunctions.getXmlValue("/faketyp:files/files/file#name:empty");
        assertTrue("file doesn't exist or it's not a file",
                result.equals("<file>"));
    }
	
    @Test
    public void testGetXmlValueWithParameter() {
        logger.info("testGetXmlValueWithParameter");
        
        String result = XmlFunctions_0Test.getXmlValue("/faketyp:files/files/file#name:name");
        assertTrue("file doesn't exist or it's not a file",
                result.equals("<file>"));
    }

     @Test
    public void testGetXmlValueWithWholeQueryString() {
         logger.info("testGetXmlValueWithWholeQueryString");
     
     String result = XmlFunctions_0Test.getXmlValue("/faketyp:files/files/file#name:name ");
         assertTrue("file doesn't exist or it's not a file",
                 result.equals("<file>"));
    }
	
     @Test
    @TestLogging(namespace = "log4j", level = "WARNING")
    public void testGetXmlValueWithSingleQueryString() {
         logger.info("testGetXmlValueWithSingleQueryString");
     
     String result = XmlFunctions_0Test.getXmlValue("/faketyp:files/files/file#name:name");
         assertTrue("file doesn't exist or it's not a file",
                 result.equals("<file>"));
    }

    @Test
    @TestLogging(namespace = "log4j", level = "DEBUG")
    public void testGetXmlValueWithQueryString1() {
    
     String result = XmlFunctions_0Test.getXmlValue("/faketyp:files/files/file#name:name?qeq=");
         assertTrue("file doesn't exist or it's not a file",
                 result.equals("<file>"));
    }
	
    @Test
    @TestLogging(namespace = "log4j", level = "DEBUG")
    public void testGetXmlValueWithQueryString2() {
         logger.info("testGetXmlValueWithQueryString2");
     
     String result = XmlFunctions_0Test.getXmlValue("/faketyp:files/files/file#name:name?qeq=nofa");
         assertTrue("file doesn't exist or it's not a file",
                 result.equals("<file>"));
    }
	
    @Test
    @TestLogging(namespace = "log4j", level = "DEBUG")
    public void testGetXmlValueWithQueryString3() {
     
     String result = XmlFunctions_0Test.getXmlValue("/faketyp:files/files/file#name:name?qeq=nofa ");
         assertTrue("file doesn't exist or it's not a file",
                 result.equals("<file>"));
    }
	
    @Test
    @TestLogging(namespace = "log4j", level = "DEBUG")
    public void testGetXmlValueWithQueryString4() {
         
     String result = XmlFunctions_0Test.getXmlValue("/faketyp:files/files/file#name:name?qeq=nofa");
         assertTrue("file doesn't exist or it's not a file",
                 result.equals("<file>"));
    }
	
    /**
     * Test of getXmlValue method, of class XmlFunctions.
     */
    @Test
    public void testGetXmlValueWithEmptyNodeList() {
        logger.info("testGetXmlValueWithEmptyNodeList");
        try {
            String result = XmlFunctions.getXmlValue(null);
            assertTrue("nodeList doesn't reference a file",
                   !result.equals("<file>"));
            assertTrue("nodeList reference a file ",
                    result.equals("<file>"));
        } catch (IOException e) {
            e.printStackTrace();
            fail("Unexpected IOException");
        }
    }

    /**
     * Test of getXmlValue method,