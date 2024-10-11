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
		
/*
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");

    @Test
    void test1() {
        try {
            Date date = sdf.parse(">1900-01-01T00:00");
            Double value = new DateExpression().evaluate(date);
            System.out.println (value);
        } catch (ParseException pex) {
            System.out.println ("FAIL");
            pex.printStackTrace ();
            fail ("FAIL");
        } catch (IllegalArgumentException exc) {}
    }
*/

    @Test
    void test2() {
        try {
            Date date = new DateExpression().evaluate(new File(""));
            Double value = new DateExpression().evaluate(date);
            System.out.println (value);
        } catch (ParseException pex) {
            System.out.println ("FAIL");
            pex.printStackTrace ();
            fail ("FAIL");
        } catch (IllegalArgumentException exc) {}
    }

    /**
     * Test whether the current node being processed is a text node.
     * @throws XPathExpressionException
     * @throws IllegalArgumentException
     * @throws ParseException
     */
    @Test
    public void test3() throws XPathExpressionException, IllegalArgumentException, ParseException {
        Node node = documentFactory.createDocument().getFirstChild();
        assertEquals (node.getNodeTyp(), Node.TEXT_NODE);
    }

    @Test
    public void test4() throws XPathExpressionException, IllegalArgumentException, ParseException, IllegalAccessError, IOException, ParserConfigurationException {
        Document document = documentFactory.newDocument();
        document.appendChild(createTestNode(document));
        document.getDocumentElement();
    }

    @Test
    @org.junit.jupiter.api.AfterEach
    public void afterTest() {
        documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
    }

    protected Document createTestNode(Document document) {
        document.appendChild(documentFactory.newDocument("" /* xsl:stylesheet */,document.createAttributeNS("http://www.w3.org/1999/xlink","href")).createTextNode("test"));
        documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
    }

    protected DocumentBuilderFactory documentFactory;
    protected Document document;
}

/*
class DoubleConvertible {
    public Double get() {
        return null;
    }

    public Double evaluate(Date value) {
        return null;
    }
}
*/

class DateExpression {
    public Double evaluate(Date date) throws IllegalArgumentException, ParseException {
        return null;
    }
}