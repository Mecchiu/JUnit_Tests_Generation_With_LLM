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
	* Test case for {@link InspirentoUtilities#tokenize(String)}.
	* It tests the case that the input string is null and expects a NullPointerException.
	*/
	@Test
	void testTokenize_0() {
		String input = null;
		assertThrows(NullPointerException.class, () -> {
			InspirentoUtilities.tokenize(input);
		});
	}
	
	/**
	* Test case for {@link InspirentoUtilities#tokenize(String)}.
	* It tests the case that the input string is empty and expects an empty array.
	*/
	@Test
	void testTokenize_1() {
		String input = "";
		String[] expected = new String[0];
		String[] actual = InspirentoUtilities.tokenize(input);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link InspirentoUtilities#tokenize(String)}.
	* It tests the case that the input string contains only one token and expects an array with one element.
	*/
	@Test
	void testTokenize_2() {
		String input = "file";
		String[] expected = new String[]{"file"};
		String[] actual = InspirentoUtilities.tokenize(input);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link InspirentoUtilities#tokenize(String)}.
	* It tests the case that the input string contains two tokens and expects an array with two elements.
	*/
	@Test
	void testTokenize_3() {
		String input = "file edit";
		String[] expected = new String[]{"file", "edit"};
		String[] actual = InspirentoUtilities.tokenize(input);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link InspirentoUtilities#tokenize(String)}.
	* It tests the case that the input string contains three tokens and expects an array with three elements.
	*/
	@Test
	void testTokenize_4() {
		String input = "file edit view";
		String[] expected = new String[]{"file", "edit", "view"};
		String[] actual = InspirentoUtilities.tokenize(input);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link InspirentoUtilities#tokenize(String)}.
	* It tests the case that the input string contains four tokens and expects an array with four elements.
	*/
	@Test
	void testTokenize_5() {
		String input = "file edit view help";
		String[] expected = new String[]{"file", "edit", "view", "help"};
		String[] actual = InspirentoUtilities.tokenize(input);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link InspirentoUtilities#tokenize(String)}.
	* It tests the case that the input string contains five tokens and expects an array with five elements.
	*/
	@Test
	void testTokenize_6() {
		String input = "file edit view help window";
		String[] expected = new String[]{"file", "edit", "view", "help", "window"};
		String[] actual = InspirentoUtilities.tokenize(input);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link InspirentoUtilities#tokenize(String)}.
	* It tests the case that the input string contains six tokens and expects an array with six elements.
	*/
	@Test
	void testTokenize_7() {
		String input = "file edit view help window tools";
		String[] expected = new String[]{"file", "edit", "view", "help", "window", "tools"};
		String[] actual = InspirentoUtilities.tokenize(input);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link InspirentoUtilities#tokenize(String)}.
	* It tests the case that the input string contains seven tokens and expects an array with seven elements.
	*/
	@Test
	void testTokenize_8() {
		String input = "file edit view help window tools help";
		String[] expected = new String[]{"file", "edit", "view", "help", "window", "tools", "help"};
		String[] actual = InspirentoUtilities.tokenize(input);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link InspirentoUtilities#tokenize(String)}.
	* It tests the case that the input string contains eight tokens and expects an array with eight elements.
	*/
	@Test
	void testTokenize_9() {
		String input = "file edit view help window tools help window";
		String[] expected = new String[]{"file", "edit", "view", "help", "window", "tools", "help", "window"};
		String[] actual = InspirentoUtilities.tokenize(input);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link InspirentoUtilities#tokenize(String)}.
	* It tests the case that the input string contains nine tokens and expects an array with nine elements.
	*/
	@Test
	void testTokenize_10() {
		String input = "file edit view help window tools help window tools";
		String[] expected = new String[]{"file", "edit", "view", "help", "window", "tools", "help", "window", "tools"};
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
	* Test case for {@link InspirentoUtilities#tokenize(String, String)}.
	* It tests the case that the input string is null and expects a NullPointerException.
	*/
	@Test
	void testTokenize_0() {
		String input = null;
		String delim = " ";
		assertThrows(NullPointerException.class, () -> {
			InspirentoUtilities.tokenize(input, delim);
		});
	}
	
	/**
	* Test case for {@link InspirentoUtilities#tokenize(String, String)}.
	* It tests the case that the input string is empty and expects an empty array.
	*/
	@Test
	void testTokenize_1() {
		String input = "";
		String delim = " ";
		String[] expected = new String[0];
		String[] actual = InspirentoUtilities.tokenize(input, delim);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link InspirentoUtilities#tokenize(String, String)}.
	* It tests the case that the input string contains only one token and expects an array with one element.
	*/
	@Test
	void testTokenize_2() {
		String input = "file";
		String delim = " ";
		String[] expected = new String[]{"file"};
		String[] actual = InspirentoUtilities.tokenize(input, delim);