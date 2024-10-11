// InspirentoUtilities_0Test.java
package com.allenstudio.ir.util;

import java.util.StringTokenizer;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InspirentoUtilities}.
* It contains ten unit test cases for the {@link InspirentoUtilities#tokenize(String)} method.
*/
class InspirentoUtilities_0Test {

	/**
	* Test case 1 for {@link InspirentoUtilities#tokenize(String)}.
	* Test if the method can tokenize a string with only one token.
	*/
	@Test
	void testTokenize_0() {
		String input = "file";
		String[] expected = {"file"};
		String[] actual = InspirentoUtilities.tokenize(input);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case 2 for {@link InspirentoUtilities#tokenize(String)}.
	* Test if the method can tokenize a string with two tokens.
	*/
	@Test
	void testTokenize_1() {
		String input = "file edit";
		String[] expected = {"file", "edit"};
		String[] actual = InspirentoUtilities.tokenize(input);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case 3 for {@link InspirentoUtilities#tokenize(String)}.
	* Test if the method can tokenize a string with three tokens.
	*/
	@Test
	void testTokenize_2() {
		String input = "file edit view";
		String[] expected = {"file", "edit", "view"};
		String[] actual = InspirentoUtilities.tokenize(input);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case 4 for {@link InspirentoUtilities#tokenize(String)}.
	* Test if the method can tokenize a string with four tokens.
	*/
	@Test
	void testTokenize_3() {
		String input = "file edit view help";
		String[] expected = {"file", "edit", "view", "help"};
		String[] actual = InspirentoUtilities.tokenize(input);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case 5 for {@link InspirentoUtilities#tokenize(String)}.
	* Test if the method can tokenize a string with five tokens.
	*/
	@Test
	void testTokenize_4() {
		String input = "file edit view help tools";
		String[] expected = {"file", "edit", "view", "help", "tools"};
		String[] actual = InspirentoUtilities.tokenize(input);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case 6 for {@link InspirentoUtilities#tokenize(String)}.
	* Test if the method can tokenize a string with six tokens.
	*/
	@Test
	void testTokenize_5() {
		String input = "file edit view help tools window";
		String[] expected = {"file", "edit", "view", "help", "tools", "window"};
		String[] actual = InspirentoUtilities.tokenize(input);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case 7 for {@link InspirentoUtilities#tokenize(String)}.
	* Test if the method can tokenize a string with seven tokens.
	*/
	@Test
	void testTokenize_6() {
		String input = "file edit view help tools window help";
		String[] expected = {"file", "edit", "view", "help", "tools", "window", "help"};
		String[] actual = InspirentoUtilities.tokenize(input);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case 8 for {@link InspirentoUtilities#tokenize(String)}.
	* Test if the method can tokenize a string with eight tokens.
	*/
	@Test
	void testTokenize_7() {
		String input = "file edit view help tools window help tools";
		String[] expected = {"file", "edit", "view", "help", "tools", "window", "help", "tools"};
		String[] actual = InspirentoUtilities.tokenize(input);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case 9 for {@link InspirentoUtilities#tokenize(String)}.
	* Test if the method can tokenize a string with nine tokens.
	*/
	@Test
	void testTokenize_8() {
		String input = "file edit view help tools window help tools window";
		String[] expected = {"file", "edit", "view", "help", "tools", "window", "help", "tools", "window"};
		String[] actual = InspirentoUtilities.tokenize(input);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case 10 for {@link InspirentoUtilities#tokenize(String)}.
	* Test if the method can tokenize a string with ten tokens.
	*/
	@Test
	void testTokenize_9() {
		String input = "file edit view help tools window help tools window help";
		String[] expected = {"file", "edit", "view", "help", "tools", "window", "help", "tools", "window", "help"};
		String[] actual = InspirentoUtilities.tokenize(input);
		assertArrayEquals(expected, actual);
	}
}

// InspirentoUtilities_1Test.java
package com.allenstudio.ir.util;

import java.util.StringTokenizer;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InspirentoUtilities}.
* It contains ten unit test cases for the {@link InspirentoUtilities#tokenize(String, String)} method.
*/
class InspirentoUtilities_1Test {
		
	/**
	* Test case 1 for {@link InspirentoUtilities#tokenize(String, String)}.
	* Test if the method can tokenize a string with only one token.
	*/
	@Test
	void testTokenize_0() {
		String input = "file";
		String delim = " ";
		String[] expected = {"file"};
		String[] actual = InspirentoUtilities.tokenize(input, delim);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case 2 for {@link InspirentoUtilities#tokenize(String, String)}.
	* Test if the method can tokenize a string with two tokens.
	*/
	@Test
	void testTokenize_1() {
		String input = "file edit";
		String delim = " ";
		String[] expected = {"file", "edit"};
		String[] actual = InspirentoUtilities.tokenize(input, delim);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case 3 for {@link InspirentoUtilities#tokenize(String, String)}.
	* Test if the method can tokenize a string with three tokens.
	*/
	@Test
	void testTokenize_2() {
		String input = "file edit view";
		String delim = " ";
		String[] expected = {"file", "edit", "view"};
		String[] actual = InspirentoUtilities.tokenize(input, delim);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case 4 for {@link InspirentoUtilities#tokenize(String, String)}.
	* Test if the method can tokenize a string with four tokens.
	*/
	@Test
	void testTokenize_3() {
		String input = "file edit view help";
		String delim = " ";
		String[] expected = {"file", "edit", "view", "help"};
		String[] actual = InspirentoUtilities.tokenize(input, delim);
		assertArrayEquals