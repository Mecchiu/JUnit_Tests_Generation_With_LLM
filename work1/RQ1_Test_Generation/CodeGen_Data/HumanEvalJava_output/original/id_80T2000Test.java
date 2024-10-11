// IsHappyTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsHappy}.
* It contains one unit test case for the {@link IsHappy#isHappy(String)} method.
*/
class IsHappyTest {
/**
		 * @throws exception An unexpected error has occurred
		 */
		@Test
    @UseMethodParameter("s")
		public void test1() {
			// Given s is empty
			String s = "";
			assertFalse(
					"expected an exception but was: " + s + " ; got: " + s.length(),
					isHappy(s));
		}

		/**
		 * @throws exception An unexpected error has occurred
		 */
		@Test
    @UseMethodParameter("s")
		public void test2() {
			// Given s contains a leading whitespace
			String s = "a  b";
			assertFalse(
					"expected an exception but was: " + s + " ; got: " + s.length(),
					isHappy(s));
		}

		/**
		 * @throws exception An unexpected error has occurred
		 */
		@Test
    @UseMethodParameter("s")
		public void test3() {
			// Given s contains a trailing whitespace
			String s = "a b ";
			assertFalse(
					"expected an exception but was: " + s + " ; got: " + s.length(),
					isHappy(s));
		}
}
