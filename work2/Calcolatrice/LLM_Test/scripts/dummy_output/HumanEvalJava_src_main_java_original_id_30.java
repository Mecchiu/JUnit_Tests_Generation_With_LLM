// GetPositiveTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPositive}.
* It contains ten unit test cases for the {@link GetPositive#getPositive(List)} method.
*/
class GetPositiveTest {
			// Test case 1: getPositive([-1, 2, -4, 5, 6])
			@Test
			void testGetPositive1() {
				List<Object> l = new ArrayList<Object>();
				l.add(-1);
				l.add(2);
				l.add(-4);
				l.add(5);
				l.add(6);
				List<Object> expected = new ArrayList<Object>();
				expected.add(2);
				expected.add(5);
				expected.add(6);
				List<Object> actual = GetPositive.getPositive(l);
				assertEquals(expected, actual);
			}

			// Test case 2: getPositive([5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10])
			@Test
			void testGetPositive2() {
				List<Object> l = new ArrayList<Object>();
				l.add(5);
				l.add(3);
				l.add(-5);
				l.add(2);
				l.add(-3);
				l.add(3);
				l.add(9);
				l.add(0);
				l.add(123);
				l.add(1);
				l.add(-10);
				List<Object> expected = new ArrayList<Object>();
				expected.add(5);
				expected.add(3);
				expected.add(2);
				expected.add(3);
				expected.add(9);
				expected.add(123);
				expected.add(1);
				List<Object> actual = GetPositive.getPositive(l);
				assertEquals(expected, actual);
			}

			// Test case 3: getPositive([-1, -2, 4, 5, 6])
			@Test
			void testGetPositive3() {
				List<Object> l = new ArrayList<Object>();
				l.add(-1);
				l.add(-2);
				l.add(4);
				l.add(5);
				l.add(6);
				List<Object> expected = new ArrayList<Object>();
				expected.add(4);
				expected.add(5);
				expected.add(6);
				List<Object> actual = GetPositive.getPositive(l);
				assertEquals(expected, actual);
			}

			// Test case 4: getPositive([5, 3, -5, 2, 3, 3, 9, 0, 123, 1, -10])
			@Test
			void testGetPositive4() {
				List<Object> l = new ArrayList<Object>();
				l.add(5);
				l.add(3);
				l.add(-5);
				l.add(2);
				l.add(3);
				l.add(3);
				l.add(9);
				l.add(0);
				l.add(123);
				l.add(1);
				l.add(-10);
				List<Object> expected = new ArrayList<Object>();
				expected.add(5);
				expected.add(3);
				expected.add(2);
				expected.add(3);
				expected.add(3);
				expected.add(9);
				expected.add(123);
				expected.add(1);
				List<Object> actual = GetPositive.getPositive(l);
				assertEquals(expected, actual);
			}

			// Test case 5: getPositive([-1, -2])
			@Test
			void testGetPositive5() {
				List<Object> l = new ArrayList<Object>();
				l.add(-1);
				l.add(-2);
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = GetPositive.getPositive(l);
				assertEquals(expected, actual);
			}

			// Test case 6: getPositive([])
			@Test
			void testGetPositive6() {
				List<Object> l = new ArrayList<Object>();
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = GetPositive.getPositive(l);
				assertEquals(expected, actual);
			}

			// Test case 7: getPositive([-1, 2, -4, 5, 6])
			@Test
			void testGetPositive7() {
				List<Object> l = new ArrayList<Object>();
				l.add(-1);
				l.add(2);
				l.add(-4);
				l.add(5);
				l.add(6);
				List<Object> expected = new ArrayList<Object>();
				expected.add(2);
				expected.add(5);
				expected.add(6);
				List<Object> actual = GetPositive.getPositive(l);
				assertEquals(expected, actual);
			}

			// Test case 8: getPositive([5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10])
			@Test
			void testGetPositive8() {
				List<Object> l = new ArrayList<Object>();
				l.add(5);
				l.add(3);
				l.add(-5);
				l.add(2);
				l.add(-3);
				l.add(3);
				l.add(9);
				l.add(0);
				l.add(123);
				l.add(1);
				l.add(-10);
				List<Object> expected = new ArrayList<Object>();
				expected.add(5);
				expected.add(3);
				expected.add(2);
				expected.add(3);
				expected.add(9);
				expected.add(123);
				expected.add(1);
				List<Object> actual = GetPositive.getPositive(l);
				assertEquals(expected, actual);
			}

			// Test case 9: getPositive([-1, -2, 4, 5, 6])
			@Test
			void testGetPositive9() {
				List<Object> l = new ArrayList<Object>();
				l.add(-1);
				l.add(-2);
				l.add(4);
				l.add(5);
				l.add(6);
				List<Object> expected = new ArrayList<Object>();
				expected.add(4);
				expected.add(5);
				expected.add(6);
				List<Object> actual = GetPositive.getPositive(l);
				assertEquals(expected, actual);
			}

			// Test case 10: getPositive([5, 3, -5, 2, 3, 3, 9, 0, 123, 1, -10])
			@Test
			void testGetPositive10() {
				List<Object> l = new ArrayList<Object>();
				l.add(5);
				l.add(3);
				l.add(-5);
				l.add(2);
				l.add(3);
				l.add(3);
				l.add(9);
				l.add(0);
				l.add(123);
				l.add(1);
				l.add(-10);
				List<Object> expected = new ArrayList<Object>();
				expected.add(5);
				expected.add(3);
				expected.add(2);
				expected.add(3);
				expected.add(3);
				expected.add(9);
				expected.add(123);
				expected.add(1);
				List<Object> actual = GetPositive.getPositive(l);
				assertEquals(expected, actual);
			}
}