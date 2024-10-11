// HowManyTimesTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HowManyTimes}.
* It contains ten unit test cases for the {@link HowManyTimes#howManyTimes(String, String)} method.
*/
class HowManyTimesTest {
	@Test
			void testEmptyString() {
				assertEquals(0, HowManyTimes.howManyTimes("", "a"));
			}
			
			@Test
			void testOneCharString() {
				assertEquals(3, HowManyTimes.howManyTimes("aaa", "a"));
			}
			
			@Test
			void testTwoCharString() {
				assertEquals(3, HowManyTimes.howManyTimes("aaaa", "aa"));
			}
			
			@Test
			void testEmptyString2() {
				assertEquals(0, HowManyTimes.howManyTimes("", "x"));
			}
			
			@Test
			void testMultipleCharString() {
				assertEquals(4, HowManyTimes.howManyTimes("xyxyxyx", "x"));
			}
			
			@Test
			void testMultipleCharString2() {
				assertEquals(4, HowManyTimes.howManyTimes("cacacacac", "cac"));
			}
			
			@Test
			void testMultipleCharString3() {
				assertEquals(1, HowManyTimes.howManyTimes("john doe", "john"));
			}
			
			@Test
			void testMultipleCharString4() {
				assertEquals(0, HowManyTimes.howManyTimes("john doe", "jane"));
			}
			
			@Test
			void testMultipleCharString5() {
				assertEquals(1, HowManyTimes.howManyTimes("john doe", "doe"));
			}
			
			@Test
			void testMultipleCharString6() {
				assertEquals(2, HowManyTimes.howManyTimes("john doe john", "john"));
			}
}
