// GetRowTest.java
package scenario1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetRow}.
* It contains ten unit test cases for the {@link GetRow#getRow(List, int)} method.
*/
class GetRowTest {
	// Test case 1: Empty list
			@Test
			void testEmptyList() {
				List<Object> lst = new ArrayList<Object>();
				int x = 1;
				List<Object> result = GetRow.getRow(lst, x);
				assertEquals(0, result.size());
			}
			
			// Test case 2: List with one element
			@Test
			void testOneElementList() {
				List<Object> lst = new ArrayList<Object>();
				lst.add(1);
				int x = 1;
				List<Object> result = GetRow.getRow(lst, x);
				assertEquals(1, result.size());
				List<Object> coordinate = (List<Object>) result.get(0);
				assertEquals(0, coordinate.get(0));
				assertEquals(0, coordinate.get(1));
			}
			
			// Test case 3: List with multiple elements, x not in list
			@Test
			void testMultipleElementsXNotInList() {
				List<Object> lst = new ArrayList<Object>();
				lst.add(1);
				lst.add(2);
				lst.add(3);
				int x = 4;
				List<Object> result = GetRow.getRow(lst, x);
				assertEquals(0, result.size());
			}
			
			// Test case 4: List with multiple elements, x in list
			@Test
			void testMultipleElementsXInList() {
				List<Object> lst = new ArrayList<Object>();
				lst.add(1);
				lst.add(2);
				lst.add(3);
				int x = 2;
				List<Object> result = GetRow.getRow(lst, x);
				assertEquals(1, result.size());
				List<Object> coordinate = (List<Object>) result.get(0);
				assertEquals(0, coordinate.get(0));
				assertEquals(1, coordinate.get(1));
			}
			
			// Test case 5: List with multiple elements, x in list multiple times
			@Test
			void testMultipleElementsXInListMultipleTimes() {
				List<Object> lst = new ArrayList<Object>();
				lst.add(1);
				lst.add(2);
				lst.add(2);
				lst.add(3);
				int x = 2;
				List<Object> result = GetRow.getRow(lst, x);
				assertEquals(2, result.size());
				List<Object> coordinate1 = (List<Object>) result.get(0);
				assertEquals(0, coordinate1.get(0));
				assertEquals(1, coordinate1.get(1));
				List<Object> coordinate2 = (List<Object>) result.get(1);
				assertEquals(0, coordinate2.get(0));
				assertEquals(2, coordinate2.get(1));
			}
			
			// Test case 6: List with multiple elements, x in list multiple times, not in order
			@Test
			void testMultipleElementsXInListMultipleTimesNotInOrder() {
				List<Object> lst = new ArrayList<Object>();
				lst.add(2);
				lst.add(1);
				lst.add(2);
				lst.add(3);
				int x = 2;
				List<Object> result = GetRow.getRow(lst, x);
				assertEquals(2, result.size());
				List<Object> coordinate1 = (List<Object>) result.get(0);
				assertEquals(0, coordinate1.get(0));
				assertEquals(0, coordinate1.get(1));
				List<Object> coordinate2 = (List<Object>) result.get(1);
				assertEquals(0, coordinate2.get(0));
				assertEquals(2, coordinate2.get(1));
			}
			
			// Test case 7: List with multiple elements, x in list multiple times, in multiple rows
			@Test
			void testMultipleElementsXInListMultipleTimesInMultipleRows() {
				List<Object> lst = new ArrayList<Object>();
				lst.add(1);
				lst.add(2);
				lst.add(2);
				lst.add(3);
				lst.add(2);
				lst.add(4);
				int x = 2;
				List<Object> result = GetRow.getRow(lst, x);
				assertEquals(3, result.size());
				List<Object> coordinate1 = (List<Object>) result.get(0);
				assertEquals(0, coordinate1.get(0));
				assertEquals(1, coordinate1.get(1));
				List<Object> coordinate2 = (List<Object>) result.get(1);
				assertEquals(0, coordinate2.get(0));
				assertEquals(2, coordinate2.get(1));
				List<Object> coordinate3 = (List<Object>) result.get(2);
				assertEquals(1, coordinate3.get(0));
				assertEquals(0, coordinate3.get(1));
			}
			
			// Test case 8: List with multiple elements, x in list multiple times, in multiple rows, not in order
			@Test
			void testMultipleElementsXInListMultipleTimesInMultipleRowsNotInOrder() {
				List<Object> lst = new ArrayList<Object>();
				lst.add(2);
				lst.add(1);
				lst.add(2);
				lst.add(3);
				lst.add(2);
				lst.add(4);
				int x = 2;
				List<Object> result = GetRow.getRow(lst, x);
				assertEquals(3, result.size());
				List<Object> coordinate1 = (List<Object>) result.get(0);
				assertEquals(0, coordinate1.get(0));
				assertEquals(0, coordinate1.get(1));
				List<Object> coordinate2 = (List<Object>) result.get(1);
				assertEquals(0, coordinate2.get(0));
				assertEquals(2, coordinate2.get(1));
				List<Object> coordinate3 = (List<Object>) result.get(2);
				assertEquals(1, coordinate3.get(0));
				assertEquals(1, coordinate3.get(1));
			}
			
			// Test case 9: List with multiple elements, x in list multiple times, in multiple rows, in multiple columns
			@Test
			void testMultipleElementsXInListMultipleTimesInMultipleRowsInMultipleColumns() {
				List<Object> lst = new ArrayList<Object>();
				lst.add(1);
				lst.add(2);
				lst.add(2);
				lst.add(3);
				lst.add(2);
				lst.add(4);
				lst.add(2);
				lst.add(5);
				int x = 2;
				List<Object> result = GetRow.getRow(lst, x);
				assertEquals(4, result.size());
				List<Object> coordinate1 = (List<Object>) result.get(0);
				assertEquals(0, coordinate1.get(0));
				assertEquals(1, coordinate1.get(1));
				List<Object> coordinate2 = (List<Object>) result.get(1);
				assertEquals(0, coordinate2.get(0));
				assertEquals(2, coordinate2.get(1));
				List<Object> coordinate3 = (List<Object>) result.get(2);
				assertEquals(1, coordinate3.get(0));
				assertEquals(0, coordinate3.get(1));
				List<Object> coordinate4 = (List<Object>) result.get(3);
				assertEquals(2, coordinate4.get(0));
				assertEquals(0, coordinate4.get(1));
			}
			
			// Test case 10: List with multiple elements, x in list multiple times, in multiple rows, in multiple columns, not in order
			@Test
			void testMultipleElementsXInListMultipleTimesInMultipleRowsInMultipleColumnsNotInOrder() {
				List<Object> lst = new ArrayList<Object>();
				lst.add(2);
				lst.add(1);
				lst.add(2);
				lst.add(3);
				lst.add(2);
				lst.add(4);
				lst.add(2);
				lst.add(5);
				int x = 2;
				List<Object> result = GetRow.getRow(lst, x);
				assertEquals(4, result.size());
				List<Object> coordinate1 = (List<Object>) result.get(0);
				assertEquals(0, coordinate1.get(0));
				assertEquals(0, coordinate1.get(1));
				List<Object> coordinate2 = (List<Object>) result.get(1);
				assertEquals(0, coordinate2.get(0));
				assertEquals(2, coordinate2.get(1));
				List<Object> coordinate3 = (List<Object>) result.get(2);
				assertEquals(1, coordinate3.get(0));
				assertEquals(1, coordinate3.get(1));
				List<Object> coordinate4 = (List<Object>) result.get(3);
				assertEquals(2, coordinate4.get(0));
				assertEquals(1, coordinate4.get(1));
			}
}
