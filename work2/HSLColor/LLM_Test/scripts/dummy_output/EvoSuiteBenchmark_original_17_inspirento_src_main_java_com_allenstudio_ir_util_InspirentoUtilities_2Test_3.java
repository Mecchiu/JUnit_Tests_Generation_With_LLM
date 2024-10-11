// InspirentoUtilities_2Test.java
package com.allenstudio.ir.util;

import java.util.StringTokenizer;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InspirentoUtilities}.
* It contains one unit test case for the {@link InspirentoUtilities#stringReplaceAll(StringBuffer, char, String)} method.
*/
class InspirentoUtilities_2Test {
		
		@Test
		void test_replaceAll_all_replaceOne() {
			assertEquals("1", stringReplaceAll("", '1', "1"));
			assertEquals("2", stringReplaceAll("", '2', "2"));
			assertEquals("3", stringReplaceAll("", '3', "3"));
			assertEquals("4", stringReplaceAll("", '4', "4"));
			
			assertEquals("1", stringReplaceAll("", '1', "a"));
			assertEquals("2", stringReplaceAll("", '2', "b"));
			assertEquals("3", stringReplaceAll("", '3', "c"));
			assertEquals("4", stringReplaceAll("", '4', "d"));
		}
		
		// StringUtilities method
		@Test
		void test_replaceAll_replaceCharacterExceptFirst() {
			assertEquals("1", stringReplaceAll("", '1', "a", 0, 1));
			assertEquals("2", stringReplaceAll("", '2', "b", 1, 1));
			assertEquals("3", stringReplaceAll("", '3', "c", 1, 1));
			assertEquals("4", stringReplaceAll("", '4', "d", 1, 1));
		}
		
		// Vector methods
		@Test
		void test_replaceAll_insertToken() {
			StringTokenizer s = new StringTokenizer("a-");
			Vector v = new Vector();
			v.add(s.nextToken());
			v.add(s.nextToken());
			v.add(s.nextToken());
			v.add(String.valueOf("t"));
			stringReplaceAll(s.nextToken(), '-', "", true);
			assertEquals(5, v.size());
			assertTrue(v.contains("a"));
			assertTrue(v.contains("-"));
			assertTrue(v.contains("-"));
			assertTrue(v.contains(""));
			assertTrue(v.contains("t"));
			assertTrue(v.contains(String.valueOf("-")));
			assertTrue(v.contains(String.valueOf("t")));
			assertTrue(v.contains(String.valueOf("-")));
			assertTrue(v.contains(String.valueOf("")));
			
			assertEquals("a", v.get(0));
			assertEquals("1", v.get(1));
			assertEquals("-", v.get(2));
			assertEquals("-", v.get(3));
			assertEquals("-", v.get(4));
			assertEquals(4, v.indexOf("-"));
			assertEquals("b", v.get(5));
			assertEquals(5, v.indexOf("t"));
		}
}