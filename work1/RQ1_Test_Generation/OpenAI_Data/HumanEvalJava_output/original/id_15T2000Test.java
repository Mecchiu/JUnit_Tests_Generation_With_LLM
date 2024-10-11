// StringSequenceTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringSequence}.
* It contains ten unit test cases for the {@link StringSequence#stringSequence(int)} method.
*/
class StringSequenceTest {
	/**
			* Test case for {@link StringSequence#stringSequence(int)}.
			* It checks if the method returns the correct string for the input 0.
			*/
			@Test
			void testStringSequence0() {
						assertEquals("0", StringSequence.stringSequence(0));
			}

			/**
			* Test case for {@link StringSequence#stringSequence(int)}.
			* It checks if the method returns the correct string for the input 5.
			*/
			@Test
			void testStringSequence5() {
						assertEquals("0 1 2 3 4 5", StringSequence.stringSequence(5));
			}

			/**
			* Test case for {@link StringSequence#stringSequence(int)}.
			* It checks if the method returns the correct string for the input 0.
			*/
			@Test
			void testStringSequence0Again() {
						assertEquals("0", StringSequence.stringSequence(0));
			}

			/**
			* Test case for {@link StringSequence#stringSequence(int)}.
			* It checks if the method returns the correct string for the input 3.
			*/
			@Test
			void testStringSequence3() {
						assertEquals("0 1 2 3", StringSequence.stringSequence(3));
			}

			/**
			* Test case for {@link StringSequence#stringSequence(int)}.
			* It checks if the method returns the correct string for the input 10.
			*/
			@Test
			void testStringSequence10() {
						assertEquals("0 1 2 3 4 5 6 7 8 9 10", StringSequence.stringSequence(10));
			}

			/**
			* Test case for {@link StringSequence#stringSequence(int)}.
			* It checks if the method returns the correct string for the input 0.
			*/
			@Test
			void testStringSequence0AgainAgain() {
						assertEquals("0", StringSequence.stringSequence(0));
			}

			/**
			* Test case for {@link StringSequence#stringSequence(int)}.
			* It checks if the method returns the correct string for the input 3.
			*/
			@Test
			void testStringSequence3Again() {
						assertEquals("0 1 2 3", StringSequence.stringSequence(3));
			}

			/**
			* Test case for {@link StringSequence#stringSequence(int)}.
			* It checks if the method returns the correct string for the input 10.
			*/
			@Test
			void testStringSequence10Again() {
						assertEquals("0 1 2 3 4 5 6 7 8 9 10", StringSequence.stringSequence(10));
			}

			/**
			* Test case for {@link StringSequence#stringSequence(int)}.
			* It checks if the method returns the correct string for the input 0.
			*/
			@Test
			void testStringSequence0AgainAgainAgain() {
						assertEquals("0", StringSequence.stringSequence(0));
			}

			/**
			* Test case for {@link StringSequence#stringSequence(int)}.
			* It checks if the method returns the correct string for the input 3.
			*/
			@Test
			void testStringSequence3AgainAgain() {
						assertEquals("0 1 2 3", StringSequence.stringSequence(3));
			}
}
