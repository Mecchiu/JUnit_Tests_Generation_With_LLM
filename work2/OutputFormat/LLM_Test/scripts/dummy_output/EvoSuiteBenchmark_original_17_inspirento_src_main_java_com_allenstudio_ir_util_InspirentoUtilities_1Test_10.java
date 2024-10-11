// InspirentoUtilities_1Test.java
package com.allenstudio.ir.util;

import java.util.StringTokenizer;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InspirentoUtilities}.
* It contains one unit test case for the {@link InspirentoUtilities#escapeText(String)} method.
*/
class InspirentoUtilities_1Test {
		/**
		 * Test the {@link InspirentoUtilities#escapeText(String)} method that escapes
		 * the characters from a non-ASCII code points (including supplementary codes).
		 *
		 * @throws
   */
	@Test
	public void testEscapeText() {
		String expectedValue = "This ";
		String actualValue = InspirentoUtilities.escapeText(expectedValue);

		assertEquals(expectedValue, actualValue);
	}


	/**
	 * Test the {@link InspirentoUtilities#escapeText(String)} method that escapes
	 * the characters from a non-ASCII codes (including supplementary codes).
	 *
	 * Test case for bug https://github.com/googlecode/IrSnippets/pull/26
	 */
	@Test
	public void testEscapeTextWithSurroundingQuote() {
		String expectedValue = "This ";
		String actualValue = InspirentoUtilities.escapeText(expectedValue);

		assertEquals(expectedValue, actualValue);


		StringBuffer buffer = new StringBuffer("This ");
		buffer.append("Test");

		String inputExpected = "Test";

		expectedValue = buffer.toString();
		actualValue = InspirentoUtilities.escapeText(actualValue);

		assertEquals(inputExpected, actualValue);
	}

	/**
	 * Test the {@link InspirentoUtilities#escapeText(String)} method that will
	 * remove all leading characters from a String that are not present in the set
	 * used in {@link InspirentoUtilities#escapeText(String)}.
	 *
	 *
	 * @throws {@link IllegalArgumentException} if no character to prevent replacement is found.
	 * @throws {@link NullPointerException} if the string is null.
	 * @throws {@link RuntimeException} if the conversion is unsuccessful.
	 */
	@Test
	public void testEscapeTextWithTrailingString() {
		String[] testSet = new String[]{"This "};

		String expectedText = "This ";
		String actualText = InspireeUtilities.remove(testSet, expectedText);

		assertEquals(expectedText, actualText);
	}

	/**
	 * Test the {@link InspirentoUtilities#escapeText(String)} method that removes
	 * all leading characters from a String that are given but not present
	 * in the {@link InspirentoUtilities#escapeText(String)} set.
	 *
	 *
	 * @throws {@link IllegalArgumentException} if no character to prevent replacement is found.
	 * @throws {@link NullPointerException} if the string is null, or a character to prevent replacement is not found.
	 * @throws {@link RuntimeException} if the conversion is unsuccessful.
	 */
	@Test
	public void testEscapeTextWithNonStringSet() {
		String[] testSet = new String[]{
				//"Test"
				"This",
				//"",
				"Test"};

		String expectedText = "Test";
		String actualText = InspireeUtilities.remove(testSet, expectedText);

		assertEquals(expectedText, actualText);
	}


	/**
	 * Test the {@link InspirentoUtilities#escapeText(String)} method that converts
	 * a non-numeric String to a numeric escape sequence in an HTML string.
	 *
	 * Test case for bug https://github.com/allen-studio/IrSnippets/bad:1079
	 */
	@Test
	public void testEscapeTextToNumeric() {

		String input =
				"This is a test string using a numeric escape sequence";

		String actual = InspirentoUtilities.escapeText(input);

		String correctHtml =
				"<html>"
				+ "<head><title>This is a test string using a numeric escape sequence</title>"
				+ "<script>document.title.toString()</script>"
				+ "<style type=\"text/css\">body {background-color:#FFF;}</style></head>"
				+ "<body><table border=\"0\"><tr><td style=\"color:#007700; font-size:x-small\"><p>[&lt;&lt;=&gt;&gt;&gt;<br>This</p></td></tr>"
				+ "<tr><td style=\"color:#007700; font-size:x-small\"><p>&lt;&lt;=&gt;&gt;&gt;Test</p></td></tr>"
				+ "<tr><td style=\"color:#007700; font-size:x-small\"><p>&lt;&lt;=&gt;&gt;&gt;is</p></td></tr>"
				+ "</table></body></html>";

		assertEquals(actual, correctHtml);

	}

    /**
     * Wrapper for test case above
     * that tests the {@link InspirentoUtilities#escapeText(String)} method, removing
     * characters that are not represented by a character in a non-numeric set of
     * characters.
     */
    @Test
	public void testEscapeSet() {
		String[] testSet = {
				"This test string ",
				" that is a test text for ",
				" html"};

		String expectedValue = "That test string that is a test text for html";

		String actualValue =
				(string!= null)?
				"That test string that is a test text for html" :
				"That test string that is a test text";

		assertEquals(expectedValue, actualValue);

    }

	/**
	 * Method to test the {@link InspirentoUtilities#remove(String[],String)} method.
	 *
	 * @param str string to be test.
	 * @param test the test to be removed.
	 * @return an array of strings that is the removed element
	 */

	public static String[] remove(Vector<String> str, String test) {
			Iterator<String> i = str.iterator();

			while (true) {
				String value = i.next();
				if (value.equals(test))
					return new String[]{i.next()};

			}
	}
}