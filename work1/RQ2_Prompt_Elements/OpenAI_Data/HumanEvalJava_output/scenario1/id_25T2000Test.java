// FactorizeTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Factorize}.
* It contains ten unit test cases for the {@link Factorize#factorize(int)} method.
*/
class FactorizeTest {
	// Test case 1: n = 0
			@Test
			void testFactorize0() {
				List<Integer> expected = new ArrayList<Integer>();
				List<Integer> actual = Factorize.factorize(0);
				assertEquals(expected, actual);
			}
			
			// Test case 2: n = 1
			@Test
			void testFactorize1() {
				List<Integer> expected = new ArrayList<Integer>();
				List<Integer> actual = Factorize.factorize(1);
				assertEquals(expected, actual);
			}
			
			// Test case 3: n = 2
			@Test
			void testFactorize2() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(2);
				List<Integer> actual = Factorize.factorize(2);
				assertEquals(expected, actual);
			}
			
			// Test case 4: n = 3
			@Test
			void testFactorize3() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(3);
				List<Integer> actual = Factorize.factorize(3);
				assertEquals(expected, actual);
			}
			
			// Test case 5: n = 4
			@Test
			void testFactorize4() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(2);
				expected.add(2);
				List<Integer> actual = Factorize.factorize(4);
				assertEquals(expected, actual);
			}
			
			// Test case 6: n = 5
			@Test
			void testFactorize5() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(5);
				List<Integer> actual = Factorize.factorize(5);
				assertEquals(expected, actual);
			}
			
			// Test case 7: n = 6
			@Test
			void testFactorize6() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(2);
				expected.add(3);
				List<Integer> actual = Factorize.factorize(6);
				assertEquals(expected, actual);
			}
			
			// Test case 8: n = 7
			@Test
			void testFactorize7() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(7);
				List<Integer> actual = Factorize.factorize(7);
				assertEquals(expected, actual);
			}
			
			// Test case 9: n = 8
			@Test
			void testFactorize8() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(2);
				expected.add(2);
				expected.add(2);
				List<Integer> actual = Factorize.factorize(8);
				assertEquals(expected, actual);
			}
			
			// Test case 10: n = 9
			@Test
			void testFactorize9() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(3);
				expected.add(3);
				List<Integer> actual = Factorize.factorize(9);
				assertEquals(expected, actual);
			}
}