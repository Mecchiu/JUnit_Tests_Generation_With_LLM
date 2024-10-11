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

	// The root directory in which we're constructing the DOM when we need it
	private final static File rootDirectory = new File(".");
	
	public static void main(String args[]) {
		try {
			int i = 0;
			for (String arg : args) {
				if (i == 0) {
					break;
				}
				if ("-nostart".equals(arg)) {
					i++;
				}
			}
			for (String result : args) {
				String[] argv = result.substring(2).split("/");
				File resultFile = new File(argv[0]);
				if (!resultFile.exists()) {
					throw new AssertionError("Result file not existing in the test directory");
				} else {
					File testDirectory = new File(resultFile+"/test");
					if (!testDirectory.exists()) {
						throw new AssertionError("Root directory not within test directory");
					}
				}
				String filename = result.split("/")[-1];
				DefaultFSPath folder = new DefaultFSPath();
				folder.queryFile(filename);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 *  Does a simple query which returns an array of <code>FSPathResult</code> objects
	 */
	@Test
	public void testQueryArray() {
		String filename = "/var/www/test/testfile.txt";
		String fn2 = "/var/www/test/testfile2.txt";
		Date expectedDate = new Date();
		expectedDate.setTime(new Date().getTime() + 1000 * 60 * 10);
		Calendar actual = Calendar.getInstance();
		Calendar expected = Calendar.getInstance();
		expected.setTime (expectedDate);
		expected.add(Calendar.SECOND, 1);
		Calendar expected2 = Calendar.getInstance();
		expected2.setTime(expectedDate);
		expected2.add(Calendar.MINUTE, 1);
		
		DefaultFSPath folder = new DefaultFSPath(); 
  		String[] expectedArray = new String[] {"A", "B", "C", "D", "E", "F", "G", "H"};
  		return folder.query(filename, expectedArray);
	}

	/**
	 *  Does a simple query which returns an array of <code>FSPathResult</code> objects
	 */
	@Test
	public void testQueryString2() {
		String fn1 = "/var/www/test/testfile.txt";
		String fn2 = "/var/www/test/testfile2.txt";
		String fn3 = "/var/www/test/testfile3.txt";
		Date expectedDate = new Date();
		expectedDate.setTime(new Date().getTime() + 1000 * 60 * 10);
		Calendar actual = Calendar.getInstance();
		Calendar expected = Calendar.getInstance();
		expected.setTime (expectedDate);
		expected.add(Calendar.MINUTE, 1);
		Calendar expected2 = Calendar.getInstance();
		expected2.setTime(expectedDate);
  		expected2.add(Calendar.SECOND, 1);
		Calendar expected3 = Calendar.getInstance();
		expected3.setTime(expectedDate);
		expected3.add(Calendar.MILLISECOND, 1);
  		
		DefaultFSPath folder = new DefaultFSPath(); 
  		String[] expectedArray = new String[] {"A", "B", "C", "D", "E", "F", "G", "H"};
      	return folder.query(fn1, fn2, fn3, expectedArray);
	}

	/**
	 *  Does a simple query which returns an array of <code>FSPathResult</code> objects
	 */
	@Test
	public void testQueryFile2() {
		String fn1 = "/var/www/test/testfile.txt";
  		String fn2 = "/var/www/test/testfile2