// DefaultFSPathTest.java
package net.sf.sugar.fspath;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import net.sf.sugar.fspath.xpath.RegexFunctionResolver;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultFSPath}.
* It contains one unit test case for the {@link DefaultFSPath#query(String)} method.
*/
class DefaultFSPathTest {

    /**
     */
    private static final DocumentBuilderFactory df=DocumentBuilderFactory.newInstance();
    private static final XPathFactory xpf=XPathFactory.newInstance();
    
    // Test Constructors
    /**
     * Test of null constructor, of class net.sf.sugar.fspath.DefaultFSPath.
     */
    @Test
    public void testConstructor_2() {
        new DefaultFSPath(null);
    }
    
    /**
     */
    public void testQuery_0() {
        FSPathResultList result = new DefaultFSPath().query("> 10  <");
        File root = new File("testData/defaultFSPathTest/FSPathTest");
        FSPathQueryFunction q = new FSPathQueryFunction("//*[@name='name']", "test");
        assertTrue(q.test(root,result));
    }
    
    /**
     */
    @Test
    public void testQuery_1() {
        FSPathResultList results = new DefaultFSPath().query("/  /**   test   /** */ / *");
        /*
        File root = new File("testData/defaultFSPath/FSPathTest");
        
        FSPathQueryFunction q = new FSPathQueryFunction("//*[@name='parent']", "test");
        File target = new File("/  FSPathTest/testFSPath.xml");
        
        //
        File childFile = new File("/  FSPathTest/FSPathTest2.xml");
        try {
            NodeList childNodes = documentBuilder.parse("<ns:node n='"+ target.getName()+"'>"+target.getAbsolutePath()+"</ns:node>").getDocumentElement().getElementsByTagName("node");
        } catch (Exception e) {
            fail("Unable to parse XML file "+target.getAbsolutePath());
        }
        
        
        doc = documentBuilder.newDocument();
        for (int i=0; i < childNodes.getLength(); i++) {
            Node child = childNodes.item(i);
            Element childElem = doc.createElement("test");
            target.appendChild(target.createTextNode(child.getNodeValue()));
            childElem.appendChild(child.getNodeValue());
            Element parentElem = doc.createElement("parent");
            parentElem.appendChild(target);
            Element newChildElem = doc.createElement("node");
            newChildElem.appendChild(childElem);
            newChildElem.appendChild(parentElem);
            childElem.appendChild(newChildElem);
            
        }
        */
        FSPathQueryFunction q = new FSPathQueryFunction("//*[@name='parent']", "test");
