// Element_4Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains ten unit test cases for the {@link Element#getAttributeType(int)} method.
*/
class Element_4Test {

		@Test
		void test_getAttributeType_1() {
				Element element = new Element("", "", 0);
				assertEquals(null, element.getAttributeType(-1));
		}
		
		@Test
		void test_getAttributeType_2() {
				Element element = new Element("", "", 0);
				assertEquals(null, element.getAttributeType(0));
		}
		
		@Test
		void test_getAttributeType_3() {
				Element element = new Element("", "", 1);
				element.addAttribute("", "", "", "");
				assertEquals("", element.getAttributeType(0));
		}
		
		@Test
		void test_getAttributeType_4() {
				Element element = new Element("", "", 1);
				element.addAttribute("", "", "CDATA", "");
				assertEquals("CDATA", element.getAttributeType(0));
		}
		
		@Test
		void test_getAttributeType_5() {
				Element element = new Element("", "", 1);
				element.addAttribute("", "", "ID", "");
				assertEquals("ID", element.getAttributeType(0));
		}
		
		@Test
		void test_getAttributeType_6() {
				Element element = new Element("", "", 1);
				element.addAttribute("", "", "IDREF", "");
				assertEquals("IDREF", element.getAttributeType(0));
		}
		
		@Test
		void test_getAttributeType_7() {
				Element element = new Element("", "", 1);
				element.addAttribute("", "", "IDREFS", "");
				assertEquals("IDREFS", element.getAttributeType(0));
		}
		
		@Test
		void test_getAttributeType_8() {
				Element element = new Element("", "", 1);
				element.addAttribute("", "", "NMTOKEN", "");
				assertEquals("NMTOKEN", element.getAttributeType(0));
		}
		
		@Test
		void test_getAttributeType_9() {
				Element element = new Element("", "", 1);
				element.addAttribute("", "", "NMTOKENS", "");
				assertEquals("NMTOKENS", element.getAttributeType(0));
		}
		
		@Test
		void test_getAttributeType_10() {
				Element element = new Element("", "", 1);
				element.addAttribute("", "", "ENTITY", "");
				assertEquals("ENTITY", element.getAttributeType(0));
		}
		
}

// Element_5Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains ten unit test cases for the {@link Element#getAttributeValue(int)} method.
*/
class Element_5Test {
		
		@Test
		void test_getAttributeValue_1() {
				Element element = new Element("", "", 0);
				assertEquals(null, element.getAttributeValue(-1));
		}
		
		@Test
		void test_getAttributeValue_2() {
				Element element = new Element("", "", 0);
				assertEquals(null, element.getAttributeValue(0));
		}
		
		@Test
		void test_getAttributeValue_3() {
				Element element = new Element("", "", 1);
				element.addAttribute("", "", "", "");
				assertEquals("", element.getAttributeValue(0));
		}
		
		@Test
		void test_getAttributeValue_4() {
				Element element = new Element("", "", 1);
				element.addAttribute("", "", "CDATA", "a");
				assertEquals("a", element.getAttributeValue(0));
		}
		
		@Test
		void test_getAttributeValue_5() {
				Element element = new Element("", "", 1);
				element.addAttribute("", "", "ID", "b");
				assertEquals("b", element.getAttributeValue(0));
		}
		
		@Test
		void test_getAttributeValue_6() {
				Element element = new Element("", "", 1);
				element.addAttribute("", "", "IDREF", "c");
				assertEquals("c", element.getAttributeValue(0));
		}
		
		@Test
		void test_getAttributeValue_7() {
				Element element = new Element("", "", 1);
				element.addAttribute("", "", "IDREFS", "d");
				assertEquals("d", element.getAttributeValue(0));
		}
		
		@Test
		void test_getAttributeValue_8() {
				Element element = new Element("", "", 1);
				element.addAttribute("", "", "NMTOKEN", "e");
				assertEquals("e", element.getAttributeValue(0));
		}
		
		@Test
		void test_getAttributeValue_9() {
				Element element = new Element("", "", 1);
				element.addAttribute("", "", "NMTOKENS", "f");
				assertEquals("f", element.getAttributeValue(0));
		}
		
		@Test
		void test_getAttributeValue_10() {
				Element element = new Element("", "", 1);
				element.addAttribute("", "", "ENTITY", "g");
				assertEquals("g", element.getAttributeValue(0));
		}
		
}

// Element_6Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains ten unit test cases for the {@link Element#getAttributeNamespaceURI(int)} method.
*/
class Element_6Test {
		
		@Test
		void test_getAttributeNamespaceURI_1() {
				Element element = new Element("", "", 0);
				assertEquals(null, element.getAttributeNamespaceURI(-1));
		}
		
		@Test
		void test_getAttributeNamespaceURI_2() {
				Element element = new Element("", "", 0);
				assertEquals(null, element.getAttributeNamespaceURI(0));
		}
		
		@Test
		void test_getAttributeNamespaceURI_3() {
				Element element = new Element("", "", 1);
				element.addAttribute("", "", "", "");
				assertEquals