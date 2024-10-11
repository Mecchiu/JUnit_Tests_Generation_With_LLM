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
	void FSPathTest_testEscapeAndEscapeString() {
		
		FSPath fspath = new DefaultFSPath();
		fspath.query("$escape:\\$esc:\\$ease:\\\\$esc:\\$ease\\$esc");
		
		assertEquals(new Integer(1), fspath.countChildElement(new File("")));
		assertEquals(new Integer(0), fspath.countChildElement(new File("/")));
		assertEquals(new Integer(0), fspath.countChildElement(new File("/var/www")));
		assertEquals(new Integer(1), fspath.countChildElement(new File("/../../..'~!@$%^&<>=")));
	}
	
	@Test
	void FSPathTest_testEscape() {

		FSPath fspath = new DefaultFSPath();
		fspath.query("$escape:\\$esc");

		assertEquals("$escape\\=\\${escape\\=\"\\$esc\"}", fspath.toString());

		fspath = new DefaultFSPath();
}
}