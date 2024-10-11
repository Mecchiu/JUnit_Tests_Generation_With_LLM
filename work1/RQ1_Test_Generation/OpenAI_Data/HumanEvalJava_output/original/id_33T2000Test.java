// SortThirdTest.java
package original;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortThird}.
* It contains ten unit test cases for the {@link SortThird#sortThird(List)} method.
*/
class SortThirdTest {
	/**
			* Test case for the {@link SortThird#sortThird(List)} method.
			* It tests the method with the input [1, 2, 3].
			*/
			@Test
			void testSortThird1() {
				List<Integer> l = new ArrayList<Integer>();
				l.add(1);
				l.add(2);
				l.add(3);
				List<Integer> l2 = SortThird.sortThird(l);
				assertEquals(l, l2);
			}
			
			/**
			* Test case for the {@link SortThird#sortThird(List)} method.
			* It tests the method with the input [5, 6, 3, 4, 8, 9, 2].
			*/
			@Test
			void testSortThird2() {
				List<Integer> l = new ArrayList<Integer>();
				l.add(5);
				l.add(6);
				l.add(3);
				l.add(4);
				l.add(8);
				l.add(9);
				l.add(2);
				List<Integer> l2 = SortThird.sortThird(l);
				List<Integer> l3 = new ArrayList<Integer>();
				l3.add(2);
				l3.add(6);
				l3.add(3);
				l3.add(4);
				l3.add(8);
				l3.add(9);
				l3.add(5);
				assertEquals(l3, l2);
			}
			
			/**
			* Test case for the {@link SortThird#sortThird(List)} method.
			* It tests the method with the input [1, 2, 3].
			*/
			@Test
			void testSortThird3() {
				List<Integer> l = new ArrayList<Integer>();
				l.add(1);
				l.add(2);
				l.add(3);
				List<Integer> l2 = SortThird.sortThird(l);
				assertEquals(l, l2);
			}
			
			/**
			* Test case for the {@link SortThird#sortThird(List)} method.
			* It tests the method with the input [5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10].
			*/
			@Test
			void testSortThird4() {
				List<Integer> l = new ArrayList<Integer>();
				l.add(5);
				l.add(3);
				l.add(-5);
				l.add(2);
				l.add(-3);
				l.add(3);
				l.add(9);
				l.add(0);
				l.add(123);
				l.add(1);
				l.add(-10);
				List<Integer> l2 = SortThird.sortThird(l);
				List<Integer> l3 = new ArrayList<Integer>();
				l3.add(1);
				l3.add(3);
				l3.add(-5);
				l3.add(2);
				l3.add(-3);
				l3.add(3);
				l3.add(5);
				l3.add(0);
				l3.add(123);
				l3.add(9);
				l3.add(-10);
				assertEquals(l3, l2);
			}
			
			/**
			* Test case for the {@link SortThird#sortThird(List)} method.
			* It tests the method with the input [5, 8, -12, 4, 23, 2, 3, 11, 12, -10].
			*/
			@Test
			void testSortThird5() {
				List<Integer> l = new ArrayList<Integer>();
				l.add(5);
				l.add(8);
				l.add(-12);
				l.add(4);
				l.add(23);
				l.add(2);
				l.add(3);
				l.add(11);
				l.add(12);
				l.add(-10);
				List<Integer> l2 = SortThird.sortThird(l);
				List<Integer> l3 = new ArrayList<Integer>();
				l3.add(-10);
				l3.add(8);
				l3.add(-12);
				l3.add(3);
				l3.add(23);
				l3.add(2);
				l3.add(4);
				l3.add(11);
				l3.add(12);
				l3.add(5);
				assertEquals(l3, l2);
			}
			
			/**
			* Test case for the {@link SortThird#sortThird(List)} method.
			* It tests the method with the input [5, 6, 3, 4, 8, 9, 2].
			*/
			@Test
			void testSortThird6() {
				List<Integer> l = new ArrayList<Integer>();
				l.add(5);
				l.add(6);
				l.add(3);
				l.add(4);
				l.add(8);
				l.add(9);
				l.add(2);
				List<Integer> l2 = SortThird.sortThird(l);
				List<Integer> l3 = new ArrayList<Integer>();
				l3.add(2);
				l3.add(6);
				l3.add(3);
				l3.add(4);
				l3.add(8);
				l3.add(9);
				l3.add(5);
				assertEquals(l3, l2);
			}
			
			/**
			* Test case for the {@link SortThird#sortThird(List)} method.
			* It tests the method with the input [5, 8, 3, 4, 6, 9, 2].
			*/
			@Test
			void testSortThird7() {
				List<Integer> l = new ArrayList<Integer>();
				l.add(5);
				l.add(8);
				l.add(3);
				l.add(4);
				l.add(6);
				l.add(9);
				l.add(2);
				List<Integer> l2 = SortThird.sortThird(l);
				List<Integer> l3 = new ArrayList<Integer>();
				l3.add(2);
				l3.add(8);
				l3.add(3);
				l3.add(4);
				l3.add(6);
				l3.add(9);
				l3.add(5);
				assertEquals(l3, l2);
			}
			
			/**
			* Test case for the {@link SortThird#sortThird(List)} method.
			* It tests the method with the input [5, 6, 9, 4, 8, 3, 2].
			*/
			@Test
			void testSortThird8() {
				List<Integer> l = new ArrayList<Integer>();
				l.add(5);
				l.add(6);
				l.add(9);
				l.add(4);
				l.add(8);
				l.add(3);
				l.add(2);
				List<Integer> l2 = SortThird.sortThird(l);
				List<Integer> l3 = new ArrayList<Integer>();
				l3.add(2);
				l3.add(6);
				l3.add(9);
				l3.add(4);
				l3.add(8);
				l3.add(3);
				l3.add(5);
				assertEquals(l3, l2);
			}
			
			/**
			* Test case for the {@link SortThird#sortThird(List)} method.
			* It tests the method with the input [5, 6, 3, 4, 8, 9, 2, 1].
			*/
			@Test
			void testSortThird9() {
				List<Integer> l = new ArrayList<Integer>();
				l.add(5);
				l.add(6);
				l.add(3);
				l.add(4);
				l.add(8);
				l.add(9);
				l.add(2);
				l.add(1);
				List<Integer> l2 = SortThird.sortThird(l);
				List<Integer> l3 = new ArrayList<Integer>();
				l3.add(2);
				l3.add(6);
				l3.add(3);
				l3.add(4);
				l3.add(8);
				l3.add(9);
				l3.add(5);
				l3.add(1);
				assertEquals(l3, l2);
			}
			
			/**
			* Test case for the {@link SortThird#sortThird(List)} method.
			* It tests the method with the input [5, 6, 3, 4, 8, 9, 2, 1, 0].
			*/
			@Test
			void testSortThird10() {
				List<Integer> l = new ArrayList<Integer>();
				l.add(5);
				l.add(6);
				l.add(3);
				l.add(4);
				l.add(8);
				l.add(9);
				l.add(2);
				l.add(1);
				l.add(0);
				List<Integer> l2 = SortThird.sortThird(l);
				List<Integer> l3 = new ArrayList<Integer>();
				l3.add(2);
				l3.add(6);
				l3.add(3);
				l3.add(4);
				l3.add(8);
				l3.add(9);
				l3.add(5);
				l3.add(1);
				l3.add(0);
				assertEquals(l3, l2