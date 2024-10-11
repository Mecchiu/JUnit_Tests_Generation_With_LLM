// MakeAPileTest.java
package scenario1;

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
		* The expected output is [1].
		*/
		@Test
		void testMakeAPile1() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(1);
				assertEquals(expected, MakeAPile.makeAPile(1));
		}
		
		/**
		* Test case 2.
		* The input is 2.
		* The expected output is [2, 1].
		*/
		@Test
		void testMakeAPile2() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(2);
				expected.add(1);
				assertEquals(expected, MakeAPile.makeAPile(2));
		}
		
		/**
		* Test case 3.
		* The input is 3.
		* The expected output is [3, 1].
		*/
		@Test
		void testMakeAPile3() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(3);
				expected.add(1);
				assertEquals(expected, MakeAPile.makeAPile(3));
		}
		
		/**
		* Test case 4.
		* The input is 4.
		* The expected output is [4, 2, 1].
		*/
		@Test
		void testMakeAPile4() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(4);
				expected.add(2);
				expected.add(1);
				assertEquals(expected, MakeAPile.makeAPile(4));
		}
		
		/**
		* Test case 5.
		* The input is 5.
		* The expected output is [5, 3, 1].
		*/
		@Test
		void testMakeAPile5() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(5);
				expected.add(3);
				expected.add(1);
				assertEquals(expected, MakeAPile.makeAPile(5));
		}
		
		/**
		* Test case 6.
		* The input is 6.
		* The expected output is [6, 4, 2, 1].
		*/
		@Test
		void testMakeAPile6() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(6);
				expected.add(4);
				expected.add(2);
				expected.add(1);
				assertEquals(expected, MakeAPile.makeAPile(6));
		}
		
		/**
		* Test case 7.
		* The input is 7.
		* The expected output is [7, 5, 3, 1].
		*/
		@Test
		void testMakeAPile7() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(7);
				expected.add(5);
				expected.add(3);
				expected.add(1);
				assertEquals(expected, MakeAPile.makeAPile(7));
		}
		
		/**
		* Test case 8.
		* The input is 8.
		* The expected output is [8, 6, 4, 2, 1].
		*/
		@Test
		void testMakeAPile8() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(8);
				expected.add(6);
				expected.add(4);
				expected.add(2);
				expected.add(1);
				assertEquals(expected, MakeAPile.makeAPile(8));
		}
		
		/**
		* Test case 9.
		* The input is 9.
		* The expected output is [9, 7, 5, 3, 1].
		*/
		@Test
		void testMakeAPile9() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(9);
				expected.add(7);
				expected.add(5);
				expected.add(3);
				expected.add(1);
				assertEquals(expected, MakeAPile.makeAPile(9));
		}
		
		/**
		* Test case 10.
		* The input is 10.
		* The expected output is [10, 8, 6, 4, 2, 1].
		*/
		@Test
		void testMakeAPile10() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(10);
				expected.add(8);
				expected.add(6);
				expected.add(4);
				expected.add(2);
				expected.add(1);
				assertEquals(expected, MakeAPile.makeAPile(10));
		}
}

// MakeAPileTest.java
package scenario1;

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
		* The expected output is [1].
		*/
		@Test
		void testMakeAPile1() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(1);
				assertEquals(expected, MakeAPile.makeAPile(1));
		}
		
		/**
		* Test case 2.
		* The input is 2.
		* The expected output is [2, 1].
		*/
		@Test
		void testMakeAPile2() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(2);
				expected.add(1);
				assertEquals(expected, MakeAPile.makeAPile(2));
		}
		
		/**
		* Test case 3.
		* The input is 3.
		* The expected output is [3, 1].
		*/
		@Test
		void testMakeAPile3() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(3);
				expected.add(1);
				assertEquals(expected, MakeAPile.makeAPile(3));
		}
		
		/**
		* Test case 4.
		* The input is 4.
		* The expected output is [4, 2, 1].
		*/
		@Test
		void testMakeAPile4() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(4);
				expected.add(2);
				expected.add(1);
				assertEquals(expected, MakeAPile.makeAPile(4));
		}
		
		/**
		* Test case 5.
		* The input is 5.
		* The expected output is [5, 3, 1].
		*/
		@Test
		void testMakeAPile5() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(5);
				expected.add(3);
				expected.add(1);
				assertEquals(expected, MakeAPile.makeAPile(5));
		}
		
		/**
		* Test case 6.
		* The input is 6.
		* The expected output is [6, 4, 2, 1].
		*/
		@Test
		void testMakeAPile6() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(6);
				expected.add(4);
				expected.add(2);
				expected.add(1);
				assertEquals(expected, MakeAPile.makeAPile(6));
		}
		
		/**
		* Test case 7.
		* The input is 7.
		* The expected output is [7, 5, 3, 1].
		*/
		@Test
		void testMakeAPile7() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(7);
				expected.add(5);
				expected.add(3);
				expected.add(1);
				assertEquals(expected, MakeAPile.makeAPile(7));
		}
		
		/**
		* Test case 8.
		* The input is 8.
		* The expected output is [8, 6, 4, 2, 1].
		*/
		@Test
		void testMakeAPile8() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(8);
				expected.add(6);
				expected.add(4);
				expected.add(2);
				expected.add(1);
				assertEquals(expected, MakeAPile.makeAPile(8));
		}
		
		/**
		* Test case 9.
		* The input is 9.
		* The expected output is [9, 7, 5, 3, 1].
		*/
		@Test
		void testMakeAPile9() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(9);
				expected.add(7);
				expected.add(5);
				expected.add(3);
				expected.add(1);
				assertEquals(expected, MakeAPile.makeAPile(9));
		}
		
		/**
		* Test case 10.
		* The input is 10.
		* The expected output is [10, 8, 6, 4, 2, 1].
		*/
		@Test
		void testMakeAPile10() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(10);
				expected.add(8);
				expected.add(6);
				expected.add(4);
				expected.add(2);
				expected.add(1);
				assertEquals(expected, MakeAPile.makeAPile(10));
		}
}

// MakeAPileTest.java
package scenario1;

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
		* The expected output is [1].
		*/
		@Test
		void testMakeAPile1() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(1);
				assertEquals(expected, MakeAPile.makeAPile(1));
		}
		
		/**
		* Test case 2.
		* The input is 2.
		* The expected output is [2, 1].
		*/
		@Test
		void testMakeAPile2() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(2);
				expected.add(1);
				assertEquals(expected, MakeAPile.makeAPile(2));
		}
		
		/**
		* Test case 3.
		* The input is 3.
		* The expected output is [3, 1].
		*/
		@Test
		void testMakeAPile3() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(3);
				expected.add(1);
				assertEquals(expected, MakeAPile.makeAPile(3));
		}
		
		/**
		* Test case 4.
		* The input is 4.
		* The expected output is [4, 2, 1].
		*/
		@Test
		void testMakeAPile4() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(4);
				expected.add(2);
				expected.add(1);
				assertEquals(expected, MakeAPile.makeAPile(4));
		}
		
		/**
		* Test case 5.
		* The input is 5.
		* The expected output is [5, 3, 1].
		*/
		@Test
		void testMakeAPile5() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(5);
				expected.add(3);
				expected.add(1);
				assertEquals(expected, MakeAPile.makeAPile(5));
		}
		
		/**
		* Test case 6.
		* The input is 6.
		* The expected output is [6, 4, 2, 1].
		*/
		@Test
		void testMakeAPile6() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(6);
				expected.add(4);
				expected.add(2);
				expected.add(1);
				assertEquals(expected, MakeAPile.makeAPile(6));
		}
		
		/**
		* Test case 7.
		* The input is 7.
		* The expected output is [7, 5, 3, 1].
		*/
		@Test
		void testMakeAPile7() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(7);
				expected.add(5);
				expected.add(3);
				expected.add(1);
				assertEquals(expected, MakeAPile.makeAPile(7));
		}
		
		/**
		* Test case 8.
		* The input is 8.