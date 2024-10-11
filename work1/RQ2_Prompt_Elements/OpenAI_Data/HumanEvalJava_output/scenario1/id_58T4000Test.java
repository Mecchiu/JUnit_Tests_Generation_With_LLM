// CommonTest.java
package scenario1;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Common}.
* It contains ten unit test cases for the {@link Common#common(List, List)} method.
*/
class CommonTest {

		/**
		* Test case 1.
		* The method {@link Common#common(List, List)} should return an empty list
		* when the first list is empty.
		*/
		@Test
		void test1() {
				List<Integer> l1 = new ArrayList<Integer>();
				List<Object> l2 = new ArrayList<Object>();
				l2.add(1);
				l2.add(2);
				l2.add(3);
				List<Object> result = Common.common(l1, l2);
				assertEquals(0, result.size());
		}
		
		/**
		* Test case 2.
		* The method {@link Common#common(List, List)} should return an empty list
		* when the second list is empty.
		*/
		@Test
		void test2() {
				List<Integer> l1 = new ArrayList<Integer>();
				l1.add(1);
				l1.add(2);
				l1.add(3);
				List<Object> l2 = new ArrayList<Object>();
				List<Object> result = Common.common(l1, l2);
				assertEquals(0, result.size());
		}
		
		/**
		* Test case 3.
		* The method {@link Common#common(List, List)} should return an empty list
		* when the two lists are empty.
		*/
		@Test
		void test3() {
				List<Integer> l1 = new ArrayList<Integer>();
				List<Object> l2 = new ArrayList<Object>();
				List<Object> result = Common.common(l1, l2);
				assertEquals(0, result.size());
		}
		
		/**
		* Test case 4.
		* The method {@link Common#common(List, List)} should return an empty list
		* when the two lists have no common elements.
		*/
		@Test
		void test4() {
				List<Integer> l1 = new ArrayList<Integer>();
				l1.add(1);
				l1.add(2);
				l1.add(3);
				List<Object> l2 = new ArrayList<Object>();
				l2.add(4);
				l2.add(5);
				l2.add(6);
				List<Object> result = Common.common(l1, l2);
				assertEquals(0, result.size());
		}
		
		/**
		* Test case 5.
		* The method {@link Common#common(List, List)} should return a list with one element
		* when the two lists have one common element.
		*/
		@Test
		void test5() {
				List<Integer> l1 = new ArrayList<Integer>();
				l1.add(1);
				l1.add(2);
				l1.add(3);
				List<Object> l2 = new ArrayList<Object>();
				l2.add(4);
				l2.add(5);
				l2.add(3);
				List<Object> result = Common.common(l1, l2);
				assertEquals(1, result.size());
				assertEquals(3, result.get(0));
		}
		
		/**
		* Test case 6.
		* The method {@link Common#common(List, List)} should return a list with two elements
		* when the two lists have two common elements.
		*/
		@Test
		void test6() {
				List<Integer> l1 = new ArrayList<Integer>();
				l1.add(1);
				l1.add(2);
				l1.add(3);
				List<Object> l2 = new ArrayList<Object>();
				l2.add(4);
				l2.add(2);
				l2.add(3);
				List<Object> result = Common.common(l1, l2);
				assertEquals(2, result.size());
				assertEquals(2, result.get(0));
				assertEquals(3, result.get(1));
		}
		
		/**
		* Test case 7.
		* The method {@link Common#common(List, List)} should return a list with three elements
		* when the two lists have three common elements.
		*/
		@Test
		void test7() {
				List<Integer> l1 = new ArrayList<Integer>();
				l1.add(1);
				l1.add(2);
				l1.add(3);
				List<Object> l2 = new ArrayList<Object>();
				l2.add(1);
				l2.add(2);
				l2.add(3);
				List<Object> result = Common.common(l1, l2);
				assertEquals(3, result.size());
				assertEquals(1, result.get(0));
				assertEquals(2, result.get(1));
				assertEquals(3, result.get(2));
		}
		
		/**
		* Test case 8.
		* The method {@link Common#common(List, List)} should return a list with three elements
		* when the two lists have three common elements and the first list has duplicates.
		*/
		@Test
		void test8() {
				List<Integer> l1 = new ArrayList<Integer>();
				l1.add(1);
				l1.add(2);
				l1.add(3);
				l1.add(2);
				List<Object> l2 = new ArrayList<Object>();
				l2.add(1);
				l2.add(2);
				l2.add(3);
				List<Object> result = Common.common(l1, l2);
				assertEquals(3, result.size());
				assertEquals(1, result.get(0));
				assertEquals(2, result.get(1));
				assertEquals(3, result.get(2));
		}
		
		/**
		* Test case 9.
		* The method {@link Common#common(List, List)} should return a list with three elements
		* when the two lists have three common elements and the second list has duplicates.
		*/
		@Test
		void test9() {
				List<Integer> l1 = new ArrayList<Integer>();
				l1.add(1);
				l1.add(2);
				l1.add(3);
				List<Object> l2 = new ArrayList<Object>();
				l2.add(1);
				l2.add(2);
				l2.add(3);
				l2.add(2);
				List<Object> result = Common.common(l1, l2);
				assertEquals(3, result.size());
				assertEquals(1, result.get(0));
				assertEquals(2, result.get(1));
				assertEquals(3, result.get(2));
		}
		
		/**
		* Test case 10.
		* The method {@link Common#common(List, List)} should return a list with three elements
		* when the two lists have three common elements and both lists have duplicates.
		*/
		@Test
		void test10() {
				List<Integer> l1 = new ArrayList<Integer>();
				l1.add(1);
				l1.add(2);
				l1.add(3);
				l1.add(2);
				List<Object> l2 = new ArrayList<Object>();
				l2.add(1);
				l2.add(2);
				l2.add(3);
				l2.add(2);
				List<Object> result = Common.common(l1, l2);
				assertEquals(3, result.size());
				assertEquals(1, result.get(0));
				assertEquals(2, result.get(1));
				assertEquals(3, result.get(2));
		}
}