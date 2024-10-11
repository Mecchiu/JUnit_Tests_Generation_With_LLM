// InspirentoUtilitiesTest.java
package com.allenstudio.ir.util;

import java.util.StringTokenizer;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InspirentoUtilities}.
* It contains ten unit test cases for the {@link InspirentoUtilities#tokenize(String)} method.
*/
class InspirentoUtilitiesTest {

	/**
	* Test case 1 for {@link InspirentoUtilities#tokenize(String)}.
	* It tests the method with a null input.
	*/
	@Test
	void testTokenize1() {
		String input = null;
		String[] expected = new String[0];
		String[] actual = InspirentoUtilities.tokenize(input);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case 2 for {@link InspirentoUtilities#tokenize(String)}.
	* It tests the method with an empty input.
	*/
	@Test
	void testTokenize2() {
		String input = "";
		String[] expected = new String[0];
		String[] actual = InspirentoUtilities.tokenize(input);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case 3 for {@link InspirentoUtilities#tokenize(String)}.
	* It tests the method with a single word input.
	*/
	@Test
	void testTokenize3() {
		String input = "hello";
		String[] expected = new String[] {"hello"};
		String[] actual = InspirentoUtilities.tokenize(input);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case 4 for {@link InspirentoUtilities#tokenize(String)}.
	* It tests the method with a single word input.
	*/
	@Test
	void testTokenize4() {
		String input = "hello world";
		String[] expected = new String[] {"hello", "world"};
		String[] actual = InspirentoUtilities.tokenize(input);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case 5 for {@link InspirentoUtilities#tokenize(String)}.
	* It tests the method with a single word input.
	*/
	@Test
	void testTokenize5() {
		String input = "hello world how are you";
		String[] expected = new String[] {"hello", "world", "how", "are", "you"};
		String[] actual = InspirentoUtilities.tokenize(input);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case 6 for {@link InspirentoUtilities#tokenize(String)}.
	* It tests the method with a single word input.
	*/
	@Test
	void testTokenize6() {
		String input = "hello world how are you doing";
		String[] expected = new String[] {"hello", "world", "how", "are", "you", "doing"};
		String[] actual = InspirentoUtilities.tokenize(input);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case 7 for {@link InspirentoUtilities#tokenize(String)}.
	* It tests the method with a single word input.
	*/
	@Test
	void testTokenize7() {
		String input = "hello world how are you doing today";
		String[] expected = new String[] {"hello", "world", "how", "are", "you", "doing", "today"};
		String[] actual = InspirentoUtilities.tokenize(input);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case 8 for {@link InspirentoUtilities#tokenize(String)}.
	* It tests the method with a single word input.
	*/
	@Test
	void testTokenize8() {
		String input = "hello world how are you doing today?";
		String[] expected = new String[] {"hello", "world", "how", "are", "you", "doing", "today?"};
		String[] actual = InspirentoUtilities.tokenize(input);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case 9 for {@link InspirentoUtilities#tokenize(String)}.
	* It tests the method with a single word input.
	*/
	@Test
	void testTokenize9() {
		String input = "hello world how are you doing today? I am fine.";
		String[] expected = new String[] {"hello", "world", "how", "are", "you", "doing", "today?", "I", "am", "fine."};
		String[] actual = InspirentoUtilities.tokenize(input);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case 10 for {@link InspirentoUtilities#tokenize(String)}.
	* It tests the method with a single word input.
	*/
	@Test
	void testTokenize10() {
		String input = "hello world how are you doing today? I am fine. Thank you.";
		String[] expected = new String[] {"hello", "world", "how", "are", "you", "doing", "today?", "I", "am", "fine.", "Thank", "you."};
		String[] actual = InspirentoUtilities.tokenize(input);
		assertArrayEquals(expected, actual);
	}
}