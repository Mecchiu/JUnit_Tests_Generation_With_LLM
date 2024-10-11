// GetRowTest.java
package scenario2;

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
	* Test case 1.
	* Test case for {@link GetRow#getRow(List, int)} method.
	* Test case with a list of lists of integers and an integer.
	* The method should return a list of tuples, [(x1, y1), (x2, y2) ...] such that
	* each tuple is a coordinate - (row, columns), starting with 0.
	* Sort coordinates initially by rows in ascending order.
	* Also, sort coordinates of the row by columns in descending order.
	*/
	@Test
	void testGetRow1() {
		List<Object> lst = new ArrayList<Object>();
		List<Object> row1 = new ArrayList<Object>();
		row1.add(1);
		row1.add(2);
		row1.add(3);
		row1.add(4);
		List<Object> row2 = new ArrayList<Object>();
		row2.add(5);
		row2.add(6);
		row2.add(7);
		List<Object> row3 = new ArrayList<Object>();
		row3.add(8);
		row3.add(9);
		row3.add(10);
		row3.add(11);
		row3.add(12);
		lst.add(row1);
		lst.add(row2);
		lst.add(row3);
		int x = 7;
		List<Object> expected = new ArrayList<Object>();
		List<Object> coordinate1 = new ArrayList<Object>();
		coordinate1.add(1);
		coordinate1.add(2);
		List<Object> coordinate2 = new ArrayList<Object>();
		coordinate2.add(2);
		coordinate2.add(1);
		expected.add(coordinate1);
		expected.add(coordinate2);
		List<Object> actual = GetRow.getRow(lst, x);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2.
	* Test case for {@link GetRow#getRow(List, int)} method.
	* Test case with a list of lists of integers and an integer.
	* The method should return a list of tuples, [(x1, y1), (x2, y2) ...] such that
	* each tuple is a coordinate - (row, columns), starting with 0.
	* Sort coordinates initially by rows in ascending order.
	* Also, sort coordinates of the row by columns in descending order.
	*/
	@Test
	void testGetRow2() {
		List<Object> lst = new ArrayList<Object>();
		List<Object> row1 = new ArrayList<Object>();
		row1.add(1);
		row1.add(2);
		row1.add(3);
		row1.add(4);
		List<Object> row2 = new ArrayList<Object>();
		row2.add(5);
		row2.add(6);
		row2.add(7);
		List<Object> row3 = new ArrayList<Object>();
		row3.add(8);
		row3.add(9);
		row3.add(10);
		row3.add(11);
		row3.add(12);
		lst.add(row1);
		lst.add(row2);
		lst.add(row3);
		int x = 1;
		List<Object> expected = new ArrayList<Object>();
		List<Object> coordinate1 = new ArrayList<Object>();
		coordinate1.add(0);
		coordinate1.add(0);
		List<Object> coordinate2 = new ArrayList<Object>();
		coordinate2.add(2);
		coordinate2.add(4);
		expected.add(coordinate1);
		expected.add(coordinate2);
		List<Object> actual = GetRow.getRow(lst, x);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3.
	* Test case for {@link GetRow#getRow(List, int)} method.
	* Test case with a list of lists of integers and an integer.
	* The method should return a list of tuples, [(x1, y1), (x2, y2) ...] such that
	* each tuple is a coordinate - (row, columns), starting with 0.
	* Sort coordinates initially by rows in ascending order.
	* Also, sort coordinates of the row by columns in descending order.
	*/
	@Test
	void testGetRow3() {
		List<Object> lst = new ArrayList<Object>();
		List<Object> row1 = new ArrayList<Object>();
		row1.add(1);
		row1.add(2);
		row1.add(3);
		row1.add(4);
		List<Object> row2 = new ArrayList<Object>();
		row2.add(5);
		row2.add(6);
		row2.add(7);
		List<Object> row3 = new ArrayList<Object>();
		row3.add(8);
		row3.add(9);
		row3.add(10);
		row3.add(11);
		row3.add(12);
		lst.add(row1);
		lst.add(row2);
		lst.add(row3);
		int x = 12;
		List<Object> expected = new ArrayList<Object>();
		List<Object> coordinate1 = new ArrayList<Object>();
		coordinate1.add(2);
		coordinate1.add(4);
		expected.add(coordinate1);
		List<Object> actual = GetRow.getRow(lst, x);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4.
	* Test case for {@link GetRow#getRow(List, int)} method.
	* Test case with a list of lists of integers and an integer.
	* The method should return a list of tuples, [(x1, y1), (x2, y2) ...] such that
	* each tuple is a coordinate - (row, columns), starting with 0.
	* Sort coordinates initially by rows in ascending order.
	* Also, sort coordinates of the row by columns in descending order.
	*/
	@Test
	void testGetRow4() {
		List<Object> lst = new ArrayList<Object>();
		List<Object> row1 = new ArrayList<Object>();
		row1.add(1);
		row1.add(2);
		row1.add(3);
		row1.add(4);
		List<Object> row2 = new ArrayList<Object>();
		row2.add(5);
		row2.add(6);
		row2.add(7);
		List<Object> row3 = new ArrayList<Object>();
		row3.add(8);
		row3.add(9);
		row3.add(10);
		row3.add(11);
		row3.add(12);
		lst.add(row1);
		lst.add(row2);
		lst.add(row3);
		int x = 13;
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = GetRow.getRow(lst, x);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5.
	* Test case for {@link GetRow#getRow(List, int)} method.
	* Test case with a list of lists of integers and an integer.
	* The method should return a list of tuples, [(x1, y1), (x2, y2) ...] such that
	* each tuple is a coordinate - (row, columns), starting with 0.
	* Sort coordinates initially by rows in ascending order.
	* Also, sort coordinates of the row by columns in descending order.
	*/
	@Test
	void testGetRow5() {
		List<Object> lst = new ArrayList<Object>();
		List<Object> row1 = new ArrayList<Object>();
		row1.add(1);
		row1.add(2);
		row1.add(3);
		row1.add(4);
		List<Object> row2 = new ArrayList<Object>();
		row2.add(5);
		row2.add(6);
		row2.add(7);
		List<Object> row3 = new ArrayList<Object>();
		row3.add(8);
		row3.add(9);
		row3.add(10);
		row3.add(11);
		row3.add(12);
		lst.add(row1);
		lst.add(row2);
		lst.add(row3);
		int x = 0;
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = GetRow.getRow(lst, x);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6.
	* Test case for {@link GetRow#getRow(List, int)} method.
	* Test case with a list of lists of integers and an integer.
	* The method should return a list of tuples, [(x1, y1), (x2, y2) ...] such that
	* each tuple is a coordinate - (row, columns), starting with 0.
	* Sort coordinates initially by rows in ascending order.
	* Also, sort coordinates of the row by columns in descending order.
	*/
	@Test
	void testGetRow6() {
		List<Object> lst = new ArrayList<Object>();
		List<Object> row1 = new ArrayList<Object>();
		row1.add(1);
		row1.add(2);
		row1.add(3);
		row1.add(4);
		List<Object> row2 = new ArrayList<Object>();
		row2.add(5);
		row2.add(6);
		row2.add(7);
		List<Object> row3 = new ArrayList<Object>();
		row3.add(8);
		row3.add(9);
		row3.add(10);
		row3.add(11);
		row3.add(12);
		lst.add(row1);
		lst.add(row2);
		lst.add(row3);
		int x = -1;
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = GetRow.getRow(lst, x);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7.
	* Test case for {@link GetRow#getRow(List, int)} method.
	* Test case with a list of lists of integers and an integer.
	* The method should return a list of tuples, [(x1, y1), (x2, y2) ...] such that
	* each tuple is a coordinate - (row, columns), starting with 0.
	* Sort coordinates initially by rows in ascending order.
	* Also, sort coordinates of the row by columns in descending order.
	*/
	@Test
	void testGetRow7() {
		List<Object> lst = new ArrayList<Object>();
		List<Object> row1 = new ArrayList<Object>();
		row1.add(1);
		row1.add(2);
		row1.add(3);
		row1.add(4);
		List<Object> row2 = new ArrayList<Object>();
		row2.add(5);
		row2.add(6);
		row2.add(7);
		List<Object> row3 = new ArrayList<Object>();
		row3.add(8);
		row3.add(9);
		row3.add(10);
		row3.add(11);
		row3.add(12);
		lst.add(row1);
		lst.add(row2);
		lst.add(row3);
		int x = 5;
		List<Object> expected = new ArrayList<Object>();
		List<Object> coordinate1 = new ArrayList<Object>();
		coordinate1.add(0);
		coordinate1.add(4);
		List<Object> coordinate2 = new ArrayList<Object>();
		coordinate2.add(1);
		coordinate2.add(0);
		expected.add(coordinate1);
		expected.add(coordinate2);
		List<Object> actual = GetRow.getRow(lst, x);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8.
	* Test case for {@link GetRow#getRow(List, int)} method.
	* Test case with a list of lists of integers and an integer.
	* The method should return a list of tuples, [(x1, y1), (x2, y2) ...] such that
	* each tuple is a coordinate - (row, columns), starting with 0.
	* Sort coordinates initially by rows in ascending order.
	* Also, sort coordinates of the row by columns in descending order.
	*/
	@Test
	void testGetRow8() {
		List<Object> lst = new ArrayList<Object>();
		List<Object> row1 = new ArrayList<Object>();
		row1.add(1);
		row1.add(2);
		row1.add(3);
		row1.add(4);
		List<Object> row2 = new ArrayList<Object>();
		row2.add(5);
		row2.add(6);
		row2.add(7);
		List<Object> row3 = new ArrayList<Object>();
		row3.add(8);
		row3.add(9);
		row3.add(10);
		row3.add(11);
		row3.add(12);
		lst.add(row1);
		lst.add(row2);
		lst.add(row3);
		int x = 6;
		List<Object> expected = new ArrayList<Object>();
		List<Object> coordinate1 = new ArrayList<Object>();
		coordinate1.add(0);
		coordinate1.add(3);
		List<Object> coordinate2 = new ArrayList<Object>();
		coordinate2.add(1);
		coordinate2.add(1);
		expected.add(coordinate1);
		expected.add(coordinate2);
		List<Object> actual = GetRow.getRow(lst, x);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9.
	* Test case for {@link GetRow#getRow(List, int)} method.
	* Test case with a list of lists of integers and an integer.
	* The method should return a list of tuples, [(x1, y1), (x2, y2) ...] such that
	* each tuple is a coordinate - (row, columns), starting with 0.
	* Sort coordinates initially by rows in ascending order.
	* Also, sort coordinates of the row by columns in descending order.
	*/
	@Test
	void testGetRow9() {
		List<Object> lst = new ArrayList<Object>();
		List<Object> row1 = new ArrayList<Object>();
		row1.add