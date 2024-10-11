// RemoveVowelsTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RemoveVowels}.
* It contains ten unit test cases for the {@link RemoveVowels#removeVowels(String)} method.
*/
class RemoveVowelsTest {

		/**
		* Test case for {@link RemoveVowels#removeVowels(String)} method.
		* It checks if the method returns the correct string without vowels.
		*/
		@Test
		void testRemoveVowels() {
				assertEquals("Hll", RemoveVowels.removeVowels("Hello"));
				assertEquals("Hll", RemoveVowels.removeVowels("hEllO"));
				assertEquals("Hll", RemoveVowels.removeVowels("HELLO"));
				assertEquals("Hll", RemoveVowels.removeVowels("hElLo"));
				assertEquals("Hll", RemoveVowels.removeVowels("heLLo"));
				assertEquals("Hll", RemoveVowels.removeVowels("helLO"));
				assertEquals("Hll", RemoveVowels.removeVowels("hellO"));
				assertEquals("Hll", RemoveVowels.removeVowels("HeLlO"));
				assertEquals("Hll", RemoveVowels.removeVowels("hElLo"));
				assertEquals("Hll", RemoveVowels.removeVowels("HeLlO"));
		}
}