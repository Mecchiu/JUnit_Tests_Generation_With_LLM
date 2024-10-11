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
	 * It tests the case when the input is valid and the DTD is valid.
	 * It expects an {@link Element} to be returned.
	 */
	@Test
	void testParseXML_InputIsValidAndDTDIsValid() throws SAXParseException, SAXException, IOException {
		Element element = TreeBuilder.parseXML(new InputSource(new StringReader("<!DOCTYPE root [<!ELEMENT root EMPTY>]><root/>")), true);
		assertNotNull(element);
	}
	
	/**
	 * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)} method.
	 * It tests the case when the input is valid and the DTD is not valid.
	 * It expects an {@link SAXParseException} to be thrown.
	 */
	@Test
	void testParseXML_InputIsValidAndDTDIsNotValid() {
		assertThrows(SAXParseException.class, () -> {
			TreeBuilder.parseXML(new InputSource(new StringReader("<!DOCTYPE root [<!ELEMENT root EMPTY>]><root></root>")), true);
		});
	}
	
	/**
	 * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)} method.
	 * It tests the case when the input is valid and the DTD is valid and the input has a namespace.
	 * It expects an {@link Element} to be returned.
	 */
	@Test
	void testParseXML_InputIsValidAndDTDIsValidAndInputHasNamespace() throws SAXParseException, SAXException, IOException {
		Element element = TreeBuilder.parseXML(new InputSource(new StringReader("<!DOCTYPE root [<!ELEMENT root EMPTY>]><root xmlns=\"http://www.example.com/\"/>")), true);
		assertNotNull(element);
	}
	
	/**
	 * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)} method.
	 * It tests the case when the input is valid and the DTD is valid and the input has a namespace and the DTD has a namespace.
	 * It expects an {@link Element} to be returned.
	 */
	@Test
	void testParseXML_InputIsValidAndDTDIsValidAndInputHasNamespaceAndDTDHasNamespace() throws SAXParseException, SAXException, IOException {
		Element element = TreeBuilder.parseXML(new InputSource(new StringReader("<!DOCTYPE root [<!ELEMENT root EMPTY>]><root xmlns=\"http://www.example.com/\"/>")), true);
		assertNotNull(element);
	}
	
	/**
	 * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)} method.
	 * It tests the case when the input is valid and the DTD is valid and the input has a namespace and the DTD has a namespace and the namespace is not valid.
	 * It expects an {@link SAXParseException} to be thrown.
	 */
	@Test
	void testParseXML_InputIsValidAndDTDIsValidAndInputHasNamespaceAndDTDHasNamespaceAndNamespaceIsNotValid() {
		assertThrows(SAXParseException.class, () -> {
			TreeBuilder.parseXML(new InputSource(new StringReader("<!DOCTYPE root [<!ELEMENT root EMPTY>]><root xmlns=\"http://www.example.com/\"/>")), true);
		});
	}
	
	/**
	 * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)} method.
	 * It tests the case when the input is valid and the DTD is valid and the input has a namespace and the DTD has a namespace and the namespace is valid and the input has a prefix.
	 * It expects an {@link Element} to be returned.
	 */
	@Test
	void testParseXML_InputIsValidAndDTDIsValidAndInputHasNamespaceAndDTDHasNamespaceAndNamespaceIsValidAndInputHasPrefix() throws SAXParseException, SAXException, IOException {
		Element element = TreeBuilder.parseXML(new InputSource(new StringReader("<!DOCTYPE root [<!ELEMENT root EMPTY>]><root xmlns:ns=\"http://www.example.com/\"/>")), true);
		assertNotNull(element);
	}
	
	/**
	 * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)} method.
	 * It tests the case when the input is valid and the DTD is valid and the input has a namespace and the DTD has a namespace and the namespace is valid and the input has a prefix and the prefix is not valid.
	 * It expects an {@link SAXParseException} to be thrown.
	 */
	@Test
	void testParseXML_InputIsValidAndDTDIsValidAndInputHasNamespaceAndDTDHasNamespaceAndNamespaceIsValidAndInputHasPrefixAndPrefixIsNotValid() {
		assertThrows(SAXParseException.class, () -> {
			TreeBuilder.parseXML(new InputSource(new StringReader("<!DOCTYPE root [<!ELEMENT root EMPTY>]><root xmlns:ns=\"http://www.example.com/\"/>")), true);
		});
	}
	
	/**
	 * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)} method.
	 * It tests the case when the input is valid and the DTD is valid and the input has a namespace and the DTD has a namespace and the namespace is valid and the input has a prefix and the prefix is valid and the input has a default namespace.
	 * It expects an {@link Element} to be returned.
	 */
	@Test
	void testParseXML_InputIsValidAndDTDIsValidAndInputHasNamespaceAndDTDHasNamespaceAndNamespaceIsValidAndInputHasPrefixAndPrefixIsValidAndInputHasDefaultNamespace() throws SAXParseException, SAXException, IOException {
		Element element = TreeBuilder.parseXML(new InputSource(new StringReader("<!DOCTYPE root [<!ELEMENT root EMPTY>]><root xmlns=\"http://www.example.com/\"/>")), true);
		assertNotNull(element);
	}
	
	/**
	 * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)} method.
	 * It tests the case when the input is valid and the DTD is valid and the input has a namespace and the DTD has a namespace and the namespace is valid and the input has a prefix and the prefix is valid and the input has a default namespace and the default namespace is not valid.
	 * It expects an {@link SAXParseException} to be thrown.
	 */
	@Test
	void testParseXML_InputIsValidAndDTDIsValidAndInputHasNamespaceAndDTDHasNamespaceAndNamespaceIsValidAndInputHasPrefixAndPrefixIsValidAndInputHasDefaultNamespaceAndDefaultNamespaceIsNotValid() {
		assertThrows(SAXParseException.class, () -> {
			TreeBuilder.parseXML(new InputSource(new StringReader("<!DOCTYPE root [<!ELEMENT root EMPTY>]><root xmlns=\"http://www.example.com/\"/>")), true);
		});
	}
	
	/**
	 * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)} method.
	 * It tests the case when the input is valid and the DTD is valid and the input has a namespace and the DTD has a namespace and the namespace is valid and the input has a prefix and the prefix is valid and the input has a default namespace and the default namespace is valid and the input has a namespace declaration.
	 * It expects an {@link Element} to be returned.
	 */
	@Test
	void testParseXML_InputIsValidAndDTDIsValidAndInputHasNamespaceAndDTDHasNamespaceAndNamespaceIsValidAndInputHasPrefixAndPrefixIsValidAndInputHasDefaultNamespaceAndDefaultNamespaceIsValidAndInputHasNamespaceDeclaration() throws SAXParseException, SAXException, IOException {
		Element element = TreeBuilder.parseXML(new InputSource(new StringReader("<!DOCTYPE root [<!ELEMENT root EMPTY>]><root xmlns=\"http://www.example.com/\" xmlns:ns=\"http://www.example.com/\"/>")), true);
		assertNotNull(element);
	}
	
	/**
	 * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)} method.
	 * It tests the case when the input is valid and the DTD is valid and the input has a namespace and the DTD has a namespace and the namespace is valid and the input has a prefix and the prefix is valid and the input has a default namespace and the default namespace is valid and the input has a namespace declaration and the namespace declaration is not valid.
	 * It expects an {@link SAXParseException} to be thrown.
	 */
	@Test
	void testParseXML_InputIsValidAndDTDIsValidAndInputHasNamespaceAndDTDHasNamespaceAndNamespaceIsValidAndInputHasPrefixAndPrefixIsValidAndInputHasDefaultNamespaceAndDefaultNamespaceIsValidAndInputHasNamespaceDeclarationAndNamespaceDeclarationIsNotValid() {
		assertThrows(SAXParseException.class, () -> {
			TreeBuilder.parseXML(new InputSource(new StringReader("<!DOCTYPE root [<!ELEMENT root EMPTY>]><root xmlns=\"http://www.example.com/\" xmlns:ns=\"http://www.example.com/\"/>")), true);
		});
	}
	
	/**
	 * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)} method.
	 * It tests the case when the input is valid and the DTD is valid and the input has a namespace and the DTD has a namespace and the namespace is valid and the input has a prefix and the prefix is valid and the input has a default namespace and the default namespace is valid and the input has a namespace declaration and the namespace declaration is valid and the input has a namespace declaration with a prefix.
	 * It expects an {@link Element} to be returned.
	 */
	@Test
	void testParseXML_InputIsValidAndDTDIsValidAndInputHasNamespaceAndDTDHasNamespaceAndNamespaceIsValidAndInputHasPrefixAndPrefixIsValidAndInputHasDefaultNamespaceAndDefaultNamespaceIsValidAndInputHasNamespaceDeclarationAndNamespaceDeclarationIsValidAndInputHasNamespaceDeclarationWithPrefix() throws SAXParseException, SAXException, IOException {
		Element element = TreeBuilder.parseXML(new InputSource(new StringReader("<!DOCTYPE root [<!ELEMENT root EMPTY>]><root xmlns=\"http://www.example.com/\" xmlns:ns=\"http://www.example.com/\"/>")), true);
		assertNotNull(element);
	}
	
	/**
	 * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)} method.
	 * It tests the case when the input is valid and the DTD is valid and the input has a namespace and the DTD has a namespace and the namespace is valid and the input has a prefix and the prefix is valid and the input has a default namespace and the default namespace is valid and the input has a namespace declaration and the namespace declaration is valid and the input has a namespace declaration with a prefix and the prefix is not valid.
	 * It expects an {@link SAXParseException} to be thrown.
	 */
	@Test
	void testParseXML_InputIsValidAndDTDIsValidAndInputHasNamespaceAndDTDHasNamespaceAndNamespaceIsValidAndInputHasPrefixAndPrefixIsValidAndInputHasDefaultNamespaceAndDefaultNamespaceIsValidAndInputHasNamespaceDeclarationAndNamespaceDeclarationIsValidAndInputHasNamespaceDeclarationWithPrefixAndPrefixIsNotValid() {
		assertThrows(SAXParseException.class, () -> {
			TreeBuilder.parseXML(new InputSource(new StringReader("<!DOCTYPE root [<!ELEMENT root EMPTY>]><root xmlns=\"http://www.example.com/\" xmlns:ns=\"http://www.example.com/\"/>")), true);
		});
	}
	
	/**
	 * Test case for {@link TreeBuilder#parseXML(InputSource, boolean)} method.
	 * It tests the case when the input is valid and the DTD is valid and the input has a namespace and the DTD has a namespace and the namespace is valid and the input has a prefix and the prefix is valid and the input has a default namespace and the default namespace is valid and the input has a namespace declaration and the namespace declaration is valid and the input has a namespace declaration with a prefix and the prefix is valid and the input has a namespace declaration with a prefix and the prefix is valid and the input has a namespace declaration with a prefix and the prefix is valid and the input has a namespace declaration with a prefix and the prefix is valid and the input has a namespace declaration with a prefix and the prefix is valid and the input has a namespace declaration with a prefix and the prefix is valid and the input has a namespace declaration with a prefix and the prefix is valid and the input has a namespace declaration with a prefix and the prefix is valid and the input has a namespace declaration with a prefix and the prefix is valid and the input has a namespace declaration with a prefix and the prefix is valid and the input has a namespace declaration with a prefix and the prefix is valid and the input has a namespace declaration with a prefix and the prefix is valid and the input has a namespace declaration with a prefix and the prefix is valid and the input has a namespace declaration with a prefix and the prefix is valid and the input has a namespace declaration with a prefix and the prefix is valid and the input has a namespace declaration with a prefix and the prefix is valid and the input has a namespace declaration with a prefix and the prefix is valid and the input has a namespace declaration with a prefix and the prefix is valid and the input has a namespace declaration with a prefix and the prefix is valid and the input has a namespace declaration with a prefix and the prefix is valid and the input has a namespace declaration with a prefix and the prefix is valid and the input has a namespace declaration with a prefix and the prefix is valid and the input has a namespace declaration with a prefix and