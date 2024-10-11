// StringSequenceTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringSequence}.
* It contains ten unit test cases for the {@link StringSequence#stringSequence(int)} method.
*/
class StringSequenceTest {
	// Test case 1: n = 0
			@Test
			void testStringSequence1() {
				String expected = "0";
				String actual = StringSequence.stringSequence(0);
				assertEquals(expected, actual);
			}
			
			// Test case 2: n = 5
			@Test
			void testStringSequence2() {
				String expected = "0 1 2 3 4 5";
				String actual = StringSequence.stringSequence(5);
				assertEquals(expected, actual);
			}
			
			// Test case 3: n = 0
			@Test
			void testStringSequence3() {
				String expected = "0";
				String actual = StringSequence.stringSequence(0);
				assertEquals(expected, actual);
			}
			
			// Test case 4: n = 3
			@Test
			void testStringSequence4() {
				String expected = "0 1 2 3";
				String actual = StringSequence.stringSequence(3);
				assertEquals(expected, actual);
			}
			
			// Test case 5: n = 10
			@Test
			void testStringSequence5() {
				String expected = "0 1 2 3 4 5 6 7 8 9 10";
				String actual = StringSequence.stringSequence(10);
				assertEquals(expected, actual);
			}
			
			// Test case 6: n = 0
			@Test
			void testStringSequence6() {
				String expected = "0";
				String actual = StringSequence.stringSequence(0);
				assertEquals(expected, actual);
			}
			
			// Test case 7: n = 5
			@Test
			void testStringSequence7() {
				String expected = "0 1 2 3 4 5";
				String actual = StringSequence.stringSequence(5);
				assertEquals(expected, actual);
			}
			
			// Test case 8: n = 0
			@Test
			void testStringSequence8() {
				String expected = "0";
				String actual = StringSequence.stringSequence(0);
				assertEquals(expected, actual);
			}
			
			// Test case 9: n = 3
			@Test
			void testStringSequence9() {
				String expected = "0 1 2 3";
				String actual = StringSequence.stringSequence(3);
				assertEquals(expected, actual);
			}
			
			// Test case 10: n = 10
			@Test
			void testStringSequence10() {
				String expected = "0 1 2 3 4 5 6 7 8 9 10";
				String actual = StringSequence.stringSequence(10);
				assertEquals(expected, actual);
			}
}