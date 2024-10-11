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
	* Test case for {@link InspirentoUtilities#tokenize(String)}.
	* It tests if the method can handle a null input.
	*/
	@Test
	void testTokenizeNull() {
		String input = null;
		String[] expected = new String[0];
		String[] actual = InspirentoUtilities.tokenize(input);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link InspirentoUtilities#tokenize(String)}.
	* It tests if the method can handle an empty input.
	*/
	@Test
	void testTokenizeEmpty() {
		String input = "";
		String[] expected = new String[0];
		String[] actual = InspirentoUtilities.tokenize(input);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link InspirentoUtilities#tokenize(String)}.
	* It tests if the method can handle a single token input.
	*/
	@Test
	void testTokenizeSingle() {
		String input = "file";
		String[] expected = new String[]{"file"};
		String[] actual = InspirentoUtilities.tokenize(input);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link InspirentoUtilities#tokenize(String)}.
	* It tests if the method can handle a multiple token input.
	*/
	@Test
	void testTokenizeMultiple() {
		String input = "file edit view";
		String[] expected = new String[]{"file", "edit", "view"};
		String[] actual = InspirentoUtilities.tokenize(input);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link InspirentoUtilities#tokenize(String)}.
	* It tests if the method can handle a multiple token input
	* with leading and trailing spaces.
	*/
	@Test
	void testTokenizeMultipleWithLeadingAndTrailingSpaces() {
		String input = " file edit view ";
		String[] expected = new String[]{"file", "edit", "view"};
		String[] actual = InspirentoUtilities.tokenize(input);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link InspirentoUtilities#tokenize(String)}.
	* It tests if the method can handle a multiple token input
	* with leading and trailing spaces and multiple spaces between tokens.
	*/
	@Test
	void testTokenizeMultipleWithLeadingAndTrailingSpacesAndMultipleSpacesBetweenTokens() {
		String input = " file  edit  view ";
		String[] expected = new String[]{"file", "edit", "view"};
		String[] actual = InspirentoUtilities.tokenize(input);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link InspirentoUtilities#tokenize(String)}.
	* It tests if the method can handle a multiple token input
	* with leading and trailing spaces and multiple spaces between tokens.
	*/
	@Test
	void testTokenizeMultipleWithLeadingAndTrailingSpacesAndMultipleSpacesBetweenTokensAndEmptyTokens() {
		String input = " file  edit  view  ";
		String[] expected = new String[]{"file", "edit", "view"};
		String[] actual = InspirentoUtilities.tokenize(input);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link InspirentoUtilities#tokenize(String)}.
	* It tests if the method can handle a multiple token input
	* with leading and trailing spaces and multiple spaces between tokens.
	*/
	@Test
	void testTokenizeMultipleWithLeadingAndTrailingSpacesAndMultipleSpacesBetweenTokensAndEmptyTokensAndEmptyTokensBetweenTokens() {
		String input = " file  edit  view  ";
		String[] expected = new String[]{"file", "edit", "view"};
		String[] actual = InspirentoUtilities.tokenize(input);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link InspirentoUtilities#tokenize(String)}.
	* It tests if the method can handle a multiple token input
	* with leading and trailing spaces and multiple spaces between tokens.
	*/
	@Test
	void testTokenizeMultipleWithLeadingAndTrailingSpacesAndMultipleSpacesBetweenTokensAndEmptyTokensAndEmptyTokensBetweenTokensAndEmptyTokensAtEnd() {
		String input = " file  edit  view  ";
		String[] expected = new String[]{"file", "edit", "view"};
		String[] actual = InspirentoUtilities.tokenize(input);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link InspirentoUtilities#tokenize(String)}.
	* It tests if the method can handle a multiple token input
	* with leading and trailing spaces and multiple spaces between tokens.
	*/
	@Test
	void testTokenizeMultipleWithLeadingAndTrailingSpacesAndMultipleSpacesBetweenTokensAndEmptyTokensAndEmptyTokensBetweenTokensAndEmptyTokensAtEndAndEmptyTokensAtBeginning() {
		String input = " file  edit  view  ";
		String[] expected = new String[]{"file", "edit", "view"};
		String[] actual = InspirentoUtilities.tokenize(input);
		assertArrayEquals(expected, actual);
	}
	
	/**
	* Test case for {@link InspirentoUtilities#tokenize(String)}.
	* It tests if the method can handle a multiple token input
	* with leading and trailing spaces and multiple spaces between tokens.
	*/
	@Test
	void testTokenizeMultipleWithLeadingAndTrailingSpacesAndMultipleSpacesBetweenTokensAndEmptyTokensAndEmptyTokensBetweenTokensAndEmptyTokensAtEndAndEmptyTokensAtBeginningAndEmptyTokensInBetween() {
		String input = " file  edit  view  ";
		String[] expected = new String[]{"file", "edit", "view"};
		String[] actual = InspirentoUtilities.tokenize(input);
		assertArrayEquals(expected, actual);
	}
}

// InspirentoUtilities.java
package com.allenstudio.ir.util;

import java.util.StringTokenizer;
import java.util.Vector;

/**
 * Wraps some static utility method employed
 * in Inspirento.
 *
 * @author Allen Chue
 */
public class InspirentoUtilities {

    /**
     * Tokenizes a input string to produce
     * an array of type <code>String</code>.<br>
     * This method is used in building menus and
     * toolbar using a resource file. For instance,
     * the following code will get an array of contents
     * {"file", "edit", "view"}:
     * <pre>
     * String str = "file edit view";
     * String[] array = tokenize(str);
     * </pre>
     *
     * @param input the input <code>String</code>
     * @return an String array containing all tokens
     * @see java.util.StringTokenizer
     */
    public static String[] tokenize(String input) {
        if (input == null) {
            return new String[0];
        }
        StringTokenizer tokenizer = new StringTokenizer(input);
        Vector<String> vector = new Vector<String>();
        while (tokenizer.hasMoreTokens()) {
            vector.add(tokenizer.nextToken());
        }
        String[] array = new String[vector.size()];
        vector.copyInto(array);
        return array;
    }
}

// InspirentoUtilitiesTest.java
package com.allenstudio.ir.util;

import java.util.StringTokenizer;
import java.util.Vector;
import org.