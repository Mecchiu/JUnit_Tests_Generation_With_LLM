// GetMaxTriplesTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetMaxTriples}.
* It contains ten unit test cases for the {@link GetMaxTriples#getMaxTriples(int)} method.
*/
class GetMaxTriplesTest {
			/**
			* Test case 1.
			* Input: n = 5
			* Output: 1
			* Explanation:
			* a = [1, 3, 7, 13, 21]
			* The only valid triple is (1, 7, 13).
			*/
			@Test
			void test1() {
				assertEquals(1, GetMaxTriples.getMaxTriples(5));
			}

			/**
			* Test case 2.
			* Input: n = 6
			* Output: 4
			* Explanation:
			* a = [1, 3, 7, 13, 21, 31]
			* The valid triples are (1, 7, 13), (1, 13, 31), (3, 7, 31), (7, 13, 31).
			*/
			@Test
			void test2() {
				assertEquals(4, GetMaxTriples.getMaxTriples(6));
			}

			/**
			* Test case 3.
			* Input: n = 10
			* Output: 36
			* Explanation:
			* a = [1, 3, 7, 13, 21, 31, 43, 57, 73, 91]
			* The valid triples are (1, 7, 13), (1, 13, 31), (1, 31, 73), (1, 73, 91), (3, 7, 31), (3, 31, 73), (3, 73, 91), (7, 13, 31), (7, 31, 73), (7, 73, 91), (13, 31, 73), (13, 73, 91), (31, 73, 91), (1, 3, 91), (1, 7, 91), (1, 13, 91), (1, 31, 91), (3, 7, 91), (3, 13, 91), (3, 31, 91), (7, 13, 91), (7, 31, 91), (13, 31, 91), (1, 3, 7), (1, 3, 13), (1, 3, 31), (1, 7, 13), (1, 7, 31), (1, 13, 31), (3, 7, 13), (3, 7, 31), (3, 13, 31), (7, 13, 31), (1, 3, 73), (1, 7, 73), (1, 13, 73), (1, 31, 73), (3, 7, 73), (3, 13, 73), (3, 31, 73), (7, 13, 73), (1, 3, 31), (1, 3, 73), (1, 7, 31), (1, 7, 73), (1, 13, 31), (1, 13, 73), (3, 7, 31), (3, 7, 73), (3, 13, 31), (3, 13, 73), (3, 31, 73), (7, 13, 31), (7, 13, 73), (7, 31, 73), (13, 31, 73).
			*/
			@Test
			void test3() {
				assertEquals(36, GetMaxTriples.getMaxTriples(10));
			}

}