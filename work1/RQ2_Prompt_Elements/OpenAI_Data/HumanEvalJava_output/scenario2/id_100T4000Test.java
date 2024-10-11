// MakeAPileTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MakeAPile}.
* It contains ten unit test cases for the {@link MakeAPile#makeAPile(int)} method.
*/
class MakeAPileTest {

		/**
		* Test case 1.
		* The input is 1.
		* The expected result is [1].
		*/
		@Test
		void testCase1() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(1);
				assertEquals(expected, MakeAPile.makeAPile(1));
		}
		
		/**
		* Test case 2.
		* The input is 2.
		* The expected result is [2, 4].
		*/
		@Test
		void testCase2() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(2);
				expected.add(4);
				assertEquals(expected, MakeAPile.makeAPile(2));
		}
		
		/**
		* Test case 3.
		* The input is 3.
		* The expected result is [3, 5, 7].
		*/
		@Test
		void testCase3() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(3);
				expected.add(5);
				expected.add(7);
				assertEquals(expected, MakeAPile.makeAPile(3));
		}
		
		/**
		* Test case 4.
		* The input is 4.
		* The expected result is [4, 6, 8, 10].
		*/
		@Test
		void testCase4() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(4);
				expected.add(6);
				expected.add(8);
				expected.add(10);
				assertEquals(expected, MakeAPile.makeAPile(4));
		}
		
		/**
		* Test case 5.
		* The input is 5.
		* The expected result is [5, 7, 9, 11, 13].
		*/
		@Test
		void testCase5() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(5);
				expected.add(7);
				expected.add(9);
				expected.add(11);
				expected.add(13);
				assertEquals(expected, MakeAPile.makeAPile(5));
		}
		
		/**
		* Test case 6.
		* The input is 6.
		* The expected result is [6, 8, 10, 12, 14, 16].
		*/
		@Test
		void testCase6() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(6);
				expected.add(8);
				expected.add(10);
				expected.add(12);
				expected.add(14);
				expected.add(16);
				assertEquals(expected, MakeAPile.makeAPile(6));
		}
		
		/**
		* Test case 7.
		* The input is 7.
		* The expected result is [7, 9, 11, 13, 15, 17, 19].
		*/
		@Test
		void testCase7() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(7);
				expected.add(9);
				expected.add(11);
				expected.add(13);
				expected.add(15);
				expected.add(17);
				expected.add(19);
				assertEquals(expected, MakeAPile.makeAPile(7));
		}
		
		/**
		* Test case 8.
		* The input is 8.
		* The expected result is [8, 10, 12, 14, 16, 18, 20, 22].
		*/
		@Test
		void testCase8() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(8);
				expected.add(10);
				expected.add(12);
				expected.add(14);
				expected.add(16);
				expected.add(18);
				expected.add(20);
				expected.add(22);
				assertEquals(expected, MakeAPile.makeAPile(8));
		}
		
		/**
		* Test case 9.
		* The input is 9.
		* The expected result is [9, 11, 13, 15, 17, 19, 21, 23, 25].
		*/
		@Test
		void testCase9() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(9);
				expected.add(11);
				expected.add(13);
				expected.add(15);
				expected.add(17);
				expected.add(19);
				expected.add(21);
				expected.add(23);
				expected.add(25);
				assertEquals(expected, MakeAPile.makeAPile(9));
		}
		
		/**
		* Test case 10.
		* The input is 10.
		* The expected result is [10, 12, 14, 16, 18, 20, 22, 24, 26, 28].
		*/
		@Test
		void testCase10() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(10);
				expected.add(12);
				expected.add(14);
				expected.add(16);
				expected.add(18);
				expected.add(20);
				expected.add(22);
				expected.add(24);
				expected.add(26);
				expected.add(28);
				assertEquals(expected, MakeAPile.makeAPile(10));
		}
}