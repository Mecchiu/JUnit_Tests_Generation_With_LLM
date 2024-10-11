// VowelsCountTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link VowelsCount}.
* It contains one unit test case for the {@link VowelsCount#vowelsCount(String)} method.
*/
class VowelsCountTest {
// The test case to execute.
		private final String[] testCases = new String[] {
				"aab", "A", "AAB", "AB", "ABA", "ABB", "ABA", "ABAA", "ABAB", "ABAAA", "ABABA", "ABAAABA", "ABABABA", "ABAAABA", "ABABABABA", "ABAAABAB"
		};

		@Test
		public void testCaseCount() {
				int result = VowelsCount.vowelsCount("aab").intValue();
				assertEquals(1, result);

				assertEquals(VowelsCount.vowelsCount("AAB"), VowelsCount.vowelsCount("AAAB").intValue());


				result = VowelsCount.vowelsCount("AB").intValue();
				assertEquals(2, result);

				assertEquals(VowelsCount.vowelsCount("AABA"), VowelsCount.vowelsCount("AAAB").intValue());

				result = VowelsCount.vowelsCount("ABABA").intValue();
				assertEquals(3, result);

				result = VowelsCount.vowelsCount("ABAAABA").intValue();
				assertEquals(4, result);

				result = VowelsCount.vowelsCount("ABABABABAB").intValue();
				assertEquals(5, result);

		}

		@Test
		public void testCase1Count() {
			for(String t : testCases) {
				boolean result = VowelsCount.vowelsCount(t) == VowelsCount.vowelsCount("aab").intValue();
				boolean expect = VowelsCount.vowelsCount("AAB") == VowelsCount.vowelsCount("AAAB").intValue();
				assertTrue("aab", result);
				assertTrue("AAB", expect);
			}
		}

		@Test
		public void testCase2Count() {
			for(String t : testCases) {
				boolean result = VowelsCount.vowelsCount(t) == VowelsCount.vowelsCount("AABA").intValue();
				boolean expect = VowelsCount.vowelsCount("AAABBA") == VowelsCount.vowelsCount("AAAB").intValue();
				assertTrue("AABAABABABA", result);
				assertTrue("AABAA", expect);
			}
		}

}
