// GetMaxTriplesTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetMaxTriples}.
* It contains ten unit test cases for the {@link GetMaxTriples#getMaxTriples(int)} method.
*/
class GetMaxTriplesTest {
	/**
			* Test case for the {@link GetMaxTriples#getMaxTriples(int)} method.
			* It checks the correctness of the method for the input 1.
			*/
			@Test
			void testGetMaxTriples1() {
						int n = 1;
						int expected = 0;
						int actual = GetMaxTriples.getMaxTriples(n);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link GetMaxTriples#getMaxTriples(int)} method.
			* It checks the correctness of the method for the input 2.
			*/
			@Test
			void testGetMaxTriples2() {
						int n = 2;
						int expected = 0;
						int actual = GetMaxTriples.getMaxTriples(n);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link GetMaxTriples#getMaxTriples(int)} method.
			* It checks the correctness of the method for the input 3.
			*/
			@Test
			void testGetMaxTriples3() {
						int n = 3;
						int expected = 1;
						int actual = GetMaxTriples.getMaxTriples(n);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link GetMaxTriples#getMaxTriples(int)} method.
			* It checks the correctness of the method for the input 4.
			*/
			@Test
			void testGetMaxTriples4() {
						int n = 4;
						int expected = 1;
						int actual = GetMaxTriples.getMaxTriples(n);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link GetMaxTriples#getMaxTriples(int)} method.
			* It checks the correctness of the method for the input 5.
			*/
			@Test
			void testGetMaxTriples5() {
						int n = 5;
						int expected = 2;
						int actual = GetMaxTriples.getMaxTriples(n);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link GetMaxTriples#getMaxTriples(int)} method.
			* It checks the correctness of the method for the input 6.
			*/
			@Test
			void testGetMaxTriples6() {
						int n = 6;
						int expected = 2;
						int actual = GetMaxTriples.getMaxTriples(n);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link GetMaxTriples#getMaxTriples(int)} method.
			* It checks the correctness of the method for the input 7.
			*/
			@Test
			void testGetMaxTriples7() {
						int n = 7;
						int expected = 4;
						int actual = GetMaxTriples.getMaxTriples(n);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link GetMaxTriples#getMaxTriples(int)} method.
			* It checks the correctness of the method for the input 8.
			*/
			@Test
			void testGetMaxTriples8() {
						int n = 8;
						int expected = 4;
						int actual = GetMaxTriples.getMaxTriples(n);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link GetMaxTriples#getMaxTriples(int)} method.
			* It checks the correctness of the method for the input 9.
			*/
			@Test
			void testGetMaxTriples9() {
						int n = 9;
						int expected = 7;
						int actual = GetMaxTriples.getMaxTriples(n);
						assertEquals(expected, actual);
			}

			/**
			* Test case for the {@link GetMaxTriples#getMaxTriples(int)} method.
			* It checks the correctness of the method for the input 10.
			*/
			@Test
			void testGetMaxTriples10() {
						int n = 10;
						int expected = 7;
						int actual = GetMaxTriples.getMaxTriples(n);
						assertEquals(expected, actual);
			}
}
