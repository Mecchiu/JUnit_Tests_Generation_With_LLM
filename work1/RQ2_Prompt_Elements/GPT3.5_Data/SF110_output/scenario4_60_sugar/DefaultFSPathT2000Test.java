// DefaultFSPath.java
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

/**
 *  The default implementation of the FSPath interface.
 *  This class uses the JDK's XPath implementation as the basis for
 *  FSPath queries.
 *  On instantiation, a DOM is created of the filesystem metadata starting form the <code>rootDirectory</code>.
 *  This DOM can then be queried using standard XML tools.
 *  <br/>
 *  Whilst this approach has been relatively quick to implement, it is still tied to the limitations of XPath.
 *  Future implementations of this class are likely to implement the FSPath language fully themselves wthout relying on XPath.
 *  <br/>
 *  todo: develop some front end substitution to enable the short queries i.e. /var/www etc
 *
 * @author keith
 *  $Id$
 */
public class DefaultFSPath implements FSPath {

    /**
     *  Escape characters, we must escape any characters that are
     *  illegal in XML attribute text.
     *
     *  i.e. &amp; " < >
     */
    private Map escapeChars;

    private DocumentBuilder documentBuilder;

    private XPath xpath;

    private Document dom;

    /**
     *  The date format used to correspond to the xs:date format i.e. yyyy-MM-dd'T'HH:mm:ss.SSS
     */
    private DateFormat format;

    private File rootDirectory;

    public DefaultFSPath() {
        escapeChars = createEscapeCharsMap();
        format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
    }

    /**
     * Creates a new instance of DefaultFSPath, based on the directory supplied
     */
    public DefaultFSPath(File currentDir) throws IOException {
        escapeChars = createEscapeCharsMap();
        format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
        rootDirectory = currentDir;
        try {
            createDocumentBuilder();
            dom = buildDOM(currentDir);
            xpath = XPathFactory.newInstance().newXPath();
            xpath.setNamespaceContext(new FSPathNamespaceContext());
            xpath.setXPathFunctionResolver(new RegexFunctionResolver());
        } catch (ParserConfigurationException e) {
            throw new IOException(e.getMessage());
        } catch (XPathExpressionException e) {
            throw new IOException(e.getMessage());
        }
    }

    protected Map createEscapeCharsMap() {
        Map map = new HashMap();
        map.put("&", "&amp;");
        map.put("\"", "&quot;");
        map.put("<", "&lt;");
        map.put(">", "&gt;");
        return map;
    }

    protected void createDocumentBuilder() throws ParserConfigurationException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        documentBuilder = factory.newDocumentBuilder();
    }

    protected Document buildDOM(File currentDir) throws IOException {
        Element root = createChildElement(documentBuilder.newDocument(), currentDir);
        Document dom = documentBuilder.newDocument();
        dom.appendChild(root);
        return dom;
    }

    private Element createChildElement(Document dom, File currentFile) throws IOException {
        Element element = dom.createElement("file");
        element.setAttribute("name", escapeChars(currentFile.getName()));
        element.setAttribute("path", escapeChars(currentFile.getPath()));
        element.setAttribute("absolutePath", escapeChars(currentFile.getAbsolutePath()));
        element.setAttribute("canonicalPath", escapeChars(currentFile.getCanonicalPath()));
        element.setAttribute("parent", escapeChars(currentFile.getParent()));
        element.setAttribute("lastModified", format.format(new Date(currentFile.lastModified())));
        element.setAttribute("length", Long.toString(currentFile.length()));
        element.setAttribute("directory", Boolean.toString(currentFile.isDirectory()));
        element.setAttribute("hidden", Boolean.toString(currentFile.isHidden()));
        if (currentFile.isDirectory()) {
            File[] children = currentFile.listFiles();
            if (children != null) {
                for (int i = 0; i < children.length; i++) {
                    element.appendChild(createChildElement(dom, children[i]));
                }
            }
        }
        return element;
    }

    /**
     *  Calls this.query(expression, XPathConstants.NODESET)
     *
     *  Note : This method MUST be passed an expression which returns a nodeset.
     *
     *  @param expression the FSPath expression to execute.
     *  @returns <code>FSPathResultList</code> the FSPathResult objects contained
     *  in this list will be of type <code>java.io.File</code>,
     *  <code>java.lang.Double</code>, <code>java.lang.Boolean</code>,
     *  <code>java.lang.String</code>
     */
    public FSPathResultList query(String expression) throws XPathExpressionException, IllegalArgumentException, ParseException {
        return query(expression, XPathConstants.NODESET);
    }

    /**
     */
    public FSPathResultList query(String expression, QName returnType) throws XPathExpressionException, IllegalArgumentException, ParseException {
        FSPathResultList results = new FSPathResultList();
        NodeList nodes = (NodeList) xpath.evaluate(expression, dom, returnType);
        for (int i = 0; i < nodes.getLength(); i++) {
            processNode(nodes.item(i), results);
        }
        return results;
    }

    private void processNode(Node node, FSPathResultList results) throws XPathExpressionException, IllegalArgumentException, ParseException {
        if (node.getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) node;
            if (element.getAttribute("directory").equals("true")) {
                results.add(new File(element.getAttribute("path")));
            } else {
                String value = element.getAttribute("length");
                if (value != null && value.length() > 0) {
                    results.add(new Double(value));
                }
            }
        } else if (node.getNodeType() == Node.ATTRIBUTE_NODE) {
            Attr attr = (Attr) node;
            String value = attr.getValue();
            if (value != null && value.length() > 0) {
                if (attr.getName().equals("lastModified")) {
                    results.add(format.parse(value));
                } else if (attr.getName().equals("length")) {
                    results.add(new Double(value));
                } else if (attr.getName().equals("directory")) {
                    results.add(new Boolean(value));
                } else {
                    results.add(value);
                }
            }
        }
    }

    public File getRootDirectory() {
        return rootDirectory;
    }

    private String escapeChars(String text) {
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < text.length(); i++) {
            String replacement = (String) escapeChars.get(text.substring(i, i + 1));
            if (replacement != null) {
                buffer.append(replacement);
            } else {
                buffer.append(text.charAt(i));
            }
        }
        return buffer.toString();
    }
}

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
* It contains ten unit test cases for the {@link DefaultFSPath#query(String)} method.
*/
class DefaultFSPathTest {
    private static final String TEST_DIR = "src/test/resources/testdir";
    private static final String TEST_FILE = "src/test/resources/testfile.txt";
    private static final String TEST_FILE2 = "src/test/resources/testfile2.txt";
    private static final String TEST_FILE3 = "src/test/resources/testfile3.txt";
    private static final String TEST_FILE4 = "src/test/resources/testfile4.txt";
    private static final String TEST_FILE5 = "src/test/resources/testfile5.txt";
    private static final String TEST_FILE6 = "src/test/resources/testfile6.txt";
    private static final String TEST_FILE7 = "src/test/resources/testfile7.txt";
    private static final String TEST_FILE8 = "src/test/resources/testfile8.txt";
    private static final String TEST_FILE9 = "src/test/resources/testfile9.txt";
    private static final String TEST_FILE10 = "src/test/resources/testfile10.txt";

    private DefaultFSPath fsPath;

    @Test
    void testQueryAllFiles() throws IOException, XPathExpressionException {
        fsPath = new DefaultFSPath