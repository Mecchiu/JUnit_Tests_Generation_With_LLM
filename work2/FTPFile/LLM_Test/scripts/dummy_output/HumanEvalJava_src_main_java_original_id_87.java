// GetRowTest.java
package original;

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
			/**
			* Test case for the {@link GetRow#getRow(List, int)} method.
			* It tests the case when the list is empty.
			*/
			@Test
			void testEmptyList() {
				List<Object> lst = new ArrayList<Object>();
				int x = 1;
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = GetRow.getRow(lst, x);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link GetRow#getRow(List, int)} method.
			* It tests the case when the list contains one element.
			*/
			@Test
			void testOneElementList() {
				List<Object> lst = new ArrayList<Object>();
				lst.add(1);
				int x = 2;
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = GetRow.getRow(lst, x);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link GetRow#getRow(List, int)} method.
			* It tests the case when the list contains one row.
			*/
			@Test
			void testOneRowList() {
				List<Object> lst = new ArrayList<Object>();
				lst.add(new ArrayList<Object>());
				lst.add(new ArrayList<Object>());
				lst.add(new ArrayList<Object>());
				int x = 1;
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = GetRow.getRow(lst, x);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link GetRow#getRow(List, int)} method.
			* It tests the case when the list contains one row and one column.
			*/
			@Test
			void testOneRowOneColumnList() {
				List<Object> lst = new ArrayList<Object>();
				List<Object> row = new ArrayList<Object>();
				row.add(1);
				lst.add(row);
				int x = 1;
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = GetRow.getRow(lst, x);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link GetRow#getRow(List, int)} method.
			* It tests the case when the list contains one row and two columns.
			*/
			@Test
			void testOneRowTwoColumnsList() {
				List<Object> lst = new ArrayList<Object>();
				List<Object> row = new ArrayList<Object>();
				row.add(1);
				row.add(2);
				lst.add(row);
				int x = 1;
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = GetRow.getRow(lst, x);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link GetRow#getRow(List, int)} method.
			* It tests the case when the list contains two rows and one column.
			*/
			@Test
			void testTwoRowsOneColumnList() {
				List<Object> lst = new ArrayList<Object>();
				List<Object> row1 = new ArrayList<Object>();
				row1.add(1);
				List<Object> row2 = new ArrayList<Object>();
				row2.add(1);
				lst.add(row1);
				lst.add(row2);
				int x = 1;
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = GetRow.getRow(lst, x);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link GetRow#getRow(List, int)} method.
			* It tests the case when the list contains two rows and two columns.
			*/
			@Test
			void testTwoRowsTwoColumnsList() {
				List<Object> lst = new ArrayList<Object>();
				List<Object> row1 = new ArrayList<Object>();
				row1.add(1);
				row1.add(2);
				List<Object> row2 = new ArrayList<Object>();
				row2.add(1);
				row2.add(2);
				lst.add(row1);
				lst.add(row2);
				int x = 1;
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = GetRow.getRow(lst, x);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link GetRow#getRow(List, int)} method.
			* It tests the case when the list contains three rows and three columns.
			*/
			@Test
			void testThreeRowsThreeColumnsList() {
				List<Object> lst = new ArrayList<Object>();
				List<Object> row1 = new ArrayList<Object>();
				row1.add(1);
				row1.add(2);
				row1.add(3);
				List<Object> row2 = new ArrayList<Object>();
				row2.add(1);
				row2.add(2);
				row2.add(3);
				List<Object> row3 = new ArrayList<Object>();
				row3.add(1);
				row3.add(2);
				row3.add(3);
				lst.add(row1);
				lst.add(row2);
				lst.add(row3);
				int x = 1;
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = GetRow.getRow(lst, x);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link GetRow#getRow(List, int)} method.
			* It tests the case when the list contains three rows and three columns.
			*/
			@Test
			void testThreeRowsThreeColumnsList2() {
				List<Object> lst = new ArrayList<Object>();
				List<Object> row1 = new ArrayList<Object>();
				row1.add(1);
				row1.add(2);
				row1.add(3);
				List<Object> row2 = new ArrayList<Object>();
				row2.add(1);
				row2.add(2);
				row2.add(3);
				List<Object> row3 = new ArrayList<Object>();
				row3.add(1);
				row3.add(2);
				row3.add(3);
				lst.add(row1);
				lst.add(row2);
				lst.add(row3);
				int x = 2;
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = GetRow.getRow(lst, x);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link GetRow#getRow(List, int)} method.
			* It tests the case when the list contains three rows and three columns.
			*/
			@Test
			void testThreeRowsThreeColumnsList3() {
				List<Object> lst = new ArrayList<Object>();
				List<Object> row1 = new ArrayList<Object>();
				row1.add(1);
				row1.add(2);
				row1.add(3);
				List<Object> row2 = new ArrayList<Object>();
				row2.add(1);
				row2.add(2);
				row2.add(3);
				List<Object> row3 = new ArrayList<Object>();
				row3.add(1);
				row3.add(2);
				row3.add(3);
				lst.add(row1);
				lst.add(row2);
				lst.add(row3);
				int x = 3;
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = GetRow.getRow(lst, x);
				assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link GetRow#getRow(List, int)} method.
			* It tests the case when the list contains three rows and three columns.
			*/
			@Test
			void testThreeRowsThreeColumnsList4() {
				List<Object> lst = new ArrayList<Object>();
				List<Object> row1 = new ArrayList<Object>();
				row1.add(1);
				row1.add(2);
				row1.add(3);
				List<Object> row2 = new ArrayList<Object>();
				row2.add(1);
				row2.add(2);
				row2.add(3);
				List<Object> row3 = new ArrayList<Object>();
				row3.add(1);
				row3.add(2);
				row3.add(3);
				lst.add(row1);
				lst.add(row2);
				lst.add(row3);
				int x = 4;
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = GetRow.getRow(lst, x);
				assertEquals(expected, actual);
			}
}