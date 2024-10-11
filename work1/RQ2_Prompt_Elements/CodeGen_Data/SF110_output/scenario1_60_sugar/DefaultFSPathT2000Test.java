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

    @Test
    public void aDate() throws IOException, XPathExpressionException {
        System.out.println("date query");
        System.out.println("SimpleDateFormat format=\"YYYY-MM-DDTHH:mm\"");
        
        File f = new File("../../src/net/sf/sugar/fspath/DefaultFSPathTest_aDate.xml");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(f);
        XPathFactory xpf = XPathFactory.newInstance();
        XPath xpath = xpf.newXPath();
        XPathExpression xpe = xpath.compile("//*[@href]");
        Map<QName, Object> vals = new HashMap<>(2);
        vals.put(XPathConstants.STRING, "2010-01-01");
        vals.put(XPathConstants.STRING, "2010-01-01");
        Map<String, String> namespaces = new HashMap<>();
        namespaces.put("tld", "http://www.w3.org/ns/ttml#tld");
        validate(xpe, doc, 1, 2, namespaces, vals);
        //validate(xpe, doc, 1, 2, namespaces, vals);
    }
    
    @Test
    public void rootDirectory() throws IOException, XPathExpressionException {
        System.out.println("rootDirectory query");
        System.out.println("SimpleDateFormat format=\"YYYY-MM-DDTHH:mm\"");

        File f = new File("../../src/net/sf/sugar/fspath/DefaultFSPathTest_rootDirectory.xml");

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(f);
        XPathFactory xpf = XPathFactory.newInstance();
        XPath xpath = xpf.newXPath();
        XPathExpression xpe = xpath.compile("//*[@href]");

        Document doc2 = xpe.evaluate("/");
        validate(xpe, doc2, 1, 2, null, null);
    }
    
    /**
    * Test the {@link #query(String)} method, with and without namespaces.
     * All variables are in XML format;
     * variables can be accessed using XPath expressions.
     * @throws IOException
     */
    private void validate(XPath xp, Document doc,
            int first, int second, Map<String, String> namespaces,
            Map<QName, Object> vals) throws IOException {
        NodeList result = (NodeList) (doc.evaluate("//div[@class='element']/i/text()",
                doc, XPathConstants.NODESET));
        assertNotNull(result);
        assertEquals(4, result.getLength());

        final Element resultElement = (Element) result.item(0);
        assertNotNull(resultElement);
        Node textNode = resultElement.getOwnerDocument().importNode(resultElement.getFirstChild(), true);
        assertNotNull(textNode);
        assertEquals("test", textNode.getAttributeNode("xmlns").getValue());
        
        // check XPath expression namespaces
        first++;
        assertTrue(first <= 1);
        assertTrue(first <= second);
        assertNotNull(validateQName(new QName("first", DocTypeNamespaceMap.class),
                new String[]{"first"}, resultElement));
        first++;
        assertTrue(first <= 1);
        assertTrue(first <= second);
        assertNotNull(validateQName(new QName("second", DocTypeNamespaceMap.class),
                new String[]{"second"}, resultElement));
        first++;
        assertTrue(first <= 1);
        assertTrue(first <= second);
        assertNotNull(validateQName(new QName("third", DocTypeNamespaceMap.class),
                new String[]{"third"}, resultElement));
        first++;
        last = first;

        first++;
        assertTrue(first <= 2);
        assertTrue(first <= second);
        assertNotNull(validateQName(new QName("fifth", DocTypeNamespaceMap.class),
                new String[]{"fifth"}, resultElement));
        first++;
        assertTrue(first <= 2);
        assertTrue(first <= second);
        assertNotNull(validateQName(new QName("sixth", DocTypeNamespaceMap.class),
                new String[]{"sixth"}, resultElement));
        first++;
        assertTrue(first <= 2