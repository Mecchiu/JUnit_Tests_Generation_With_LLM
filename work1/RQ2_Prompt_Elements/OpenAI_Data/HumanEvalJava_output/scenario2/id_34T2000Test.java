// UniqueTest.java
package scenario2;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Unique}.
* It contains ten unit test cases for the {@link Unique#unique(List)} method.
*/
class UniqueTest {
	// Test case 1: Empty list
			@Test
			void testUnique1() {
				List<Integer> input = new ArrayList<Integer>();
				List<Integer> expected = new ArrayList<Integer>();
				List<Integer> actual = Unique.unique(input);
				assertEquals(expected, actual);
			}
			
			// Test case 2: List with one element
			@Test
			void testUnique2() {
				List<Integer> input = new ArrayList<Integer>();
				input.add(1);
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(1);
				List<Integer> actual = Unique.unique(input);
				assertEquals(expected, actual);
			}
			
			// Test case 3: List with two identical elements
			@Test
			void testUnique3() {
				List<Integer> input = new ArrayList<Integer>();
				input.add(1);
				input.add(1);
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(1);
				List<Integer> actual = Unique.unique(input);
				assertEquals(expected, actual);
			}
			
			// Test case 4: List with two different elements
			@Test
			void testUnique4() {
				List<Integer> input = new ArrayList<Integer>();
				input.add(1);
				input.add(2);
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(1);
				expected.add(2);
				List<Integer> actual = Unique.unique(input);
				assertEquals(expected, actual);
			}
			
			// Test case 5: List with multiple identical elements
			@Test
			void testUnique5() {
				List<Integer> input = new ArrayList<Integer>();
				input.add(1);
				input.add(1);
				input.add(1);
				input.add(1);
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(1);
				List<Integer> actual = Unique.unique(input);
				assertEquals(expected, actual);
			}
			
			// Test case 6: List with multiple different elements
			@Test
			void testUnique6() {
				List<Integer> input = new ArrayList<Integer>();
				input.add(1);
				input.add(2);
				input.add(3);
				input.add(4);
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(1);
				expected.add(2);
				expected.add(3);
				expected.add(4);
				List<Integer> actual = Unique.unique(input);
				assertEquals(expected, actual);
			}
			
			// Test case 7: List with negative elements
			@Test
			void testUnique7() {
				List<Integer> input = new ArrayList<Integer>();
				input.add(-1);
				input.add(-2);
				input.add(-3);
				input.add(-4);
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(-4);
				expected.add(-3);
				expected.add(-2);
				expected.add(-1);
				List<Integer> actual = Unique.unique(input);
				assertEquals(expected, actual);
			}
			
			// Test case 8: List with zero
			@Test
			void testUnique8() {
				List<Integer> input = new ArrayList<Integer>();
				input.add(0);
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(0);
				List<Integer> actual = Unique.unique(input);
				assertEquals(expected, actual);
			}
			
			// Test case 9: List with multiple identical elements and one different element
			@Test
			void testUnique9() {
				List<Integer> input = new ArrayList<Integer>();
				input.add(1);
				input.add(1);
				input.add(1);
				input.add(1);
				input.add(2);
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(1);
				expected.add(2);
				List<Integer> actual = Unique.unique(input);
				assertEquals(expected, actual);
			}
			
			// Test case 10: List with multiple different elements and one identical element
			@Test
			void testUnique10() {
				List<Integer> input = new ArrayList<Integer>();
				input.add(1);
				input.add(2);
				input.add(3);
				input.add(4);
				input.add(4);
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(1);
				expected.add(2);
				expected.add(3);
				expected.add(4);
				List<Integer> actual = Unique.unique(input);
				assertEquals(expected, actual);
			}
}