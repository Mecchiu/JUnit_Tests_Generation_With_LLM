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
	 * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)} method.
	 * It tests the case when the input is null.
	 * It expects an {@link IllegalArgumentException} to be thrown.
	 */
	@Test
	void testParseXML_InputIsNull() {
		assertThrows(IllegalArgumentException.class, () -> {
			TreeBuilder.parseXML(null, false);
		});
	}
	
	/**
	 * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)} method.
	 * It tests the case when the input is empty.
	 * It expects an {@link IllegalArgumentException} to be thrown.
	 */
	@Test
	void testParseXML_InputIsEmpty() {
		assertThrows(IllegalArgumentException.class, () -> {
			TreeBuilder.parseXML(new InputSource(), false);
		});
	}
	
	/**
	 * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)} method.
	 * It tests the case when the input is not valid.
	 * It expects an {@link SAXParseException} to be thrown.
	 */
	@Test
	void testParseXML_InputIsNotValid() {
		assertThrows(SAXParseException.class, () -> {
			TreeBuilder.parseXML(new InputSource(new StringReader("<root>")), false);
		});
	}
	
	/**
	 * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)} method.
	 * It tests the case when the input is valid.
	 * It expects an {@link Element} to be returned.
	 */
	@Test
	void testParseXML_InputIsValid() throws SAXParseException, SAXException, IOException {
		Element element = TreeBuilder.parseXML(new InputSource(new StringReader("<root/>")), false);
		assertNotNull(element);
	}
	
	/**
	 * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)} method.
	 * It tests the case when the input is valid and the validateDTD parameter is true.
	 * It expects an {@link Element} to be returned.
	 */
	@Test
	void testParseXML_InputIsValidAndValidateDTDIsTrue() throws SAXParseException, SAXException, IOException {
		Element element = TreeBuilder.parseXML(new InputSource(new StringReader("<root/>")), true);
		assertNotNull(element);
	}
	
	/**
	 * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)} method.
	 * It tests the case when the input is valid and the validateDTD parameter is false.
	 * It expects an {@link Element} to be returned.
	 */
	@Test
	void testParseXML_InputIsValidAndValidateDTDIsFalse() throws SAXParseException, SAXException, IOException {
		Element element = TreeBuilder.parseXML(new InputSource(new StringReader("<root/>")), false);
		assertNotNull(element);
	}
	
	/**
	 * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)} method.
	 * It tests the case when the input is valid and the validateDTD parameter is true.
	 * It expects an {@link Element} to be returned.
	 */
	@Test
	void testParseXML_InputIsValidAndValidateDTDIsTrueAndInputIsEmpty() throws SAXParseException, SAXException, IOException {
		Element element = TreeBuilder.parseXML(new InputSource(new StringReader("")), true);
		assertNotNull(element);
	}
	
	/**
	 * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)} method.
	 * It tests the case when the input is valid and the validateDTD parameter is false.
	 * It expects an {@link Element} to be returned.
	 */
	@Test
	void testParseXML_InputIsValidAndValidateDTDIsFalseAndInputIsEmpty() throws SAXParseException, SAXException, IOException {
		Element element = TreeBuilder.parseXML(new InputSource(new StringReader("")), false);
		assertNotNull(element);
	}
	
	/**
	 * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)} method.
	 * It tests the case when the input is valid and the validateDTD parameter is true.
	 * It expects an {@link Element} to be returned.
	 */
	@Test
	void testParseXML_InputIsValidAndValidateDTDIsTrueAndInputIsNull() throws SAXParseException, SAXException, IOException {
		Element element = TreeBuilder.parseXML(new InputSource(null), true);
		assertNotNull(element);
	}
	
	/**
	 * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)} method.
	 * It tests the case when the input is valid and the validateDTD parameter is false.
	 * It expects an {@link Element} to be returned.
	 */
	@Test
	void testParseXML_InputIsValidAndValidateDTDIsFalseAndInputIsNull() throws SAXParseException, SAXException, IOException {
		Element element = TreeBuilder.parseXML(new InputSource(null), false);
		assertNotNull(element);
	}
}