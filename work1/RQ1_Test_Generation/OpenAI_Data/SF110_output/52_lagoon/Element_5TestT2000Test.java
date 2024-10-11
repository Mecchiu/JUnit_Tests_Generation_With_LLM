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
		assertThrows(IndexOutOfBoundsException.class, () -> {
			element.getAttributeValue(0);
		});
	}
	
	@Test
	void test_getAttributeValue_2() {
		Element element = new Element("", "", 0);
		assertThrows(IndexOutOfBoundsException.class, () -> {
			element.getAttributeValue(-1);
		});
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
		element.addAttribute("", "", "", "a");
		assertEquals("a", element.getAttributeValue(0));
	}
	
	@Test
	void test_getAttributeValue_5() {
		Element element = new Element("", "", 1);
		element.addAttribute("", "", "", "a");
		assertThrows(IndexOutOfBoundsException.class, () -> {
			element.getAttributeValue(1);
		});
	}
	
	@Test
	void test_getAttributeValue_6() {
		Element element = new Element("", "", 1);
		element.addAttribute("", "", "", "a");
		assertThrows(IndexOutOfBoundsException.class, () -> {
			element.getAttributeValue(-1);
		});
	}
	
	@Test
	void test_getAttributeValue_7() {
		Element element = new Element("", "", 2);
		element.addAttribute("", "", "", "a");
		element.addAttribute("", "", "", "b");
		assertEquals("a", element.getAttributeValue(0));
	}
	
	@Test
	void test_getAttributeValue_8() {
		Element element = new Element("", "", 2);
		element.addAttribute("", "", "", "a");
		element.addAttribute("", "", "", "b");
		assertEquals("b", element.getAttributeValue(1));
	}
	
	@Test
	void test_getAttributeValue_9() {
		Element element = new Element("", "", 2);
		element.addAttribute("", "", "", "a");
		element.addAttribute("", "", "", "b");
		assertThrows(IndexOutOfBoundsException.class, () -> {
			element.getAttributeValue(2);
		});
	}
	
	@Test
	void test_getAttributeValue_10() {
		Element element = new Element("", "", 2);
		element.addAttribute("", "", "", "a");
		element.addAttribute("", "", "", "b");
		assertThrows(IndexOutOfBoundsException.class, () -> {
			element.getAttributeValue(-1);
		});
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
* It contains ten unit test cases for the {@link Element#getAttributeType(int)} method.
*/
class Element_6Test {
		
	@Test
	void test_getAttributeType_1() {
		Element element = new Element("", "", 0);
		assertThrows(IndexOutOfBoundsException.class, () -> {
			element.getAttributeType(0);
		});
	}
	
	@Test
	void test_getAttributeType_2() {
		Element element = new Element("", "", 0);
		assertThrows(IndexOutOfBoundsException.class, () -> {
			element.getAttributeType(-1);
		});
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
		element.addAttribute("", "", "a", "");
		assertEquals("a", element.getAttributeType(0));
	}
	
	@Test
	void test_getAttributeType_5() {
		Element element = new Element("", "", 1);
		element.addAttribute("", "", "a", "");
		assertThrows(IndexOutOfBoundsException.class, () -> {
			element.getAttributeType(1);
		});
	}
	
	@Test
	void test_getAttributeType_6() {
		Element element = new Element("", "", 1);
		element.addAttribute("", "", "a", "");
		assertThrows(IndexOutOfBoundsException.class, () -> {
			element.getAttributeType(-1);
		});
	}
	
	@Test
	void test_getAttributeType_7() {
		Element element = new Element("", "", 2);
		element.addAttribute("", "", "a", "");
		element.addAttribute("", "", "b", "");
		assertEquals("a", element.getAttributeType(0));
	}
	
	@Test
	void test_getAttributeType_8() {
		Element element = new Element("", "", 2);
		element.addAttribute("", "", "a", "");
		element.addAttribute("", "", "b", "");
		assertEquals("b", element.getAttributeType(1));
	}
	
	@Test
	void test_getAttributeType_9() {
		Element element = new Element("", "", 2);
		element.addAttribute("", "", "a", "");
		element.addAttribute("", "", "b", "");
		assertThrows(IndexOutOfBoundsException.class, () -> {
			element.getAttributeType(2);
		});
	}
	
	@Test
	void test_getAttributeType_10() {
		Element element = new Element("", "", 2);
		element.addAttribute("", "", "a", "");
		element.addAttribute("", "", "b", "");
		assertThrows(IndexOutOfBoundsException.class, () -> {
			element.getAttributeType(-1);
		});
	}
}

// Element_7Test.java
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
class Element_7Test {
		
	@Test
	void test_getAttributeNamespaceURI_1() {
		Element element = new Element("", "", 0);
		assertThrows(IndexOutOfBoundsException.class, () -> {
			element.getAttributeNamespaceURI(0);
		});
	}
	
	@Test