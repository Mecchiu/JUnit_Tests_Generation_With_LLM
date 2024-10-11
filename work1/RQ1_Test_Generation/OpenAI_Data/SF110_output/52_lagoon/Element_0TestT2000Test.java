// Element_0Test.java
package nu.staldal.xtree;

import java.util.Vector;
import java.net.URL;
import org.xml.sax.*;
import org.xml.sax.helpers.AttributesImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Element}.
* It contains ten unit test cases for the {@link Element#lookupAttribute(String, String)} method.
*/
class Element_0Test {

		@Test
		void test_lookupAttribute_0() {
			Element element = new Element("", "", 0);
			int result = element.lookupAttribute("", "");
			assertEquals(-1, result);
		}
		
		@Test
		void test_lookupAttribute_1() {
			Element element = new Element("", "", 0);
			int result = element.lookupAttribute("", "a");
			assertEquals(-1, result);
		}
		
		@Test
		void test_lookupAttribute_2() {
			Element element = new Element("", "", 0);
			int result = element.lookupAttribute("a", "");
			assertEquals(-1, result);
		}
		
		@Test
		void test_lookupAttribute_3() {
			Element element = new Element("", "", 0);
			int result = element.lookupAttribute("a", "a");
			assertEquals(-1, result);
		}
		
		@Test
		void test_lookupAttribute_4() {
			Element element = new Element("", "", 1);
			int result = element.lookupAttribute("", "");
			assertEquals(-1, result);
		}
		
		@Test
		void test_lookupAttribute_5() {
			Element element = new Element("", "", 1);
			int result = element.lookupAttribute("", "a");
			assertEquals(-1, result);
		}
		
		@Test
		void test_lookupAttribute_6() {
			Element element = new Element("", "", 1);
			int result = element.lookupAttribute("a", "");
			assertEquals(-1, result);
		}
		
		@Test
		void test_lookupAttribute_7() {
			Element element = new Element("", "", 1);
			int result = element.lookupAttribute("a", "a");
			assertEquals(-1, result);
		}
		
		@Test
		void test_lookupAttribute_8() {
			Element element = new Element("", "", 1);
			element.addAttribute("", "", "", "");
			int result = element.lookupAttribute("", "");
			assertEquals(0, result);
		}
		
		@Test
		void test_lookupAttribute_9() {
			Element element = new Element("", "", 1);
			element.addAttribute("", "a", "", "");
			int result = element.lookupAttribute("", "a");
			assertEquals(0, result);
		}
		
		@Test
		void test_lookupAttribute_10() {
			Element element = new Element("", "", 1);
			element.addAttribute("a", "", "", "");
			int result = element.lookupAttribute("a", "");
			assertEquals(0, result);
		}
		
		@Test
		void test_lookupAttribute_11() {
			Element element = new Element("", "", 1);
			element.addAttribute("a", "a", "", "");
			int result = element.lookupAttribute("a", "a");
			assertEquals(0, result);
		}
		
		@Test
		void test_lookupAttribute_12() {
			Element element = new Element("", "", 2);
			element.addAttribute("", "", "", "");
			element.addAttribute("", "a", "", "");
			int result = element.lookupAttribute("", "");
			assertEquals(0, result);
		}
		
		@Test
		void test_lookupAttribute_13() {
			Element element = new Element("", "", 2);
			element.addAttribute("", "", "", "");
			element.addAttribute("", "a", "", "");
			int result = element.lookupAttribute("", "a");
			assertEquals(1, result);
		}
		
		@Test
		void test_lookupAttribute_14() {
			Element element = new Element("", "", 2);
			element.addAttribute("a", "", "", "");
			element.addAttribute("", "a", "", "");
			int result = element.lookupAttribute("a", "");
			assertEquals(0, result);
		}
		
		@Test
		void test_lookupAttribute_15() {
			Element element = new Element("", "", 2);
			element.addAttribute("a", "", "", "");
			element.addAttribute("", "a", "", "");
			int result = element.lookupAttribute("a", "a");
			assertEquals(-1, result);
		}
		
		@Test
		void test_lookupAttribute_16() {
			Element element = new Element("", "", 2);
			element.addAttribute("", "", "", "");
			element.addAttribute("a", "", "", "");
			int result = element.lookupAttribute("", "");
			assertEquals(0, result);
		}
		
		@Test
		void test_lookupAttribute_17() {
			Element element = new Element("", "", 2);
			element.addAttribute("", "", "", "");
			element.addAttribute("a", "", "", "");
			int result = element.lookupAttribute("", "a");
			assertEquals(-1, result);
		}
		
		@Test
		void test_lookupAttribute_18() {
			Element element = new Element("", "", 2);
			element.addAttribute("", "", "", "");
			element.addAttribute("a", "", "", "");
			int result = element.lookupAttribute("a", "");
			assertEquals(1, result);
		}
		
		@Test
		void test_lookupAttribute_19() {
			Element element = new Element("", "", 2);
			element.addAttribute("", "", "", "");
			element.addAttribute("a", "", "", "");
			int result = element.lookupAttribute("a", "a");
			assertEquals(-1, result);
		}
		
		@Test
		void test_lookupAttribute_20() {
			Element element = new Element("", "", 2);
			element.addAttribute("a", "", "", "");
			element.addAttribute("", "a", "", "");
			int result = element.lookupAttribute("", "");
			assertEquals(-1, result);
		}
		
		@Test
		void test_lookupAttribute_21() {
			Element element = new Element("", "", 2);
			element.addAttribute("a", "", "", "");
			element.addAttribute("", "a", "", "");
			int result = element.lookupAttribute("", "a");
			assertEquals(1, result);
		}
		
		@Test
		void test_lookupAttribute_22() {
			Element element = new Element("", "", 2);
			element.addAttribute("a", "", "", "");
			element.addAttribute("", "a", "", "");
			int result = element.lookupAttribute("a