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
	 * @param args
	 */
    public static void main(String[] args) {
        //System.out.println( "defaultFSPathTest" );
    }

    /**
     * Create a new instance of DefaultFSPath, based on the directory provided
     */
    public DefaultFSPath(File currentDir) throws FileNotFoundException, IOException, ParserConfigurationException {
	    // Create DOM document.
	    long start = start();

	    // Create XPath.
	    XPathFactory factory = XPathFactory.newInstance();
	    xpath = factory.newXPath();
	    NodeList rootElements = new DocumentBuilder(null).parse(new File(currentDir, "fspath.xml")).getDocumentElement().getChildNodes();
	    dom = buildDOM(currentDir);

	    if(rootElements.getLength()<3){
		// TODO : error message can't be caught. Maybe the test is broken
		System.err.println("no root element!!");
	    }

	    // Parse and generate the results.
}
}