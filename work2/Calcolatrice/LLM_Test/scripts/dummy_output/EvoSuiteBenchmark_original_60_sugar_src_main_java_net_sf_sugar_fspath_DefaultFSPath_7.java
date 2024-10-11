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
     * test case which ensures no exceptions are thrown - this case has a single method which takes an expression which returns a nodeset
     */
    @Test
    public void test_NoExceptionsCalled() throws IOException, XPathExpressionException {
        FSPathResultList results;

        results = query("/*");

        assertTrue(results.isEmpty());
    }

    @Test
    public void test_SimpleDateExists() throws IOException, XPathExpressionException {
            
        //this case should never happen since the method should return true/false
        
        FSPathResultList results;

        results = query("1 >= 0");
        assertTrue(results.size() >= 1);
        assertTrue(results.get(0).getIsExpression());
        assertTrue(results.get(0).getIsSimpleDate());
        assertFalse(results.get(0).getIsFunction());
    }

    @Test
    public void test_SimpleDateStringExists() throws IOException {
                        //should always be true because of this case
        
        FSPathResultList results;
 
                 /*

                    1.   1  1
                       0
                     0 >/= 1
        0  == 2
        1 != 4
    */
                     
        results = query("1 >= 0");
        assertTrue(results.size() >= 1);
        assertTrue(results.get(0).getIsExpression());
        assertTrue(results.get(0).getIsSimpleDate());
        assertFalse(results.get(0).getIsFunction());
    }

    @Test
    public void test_SimpleDateNull() throws IOException {
        FSPathResultList results;

        results = query("1 >= 0");
        assertTrue(results.size() >= 1);
        assertFalse(results.get(0).getIsExpression());
        assertFalse(results.get(0).getIsSimpleDate());
    }

    @Test
    public void test_SimpleDateIsString() throws IOException {
         //should always be true because of this case
                         
        FSPathResultList results;

        results = query("1 >= '' || 1 >= '0'");
        assertTrue(results.size() >= 1);
        assertTrue(results.get(0).getIsExpression());
        assertFalse(results.get(0).getIsSimpleDate());
    }

    @Test
    public void test_NoSuchFunction() throws XPathExpressionException, FileNotFoundException, IOException {
                                       //should never happen since the method should return 
                                       
        FSPathResultList results;

        results = query("/not/an/expression/#");
        assertTrue(results.isEmpty());
    }

    @Test
    public void test_functionResolver() throws XPathExpressionException, FileNotFoundException, IOException, ParseException {
}
}