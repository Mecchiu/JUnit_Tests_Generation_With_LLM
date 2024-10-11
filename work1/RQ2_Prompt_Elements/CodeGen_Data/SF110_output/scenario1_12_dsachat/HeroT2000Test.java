// HeroTest.java
package dsachat.share.hero;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Vector;
import org.dom4j.Document;
import org.dom4j.Element;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Hero}.
* It contains one unit test case for the {@link Hero#getAttrValue(String)} method.
*/
class HeroTest {
static final String INVALID_CHARACTER_MATCH = "Invalid";
		static final String TEST_SEL_CODE            = "c";
		static final int testSuiteCode              = 200;
		static final String TEST_NAME                =  "Hello Test";
		static final String TEST_NAME_HELO             =  "Hello Test Help";

		@Test
		void isValid_InvalidCharacter() {
			assertFalse(isValid(INVALID_CHARACTER_MATCH));
		}

		@Test
		void isValid_ValidWhitespace() {
			assertTrue(isValid(CharacTest.VALID_CHARS));
		}

		@Test
		void isValid_ValidCharacterMatch() {
			Element element = Element.create(CharacTest.ATTRIBUTE_NAME).addAttribute(CharacTest.VALID_CHARACTER_MATCH);
            Document doc = Element.create(CharacTest.ATTRIBUTE_DOCUMENT).addElement(element).addElement(CharacTest.ATTRIBUTE_TYPE);
            assertTrue(doc.elementText(CharacTest.ELEMENT_TYPE).equals(CharacTest.ATTRIBUTE_TYPE));
		}

		@Test
		void isValid_InvalidEmptyString() {
			assertFalse(isValid(""));
		}

		@Test
		void isValid_ValidWhitespace() {
            assertTrue(isValid(CharacTest.VALID_CHARACTER_MATCH));
		}

		@Test
		void isValid_ValidCharacTest() {
			Element e = Element.create(CharacTest.ATTRIBUTE_NAME).addAttribute(CharacTest.VALID_CHARACTER_MATCH).addElement(CharacTest.ATTRIBUTE_VALUE).addElement(CharacTest.ATTRIBUTE_NAME).addElement("a");
			Document doc = Element.create(CharacTest.ATTRIBUTE_DOCUMENT).addElement(e).addElement(CharacTest.ATTRIBUTE_TYPE);
            assertTrue(doc.elementText(CharacTest.ATTRIBUTE_TYPE).equals(CharacTest.ATTRIBUTE_TYPE));
        }

		@Test
		void isValid_ValidAttributeValue() {
			Element element = Element.create(CharacTest.ATTRIBUTE_NAME, CharacTest.VALID_CHARACTER_MATCH);
            Document doc = Element.create(CharacTest.ATTRIBUTE_DOCUMENT).addElement(element).addElement(CharacTest.ATTRIBUTE_TYPE);
            assertTrue(doc.elementText(CharacTest.ATTRIBUTE_TYPE).equals(CharacTest.ATTRIBUTE_TYPE));
			element.setText("a");
			Element e = Element.create(CharacTest.ATTRIBUTE_NAME).addAttribute(CharacTest.VALID_CHARACTER_MATCH).addElement(CharacTest.ATTRIBUTE_VALUE).addElement(CharacTest.ATTRIBUTE_NAME).addElement(CharacTest.ATTRIBUTE_VALUE).addElement(CharacTest.ATTRIBUTE_NAME);
            Element docAfter = Element.create(CharacTest.ATTRIBUTE_DOCUMENT).addElement(e);
            Element expectedResult = Element.create(CharacTest.ATTRIBUTE_ATTRIBUTE, CharacTest.VALID_CHARACTER_MATCH);
            assertTrue(docAfter.elementText(CharacTest.ATTRIBUTE_TYPE).equals(CharacTest.ATTRIBUTE_TYPE));
			assertTrue(Document.verify(docAfter));
			assertTrue(docAfter.elementText(CharacTest.ATTRIBUTE_ATTRIBUTE).equals(CharacTest.ATTRIBUTE_ATTRIBUTE));
			assertFalse(expectedResult.elementText(CharacTest.ATTRIBUTE_TYPE).equals(CharacTest.ATTRIBUTE_ATTRIBUTE));
			assertTrue(expectedResult.elementText(CharacTest.ATTRIBUTE_ATTRIBUTE).equals(CharacTest.ATTRIBUTE_ATTRIBUTE));
			assertFalse(expectedResult.elementText(CharacTest.ATTRIBUTE_ATTRIBUTE).equals(CharacTest.ATTRIBUTE_ATTRIBUTE));
			assertTrue(expectedResult.elementText(CharacTest.ATTRIBUTE_ATTRIBUTE).equals(CharacTest.ATTRIBUTE_ATTRIBUTE));
			assertFalse(expectedResult.elementText(CharacTest.ATTRIBUTE_ATTRIBUTE).equals(CharacTest.ATTRIBUTE_DOUBLE_VALUE));
			assertTrue(expectedResult.elementText(CharacTest.ATTRIBUTE_ATTRIBUTE).equals(CharacTest.ATTRIBUTE_DOUBLE_VALUE));
			assertFalse(expectedResult.elementText(CharacTest.ATTRIBUTE_ATTRIBUTE).equals(CharacTest.ATTRIBUTE_ATTRIBUTE));
			assertTrue(expectedResult.elementText(CharacTest.ATTRIBUTE_DOUBLE_VALUE).equals(CharacTest.ATTRIBUTE_ATTRIBUTE));
			assertFalse(expectedResult.elementText(CharacTest.ATTRIBUTE_ATTRIBUTE).equals(CharacTest.ATTRIBUTE_DOUBLE_VALUE));
			assertTrue(expectedResult.elementText(CharacTest.ATTRIBUTE_DOUBLE_VALUE).equals(CharacTest.ATTRIBUTE_DOUBLE_VALUE));
		}
}