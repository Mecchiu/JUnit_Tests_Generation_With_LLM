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
		File dir;
		String searchPath;
		DefaultFSPath defaultFSPath;

        @Before
        public void before() {
        	dir = File.createTempFile("sugar", ".fs");
        	dir.delete();
        	dir.mkdir();

        	defaultFSPath = new DefaultFSPath(dir.toString(), searchPath);
        }

        @After
        public void after() {
        	defaultFSPath.destroy();
        
        	File rootFile = new File(dir, "root");
        	File rootDirectory = new File(rootFile, "foo");
        	File homeDirectory = new File(rootDirectory, "home");
        	rootFile.delete();
        	rootDirectory.delete();
        	homeDirectory.delete();
        }

		@Test
		public void testExists() throws IOException {
			assertEquals("", defaultFSPath.query("/"));
			File folder = File.createTempFile("sugar", ".fs");

			defaultFSPath.createPath(folder.toString());

			assertEquals("/foo", defaultFSPath.query("/foo"));
			assertEquals("/home", defaultFSPath.query("/home"));
			assertEquals("/", defaultFSPath.query("/bar"));
			assertEquals("/test", defaultFSPath.query("/test"));
		}

		@Test
		public void testContainsRegexFunction() throws IOException {
			assertTrue(defaultFSPath.query("regex:"));
		}

		@Test
		public void testConstructor() throws IOException {
			defaultFSPath = new DefaultFSPath("/home/foo/bar", "regex:", searchPath);
		}

		@Test
		public void testHasChild() {
			defaultFSPath.query(defaultFSPath.createChildElement(dom, "/foo"));
			checkFileElements(defaultFSPath, 1);
		}

		@Test
		public void testHasNotChild() {
			defaultFSPath.query(defaultFSPath.createChildElement(dom, "/"));
			checkFileElements(defaultFSPath, 0);
		}

		@Test
		public void testQuery() {
			defaultFSPath.query(defaultFSPath.createChildElement(dom, SearchPath.ROOT));
			assertEquals("/", defaultFSPath.query("/foo"));

			defaultFSPath.query(defaultFSPath.createChildElement(dom, "/foo"));
			defaultFSPath.query(defaultFSPath.createChildElement(dom, "/"));

			String pathFromResult = defaultFSPath.query("/foo/foo/bar/");
			defaultFSPath = new DefaultFSPath("/", searchPath);
}
}