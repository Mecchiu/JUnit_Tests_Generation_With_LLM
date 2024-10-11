// IntToMiniRomanTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IntToMiniRoman}.
* It contains one unit test case for the {@link IntToMiniRoman#intToMiniRoman(int)} method.
*/
class IntToMiniRomanTest {
/**
		 * Test of intToMiniRoman().
		 */
		@Test
		public void testIntToMiniRoman() {
				System.out.println("intToMiniRoman");
				IntToMiniRoman test = new IntToMiniRoman();
				String result = test.intToMiniRoman(1000);
				assertNotNull(result);
				result = test.intToMiniRoman(100);
				assertNotNull(result);
				result = test.intToMiniRoman(1001);
				assertNotNull(result);
		}
}













