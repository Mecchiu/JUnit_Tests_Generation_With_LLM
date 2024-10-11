// CommonTest.java
package original;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Common}.
* It contains ten unit test cases for the {@link Common#common(List, List)} method.
*/
class CommonTest {

		/**
		* Test case for {@link Common#common(List, List)} method.
		* It tests the case when the first list is empty.
		*/
		@Test
		void testCommon_1() {
				List<Integer> l1 = new ArrayList<Integer>();
				List<Object> l2 = new ArrayList<Object>();
				l2.add(5);
				l2.add(7);
				l2.add(1);
				l2.add(5);
				l2.add(9);
				l2.add(653);
				l2.add(121);
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = Common.common(l1, l2);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Common#common(List, List)} method.
		* It tests the case when the second list is empty.
		*/
		@Test
		void testCommon_2() {
				List<Integer> l1 = new ArrayList<Integer>();
				l1.add(1);
				l1.add(4);
				l1.add(3);
				l1.add(34);
				l1.add(653);
				l1.add(2);
				l1.add(5);
				List<Object> l2 = new ArrayList<Object>();
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = Common.common(l1, l2);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Common#common(List, List)} method.
		* It tests the case when the first list is null.
		*/
		@Test
		void testCommon_3() {
				List<Integer> l1 = null;
				List<Object> l2 = new ArrayList<Object>();
				l2.add(5);
				l2.add(7);
				l2.add(1);
				l2.add(5);
				l2.add(9);
				l2.add(653);
				l2.add(121);
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = Common.common(l1, l2);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Common#common(List, List)} method.
		* It tests the case when the second list is null.
		*/
		@Test
		void testCommon_4() {
				List<Integer> l1 = new ArrayList<Integer>();
				l1.add(1);
				l1.add(4);
				l1.add(3);
				l1.add(34);
				l1.add(653);
				l1.add(2);
				l1.add(5);
				List<Object> l2 = null;
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = Common.common(l1, l2);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Common#common(List, List)} method.
		* It tests the case when the first list is empty and the second list is null.
		*/
		@Test
		void testCommon_5() {
				List<Integer> l1 = new ArrayList<Integer>();
				List<Object> l2 = null;
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = Common.common(l1, l2);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Common#common(List, List)} method.
		* It tests the case when the first list is null and the second list is empty.
		*/
		@Test
		void testCommon_6() {
				List<Integer> l1 = null;
				List<Object> l2 = new ArrayList<Object>();
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = Common.common(l1, l2);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Common#common(List, List)} method.
		* It tests the case when the first list is null and the second list is null.
		*/
		@Test
		void testCommon_7() {
				List<Integer> l1 = null;
				List<Object> l2 = null;
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = Common.common(l1, l2);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Common#common(List, List)} method.
		* It tests the case when the first list is empty and the second list is empty.
		*/
		@Test
		void testCommon_8() {
				List<Integer> l1 = new ArrayList<Integer>();
				List<Object> l2 = new ArrayList<Object>();
				List<Object> expected = new ArrayList<Object>();
				List<Object> actual = Common.common(l1, l2);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Common#common(List, List)} method.
		* It tests the case when the first list is not empty and the second list is not empty.
		*/
		@Test
		void testCommon_9() {
				List<Integer> l1 = new ArrayList<Integer>();
				l1.add(1);
				l1.add(4);
				l1.add(3);
				l1.add(34);
				l1.add(653);
				l1.add(2);
				l1.add(5);
				List<Object> l2 = new ArrayList<Object>();
				l2.add(5);
				l2.add(7);
				l2.add(1);
				l2.add(5);
				l2.add(9);
				l2.add(653);
				l2.add(121);
				List<Object> expected = new ArrayList<Object>();
				expected.add(1);
				expected.add(5);
				expected.add(653);
				List<Object> actual = Common.common(l1, l2);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Common#common(List, List)} method.
		* It tests the case when the first list is not empty and the second list is not empty.
		*/
		@Test
		void testCommon_10() {
				List<Integer> l1 = new ArrayList<Integer>();
				l1.add(5);
				l1.add(3);
				l1.add(2);
				l1.add(8);
				List<Object> l2 = new ArrayList<Object>();
				l2.add(3);
				l2.add(2);
				List<Object> expected = new ArrayList<Object>();
				expected.add(2);
				expected.add(3);
				List<Object> actual = Common.common(l1, l2);
				assertEquals(expected, actual);
		}
}