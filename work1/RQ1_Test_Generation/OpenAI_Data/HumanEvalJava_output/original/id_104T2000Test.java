// UniqueDigitsTest.java
package original;

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
			* Test case 1: Test the method with a list of positive integers.
			* The list contains four elements, and the result should be a sorted list of three elements.
			*/
			@Test
			void testCase1() {
				List<Integer> input = new ArrayList<Integer>();
				input.add(15);
				input.add(33);
				input.add(1422);
				input.add(1);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(15);
				expected.add(33);
				List<Object> actual = UniqueDigits.uniqueDigits(input);
				Collections.sort(actual, new Comparator<Object>() {
					public int compare(Object a, Object b) {
						return (Integer) a - (Integer) b;
					}
				});
				assertEquals(expected, actual);
			}

			/**
			* Test case 2: Test the method with a list of positive integers.
			* The list contains four elements, and the result should be an empty list.
			*/
			@Test
			void testCase2() {
				List<Integer> input = new ArrayList<Integer>();
				input.add(152);
				input.add(323);
				input.add(1422);
				input.add(10);
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = UniqueDigits.uniqueDigits(input);
				assertEquals(expected, actual);
			}

			/**
			* Test case 3: Test the method with a list of positive integers.
			* The list contains four elements, and the result should be a sorted list of two elements.
			*/
			@Test
			void testCase3() {
				List<Integer> input = new ArrayList<Integer>();
				input.add(12345);
				input.add(2033);
				input.add(111);
				input.add(151);
				List<Object> expected = new ArrayList<Object>();
				expected.add(111);
				expected.add(151);
				List<Object> actual = UniqueDigits.uniqueDigits(input);
				Collections.sort(actual, new Comparator<Object>() {
					public int compare(Object a, Object b) {
						return (Integer) a - (Integer) b;
					}
				});
				assertEquals(expected, actual);
			}

			/**
			* Test case 4: Test the method with a list of positive integers.
			* The list contains three elements, and the result should be a sorted list of two elements.
			*/
			@Test
			void testCase4() {
				List<Integer> input = new ArrayList<Integer>();
				input.add(135);
				input.add(103);
				input.add(31);
				List<Object> expected = new ArrayList<Object>();
				expected.add(31);
				expected.add(135);
				List<Object> actual = UniqueDigits.uniqueDigits(input);
				Collections.sort(actual, new Comparator<Object>() {
					public int compare(Object a, Object b) {
						return (Integer) a - (Integer) b;
					}
				});
				assertEquals(expected, actual);
			}

			/**
			* Test case 5: Test the method with a list of positive integers.
			* The list contains three elements, and the result should be a sorted list of two elements.
			*/
			@Test
			void testCase5() {
				List<Integer> input = new ArrayList<Integer>();
				input.add(135);
				input.add(103);
				input.add(31);
				List<Object> expected = new ArrayList<Object>();
				expected.add(31);
				expected.add(135);
				List<Object> actual = UniqueDigits.uniqueDigits(input);
				Collections.sort(actual, new Comparator<Object>() {
					public int compare(Object a, Object b) {
						return (Integer) a - (Integer) b;
					}
				});
				assertEquals(expected, actual);
			}

			/**
			* Test case 6: Test the method with a list of positive integers.
			* The list contains three elements, and the result should be a sorted list of two elements.
			*/
			@Test
			void testCase6() {
				List<Integer> input = new ArrayList<Integer>();
				input.add(135);
				input.add(103);
				input.add(31);
				List<Object> expected = new ArrayList<Object>();
				expected.add(31);
				expected.add(135);
				List<Object> actual = UniqueDigits.uniqueDigits(input);
				Collections.sort(actual, new Comparator<Object>() {
					public int compare(Object a, Object b) {
						return (Integer) a - (Integer) b;
					}
				});
				assertEquals(expected, actual);
			}

			/**
			* Test case 7: Test the method with a list of positive integers.
			* The list contains three elements, and the result should be a sorted list of two elements.
			*/
			@Test
			void testCase7() {
				List<Integer> input = new ArrayList<Integer>();
				input.add(135);
				input.add(103);
				input.add(31);
				List<Object> expected = new ArrayList<Object>();
				expected.add(31);
				expected.add(135);
				List<Object> actual = UniqueDigits.uniqueDigits(input);
				Collections.sort(actual, new Comparator<Object>() {
					public int compare(Object a, Object b) {
						return (Integer) a - (Integer) b;
					}
				});
				assertEquals(expected, actual);
			}

			/**
			* Test case 8: Test the method with a list of positive integers.
			* The list contains three elements, and the result should be a sorted list of two elements.
			*/
			@Test
			void testCase8() {
				List<Integer> input = new ArrayList<Integer>();
				input.add(135);
				input.add(103);
				input.add(31);
				List<Object> expected = new ArrayList<Object>();
				expected.add(31);
				expected.add(135);
				List<Object> actual = UniqueDigits.uniqueDigits(input);
				Collections.sort(actual, new Comparator<Object>() {
					public int compare(Object a, Object b) {
						return (Integer) a - (Integer) b;
					}
				});
				assertEquals(expected, actual);
			}

			/**
			* Test case 9: Test the method with a list of positive integers.
			* The list contains three elements, and the result should be a sorted list of two elements.
			*/
			@Test
			void testCase9() {
				List<Integer> input = new ArrayList<Integer>();
				input.add(135);
				input.add(103);
				input.add(31);
				List<Object> expected = new ArrayList<Object>();
				expected.add(31);
				expected.add(135);
				List<Object> actual = UniqueDigits.uniqueDigits(input);
				Collections.sort(actual, new Comparator<Object>() {
					public int compare(Object a, Object b) {
						return (Integer) a - (Integer) b;
					}
				});
				assertEquals(expected, actual);
			}

			/**
			* Test case 10: Test the method with a list of positive integers.
			* The list contains three elements, and the result should be a sorted list of two elements.
			*/
			@Test
			void testCase10() {
				List<Integer> input = new ArrayList<Integer>();
				input.add(135);
				input.add(103);
				input.add(31);
				List<Object> expected = new ArrayList<Object>();
				expected.add(31);
				expected.add(135);
				List<Object> actual = UniqueDigits.uniqueDigits(input);
				Collections.sort(actual, new Comparator<Object>() {
					public int compare(Object a, Object b) {
						return (Integer) a - (Integer) b;
					}
				});
				assertEquals(expected, actual);
			}
}
