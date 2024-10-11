// StrangeSortListTest.java
package scenario1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StrangeSortList}.
* It contains ten unit test cases for the {@link StrangeSortList#strangeSortList(List)} method.
*/
class StrangeSortListTest {
	// Test case 1: Empty list
			@Test
			void testEmptyList() {
				List<Object> lst = new ArrayList<Object>();
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = StrangeSortList.strangeSortList(lst);
				assertEquals(expected, actual);
			}
			
			// Test case 2: List with one element
			@Test
			void testOneElementList() {
				List<Object> lst = new ArrayList<Object>();
				lst.add(5);
				List<Object> expected = new ArrayList<Object>();
				expected.add(5);
				List<Object> actual = StrangeSortList.strangeSortList(lst);
				assertEquals(expected, actual);
			}
			
			// Test case 3: List with only integers
			@Test
			void testIntegerList() {
				List<Object> lst = new ArrayList<Object>();
				lst.add(5);
				lst.add(2);
				lst.add(8);
				lst.add(1);
				lst.add(3);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(8);
				expected.add(2);
				expected.add(5);
				expected.add(3);
				List<Object> actual = StrangeSortList.strangeSortList(lst);
				assertEquals(expected, actual);
			}
			
			// Test case 4: List with only strings
			@Test
			void testStringList() {
				List<Object> lst = new ArrayList<Object>();
				lst.add("hello");
				lst.add("world");
				lst.add("java");
				List<Object> expected = new ArrayList<Object>();
				expected.add("hello");
				expected.add("world");
				expected.add("java");
				List<Object> actual = StrangeSortList.strangeSortList(lst);
				assertEquals(expected, actual);
			}
			
			// Test case 5: List with both integers and strings
			@Test
			void testMixedList() {
				List<Object> lst = new ArrayList<Object>();
				lst.add(5);
				lst.add("hello");
				lst.add(2);
				lst.add("world");
				lst.add(8);
				lst.add("java");
				List<Object> expected = new ArrayList<Object>();
				expected.add(2);
				expected.add("world");
				expected.add(5);
				expected.add("java");
				expected.add(8);
				expected.add("hello");
				List<Object> actual = StrangeSortList.strangeSortList(lst);
				assertEquals(expected, actual);
			}
			
			// Test case 6: List with negative integers
			@Test
			void testNegativeIntegerList() {
				List<Object> lst = new ArrayList<Object>();
				lst.add(-5);
				lst.add(-2);
				lst.add(-8);
				lst.add(-1);
				lst.add(-3);
				List<Object> expected = new ArrayList<Object>();
				expected.add(-8);
				expected.add(-1);
				expected.add(-5);
				expected.add(-2);
				expected.add(-3);
				List<Object> actual = StrangeSortList.strangeSortList(lst);
				assertEquals(expected, actual);
			}
			
			// Test case 7: List with duplicate integers
			@Test
			void testDuplicateIntegerList() {
				List<Object> lst = new ArrayList<Object>();
				lst.add(5);
				lst.add(2);
				lst.add(8);
				lst.add(1);
				lst.add(3);
				lst.add(5);
				lst.add(2);
				lst.add(8);
				lst.add(1);
				lst.add(3);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(8);
				expected.add(2);
				expected.add(5);
				expected.add(3);
				expected.add(1);
				expected.add(8);
				expected.add(2);
				expected.add(5);
				expected.add(3);
				List<Object> actual = StrangeSortList.strangeSortList(lst);
				assertEquals(expected, actual);
			}
			
			// Test case 8: List with null values
			@Test
			void testNullList() {
				List<Object> lst = new ArrayList<Object>();
				lst.add(null);
				lst.add(5);
				lst.add(null);
				lst.add(2);
				lst.add(null);
				lst.add(8);
				lst.add(null);
				lst.add(1);
				lst.add(null);
				lst.add(3);
				List<Object> expected = new ArrayList<Object>();
				expected.add(null);
				expected.add(8);
				expected.add(null);
				expected.add(5);
				expected.add(null);
				expected.add(3);
				expected.add(null);
				expected.add(2);
				expected.add(null);
				expected.add(1);
				List<Object> actual = StrangeSortList.strangeSortList(lst);
				assertEquals(expected, actual);
			}
			
			// Test case 9: List with empty strings
			@Test
			void testEmptyStringList() {
				List<Object> lst = new ArrayList<Object>();
				lst.add("");
				lst.add("hello");
				lst.add("");
				lst.add("world");
				lst.add("");
				lst.add("java");
				List<Object> expected = new ArrayList<Object>();
				expected.add("");
				expected.add("world");
				expected.add("");
				expected.add("java");
				expected.add("");
				expected.add("hello");
				List<Object> actual = StrangeSortList.strangeSortList(lst);
				assertEquals(expected, actual);
			}
			
			// Test case 10: List with special characters
			@Test
			void testSpecialCharacterList() {
				List<Object> lst = new ArrayList<Object>();
				lst.add("!");
				lst.add("hello");
				lst.add("@");
				lst.add("world");
				lst.add("#");
				lst.add("java");
				List<Object> expected = new ArrayList<Object>();
				expected.add("!");
				expected.add("world");
				expected.add("@");
				expected.add("java");
				expected.add("#");
				expected.add("hello");
				List<Object> actual = StrangeSortList.strangeSortList(lst);
				assertEquals(expected, actual);
			}
}