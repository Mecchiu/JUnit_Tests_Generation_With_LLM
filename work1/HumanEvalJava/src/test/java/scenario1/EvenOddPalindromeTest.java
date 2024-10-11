// EvenOddPalindromeTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EvenOddPalindrome}.
* It contains ten unit test cases for the {@link EvenOddPalindrome#evenOddPalindrome(int)} method.
*/
class EvenOddPalindromeTest {
			// Test case 1: n = 0
			@Test
			void testEvenOddPalindrome1() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(0);
				expected.add(0);
				assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(0));
			}
			
			// Test case 2: n = 1
			@Test
			void testEvenOddPalindrome2() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(0);
				expected.add(1);
				assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(1));
			}
			
			// Test case 3: n = 2
			@Test
			void testEvenOddPalindrome3() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(1);
				expected.add(1);
				assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(2));
			}
			
			// Test case 4: n = 3
			@Test
			void testEvenOddPalindrome4() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(1);
				expected.add(2);
				assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(3));
			}
			
			// Test case 5: n = 4
			@Test
			void testEvenOddPalindrome5() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(2);
				expected.add(2);
				assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(4));
			}
			
			// Test case 6: n = 5
			@Test
			void testEvenOddPalindrome6() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(2);
				expected.add(3);
				assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(5));
			}
			
			// Test case 7: n = 6
			@Test
			void testEvenOddPalindrome7() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(3);
				expected.add(3);
				assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(6));
			}
			
			// Test case 8: n = 7
			@Test
			void testEvenOddPalindrome8() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(3);
				expected.add(4);
				assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(7));
			}
			
			// Test case 9: n = 8
			@Test
			void testEvenOddPalindrome9() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(4);
				expected.add(4);
				assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(8));
			}
			
			// Test case 10: n = 9
			@Test
			void testEvenOddPalindrome10() {
				List<Integer> expected = new ArrayList<Integer>();
				expected.add(4);
				expected.add(5);
				assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(9));
			}
}