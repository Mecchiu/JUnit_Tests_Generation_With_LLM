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
* It contains ten unit test cases for the {@link Element#numberOfNamespaceMappings()} method.
*/
class Element_6Test {

	@Test
	void test_numberOfNamespaceMappings_0() {
		Element element = new Element("", "", -1, -1);
		assertEquals(0, element.numberOfNamespaceMappings());
	}
	
	@Test
	void test_numberOfNamespaceMappings_1() {
		Element element = new Element("", "", -1, -1);
		element.addNamespaceMapping("", "");
		assertEquals(1, element.numberOfNamespaceMappings());
	}
	
	@Test
	void test_numberOfNamespaceMappings_2() {
		Element element = new Element("", "", -1, -1);
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		assertEquals(2, element.numberOfNamespaceMappings());
	}
	
	@Test
	void test_numberOfNamespaceMappings_3() {
		Element element = new Element("", "", -1, -1);
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		assertEquals(3, element.numberOfNamespaceMappings());
	}
	
	@Test
	void test_numberOfNamespaceMappings_4() {
		Element element = new Element("", "", -1, -1);
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		assertEquals(4, element.numberOfNamespaceMappings());
	}
	
	@Test
	void test_numberOfNamespaceMappings_5() {
		Element element = new Element("", "", -1, -1);
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		assertEquals(5, element.numberOfNamespaceMappings());
	}
	
	@Test
	void test_numberOfNamespaceMappings_6() {
		Element element = new Element("", "", -1, -1);
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		assertEquals(6, element.numberOfNamespaceMappings());
	}
	
	@Test
	void test_numberOfNamespaceMappings_7() {
		Element element = new Element("", "", -1, -1);
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		assertEquals(7, element.numberOfNamespaceMappings());
	}
	
	@Test
	void test_numberOfNamespaceMappings_8() {
		Element element = new Element("", "", -1, -1);
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		assertEquals(8, element.numberOfNamespaceMappings());
	}
	
	@Test
	void test_numberOfNamespaceMappings_9() {
		Element element = new Element("", "", -1, -1);
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		assertEquals(9, element.numberOfNamespaceMappings());
	}
	
	@Test
	void test_numberOfNamespaceMappings_10() {
		Element element = new Element("", "", -1, -1);
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		assertEquals(10, element.numberOfNamespaceMappings());
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
* It contains ten unit test cases for the {@link Element#getNamespaceMapping(int)} method.
*/
class Element_7Test {
		
	@Test
	void test_getNamespaceMapping_0() {
		Element element = new Element("", "", -1, -1);
		element.addNamespaceMapping("", "");
		String[] result = element.getNamespaceMapping(0);
		assertEquals("", result[0]);
		assertEquals("", result[1]);
	}
	
	@Test
	void test_getNamespaceMapping_1() {
		Element element = new Element("", "", -1, -1);
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		String[] result = element.getNamespaceMapping(1);
		assertEquals("", result[0]);
		assertEquals("", result[1]);
	}
	
	@Test
	void test_getNamespaceMapping_2() {
		Element element = new Element("", "", -1, -1);
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		String[] result = element.getNamespaceMapping(2);
		assertEquals("", result[0]);
		assertEquals("", result[1]);
	}
	
	@Test
	void test_getNamespaceMapping_3() {
		Element element = new Element("", "", -1, -1);
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
		element.addNamespaceMapping("", "");
	