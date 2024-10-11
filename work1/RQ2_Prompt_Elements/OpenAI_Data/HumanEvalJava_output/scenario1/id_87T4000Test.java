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

	/**
	* Test case 1.
	* The input is a list of list of integers, and the integer to be searched is 1.
	* The expected result is a list of list of integers, which contains the coordinates of the integer 1.
	*/
	@Test
	void testGetRow1() {
		List<Object> lst = new ArrayList<Object>();
		List<Object> row1 = new ArrayList<Object>();
		row1.add(1);
		row1.add(2);
		row1.add(3);
		List<Object> row2 = new ArrayList<Object>();
		row2.add(4);
		row2.add(5);
		row2.add(6);
		List<Object> row3 = new ArrayList<Object>();
		row3.add(7);
		row3.add(8);
		row3.add(9);
		lst.add(row1);
		lst.add(row2);
		lst.add(row3);
		List<Object> result = new ArrayList<Object>();
		List<Object> coordinate1 = new ArrayList<Object>();
		coordinate1.add(0);
		coordinate1.add(0);
		List<Object> coordinate2 = new ArrayList<Object>();
		coordinate2.add(1);
		coordinate2.add(1);
		List<Object> coordinate3 = new ArrayList<Object>();
		coordinate3.add(2);
		coordinate3.add(2);
		result.add(coordinate1);
		result.add(coordinate2);
		result.add(coordinate3);
		assertEquals(result, GetRow.getRow(lst, 1));
	}
	
	/**
	* Test case 2.
	* The input is a list of list of integers, and the integer to be searched is 2.
	* The expected result is a list of list of integers, which contains the coordinates of the integer 2.
	*/
	@Test
	void testGetRow2() {
		List<Object> lst = new ArrayList<Object>();
		List<Object> row1 = new ArrayList<Object>();
		row1.add(1);
		row1.add(2);
		row1.add(3);
		List<Object> row2 = new ArrayList<Object>();
		row2.add(4);
		row2.add(5);
		row2.add(6);
		List<Object> row3 = new ArrayList<Object>();
		row3.add(7);
		row3.add(8);
		row3.add(9);
		lst.add(row1);
		lst.add(row2);
		lst.add(row3);
		List<Object> result = new ArrayList<Object>();
		List<Object> coordinate1 = new ArrayList<Object>();
		coordinate1.add(0);
		coordinate1.add(1);
		List<Object> coordinate2 = new ArrayList<Object>();
		coordinate2.add(1);
		coordinate2.add(2);
		result.add(coordinate1);
		result.add(coordinate2);
		assertEquals(result, GetRow.getRow(lst, 2));
	}
	
	/**
	* Test case 3.
	* The input is a list of list of integers, and the integer to be searched is 3.
	* The expected result is a list of list of integers, which contains the coordinates of the integer 3.
	*/
	@Test
	void testGetRow3() {
		List<Object> lst = new ArrayList<Object>();
		List<Object> row1 = new ArrayList<Object>();
		row1.add(1);
		row1.add(2);
		row1.add(3);
		List<Object> row2 = new ArrayList<Object>();
		row2.add(4);
		row2.add(5);
		row2.add(6);
		List<Object> row3 = new ArrayList<Object>();
		row3.add(7);
		row3.add(8);
		row3.add(9);
		lst.add(row1);
		lst.add(row2);
		lst.add(row3);
		List<Object> result = new ArrayList<Object>();
		List<Object> coordinate1 = new ArrayList<Object>();
		coordinate1.add(0);
		coordinate1.add(2);
		List<Object> coordinate2 = new ArrayList<Object>();
		coordinate2.add(1);
		coordinate2.add(1);
		List<Object> coordinate3 = new ArrayList<Object>();
		coordinate3.add(2);
		coordinate3.add(0);
		result.add(coordinate1);
		result.add(coordinate2);
		result.add(coordinate3);
		assertEquals(result, GetRow.getRow(lst, 3));
	}
	
	/**
	* Test case 4.
	* The input is a list of list of integers, and the integer to be searched is 4.
	* The expected result is a list of list of integers, which contains the coordinates of the integer 4.
	*/
	@Test
	void testGetRow4() {
		List<Object> lst = new ArrayList<Object>();
		List<Object> row1 = new ArrayList<Object>();
		row1.add(1);
		row1.add(2);
		row1.add(3);
		List<Object> row2 = new ArrayList<Object>();
		row2.add(4);
		row2.add(5);
		row2.add(6);
		List<Object> row3 = new ArrayList<Object>();
		row3.add(7);
		row3.add(8);
		row3.add(9);
		lst.add(row1);
		lst.add(row2);
		lst.add(row3);
		List<Object> result = new ArrayList<Object>();
		List<Object> coordinate1 = new ArrayList<Object>();
		coordinate1.add(1);
		coordinate1.add(0);
		List<Object> coordinate2 = new ArrayList<Object>();
		coordinate2.add(2);
		coordinate2.add(1);
		result.add(coordinate1);
		result.add(coordinate2);
		assertEquals(result, GetRow.getRow(lst, 4));
	}
	
	/**
	* Test case 5.
	* The input is a list of list of integers, and the integer to be searched is 5.
	* The expected result is a list of list of integers, which contains the coordinates of the integer 5.
	*/
	@Test
	void testGetRow5() {
		List<Object> lst = new ArrayList<Object>();
		List<Object> row1 = new ArrayList<Object>();
		row1.add(1);
		row1.add(2);
		row1.add(3);
		List<Object> row2 = new ArrayList<Object>();
		row2.add(4);
		row2.add(5);
		row2.add(6);
		List<Object> row3 = new ArrayList<Object>();
		row3.add(7);
		row3.add(8);
		row3.add(9);
		lst.add(row1);
		lst.add(row2);
		lst.add(row3);
		List<Object> result = new ArrayList<Object>();
		List<Object> coordinate1 = new ArrayList<Object>();
		coordinate1.add(1);
		coordinate1.add(1);
		List<Object> coordinate2 = new ArrayList<Object>();
		coordinate2.add(2);
		coordinate2.add(0);
		result.add(coordinate1);
		result.add(coordinate2);
		assertEquals(result, GetRow.getRow(lst, 5));
	}
	
	/**
	* Test case 6.
	* The input is a list of list of integers, and the integer to be searched is 6.
	* The expected result is a list of list of integers, which contains the coordinates of the integer 6.
	*/
	@Test
	void testGetRow6() {
		List<Object> lst = new ArrayList<Object>();
		List<Object> row1 = new ArrayList<Object>();
		row1.add(1);
		row1.add(2);
		row1.add(3);
		List<Object> row2 = new ArrayList<Object>();
		row2.add(4);
		row2.add(5);
		row2.add(6);
		List<Object> row3 = new ArrayList<Object>();
		row3.add(7);
		row3.add(8);
		row3.add(9);
		lst.add(row1);
		lst.add(row2);
		lst.add(row3);
		List<Object> result = new ArrayList<Object>();
		List<Object> coordinate1 = new ArrayList<Object>();
		coordinate1.add(1);
		coordinate1.add(2);
		List<Object> coordinate2 = new ArrayList<Object>();
		coordinate2.add(2);
		coordinate2.add(1);
		result.add(coordinate1);
		result.add(coordinate2);
		assertEquals(result, GetRow.getRow(lst, 6));
	}
	
	/**
	* Test case 7.
	* The input is a list of list of integers, and the integer to be searched is 7.
	* The expected result is a list of list of integers, which contains the coordinates of the integer 7.
	*/
	@Test
	void testGetRow7() {
		List<Object> lst = new ArrayList<Object>();
		List<Object> row1 = new ArrayList<Object>();
		row1.add(1);
		row1.add(2);
		row1.add(3);
		List<Object> row2 = new ArrayList<Object>();
		row2.add(4);
		row2.add(5);
		row2.add(6);
		List<Object> row3 = new ArrayList<Object>();
		row3.add(7);
		row3.add(8);
		row3.add(9);
		lst.add(row1);
		lst.add(row2);
		lst.add(row3);
		List<Object> result = new ArrayList<Object>();
		List<Object> coordinate1 = new ArrayList<Object>();
		coordinate1.add(2);
		coordinate1.add(0);
		result.add(coordinate1);
		assertEquals(result, GetRow.getRow(lst, 7));
	}
	
	/**
	* Test case 8.
	* The input is a list of list of integers, and the integer to be searched is 8.
	* The expected result is a list of list of integers, which contains the coordinates of the integer 8.
	*/
	@Test
	void testGetRow8() {
		List<Object> lst = new ArrayList<Object>();
		List<Object> row1 = new ArrayList<Object>();
		row1.add(1);
		row1.add(2);
		row1.add(3);
		List<Object> row2 = new ArrayList<Object>();
		row2.add(4);
		row2.add(5);
		row2.add(6);
		List<Object> row3 = new ArrayList<Object>();
		row3.add(7);
		row3.add(8);
		row3.add(9);
		lst.add(row1);
		lst.add(row2);
		lst.add(row3);
		List<Object> result = new ArrayList<Object>();
		List<Object> coordinate1 = new ArrayList<Object>();
		coordinate1.add(2);
		coordinate1.add(1);
		result.add(coordinate1);
		assertEquals(result, GetRow.getRow(lst, 8));
	}
	
	/**
	* Test case 9.
	* The input is a list of list of integers, and the integer to be searched is 9.
	* The expected result is a list of list of integers, which contains the coordinates of the integer 9.
	*/
	@Test
	void testGetRow9() {
		List<Object> lst = new ArrayList<Object>();
		List<Object> row1 = new ArrayList<Object>();
		row1.add(1);
		row1.add(2);
		row1.add(3);
		List<Object> row2 = new ArrayList<Object>();
		row2.add(4);
		row2.add(5);
		row2.add(6);
		List<Object> row3 = new ArrayList<Object>();
		row3.add(7);
		row3.add(8);
		row3.add(9);
		lst.add(row1);
		lst.add(row2);
		lst.add(row3);
		List<Object> result = new ArrayList<Object>();
		List<Object> coordinate1 = new ArrayList<Object>();
		coordinate1.add(2);
		coordinate1.add(2);
		result.add(coordinate1);
		assertEquals(result, GetRow.getRow(lst, 9));
	}
	
	/**
	* Test case 10.
	* The input is a list of list of integers, and the integer to be searched is 10.
	* The expected result is a list of list of integers, which contains the coordinates of the integer 10.
	*/
	@Test
	void testGetRow10() {
		List<Object> lst = new ArrayList<Object>();
		List<Object> row1 = new ArrayList<Object>();
		row1.add(1);
		row1.add(2);
		row1.add(3);
		List<Object> row2 = new ArrayList<Object>();
		row2.add(4);
		row2.add(5);
		row2.add(6);
		List<Object> row3 = new ArrayList<Object>();
		row3.add(7);
		row3.add(8);
		row3.add(9);
		lst.add(row1);
		lst.add(row2);
		lst.add(row3);
		List<Object> result = new ArrayList<Object>();
		assertEquals(result, GetRow.getRow(lst, 10));
	}
}