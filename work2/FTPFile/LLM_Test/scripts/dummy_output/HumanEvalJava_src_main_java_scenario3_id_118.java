// GetClosestVowelTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetClosestVowel}.
* It contains ten unit test cases for the {@link GetClosestVowel#getClosestVowel(String)} method.
*/
class GetClosestVowelTest {
			@Test
			void testGetClosestVowel1() {
				assertEquals("u", GetClosestVowel.getClosestVowel("yogurt"));
			}

			@Test
			void testGetClosestVowel2() {
				assertEquals("U", GetClosestVowel.getClosestVowel("FULL"));
			}

			@Test
			void testGetClosestVowel3() {
				assertEquals("", GetClosestVowel.getClosestVowel("quick"));
			}

			@Test
			void testGetClosestVowel4() {
				assertEquals("", GetClosestVowel.getClosestVowel("ab"));
			}

			@Test
			void testGetClosestVowel5() {
				assertEquals("", GetClosestVowel.getClosestVowel("ba"));
			}

			@Test
			void testGetClosestVowel6() {
				assertEquals("a", GetClosestVowel.getClosestVowel("bad"));
			}

			@Test
			void testGetClosestVowel7() {
				assertEquals("o", GetClosestVowel.getClosestVowel("most"));
			}

			@Test
			void testGetClosestVowel8() {
				assertEquals("", GetClosestVowel.getClosestVowel("easy"));
			}

			@Test
			void testGetClosestVowel9() {
				assertEquals("i", GetClosestVowel.getClosestVowel("anime"));
			}

			@Test
			void testGetClosestVowel10() {
				assertEquals("", GetClosestVowel.getClosestVowel("Asia"));
			}
}