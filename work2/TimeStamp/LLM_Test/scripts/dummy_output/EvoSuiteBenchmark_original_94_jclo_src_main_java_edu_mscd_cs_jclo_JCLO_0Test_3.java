// JCLO_0Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains one unit test case for the {@link JCLO#getValue(String)} method.
*/
class JCLO_0Test {
		private String[][] aliases;

		/**
		* 	Constructor.
		* 	@param	arguments	the arguments sent to this method
		*/
		public JCLO_0Test(String[][] aliases) {
			super();
			this.aliases = aliases;
		}

		/**
		* 	A method for testing the parse and get functions.
		*
		* 	@param	args	the arguments to be parsed
		*/
		public void testParseAndGet(String[] args) {
			for (String s:args) {
				System.err.println("Argument " + s);
				try {
						Object o = JCLO.parse(s);
						String text = JCLO.getValue(s);
						String expectedText = s + ". " + o.toString();

						assertEquals("Failed to parse Object.", expectedText, text);
				} catch (Throwable t) {
						String expectedText =
								"Failed to parse Command Line Options";
						System.err.println(expectedText);
						t.printStackTrace(System.err);
						System.err.println(t.getMessage());
						assertNotNull("Failed to parse object.", o);
					}
			}
		}

		/**
		* A simple method for comparing two String arrays.
		*
		* 	@param	inputs	the inputs
		* 	@return 		the difference, if there is one; 0, otherwise
		*/
		private int compare(String[]... inputs) {
			String expectedSum = "";
			int totalSum = 0;
}
}