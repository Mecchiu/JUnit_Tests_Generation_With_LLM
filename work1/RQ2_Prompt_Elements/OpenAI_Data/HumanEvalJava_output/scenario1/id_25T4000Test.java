// FactorizeTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Factorize}.
* It contains ten unit test cases for the {@link Factorize#factorize(int)} method.
*/
class FactorizeTest {

		/**
		* Test case 1.
		* The input is a prime number.
		*/
		@Test
		void testCase1() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(2);
				List<Integer> actual = Factorize.factorize(2);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 2.
		* The input is a prime number.
		*/
		@Test
		void testCase2() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(3);
				List<Integer> actual = Factorize.factorize(3);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 3.
		* The input is a prime number.
		*/
		@Test
		void testCase3() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(5);
				List<Integer> actual = Factorize.factorize(5);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 4.
		* The input is a prime number.
		*/
		@Test
		void testCase4() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(7);
				List<Integer> actual = Factorize.factorize(7);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 5.
		* The input is a prime number.
		*/
		@Test
		void testCase5() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(11);
				List<Integer> actual = Factorize.factorize(11);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 6.
		* The input is a composite number.
		*/
		@Test
		void testCase6() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(2);
				expected.add(2);
				expected.add(3);
				List<Integer> actual = Factorize.factorize(12);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 7.
		* The input is a composite number.
		*/
		@Test
		void testCase7() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(2);
				expected.add(2);
				expected.add(5);
				List<Integer> actual = Factorize.factorize(20);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 8.
		* The input is a composite number.
		*/
		@Test
		void testCase8() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(2);
				expected.add(3);
				expected.add(5);
				List<Integer> actual = Factorize.factorize(30);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 9.
		* The input is a composite number.
		*/
		@Test
		void testCase9() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(2);
				expected.add(2);
				expected.add(3);
				expected.add(5);
				List<Integer> actual = Factorize.factorize(60);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 10.
		* The input is a composite number.
		*/
		@Test
		void testCase10() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(2);
				expected.add(2);
				expected.add(2);
				expected.add(3);
				expected.add(5);
				List<Integer> actual = Factorize.factorize(120);
				assertEquals(expected, actual);
		}
}