// SortArrayTest.java
package original;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortArray}.
* It contains ten unit test cases for the {@link SortArray#sortArray(List)} method.
*/
class SortArrayTest {

	@Test
	void testSortArray() {
		List<Object> arr = new ArrayList<Object>();
		arr.add(1);
		arr.add(5);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		List<Object> sorted = new ArrayList<Object>();
		sorted.add(1);
		sorted.add(2);
		sorted.add(3);
		sorted.add(4);
		sorted.add(5);
		assertEquals(sorted, SortArray.sortArray(arr));
	}
	
	@Test
	void testSortArray2() {
		List<Object> arr = new ArrayList<Object>();
		arr.add(1);
		arr.add(0);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		List<Object> sorted = new ArrayList<Object>();
		sorted.add(0);
		sorted.add(1);
		sorted.add(2);
		sorted.add(3);
		sorted.add(4);
		assertEquals(sorted, SortArray.sortArray(arr));
	}
	
	@Test
	void testSortArray3() {
		List<Object> arr = new ArrayList<Object>();
		List<Object> sorted = new ArrayList<Object>();
		assertEquals(sorted, SortArray.sortArray(arr));
	}
	
	@Test
	void testSortArray4() {
		List<Object> arr = new ArrayList<Object>();
		arr.add(2);
		arr.add(5);
		arr.add(77);
		arr.add(4);
		arr.add(5);
		arr.add(3);
		arr.add(5);
		arr.add(7);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		List<Object> sorted = new ArrayList<Object>();
		sorted.add(2);
		sorted.add(2);
		sorted.add(4);
		sorted.add(4);
		sorted.add(3);
		sorted.add(3);
		sorted.add(5);
		sorted.add(5);
		sorted.add(5);
		sorted.add(7);
		sorted.add(77);
		assertEquals(sorted, SortArray.sortArray(arr));
	}
	
	@Test
	void testSortArray5() {
		List<Object> arr = new ArrayList<Object>();
		arr.add(3);
		arr.add(6);
		arr.add(44);
		arr.add(12);
		arr.add(32);
		arr.add(5);
		List<Object> sorted = new ArrayList<Object>();
		sorted.add(32);
		sorted.add(3);
		sorted.add(5);
		sorted.add(6);
		sorted.add(12);
		sorted.add(44);
		assertEquals(sorted, SortArray.sortArray(arr));
	}
	
	@Test
	void testSortArray6() {
		List<Object> arr = new ArrayList<Object>();
		arr.add(2);
		arr.add(4);
		arr.add(8);
		arr.add(16);
		arr.add(32);
		List<Object> sorted = new ArrayList<Object>();
		sorted.add(2);
		sorted.add(4);
		sorted.add(8);
		sorted.add(16);
		sorted.add(32);
		assertEquals(sorted, SortArray.sortArray(arr));
	}
	
	@Test
	void testSortArray7() {
		List<Object> arr = new ArrayList<Object>();
		arr.add(2);
		arr.add(4);
		arr.add(8);
		arr.add(16);
		arr.add(32);
		List<Object> sorted = new ArrayList<Object>();
		sorted.add(2);
		sorted.add(4);
		sorted.add(8);
		sorted.add(16);
		sorted.add(32);
		assertEquals(sorted, SortArray.sortArray(arr));
	}
	
	@Test
	void testSortArray8() {
		List<Object> arr = new ArrayList<Object>();
		arr.add(2);
		arr.add(4);
		arr.add(8);
		arr.add(16);
		arr.add(32);
		List<Object> sorted = new ArrayList<Object>();
		sorted.add(2);
		sorted.add(4);
		sorted.add(8);
		sorted.add(16);
		sorted.add(32);
		assertEquals(sorted, SortArray.sortArray(arr));
	}
	
	@Test
	void testSortArray9() {
		List<Object> arr = new ArrayList<Object>();
		arr.add(2);
		arr.add(4);
		arr.add(8);
		arr.add(16);
		arr.add(32);
		List<Object> sorted = new ArrayList<Object>();
		sorted.add(2);
		sorted.add(4);
		sorted.add(8);
		sorted.add(16);
		sorted.add(32);
		assertEquals(sorted, SortArray.sortArray(arr));
	}
	
	@Test
	void testSortArray10() {
		List<Object> arr = new ArrayList<Object>();
		arr.add(2);
		arr.add(4);
		arr.add(8);
		arr.add(16);
		arr.add(32);
		List<Object> sorted = new ArrayList<Object>();
		sorted.add(2);
		sorted.add(4);
		sorted.add(8);
		sorted.add(16);
		sorted.add(32);
		assertEquals(sorted, SortArray.sortArray(arr));
	}
}