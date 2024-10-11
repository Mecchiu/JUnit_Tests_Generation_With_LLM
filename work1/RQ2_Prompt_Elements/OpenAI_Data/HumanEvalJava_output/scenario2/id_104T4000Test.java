// UniqueDigitsTest.java
package scenario2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link UniqueDigits}.
* It contains ten unit test cases for the {@link UniqueDigits#uniqueDigits(List)} method.
*/
class UniqueDigitsTest {

	/**
	* Test case 1.
	* Test method with following arguments:
	* <ul>
	* 	<li>List: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]</li>
	* </ul>
	* and following expectations:
	* <ul>
	* 	<li>List: [1, 3, 5, 7, 9]</li>
	* </ul>
	*/
	@Test
	public void testCase1() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(3);
		expected.add(5);
		expected.add(7);
		expected.add(9);
		List<Object> actual = UniqueDigits.uniqueDigits(list);
		Collections.sort(actual, new Comparator<Object>() {
			public int compare(Object a, Object b) {
				return (Integer) a - (Integer) b;
			}
		});
		assertEquals(expected, actual);
	}
		
	/**
	* Test case 2.
	* Test method with following arguments:
	* <ul>
	* 	<li>List: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]</li>
	* </ul>
	* and following expectations:
	* <ul>
	* 	<li>List: [1, 3, 5, 7, 9, 11, 13, 15, 17, 19]</li>
	* </ul>
	*/
	@Test
	public void testCase2() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(16);
		list.add(17);
		list.add(18);
		list.add(19);
		list.add(20);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(3);
		expected.add(5);
		expected.add(7);
		expected.add(9);
		expected.add(11);
		expected.add(13);
		expected.add(15);
		expected.add(17);
		expected.add(19);
		List<Object> actual = UniqueDigits.uniqueDigits(list);
		Collections.sort(actual, new Comparator<Object>() {
			public int compare(Object a, Object b) {
				return (Integer) a - (Integer) b;
			}
		});
		assertEquals(expected, actual);
	}
		
	/**
	* Test case 3.
	* Test method with following arguments:
	* <ul>
	* 	<li>List: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30]</li>
	* </ul>
	* and following expectations:
	* <ul>
	* 	<li>List: [1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29]</li>
	* </ul>
	*/
	@Test
	public void testCase3() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(16);
		list.add(17);
		list.add(18);
		list.add(19);
		list.add(20);
		list.add(21);
		list.add(22);
		list.add(23);
		list.add(24);
		list.add(25);
		list.add(26);
		list.add(27);
		list.add(28);
		list.add(29);
		list.add(30);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(3);
		expected.add(5);
		expected.add(7);
		expected.add(9);
		expected.add(11);
		expected.add(13);
		expected.add(15);
		expected.add(17);
		expected.add(19);
		expected.add(21);
		expected.add(23);
		expected.add(25);
		expected.add(27);
		expected.add(29);
		List<Object> actual = UniqueDigits.uniqueDigits(list);
		Collections.sort(actual, new Comparator<Object>() {
			public int compare(Object a, Object b) {
				return (Integer) a - (Integer) b;
			}
		});
		assertEquals(expected, actual);
	}
		
	/**
	* Test case 4.
	* Test method with following arguments:
	* <ul>
	* 	<li>List: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40]</li>
	* </ul>
	* and following expectations:
	* <ul>
	* 	<li>List: [1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39]</li>
	* </ul>
	*/
	@Test
	public void testCase4() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(16);
		list.add(17);
		list.add(18);
		list.add(19);
		list.add(20);
		list.add(21);
		list.add(22);
		list.add(23);
		list.add(24);
		list.add(25);
		list.add(26);
		list.add(27);
		list.add(28);
		list.add(29);
		list.add(30);
		list.add(31);
		list.add(32);
		list.add(33);
		list.add(34);
		list.add(35);
		list.add(36);
		list.add(37);
		list.add(38);
		list.add(39);
		list.add(40);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(3);
		expected.add(5);
		expected.add(7);
		expected.add(9);
		expected.add(11);
		expected.add(13);
		expected.add(15);
		expected.add(17);
		expected.add(19);
		expected.add(21);
		expected.add(23);
		expected.add(25);
		expected.add(27);
		expected.add(29);
		expected.add(31);
		expected.add(33);
		expected.add(35);
		expected.add(37);
		expected.add(39);
		List<Object> actual = UniqueDigits.uniqueDigits(list);
		Collections.sort(actual, new Comparator<Object>() {
			public int compare(Object a, Object b) {
				return (Integer) a - (Integer) b;
			}
		});
		assertEquals(expected, actual);
	}
		
	/**
	* Test case 5.
	* Test method with following arguments:
	* <ul>
	* 	<li>List: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50]</li>
	* </ul>
	* and following expectations:
	* <ul>
	* 	<li>List: [1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49]</li>
	* </ul>
	*/
	@Test
	public void testCase5() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		list.add(16);
		list.add(17);
		list.add(18);
		list.add(19);
		list.add(20);
		list.add(21);
		list.add(22);
		list.add(23);
		list.add(24);
		list.add(25);
		list.add(26);
		list.add(27);
		list.add(28);
		list.add(29);
		list.add(30);
		list.add(31);
		list.add(32);
		list.add(33);
		list.add(34);
		list.add(35);
		list.add(36);
		list.add(37);
		list.add(38);
		list.add(39);
		list.add(40);
		list.add(41);
		list.add(42);
		list.add(43);
		list.add(44);
		list.add(45);
		list.add(46);
		list.add(47);
		list.add(48);
		list.add(49);
		list.add(50);
		List<Object> expected = new ArrayList<Object>();
		expected.add(1);
		expected.add(3);
		expected.add(5);
		expected.add(7);
		expected.add(9);
		expected.add(11);
		expected.add(13);
		expected.add(15);
		expected.add(17);
		expected.add(19);
		expected.add(21);
		expected.add(23);
		expected.add(25);
		expected.add(27);
		expected.add(29);
		expected.add(31);
		expected.add(33);
		expected.add(35);
		expected.add(37);
		expected.add(39);
		expected.add(41);
		expected.add(43);
		expected.add(45);
		expected.add(47);
		expected.add(49);
		List<Object> actual = UniqueDigits.uniqueDigits(list);
		Collections.sort(actual, new Comparator<Object>() {
			public int compare(Object a, Object b) {
				return (Integer) a - (Integer) b;
			}
		});
		assertEquals(expected, actual);
	}
		
	/**
	* Test case 6.
	* Test method with following arguments:
	* <ul>
	* 	<li>List: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60]</li>
	* </ul>
	* and following expectations:
	* <ul>
	* 	<li>List: [1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49, 51, 53, 55, 57, 59]</li>
	* </ul>
	*/
	@Test
	public void testCase6() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);