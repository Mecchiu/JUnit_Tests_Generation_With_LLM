// TreeBuilderTest.java
package nu.staldal.xtree;

import java.util.*;
import java.io.*;
import java.net.URL;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TreeBuilder}.
* It contains ten unit test cases for the {@link TreeBuilder#parseXML(InputSource, boolean)} method.
*/
class TreeBuilderTest {

	/**
	* Test case 1 for the {@link TreeBuilder#parseXML(InputSource, boolean)} method.
	* It tests the case when the input is null.
	* It expects an {@link IllegalArgumentException} to be thrown.
	*/
	@Test
	void testParseXML_1() {
		try {
			TreeBuilder.parseXML(null, false);
			fail("Expected an IllegalArgumentException to be thrown");
		} catch (IllegalArgumentException e) {
			assertEquals("InputSource cannot be null", e.getMessage());
		} catch (Exception e) {
			fail("Expected an IllegalArgumentException to be thrown");
		}
	}
	
	/**
	* Test case 2 for the {@link TreeBuilder#parseXML(InputSource, boolean)} method.
	* It tests the case when the input is not valid.
	* It expects an {@link SAXParseException} to be thrown.
	*/
	@Test
	void testParseXML_2() {
		try {
			TreeBuilder.parseXML(new InputSource(new StringReader("<a><b></a>")), false);
			fail("Expected an SAXParseException to be thrown");
		} catch (SAXParseException e) {
			assertEquals("The element type \"b\" must be terminated by the matching end-tag \"</b>\".", e.getMessage());
		} catch (Exception e) {
			fail("Expected an SAXParseException to be thrown");
		}
	}
	
	/**
	* Test case 3 for the {@link TreeBuilder#parseXML(InputSource, boolean)} method.
	* It tests the case when the input is not valid.
	* It expects an {@link SAXParseException} to be thrown.
	*/
	@Test
	void testParseXML_3() {
		try {
			TreeBuilder.parseXML(new InputSource(new StringReader("<a><b></b></a>")), true);
			fail("Expected an SAXParseException to be thrown");
		} catch (SAXParseException e) {
			assertEquals("Document root element \"a\", must match DOCTYPE root \"null\".", e.getMessage());
		} catch (Exception e) {
			fail("Expected an SAXParseException to be thrown");
		}
	}
	
	/**
	* Test case 4 for the {@link TreeBuilder#parseXML(InputSource, boolean)} method.
	* It tests the case when the input is not valid.
	* It expects an {@link SAXParseException} to be thrown.
	*/
	@Test
	void testParseXML_4() {
		try {
			TreeBuilder.parseXML(new InputSource(new StringReader("<a><b></b></a>")), false);
			fail("Expected an SAXParseException to be thrown");
		} catch (SAXParseException e) {
			assertEquals("Document root element \"a\", must match DOCTYPE root \"null\".", e.getMessage());
		} catch (Exception e) {
			fail("Expected an SAXParseException to be thrown");
		}
	}
	
	/**
	* Test case 5 for the {@link TreeBuilder#parseXML(InputSource, boolean)} method.
	* It tests the case when the input is not valid.
	* It expects an {@link SAXParseException} to be thrown.
	*/
	@Test
	void testParseXML_5() {
		try {
			TreeBuilder.parseXML(new InputSource(new StringReader("<a><b></b></a>")), true);
			fail("Expected an SAXParseException to be thrown");
		} catch (SAXParseException e) {
			assertEquals("Document root element \"a\", must match DOCTYPE root \"null\".", e.getMessage());
		} catch (Exception e) {
			fail("Expected an SAXParseException to be thrown");
		}
	}
	
	/**
	* Test case 6 for the {@link TreeBuilder#parseXML(InputSource, boolean)} method.
	* It tests the case when the input is not valid.
	* It expects an {@link SAXParseException} to be thrown.
	*/
	@Test
	void testParseXML_6() {
		try {
			TreeBuilder.parseXML(new InputSource(new StringReader("<a><b></b></a>")), false);
			fail("Expected an SAXParseException to be thrown");
		} catch (SAXParseException e) {
			assertEquals("Document root element \"a\", must match DOCTYPE root \"null\".", e.getMessage());
		} catch (Exception e) {
			fail("Expected an SAXParseException to be thrown");
		}
	}
	
	/**
	* Test case 7 for the {@link TreeBuilder#parseXML(InputSource, boolean)} method.
	* It tests the case when the input is not valid.
	* It expects an {@link SAXParseException} to be thrown.
	*/
	@Test
	void testParseXML_7() {
		try {
			TreeBuilder.parseXML(new InputSource(new StringReader("<a><b></b></a>")), true);
			fail("Expected an SAXParseException to be thrown");
		} catch (SAXParseException e) {
			assertEquals("Document root element \"a\", must match DOCTYPE root \"null\".", e.getMessage());
		} catch (Exception e) {
			fail("Expected an SAXParseException to be thrown");
		}
	}
	
	/**
	* Test case 8 for the {@link TreeBuilder#parseXML(InputSource, boolean)} method.
	* It tests the case when the input is not valid.
	* It expects an {@link SAXParseException} to be thrown.
	*/
	@Test
	void testParseXML_8() {
		try {
			TreeBuilder.parseXML(new InputSource(new StringReader("<a><b></b></a>")), false);
			fail("Expected an SAXParseException to be thrown");
		} catch (SAXParseException e) {
			assertEquals("Document root element \"a\", must match DOCTYPE root \"null\".", e.getMessage());
		} catch (Exception e) {
			fail("Expected an SAXParseException to be thrown");
		}
	}
	
	/**
	* Test case 9 for the {@link TreeBuilder#parseXML(InputSource, boolean)} method.
	* It tests the case when the input is not valid.
	* It expects an {@link SAXParseException} to be thrown.
	*/
	@Test
	void testParseXML_9() {
		try {
			TreeBuilder.parseXML(new InputSource(new StringReader("<a><b></b></a>")), true);
			fail("Expected an SAXParseException to be thrown");
		} catch (SAXParseException e) {
			assertEquals("Document root element \"a\", must match DOCTYPE root \"null\".", e.getMessage());
		} catch (Exception e) {
			fail("Expected an SAXParseException to be thrown");
		}
	}
	
	/**
	* Test case 10 for the {@link TreeBuilder#parseXML(InputSource, boolean)} method.
	* It tests the case when the input is not valid.
	* It expects an {@link SAXParseException} to be thrown.
	*/
	@Test
	void testParseXML_10() {
		try {
			TreeBuilder.parseXML(new InputSource(new StringReader("<a><b></b></a>")), false);
			fail("Expected an SAXParseException to be thrown");
		} catch (SAXParseException e) {
			assertEquals("Document root element \"a\", must match DOCTYPE root \"null\".", e.getMessage());
		} catch (Exception e) {
			fail("Expected an SAXParseException to be thrown");
		}
	}
}