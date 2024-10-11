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
	void testQueryRootAll() {
		DefaultFSPath fspath = new DefaultFSPath();
		FSPathResultList result = fspath.query("/*");
		assertEquals(1, result.size());
	}
	
	/**
	* Test case for the {@link DefaultFSPath#query(String)} method.
	* It tests the query "/*[@name='root']" and expects a result list with one element.
	*/
	@Test
	void testQueryRootName() {
		DefaultFSPath fspath = new DefaultFSPath();
		FSPathResultList result = fspath.query("/*[@name='root']");
		assertEquals(1, result.size());
	}
	
	/**
	* Test case for the {@link DefaultFSPath#query(String)} method.
	* It tests the query "/*[@name='root']/@name" and expects a result list with one element.
	*/
	@Test
	void testQueryRootNameAttribute() {
		DefaultFSPath fspath = new DefaultFSPath();
		FSPathResultList result = fspath.query("/*[@name='root']/@name");
		assertEquals(1, result.size());
	}
	
	/**
	* Test case for the {@link DefaultFSPath#query(String)} method.
	* It tests the query "/*[@name='root']/@name='root'" and expects a result list with one element.
	*/
	@Test
	void testQueryRootNameAttributeValue() {
		DefaultFSPath fspath = new DefaultFSPath();
		FSPathResultList result = fspath.query("/*[@name='root']/@name='root'");
		assertEquals(1, result.size());
	}
	
	/**
	* Test case for the {@link DefaultFSPath#query(String)} method.
	* It tests the query "/*[@name='root']/@name='root' and @type='directory'" and expects a result list with one element.
	*/
	@Test
	void testQueryRootNameAttributeValueAndTypeAttributeValue() {
		DefaultFSPath fspath = new DefaultFSPath();
		FSPathResultList result = fspath.query("/*[@name='root']/@name='root' and @type='directory'");
		assertEquals(1, result.size());
	}
	
	/**
	* Test case for the {@link DefaultFSPath#query(String)} method.
	* It tests the query "/*[@name='root']/@name='root' and @type='directory' and @size=0" and expects a result list with one element.
	*/
	@Test
	void testQueryRootNameAttributeValueAndTypeAttributeValueAndSizeAttributeValue() {
		DefaultFSPath fspath = new DefaultFSPath();
		FSPathResultList result = fspath.query("/*[@name='root']/@name='root' and @type='directory' and @size=0");
		assertEquals(1, result.size());
	}
	
	/**
	* Test case for the {@link DefaultFSPath#query(String)} method.
	* It tests the query "/*[@name='root']/@name='root' and @type='directory' and @size=0 and @lastModified='1970-01-01T00:00:00Z'" and expects a result list with one element.
	*/
	@Test
	void testQueryRootNameAttributeValueAndTypeAttributeValueAndSizeAttributeValueAndLastModifiedAttributeValue() {
		DefaultFSPath fspath = new DefaultFSPath();
		FSPathResultList result = fspath.query("/*[@name='root']/@name='root' and @type='directory' and @size=0 and @lastModified='1970-01-01T00:00:00Z'");
		assertEquals(1, result.size());
	}
	
	/**
	* Test case for the {@link DefaultFSPath#query(String)} method.
	* It tests the query "/*[@name='root']/@name='root' and @type='directory' and @size=0 and @lastModified='1970-01-01T00:00:00Z' and @lastAccessed='1970-01-01T00:00:00Z'" and expects a result list with one element.
	*/
	@Test
	void testQueryRootNameAttributeValueAndTypeAttributeValueAndSizeAttributeValueAndLastModifiedAttributeValueAndLastAccessedAttributeValue() {
		DefaultFSPath fspath = new DefaultFSPath();
		FSPathResultList result = fspath.query("/*[@name='root']/@name='root' and @type='directory' and @size=0 and @lastModified='1970-01-01T00:00:00Z' and @lastAccessed='1970-01-01T00:00:00Z'");
		assertEquals(1, result.size());
	}
	
	/**
	* Test case for the {@link DefaultFSPath#query(String)} method.
	* It tests the query "/*[@name='root']/@name='root' and @type='directory' and @size=0 and @lastModified='1970-01-01T00:00:00Z' and @lastAccessed='1970-01-01T00:00:00Z' and @created='1970-01-01T00:00:00Z'" and expects a result list with one element.
	*/
	@Test
	void testQueryRootNameAttributeValueAndTypeAttributeValueAndSizeAttributeValueAndLastModifiedAttributeValueAndLastAccessedAttributeValueAndCreatedAttributeValue() {
		DefaultFSPath fspath = new DefaultFSPath();
		FSPathResultList result = fspath.query("/*[@name='root']/@name='root' and @type='directory' and @size=0 and @lastModified='1970-01-01T00:00:00Z' and @lastAccessed='1970-01-01T00:00:00Z' and @created='1970-01-01T00:00:00Z'");
		assertEquals(1, result.size());
	}
	
	/**
	* Test case for the {@link DefaultFSPath#query(String)} method.
	* It tests the query "/*[@name='root']/@name='root' and @type='directory' and @size=0 and @lastModified='1970-01-01T00:00:00Z' and @lastAccessed='1970-01-01T00:00:00Z' and @created='1970-01-01T00:00:00Z' and @owner='root'" and expects a result list with one element.
	*/
	@Test
	void testQueryRootNameAttributeValueAndTypeAttributeValueAndSizeAttributeValueAndLastModifiedAttributeValueAndLastAccessedAttributeValueAndCreatedAttributeValueAndOwnerAttributeValue() {
		DefaultFSPath fspath = new DefaultFSPath();
		FSPathResultList result = fspath.query("/*[@name='root']/@name='root' and @type='directory' and @size=0 and @lastModified='1970-01-01T00:00:00Z' and @lastAccessed='1970-01-01T00:00:00Z' and @created='1970-01-01T00:00:00Z' and @owner='root'");
		assertEquals(1, result.size());
	}
	
	/**
	* Test case for the {@link DefaultFSPath#query(String)} method.
	* It tests the query "/*[@name='root']/@name='root' and @type='directory' and @size=0 and @lastModified='1970-01-01T00:00:00Z' and @lastAccessed='1970-01-01T00:00:00Z' and @created='1970-01-01T00:00:00Z' and @owner='root' and @group='root'" and expects a result list with one element.
	*/
	@Test
	void testQueryRootNameAttributeValueAndTypeAttributeValueAndSizeAttributeValueAndLastModifiedAttributeValueAndLastAccessedAttributeValueAndCreatedAttributeValueAndOwnerAttributeValueAndGroupAttributeValue() {
		DefaultFSPath fspath = new DefaultFSPath();
		FSPathResultList result = fspath.query("/*[@name='root']/@name='root' and @type='directory' and @size=0 and @lastModified='1970-01-01T00:00:00Z' and @lastAccessed='1970-01-01T00:00:00Z' and @created='1970-01-01T00:00:00Z' and @owner='root' and @group='root'");
		assertEquals(1, result.size());
	}
	
	/**
	* Test case for the {@link DefaultFSPath#query(String)} method.
	* It tests the query "/*[@name='root']/@name='root' and @type='directory' and @size=0 and @lastModified='1970-01-01T00:00:00Z' and @lastAccessed='1970-01-01T00:00:00Z' and @created='1970-01-01T00:00:00Z' and @owner='root' and @group='root' and @permissions='rwxrwxrwx'" and expects a result list with one element.
	*/
	@Test
	void testQueryRootNameAttributeValueAndTypeAttributeValueAndSizeAttributeValueAndLastModifiedAttributeValueAndLastAccessedAttributeValueAndCreatedAttributeValueAndOwnerAttributeValueAndGroupAttributeValueAndPermissionsAttributeValue() {
		DefaultFSPath fspath = new DefaultFSPath();
		FSPathResultList result = fspath.query("/*[@name='root']/@name='root' and @type='directory' and @size=0 and @lastModified='1970-01-01T00:00:00Z' and @lastAccessed='1970-01-01T00:00:00Z' and @created='1970-01-01T00:00:00Z' and @owner='root' and @group='root' and @permissions='rwxrwxrwx'");
		assertEquals(1, result.size());
	}
	
}

// FSPath.java
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

    public FSPathResultList query(String expression) {
        return this.query(expression, XPathConstants.NODESET);
    }
}

// FSPathResult.java
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

    public FSPathResultList query(String expression) {
        return this.query(expression, XPathConstants.NODESET);
    }
}

// FSPathResultList.java
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
import org