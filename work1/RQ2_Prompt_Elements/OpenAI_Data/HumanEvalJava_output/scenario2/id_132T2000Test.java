// IsNestedTest.java
package scenario2;

import java.util.ArrayList;
import java.util.Collections;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsNested}.
* It contains ten unit test cases for the {@link IsNested#isNested(String)} method.
*/
class IsNestedTest {
	/**
			* Test case 1: Empty string
			* Expected output: False
			*/
			@Test
			void test1() {
				String string = "";
				Boolean expected = false;
				Boolean actual = IsNested.isNested(string);
				assertEquals(expected, actual);
			}

			/**
			* Test case 2: String with only opening brackets
			* Expected output: False
			*/
			@Test
			void test2() {
				String string = "[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[