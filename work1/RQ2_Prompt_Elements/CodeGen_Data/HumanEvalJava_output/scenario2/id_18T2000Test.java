// HowManyTimesTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HowManyTimes}.
* It contains one unit test case for the {@link HowManyTimes#howManyTimes(String, String)} method.
*/
class HowManyTimesTest {
/**
		 * Test method for {@link HowManyTimes#howManyTimes(String, String)}.
		*/
		@Test
		void test() {
			//Test case 1
			String s = "abaaabaaabaabaaaabaa";
			assertEquals(5, howManyTimes(s, "a"));
			assertEquals(5, howManyTimes(s, "b"));
			assertEquals(5, howManyTimes(s, "b"));
			assertEquals(0, howManyTimes(s, "ab"));
			assertEquals(0, howManyTimes(s, "acc"));
			assertEquals(0, howManyTimes(s, "cccc"));
			assertEquals(0, howManyTimes(s, "aabaacaabacacab"));
			
			//Test case 2
			s = "aab";
			assertEquals(11, howManyTimes(s, "a"));
			assertEquals(9, howManyTimes(s, "a"));
			assertEquals(0, howManyTimes(s, "a"));
			assertEquals(1, howManyTimes(s, "a"));
			assertEquals(2, howManyTimes(s, "a"));
			assertEquals(3, howManyTimes(s, "a"));
			assertEquals(4, howManyTimes(s, "a"));
			assertEquals(5, howManyTimes(s, "a"));
			assertEquals(11, howManyTimes(s, "a"));
			assertEquals(13, howManyTimes(s, "a"));
			assertEquals(19, howManyTimes(s, "a"));
			assertEquals(20, howManyTimes(s, "a"));
			assertEquals(21, howManyTimes(s, "a"));
		}
}
