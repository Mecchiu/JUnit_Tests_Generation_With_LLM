// GetClosestVowelTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetClosestVowel}.
* It contains ten unit test cases for the {@link GetClosestVowel#getClosestVowel(String)} method.
*/
class GetClosestVowelTest {
			@Test
			void testGetClosestVowel1() {
				assertEquals("i", GetClosestVowel.getClosestVowel("abir"));
			}
			
			@Test
			void testGetClosestVowel2() {
				assertEquals("o", GetClosestVowel.getClosestVowel("abpor"));
			}
			
			@Test
			void testGetClosestVowel3() {
				assertEquals("a", GetClosestVowel.getClosestVowel("abcr"));
			}
			
			@Test
			void testGetClosestVowel4() {
				assertEquals("e", GetClosestVowel.getClosestVowel("abcer"));
			}
			
			@Test
			void testGetClosestVowel5() {
				assertEquals("u", GetClosestVowel.getClosestVowel("abcur"));
			}
			
			@Test
			void testGetClosestVowel6() {
				assertEquals("i", GetClosestVowel.getClosestVowel("abir"));
			}
			
			@Test
			void testGetClosestVowel7() {
				assertEquals("o", GetClosestVowel.getClosestVowel("abpor"));
			}
			
			@Test
			void testGetClosestVowel8() {
				assertEquals("a", GetClosestVowel.getClosestVowel("abcr"));
			}
			
			@Test
			void testGetClosestVowel9() {
				assertEquals("e", GetClosestVowel.getClosestVowel("abcer"));
			}
			
			@Test
			void testGetClosestVowel10() {
				assertEquals("u", GetClosestVowel.getClosestVowel("abcur"));
			}
}