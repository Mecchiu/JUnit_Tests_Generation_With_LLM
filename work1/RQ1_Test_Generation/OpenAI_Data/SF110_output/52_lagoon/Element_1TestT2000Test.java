// Element_1Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains ten unit test cases for the {@link Element#numberOfAttributes()} method.
*/
class Element_1Test {

	@Test
	void test_numberOfAttributes_1() {
		Element element = new Element("", "", 0);
		assertEquals(0, element.numberOfAttributes());
	}
	
	@Test
	void test_numberOfAttributes_2() {
		Element element = new Element("", "", 1);
		assertEquals(0, element.numberOfAttributes());
	}
	
	@Test
	void test_numberOfAttributes_3() {
		Element element = new Element("", "", 2);
		assertEquals(0, element.numberOfAttributes());
	}
	
	@Test
	void test_numberOfAttributes_4() {
		Element element = new Element("", "", 3);
		assertEquals(0, element.numberOfAttributes());
	}
	
	@Test
	void test_numberOfAttributes_5() {
		Element element = new Element("", "", 4);
		assertEquals(0, element.numberOfAttributes());
	}
	
	@Test
	void test_numberOfAttributes_6() {
		Element element = new Element("", "", 5);
		assertEquals(0, element.numberOfAttributes());
	}
	
	@Test
	void test_numberOfAttributes_7() {
		Element element = new Element("", "", 6);
		assertEquals(0, element.numberOfAttributes());
	}
	
	@Test
	void test_numberOfAttributes_8() {
		Element element = new Element("", "", 7);
		assertEquals(0, element.numberOfAttributes());
	}
	
	@Test
	void test_numberOfAttributes_9() {
		Element element = new Element("", "", 8);
		assertEquals(0, element.numberOfAttributes());
	}
	
	@Test
	void test_numberOfAttributes_10() {
		Element element = new Element("", "", 9);
		assertEquals(0, element.numberOfAttributes());
	}
}

// Element_2Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains ten unit test cases for the {@link Element#addAttribute(String, String, String, String)} method.
*/
class Element_2Test {
		
	@Test
	void test_addAttribute_1() {
		Element element = new Element("", "", 0);
		element.addAttribute("", "", "", "");
		assertEquals(1, element.numberOfAttributes());
	}
	
	@Test
	void test_addAttribute_2() {
		Element element = new Element("", "", 1);
		element.addAttribute("", "", "", "");
		assertEquals(1, element.numberOfAttributes());
	}
	
	@Test
	void test_addAttribute_3() {
		Element element = new Element("", "", 2);
		element.addAttribute("", "", "", "");
		assertEquals(1, element.numberOfAttributes());
	}
	
	@Test
	void test_addAttribute_4() {
		Element element = new Element("", "", 3);
		element.addAttribute("", "", "", "");
		assertEquals(1, element.numberOfAttributes());
	}
	
	@Test
	void test_addAttribute_5() {
		Element element = new Element("", "", 4);
		element.addAttribute("", "", "", "");
		assertEquals(1, element.numberOfAttributes());
	}
	
	@Test
	void test_addAttribute_6() {
		Element element = new Element("", "", 5);
		element.addAttribute("", "", "", "");
		assertEquals(1, element.numberOfAttributes());
	}
	
	@Test
	void test_addAttribute_7() {
		Element element = new Element("", "", 6);
		element.addAttribute("", "", "", "");
		assertEquals(1, element.numberOfAttributes());
	}
	
	@Test
	void test_addAttribute_8() {
		Element element = new Element("", "", 7);
		element.addAttribute("", "", "", "");
		assertEquals(1, element.numberOfAttributes());
	}
	
	@Test
	void test_addAttribute_9() {
		Element element = new Element("", "", 8);
		element.addAttribute("", "", "", "");
		assertEquals(1, element.numberOfAttributes());
	}
	
	@Test
	void test_addAttribute_10() {
		Element element = new Element("", "", 9);
		element.addAttribute("", "", "", "");
		assertEquals(1, element.numberOfAttributes());
	}
}

// Element_3Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains ten unit test cases for the {@link Element#addAttribute(String, String, String, String)} method.
*/
class Element_3Test {
		
	@Test
	void test_addAttribute_1() {
		Element element = new Element("", "", 0);
		element.addAttribute("", "", "", "");
		assertEquals(1, element.numberOfAttributes());
	}
	
	@Test
	void test_addAttribute_2() {
		Element element = new Element("", "", 1);
		element.addAttribute("", "", "", "");
		assertEquals(1, element.numberOfAttributes());
	}
	
	@Test
	void test_addAttribute_3() {
		Element element = new Element("", "", 2);
		element.addAttribute("", "", "", "");
		assertEquals(1, element.numberOfAttributes());
	}
	
	@Test
	void test_addAttribute_4() {
		Element element = new Element("", "", 3);
		element.addAttribute("", "", "", "");
		assertEquals(1, element.numberOfAttributes());
	}
	
	@Test
	void test_addAttribute_5() {
		Element element = new Element("", "", 4);
		element.addAttribute("", "", "", "");
		assertEquals(1, element.numberOfAttributes());
	}
	
	@Test
	void test_addAttribute_6() {
		Element element = new Element("", "", 5);
		element.addAttribute("", "", "", "");
		assertEquals(1, element.numberOfAttributes());
	}
	
	@Test
	void test_addAttribute_7() {
		Element element = new Element("", "", 6);
		element.addAttribute("", "", "", "");
		assertEquals(1, element.numberOfAttributes());
	}
	
	@Test
	void test_addAttribute_8() {
		Element element = new Element("", "", 7);
		element.addAttribute("", "", "", "");
		assertEquals(1, element.numberOfAttributes());
	}
	
	@Test
	void test_addAttribute_9() {
		Element element = new Element("", "", 8);
		element.addAttribute("", "", "", "");
		assertEquals(1, element