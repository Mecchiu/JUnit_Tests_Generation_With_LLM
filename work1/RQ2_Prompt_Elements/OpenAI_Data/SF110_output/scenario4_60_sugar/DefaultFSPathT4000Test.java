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

	/**
	* Test case for the {@link DefaultFSPath#query(String)} method.
	* It tests the query "/" and expects a result list with one element.
	*/
	@Test
	void testQueryRoot() {
		DefaultFSPath fspath = new DefaultFSPath();
		FSPathResultList result = fspath.query("/");
		assertEquals(1, result.size());
	}
	
	/**
	* Test case for the {@link DefaultFSPath#query(String)} method.
	* It tests the query "/*" and expects a result list with one element.
	*/
	@Test
	void testQueryAll() {
		DefaultFSPath fspath = new DefaultFSPath();
		FSPathResultList result = fspath.query("/*");
		assertEquals(1, result.size());
	}
	
	/**
	* Test case for the {@link DefaultFSPath#query(String)} method.
	* It tests the query "/*/*" and expects a result list with two elements.
	*/
	@Test
	void testQueryAllAll() {
		DefaultFSPath fspath = new DefaultFSPath();
		FSPathResultList result = fspath.query("/*/*");
		assertEquals(2, result.size());
	}
	
	/**
	* Test case for the {@link DefaultFSPath#query(String)} method.
	* It tests the query "/*/*/*" and expects a result list with three elements.
	*/
	@Test
	void testQueryAllAllAll() {
		DefaultFSPath fspath = new DefaultFSPath();
		FSPathResultList result = fspath.query("/*/*/*");
		assertEquals(3, result.size());
	}
	
	/**
	* Test case for the {@link DefaultFSPath#query(String)} method.
	* It tests the query "/*/*/*/*" and expects a result list with four elements.
	*/
	@Test
	void testQueryAllAllAllAll() {
		DefaultFSPath fspath = new DefaultFSPath();
		FSPathResultList result = fspath.query("/*/*/*/*");
		assertEquals(4, result.size());
	}
	
	/**
	* Test case for the {@link DefaultFSPath#query(String)} method.
	* It tests the query "/*/*/*/*/*" and expects a result list with five elements.
	*/
	@Test
	void testQueryAllAllAllAllAll() {
		DefaultFSPath fspath = new DefaultFSPath();
		FSPathResultList result = fspath.query("/*/*/*/*/*");
		assertEquals(5, result.size());
	}
	
	/**
	* Test case for the {@link DefaultFSPath#query(String)} method.
	* It tests the query "/*/*/*/*/*/*" and expects a result list with six elements.
	*/
	@Test
	void testQueryAllAllAllAllAllAll() {
		DefaultFSPath fspath = new DefaultFSPath();
		FSPathResultList result = fspath.query("/*/*/*/*/*/*");
		assertEquals(6, result.size());
	}
	
	/**
	* Test case for the {@link DefaultFSPath#query(String)} method.
	* It tests the query "/*/*/*/*/*/*/*" and expects a result list with seven elements.
	*/
	@Test
	void testQueryAllAllAllAllAllAllAll() {
		DefaultFSPath fspath = new DefaultFSPath();
		FSPathResultList result = fspath.query("/*/*/*/*/*/*/*");
		assertEquals(7, result.size());
	}
	
	/**
	* Test case for the {@link DefaultFSPath#query(String)} method.
	* It tests the query "/*/*/*/*/*/*/*/*" and expects a result list with eight elements.
	*/
	@Test
	void testQueryAllAllAllAllAllAllAllAll() {
		DefaultFSPath fspath = new DefaultFSPath();
		FSPathResultList result = fspath.query("/*/*/*/*/*/*/*/*");
		assertEquals(8, result.size());
	}
	
	/**
	* Test case for the {@link DefaultFSPath#query(String)} method.
	* It tests the query "/*/*/*/*/*/*/*/*/*" and expects a result list with nine elements.
	*/
	@Test
	void testQueryAllAllAllAllAllAllAllAllAll() {
		DefaultFSPath fspath = new DefaultFSPath();
		FSPathResultList result = fspath.query("/*/*/*/*/*/*/*/*/*");
		assertEquals(9, result.size());
	}
	
	/**
	* Test case for the {@link DefaultFSPath#query(String)} method.
	* It tests the query "/*/*/*/*/*/*/*/*/*/*" and expects a result list with ten elements.
	*/
	@Test
	void testQueryAllAllAllAllAllAllAllAllAllAll() {
		DefaultFSPath fspath = new DefaultFSPath();
		FSPathResultList result = fspath.query("/*/*/*/*/*/*/*/*/*/*");
		assertEquals(10, result.size());
	}
	
}