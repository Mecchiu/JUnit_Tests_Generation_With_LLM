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
		
	public DefaultFSPathTest() {
	}

	/**
	* Creates an empty new instance of DefaultFSPath
	*/
	@Test
	public void TestConstructorNewInstance() {
		DefaultFSPath defaultFSPath = new DefaultFSPath(new File("/tmp"));
		assertTrue(defaultFSPath.equals(new DefaultFSPath(new File("/tmp"))));
	}

	/**
	 * Creates a new instance of a new instance of {@link DefaultFSPath}.
	 * It is the same as creating a new instance directly of a {@link FSPath} and using the
	 * {@link DefaultFSPath#query(String) query(expression)}, where expression is a "xpath" statement.
	 *
	 */
	@Test
	public void TestConstructorNewInstanceExpression() throws XPathExpressionException {
		String expression = "/tmp//file[contains(normalize-space(text()), 'D')]";
		DefaultFSPath defaultFSPath = new DefaultFSPath(new File("/tmp/D"));
		QName returnType = new QName("", "file");
		FSPathResultList results = defaultFSPath.query(expression, returnType);
		assertTrue("Expression not returned correctly as new instance", results.size() > 1);
		assertTrue(results.contains(new FSPathResult(new File("/tmp/D"), returnType)));
		assertTrue(results.equals(new DefaultFSPathResultList(new FSPathResultList(new DocumentBuilderFactory(),
				new XPathFactory())
				.newDocumentBuilder().newDocument(), returnType)));
	}
	
	/**
	 * Test method for {@link DefaultFSPath#query(String)}.
	 * It tests the {@link FSPath#query(String, QName) query(String, QName)} method which takes a map as the map
	 * as its key in the map.
	 */
	public void testQueryList() throws XPathExpressionException, ParseException {
		Map<String, String> maps = new HashMap();
		DefaultFSPath defaultFSPath = new DefaultFSPath(new File("/tmp"));
		maps.put("normalize-space", new FSPathResult(new Date(), null).toString());
		maps.put("pathConcat", new FSPathResult(new File("/tmp"), null).toString());
		String expression = "/tmp//file[contains(normalize-space(text()), 'D')]";
		FSPathResult result = defaultFSPath.query(expression, "QName");
		assertTrue((result!= null) && (result.toString().equals(new FSPathResult(new File("/tmp/D"), null).toString())));
}
}