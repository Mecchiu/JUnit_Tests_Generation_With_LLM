// UniqueTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Unique}.
* It contains ten unit test cases for the {@link Unique#unique(List)} method.
*/
class UniqueTest {
			// Test case 1: Test with empty list
			@Test
			void testUnique1() {
				List<Integer> l = new ArrayList<>();
				List<Integer> expected = new ArrayList<>();
				List<Integer> actual = Unique.unique(l);
				assertEquals(expected, actual);
			}

			// Test case 2: Test with list of one element
			@Test
			void testUnique2() {
				List<Integer> l = new ArrayList<>();
				l.add(5);
				List<Integer> expected = new ArrayList<>();
				expected.add(5);
				List<Integer> actual = Unique.unique(l);
				assertEquals(expected, actual);
			}

			// Test case 3: Test with list of two elements
			@Test
			void testUnique3() {
				List<Integer> l = new ArrayList<>();
				l.add(5);
				l.add(3);
				List<Integer> expected = new ArrayList<>();
				expected.add(3);
				expected.add(5);
				List<Integer> actual = Unique.unique(l);
				assertEquals(expected, actual);
			}

			// Test case 4: Test with list of three elements
			@Test
			void testUnique4() {
				List<Integer> l = new ArrayList<>();
				l.add(5);
				l.add(3);
				l.add(5);
				List<Integer> expected = new ArrayList<>();
				expected.add(3);
				expected.add(5);
				List<Integer> actual = Unique.unique(l);
				assertEquals(expected, actual);
			}

			// Test case 5: Test with list of four elements
			@Test
			void testUnique5() {
				List<Integer> l = new ArrayList<>();
				l.add(5);
				l.add(3);
				l.add(5);
				l.add(2);
				List<Integer> expected = new ArrayList<>();
				expected.add(2);
				expected.add(3);
				expected.add(5);
				List<Integer> actual = Unique.unique(l);
				assertEquals(expected, actual);
			}

			// Test case 6: Test with list of five elements
			@Test
			void testUnique6() {
				List<Integer> l = new ArrayList<>();
				l.add(5);
				l.add(3);
				l.add(5);
				l.add(2);
				l.add(3);
				List<Integer> expected = new ArrayList<>();
				expected.add(2);
				expected.add(3);
				expected.add(5);
				List<Integer> actual = Unique.unique(l);
				assertEquals(expected, actual);
			}

			// Test case 7: Test with list of six elements
			@Test
			void testUnique7() {
				List<Integer> l = new ArrayList<>();
				l.add(5);
				l.add(3);
				l.add(5);
				l.add(2);
				l.add(3);
				l.add(3);
				List<Integer> expected = new ArrayList<>();
				expected.add(2);
				expected.add(3);
				expected.add(5);
				List<Integer> actual = Unique.unique(l);
				assertEquals(expected, actual);
			}

			// Test case 8: Test with list of seven elements
			@Test
			void testUnique8() {
				List<Integer> l = new ArrayList<>();
				l.add(5);
				l.add(3);
				l.add(5);
				l.add(2);
				l.add(3);
				l.add(3);
				l.add(9);
				List<Integer> expected = new ArrayList<>();
				expected.add(2);
				expected.add(3);
				expected.add(5);
				expected.add(9);
				List<Integer> actual = Unique.unique(l);
				assertEquals(expected, actual);
			}

			// Test case 9: Test with list of eight elements
			@Test
			void testUnique9() {
				List<Integer> l = new ArrayList<>();
				l.add(5);
				l.add(3);
				l.add(5);
				l.add(2);
				l.add(3);
				l.add(3);
				l.add(9);
				l.add(0);
				List<Integer> expected = new ArrayList<>();
				expected.add(0);
				expected.add(2);
				expected.add(3);
				expected.add(5);
				expected.add(9);
				List<Integer> actual = Unique.unique(l);
				assertEquals(expected, actual);
			}

			// Test case 10: Test with list of nine elements
			@Test
			void testUnique10() {
				List<Integer> l = new ArrayList<>();
				l.add(5);
				l.add(3);
				l.add(5);
				l.add(2);
				l.add(3);
				l.add(3);
				l.add(9);
				l.add(0);
				l.add(123);
				List<Integer> expected = new ArrayList<>();
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