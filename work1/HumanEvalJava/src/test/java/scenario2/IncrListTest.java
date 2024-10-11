// IncrListTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IncrList}.
* It contains ten unit test cases for the {@link IncrList#incrList(List)} method.
*/
class IncrListTest {
			// Test case 1: Test with empty list
			@Test
			void testEmptyList() {
				List<Object> l = new ArrayList<Object>();
				List<Object> result = IncrList.incrList(l);
				assertEquals(0, result.size());
			}
			
			// Test case 2: Test with list of one element
			@Test
			void testOneElementList() {
				List<Object> l = new ArrayList<Object>();
				l.add(1);
				List<Object> result = IncrList.incrList(l);
				assertEquals(1, result.size());
				assertEquals(2, result.get(0));
			}
			
			// Test case 3: Test with list of two elements
			@Test
			void testTwoElementsList() {
				List<Object> l = new ArrayList<Object>();
				l.add(1);
				l.add(2);
				List<Object> result = IncrList.incrList(l);
				assertEquals(2, result.size());
				assertEquals(2, result.get(0));
				assertEquals(3, result.get(1));
			}
			
			// Test case 4: Test with list of three elements
			@Test
			void testThreeElementsList() {
				List<Object> l = new ArrayList<Object>();
				l.add(1);
				l.add(2);
				l.add(3);
				List<Object> result = IncrList.incrList(l);
				assertEquals(3, result.size());
				assertEquals(2, result.get(0));
				assertEquals(3, result.get(1));
				assertEquals(4, result.get(2));
			}
			
			// Test case 5: Test with list of four elements
			@Test
			void testFourElementsList() {
				List<Object> l = new ArrayList<Object>();
				l.add(1);
				l.add(2);
				l.add(3);
				l.add(4);
				List<Object> result = IncrList.incrList(l);
				assertEquals(4, result.size());
				assertEquals(2, result.get(0));
				assertEquals(3, result.get(1));
				assertEquals(4, result.get(2));
				assertEquals(5, result.get(3));
			}
			
			// Test case 6: Test with list of five elements
			@Test
			void testFiveElementsList() {
				List<Object> l = new ArrayList<Object>();
				l.add(1);
				l.add(2);
				l.add(3);
				l.add(4);
				l.add(5);
				List<Object> result = IncrList.incrList(l);
				assertEquals(5, result.size());
				assertEquals(2, result.get(0));
				assertEquals(3, result.get(1));
				assertEquals(4, result.get(2));
				assertEquals(5, result.get(3));
				assertEquals(6, result.get(4));
			}
			
			// Test case 7: Test with list of six elements
			@Test
			void testSixElementsList() {
				List<Object> l = new ArrayList<Object>();
				l.add(1);
				l.add(2);
				l.add(3);
				l.add(4);
				l.add(5);
				l.add(6);
				List<Object> result = IncrList.incrList(l);
				assertEquals(6, result.size());
				assertEquals(2, result.get(0));
				assertEquals(3, result.get(1));
				assertEquals(4, result.get(2));
				assertEquals(5, result.get(3));
				assertEquals(6, result.get(4));
				assertEquals(7, result.get(5));
			}
			
			// Test case 8: Test with list of seven elements
			@Test
			void testSevenElementsList() {
				List<Object> l = new ArrayList<Object>();
				l.add(1);
				l.add(2);
				l.add(3);
				l.add(4);
				l.add(5);
				l.add(6);
				l.add(7);
				List<Object> result = IncrList.incrList(l);
				assertEquals(7, result.size());
				assertEquals(2, result.get(0));
				assertEquals(3, result.get(1));
				assertEquals(4, result.get(2));
				assertEquals(5, result.get(3));
				assertEquals(6, result.get(4));
				assertEquals(7, result.get(5));
				assertEquals(8, result.get(6));
			}
			
			// Test case 9: Test with list of eight elements
			@Test
			void testEightElementsList() {
				List<Object> l = new ArrayList<Object>();
				l.add(1);
				l.add(2);
				l.add(3);
				l.add(4);
				l.add(5);
				l.add(6);
				l.add(7);
				l.add(8);
				List<Object> result = IncrList.incrList(l);
				assertEquals(8, result.size());
				assertEquals(2, result.get(0));
				assertEquals(3, result.get(1));
				assertEquals(4, result.get(2));
				assertEquals(5, result.get(3));
				assertEquals(6, result.get(4));
				assertEquals(7, result.get(5));
				assertEquals(8, result.get(6));
				assertEquals(9, result.get(7));
			}
			
			// Test case 10: Test with list of nine elements
			@Test
			void testNineElementsList() {
				List<Object> l = new ArrayList<Object>();
				l.add(1);
				l.add(2);
				l.add(3);
				l.add(4);
				l.add(5);
				l.add(6);
				l.add(7);
				l.add(8);
				l.add(9);
				List<Object> result = IncrList.incrList(l);
				assertEquals(9, result.size());
				assertEquals(2, result.get(0));
				assertEquals(3, result.get(1));
				assertEquals(4, result.get(2));
				assertEquals(5, result.get(3));
				assertEquals(6, result.get(4));
				assertEquals(7, result.get(5));
				assertEquals(8, result.get(6));
				assertEquals(9, result.get(7));
				assertEquals(10, result.get(8));
			}
}