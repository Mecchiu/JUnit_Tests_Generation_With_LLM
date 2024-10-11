// UniqueTest.java
package original;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Unique}.
* It contains ten unit test cases for the {@link Unique#unique(List)} method.
*/
class UniqueTest {
	// Test case 1: Test with an empty list
			@Test
			void testEmptyList() {
				List<Integer> l = new ArrayList<Integer>();
				List<Integer> expected = new ArrayList<Integer>();
				List<Integer> actual = Unique.unique(l);
				assertEquals(expected, actual);
			}

			// Test case 2: Test with a list of one element
			@Test
			void testOneElementList() {
				List<Integer> l = new ArrayList<Integer>();
				l.add(5);
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(5);
				List<Integer> actual = Unique.unique(l);
				assertEquals(expected, actual);
			}

			// Test case 3: Test with a list of two elements
			@Test
			void testTwoElementsList() {
				List<Integer> l = new ArrayList<Integer>();
				l.add(5);
				l.add(3);
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(3);
				expected.add(5);
				List<Integer> actual = Unique.unique(l);
				assertEquals(expected, actual);
			}

			// Test case 4: Test with a list of three elements
			@Test
			void testThreeElementsList() {
				List<Integer> l = new ArrayList<Integer>();
				l.add(5);
				l.add(3);
				l.add(2);
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(2);
				expected.add(3);
				expected.add(5);
				List<Integer> actual = Unique.unique(l);
				assertEquals(expected, actual);
			}

			// Test case 5: Test with a list of four elements
			@Test
			void testFourElementsList() {
				List<Integer> l = new ArrayList<Integer>();
				l.add(5);
				l.add(3);
				l.add(2);
				l.add(3);
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(2);
				expected.add(3);
				expected.add(5);
				List<Integer> actual = Unique.unique(l);
				assertEquals(expected, actual);
			}

			// Test case 6: Test with a list of five elements
			@Test
			void testFiveElementsList() {
				List<Integer> l = new ArrayList<Integer>();
				l.add(5);
				l.add(3);
				l.add(2);
				l.add(3);
				l.add(9);
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(2);
				expected.add(3);
				expected.add(5);
				expected.add(9);
				List<Integer> actual = Unique.unique(l);
				assertEquals(expected, actual);
			}

			// Test case 7: Test with a list of six elements
			@Test
			void testSixElementsList() {
				List<Integer> l = new ArrayList<Integer>();
				l.add(5);
				l.add(3);
				l.add(2);
				l.add(3);
				l.add(9);
				l.add(0);
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(0);
				expected.add(2);
				expected.add(3);
				expected.add(5);
				expected.add(9);
				List<Integer> actual = Unique.unique(l);
				assertEquals(expected, actual);
			}

			// Test case 8: Test with a list of seven elements
			@Test
			void testSevenElementsList() {
				List<Integer> l = new ArrayList<Integer>();
				l.add(5);
				l.add(3);
				l.add(5);
				l.add(2);
				l.add(3);
				l.add(3);
				l.add(9);
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(2);
				expected.add(3);
				expected.add(5);
				expected.add(9);
				List<Integer> actual = Unique.unique(l);
				assertEquals(expected, actual);
			}

			// Test case 9: Test with a list of eight elements
			@Test
			void testEightElementsList() {
				List<Integer> l = new ArrayList<Integer>();
				l.add(5);
				l.add(3);
				l.add(5);
				l.add(2);
				l.add(3);
				l.add(3);
				l.add(9);
				l.add(0);
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(0);
				expected.add(2);
				expected.add(3);
				expected.add(5);
				expected.add(9);
				List<Integer> actual = Unique.unique(l);
				assertEquals(expected, actual);
			}

			// Test case 10: Test with a list of nine elements
			@Test
			void testNineElementsList() {
				List<Integer> l = new ArrayList<Integer>();
				l.add(5);
				l.add(3);
				l.add(5);
				l.add(2);
				l.add(3);
				l.add(3);
				l.add(9);
				l.add(0);
				l.add(123);
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(0);
				expected.add(2);
				expected.add(3);
				expected.add(5);
				expected.add(9);
				expected.add(123);
				List<Integer> actual = Unique.unique(l);
				assertEquals(expected, actual);
			}
}
