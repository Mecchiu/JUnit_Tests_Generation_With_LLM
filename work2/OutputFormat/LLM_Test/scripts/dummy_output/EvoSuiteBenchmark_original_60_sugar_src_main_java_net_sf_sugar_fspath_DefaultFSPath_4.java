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
         *  Creates a new instance of DefaultFSPathTest with a test object.
         *  This constructor takes two parameters:
         *  rootDirectory: Directory with all documents whose content is tested against.
         *  testResult: A list of test results, one for each tested file.
         */
    private DefaultFSPathTest(File rootDirectory, FSPathResultList testResult){
        this.rootDirectory = rootDirectory;
        this.format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS");
        this.xpath = XPathFactory.newInstance().newXPath();
        this.escapeChars = createEscapeCharsMap();
        this.testResult = testResult;
    }

	/**
         * Creates a new DefaultFSPathTest object and tests a number of different queries.
	 */
    @Test
	public void query() throws IOException, ParserConfigurationException {
        File rootDirectory = new File(this.rootDirectory, "fspath");
        Document dom = null;
	    DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
	
	    dbf.setNamespaceAware(true);
        dbf.setValidating(false);
        dbf.setXIncludeAware(false);

        dbf.setExpandEntityReferences(false);

        DocumentBuilder db = dbf.newDocumentBuilder();
}
}