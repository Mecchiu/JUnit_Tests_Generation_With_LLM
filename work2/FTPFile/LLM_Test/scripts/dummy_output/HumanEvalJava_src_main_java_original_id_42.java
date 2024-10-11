// IncrListTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IncrList}.
* It contains ten unit test cases for the {@link IncrList#incrList(List)} method.
*/
class IncrListTest {
			// Test case 1: Test with a list of positive integers
			@Test
			void testIncrList1() {
				List<Object> l = new ArrayList<Object>();
				l.add(1);
				l.add(2);
				l.add(3);
				List<Object> expected = new ArrayList<Object>();
				expected.add(2);
				expected.add(3);
				expected.add(4);
				List<Object> actual = IncrList.incrList(l);
				assertEquals(expected, actual);
			}
			
			// Test case 2: Test with a list of negative integers
			@Test
			void testIncrList2() {
				List<Object> l = new ArrayList<Object>();
				l.add(-1);
				l.add(-2);
				l.add(-3);
				List<Object> expected = new ArrayList<Object>();
				expected.add(0);
				expected.add(-1);
				expected.add(-2);
				List<Object> actual = IncrList.incrList(l);
				assertEquals(expected, actual);
			}
			
			// Test case 3: Test with a list of positive and negative integers
			@Test
			void testIncrList3() {
				List<Object> l = new ArrayList<Object>();
				l.add(1);
				l.add(-2);
				l.add(3);
				List<Object> expected = new ArrayList<Object>();
				expected.add(2);
				expected.add(-1);
				expected.add(4);
				List<Object> actual = IncrList.incrList(l);
				assertEquals(expected, actual);
			}
			
			// Test case 4: Test with a list of positive and negative integers and zero
			@Test
			void testIncrList4() {
				List<Object> l = new ArrayList<Object>();
				l.add(1);
				l.add(-2);
				l.add(0);
				List<Object> expected = new ArrayList<Object>();
				expected.add(2);
				expected.add(-1);
				expected.add(1);
				List<Object> actual = IncrList.incrList(l);
				assertEquals(expected, actual);
			}
			
			// Test case 5: Test with a list of positive and negative integers and zero
			@Test
			void testIncrList5() {
				List<Object> l = new ArrayList<Object>();
				l.add(1);
				l.add(-2);
				l.add(0);
				l.add(3);
				List<Object> expected = new ArrayList<Object>();
				expected.add(2);
				expected.add(-1);
				expected.add(1);
				expected.add(4);
				List<Object> actual = IncrList.incrList(l);
				assertEquals(expected, actual);
			}
			
			// Test case 6: Test with a list of positive and negative integers and zero
			@Test
			void testIncrList6() {
				List<Object> l = new ArrayList<Object>();
				l.add(1);
				l.add(-2);
				l.add(0);
				l.add(3);
				l.add(0);
				List<Object> expected = new ArrayList<Object>();
				expected.add(2);
				expected.add(-1);
				expected.add(1);
				expected.add(4);
				expected.add(1);
				List<Object> actual = IncrList.incrList(l);
				assertEquals(expected, actual);
			}
			
			// Test case 7: Test with a list of positive and negative integers and zero
			@Test
			void testIncrList7() {
				List<Object> l = new ArrayList<Object>();
				l.add(1);
				l.add(-2);
				l.add(0);
				l.add(3);
				l.add(0);
				l.add(-1);
				List<Object> expected = new ArrayList<Object>();
				expected.add(2);
				expected.add(-1);
				expected.add(1);
				expected.add(4);
				expected.add(1);
				expected.add(0);
				List<Object> actual = IncrList.incrList(l);
				assertEquals(expected, actual);
			}
			
			// Test case 8: Test with a list of positive and negative integers and zero
			@Test
			void testIncrList8() {
				List<Object> l = new ArrayList<Object>();
				l.add(1);
				l.add(-2);
				l.add(0);
				l.add(3);
				l.add(0);
				l.add(-1);
				l.add(5);
				List<Object> expected = new ArrayList<Object>();
				expected.add(2);
				expected.add(-1);
				expected.add(1);
				expected.add(4);
				expected.add(1);
				expected.add(0);
				expected.add(6);
				List<Object> actual = IncrList.incrList(l);
				assertEquals(expected, actual);
			}
			
			// Test case 9: Test with a list of positive and negative integers and zero
			@Test
			void testIncrList9() {
				List<Object> l = new ArrayList<Object>();
				l.add(1);
				l.add(-2);
				l.add(0);
				l.add(3);
				l.add(0);
				l.add(-1);
				l.add(5);
				l.add(0);
				List<Object> expected = new ArrayList<Object>();
				expected.add(2);
				expected.add(-1);
				expected.add(1);
				expected.add(4);
				expected.add(1);
				expected.add(0);
				expected.add(6);
				expected.add(1);
				List<Object> actual = IncrList.incrList(l);
				assertEquals(expected, actual);
			}
			
			// Test case 10: Test with an empty list
			@Test
			void testIncrList10() {
				List<Object> l = new ArrayList<Object>();
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = IncrList.incrList(l);
				assertEquals(expected, actual);
			}
}