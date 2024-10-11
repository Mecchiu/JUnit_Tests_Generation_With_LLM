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
	* Test case for {@link GetRow#getRow(List, int)} method.
	* It tests the case when the given list is empty.
	*/
	@Test
	void testGetRow_EmptyList() {
		List<Object> lst = new ArrayList<Object>();
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = GetRow.getRow(lst, 1);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link GetRow#getRow(List, int)} method.
	* It tests the case when the given list contains only one element.
	*/
	@Test
	void testGetRow_OneElementList() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(1);
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = GetRow.getRow(lst, 2);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link GetRow#getRow(List, int)} method.
	* It tests the case when the given list contains only one element.
	*/
	@Test
	void testGetRow_OneElementList_2() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(1);
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = GetRow.getRow(lst, 1);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link GetRow#getRow(List, int)} method.
	* It tests the case when the given list contains only one element.
	*/
	@Test
	void testGetRow_OneElementList_3() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(1);
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = GetRow.getRow(lst, 1);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link GetRow#getRow(List, int)} method.
	* It tests the case when the given list contains only one element.
	*/
	@Test
	void testGetRow_OneElementList_4() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(1);
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = GetRow.getRow(lst, 1);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link GetRow#getRow(List, int)} method.
	* It tests the case when the given list contains only one element.
	*/
	@Test
	void testGetRow_OneElementList_5() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(1);
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = GetRow.getRow(lst, 1);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link GetRow#getRow(List, int)} method.
	* It tests the case when the given list contains only one element.
	*/
	@Test
	void testGetRow_OneElementList_6() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(1);
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = GetRow.getRow(lst, 1);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link GetRow#getRow(List, int)} method.
	* It tests the case when the given list contains only one element.
	*/
	@Test
	void testGetRow_OneElementList_7() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(1);
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = GetRow.getRow(lst, 1);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link GetRow#getRow(List, int)} method.
	* It tests the case when the given list contains only one element.
	*/
	@Test
	void testGetRow_OneElementList_8() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(1);
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = GetRow.getRow(lst, 1);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link GetRow#getRow(List, int)} method.
	* It tests the case when the given list contains only one element.
	*/
	@Test
	void testGetRow_OneElementList_9() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(1);
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = GetRow.getRow(lst, 1);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link GetRow#getRow(List, int)} method.
	* It tests the case when the given list contains only one element.
	*/
	@Test
	void testGetRow_OneElementList_10() {
		List<Object> lst = new ArrayList<Object>();
		lst.add(1);
		List<Object> expected = new ArrayList<Object>();
		List<Object> actual = GetRow.getRow(lst, 1);
		assertEquals(expected, actual);
	}
}