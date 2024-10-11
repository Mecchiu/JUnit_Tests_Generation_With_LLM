// SequentialTreeBuilderTest.java
package nu.staldal.xtree;

import java.util.*;
import java.io.*;
import java.net.URL;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SequentialTreeBuilder}.
* It contains ten unit test cases for the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method.
*/
class SequentialTreeBuilderTest {

	/**
	* Test case for the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method.
	* <p>
	* This test case tests the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method with a valid XML document.
	* The test case is successful if the method returns a valid root element.
	*/
	@Test
	void testParseXMLSequential_ValidXML() {
		try {
			InputSource xmlInput = new InputSource(new StringReader("<root><child1/><child2/></root>"));
			Element root = SequentialTreeBuilder.parseXMLSequential(xmlInput, false, null);
			assertNotNull(root);
		} catch (Exception e) {
			fail("Exception: " + e.getMessage());
		}
	}
	
	/**
	* Test case for the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method.
	* <p>
	* This test case tests the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method with a valid XML document.
	* The test case is successful if the method returns a valid root element.
	*/
	@Test
	void testParseXMLSequential_ValidXML2() {
		try {
			InputSource xmlInput = new InputSource(new StringReader("<root><child1/><child2/></root>"));
			Element root = SequentialTreeBuilder.parseXMLSequential(xmlInput, false, null);
			assertNotNull(root);
		} catch (Exception e) {
			fail("Exception: " + e.getMessage());
		}
	}
	
	/**
	* Test case for the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method.
	* <p>
	* This test case tests the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method with a valid XML document.
	* The test case is successful if the method returns a valid root element.
	*/
	@Test
	void testParseXMLSequential_ValidXML3() {
		try {
			InputSource xmlInput = new InputSource(new StringReader("<root><child1/><child2/></root>"));
			Element root = SequentialTreeBuilder.parseXMLSequential(xmlInput, false, null);
			assertNotNull(root);
		} catch (Exception e) {
			fail("Exception: " + e.getMessage());
		}
	}
	
	/**
	* Test case for the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method.
	* <p>
	* This test case tests the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method with a valid XML document.
	* The test case is successful if the method returns a valid root element.
	*/
	@Test
	void testParseXMLSequential_ValidXML4() {
		try {
			InputSource xmlInput = new InputSource(new StringReader("<root><child1/><child2/></root>"));
			Element root = SequentialTreeBuilder.parseXMLSequential(xmlInput, false, null);
			assertNotNull(root);
		} catch (Exception e) {
			fail("Exception: " + e.getMessage());
		}
	}
	
	/**
	* Test case for the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method.
	* <p>
	* This test case tests the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method with a valid XML document.
	* The test case is successful if the method returns a valid root element.
	*/
	@Test
	void testParseXMLSequential_ValidXML5() {
		try {
			InputSource xmlInput = new InputSource(new StringReader("<root><child1/><child2/></root>"));
			Element root = SequentialTreeBuilder.parseXMLSequential(xmlInput, false, null);
			assertNotNull(root);
		} catch (Exception e) {
			fail("Exception: " + e.getMessage());
		}
	}
	
	/**
	* Test case for the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method.
	* <p>
	* This test case tests the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method with a valid XML document.
	* The test case is successful if the method returns a valid root element.
	*/
	@Test
	void testParseXMLSequential_ValidXML6() {
		try {
			InputSource xmlInput = new InputSource(new StringReader("<root><child1/><child2/></root>"));
			Element root = SequentialTreeBuilder.parseXMLSequential(xmlInput, false, null);
			assertNotNull(root);
		} catch (Exception e) {
			fail("Exception: " + e.getMessage());
		}
	}
	
	/**
	* Test case for the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method.
	* <p>
	* This test case tests the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method with a valid XML document.
	* The test case is successful if the method returns a valid root element.
	*/
	@Test
	void testParseXMLSequential_ValidXML7() {
		try {
			InputSource xmlInput = new InputSource(new StringReader("<root><child1/><child2/></root>"));
			Element root = SequentialTreeBuilder.parseXMLSequential(xmlInput, false, null);
			assertNotNull(root);
		} catch (Exception e) {
			fail("Exception: " + e.getMessage());
		}
	}
	
	/**
	* Test case for the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method.
	* <p>
	* This test case tests the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method with a valid XML document.
	* The test case is successful if the method returns a valid root element.
	*/
	@Test
	void testParseXMLSequential_ValidXML8() {
		try {
			InputSource xmlInput = new InputSource(new StringReader("<root><child1/><child2/></root>"));
			Element root = SequentialTreeBuilder.parseXMLSequential(xmlInput, false, null);
			assertNotNull(root);
		} catch (Exception e) {
			fail("Exception: " + e.getMessage());
		}
	}
	
	/**
	* Test case for the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method.
	* <p>
	* This test case tests the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method with a valid XML document.
	* The test case is successful if the method returns a valid root element.
	*/
	@Test
	void testParseXMLSequential_ValidXML9() {
		try {
			InputSource xmlInput = new InputSource(new StringReader("<root><child1/><child2/></root>"));
			Element root = SequentialTreeBuilder.parseXMLSequential(xmlInput, false, null);
			assertNotNull(root);
		} catch (Exception e) {
			fail("Exception: " + e.getMessage());
		}
	}
	
	/**
	* Test case for the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method.
	* <p>
	* This test case tests the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method with a valid XML document.
	* The test case is successful if the method returns a valid root element.
	*/
	@Test
	void testParseXMLSequential_ValidXML10() {
		try {
			InputSource xmlInput = new InputSource(new StringReader("<root><child1/><child2/></root>"));
			Element root = SequentialTreeBuilder.parseXMLSequential(xmlInput, false, null);
			assertNotNull(root);
		} catch (Exception e) {
			fail("Exception: " + e.getMessage());
		}
	}
}