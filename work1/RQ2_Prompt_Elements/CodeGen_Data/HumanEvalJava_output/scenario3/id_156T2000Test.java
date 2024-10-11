// IntToMiniRomanTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IntToMiniRoman}.
* It contains one unit test case for the {@link IntToMiniRoman#intToMiniRoman(int)} method.
*/
class IntToMiniRomanTest {
/**
		 * * Test of the {@code intToMiniRoman(int)} method, of class {@code IntToMiniRoman}.
		 * We test the value {@code 0} here to make sure that an exception wouldn't be thrown for an invalid value,
		 * which happens when the value is larger than the allowed positive value.
		 */
		@Test
		public void testIntToMINIroman() {
			//System.out.println(">> intToMiniRoman(0)");
			int i = 0;
			String result = "xix";
						assertEquals("[0] wrong value at the 0th position", result, IntegerToMiniRoman.intToMiniRoman(i));
				i++;
				assertEquals("[-1] wrong value at the 1st position", result, IntegerToMiniRoman.intToMiniRoman(i));
				i++;
				assertEquals("[-2] wrong value at the 2nd position", result, IntegerToMiniRoman.intToMiniRoman(i));
				i++;
				assertEquals("[-4] wrong value at the 3rd position", result, IntegerToMiniRoman.intToMiniRoman(i));
				i++;
				assertEquals("[-5] wrong value at the 4th position", result, IntegerToMiniRoman.intToMiniRoman(i));
				i++;
				assertEquals("[-6] wrong value at the 5th position", result, IntegerToMiniRoman.intToMiniRoman(i));
				i++;
				assertEquals("[-9] wrong value at the 6th position", result, IntegerToMiniRoman.intToMiniRoman(i));
				//System.out.println("[+1] wrong value at the 1st position");
				i++;
				assertEquals("[+1] wrong value at the 2nd position");
				//System.out.println("[+2] wrong value at the 3rd position");
				i++;
				assertEquals("[+4] wrong value at the 4th position");
				//System.out.println("[+5] wrong value at the 5th position");
				i++;
				assertEquals("[+6] wrong value at the 6th position");
				//System.out.println("[+7] wrong value at the 7th position");
				i++;
				assertEquals("[+8] wrong value at the 9th position");
				//System.out.println("[+10] wrong value at the 10th position");
				i++;
				assertEquals("[+11] wrong value at the 11th position");
				//System.out.println("[+12] wrong value at the 12th position");
				i++;
				assertEquals("[+14] wrong value at the 13th position");
				i++;
				assertEquals("[+15] wrong value at the 15th position");
				i++;
				//System.out.println("[+17] wrong value at the 17th position");
				i++;
				assertEquals("[+18] wrong value at the 18th position");
				//System.out.println("[+30] wrong value at the 30th position");
				i++;
				assertEquals("[+31] wrong value at the 31st position");
				i++;
				assertEquals("[+32] wrong value at the 32th position");
				//System.out.println("[+33] wrong value at the 33th position");
				i--;
				assertEquals("[+34] wrong value at the 34th position");
				//System.out.println("[32] wrong value at the 32nd position");
				i--;
				assertEquals("[35] wrong value at the 35nd position");
				i--;
				//System.out.println("[34] wrong value at the 34th position");
				i--;
				//System.out.println("[37] wrong value at the 37th position");
				i--;
				assertEquals("[-20] wrong value at the 20th position");
				//System.out.println("[-21] wrong value at the 21st position");
				i--;
				i--;
				//System.out.println("[-22] wrong value at the 22nd position");
				i--;
				i--;
				{
						int r = i;
						//System.out.println("[-24] wrong value at the 24th position");
						i--;
						//System.out.println("[-25] wrong value at the 25th position");
						i--;
						//System.out.println("[-26] wrong value at the 26th position");
						i--;
						//System.out.println("[-24] wrong value at the 24th position");
						i--;
						//System.out.println("[-20] wrong value at the 20th position");
						//System.out.println("[-21] wrong value at the 21st position");
						//System.out.println("[-22] wrong value at the 22nd position");
						i--;
						//System.out.println("[-34] wrong value at the 34th position");
						i--;
						//System.out.println("[-35] wrong value at the 35th position");
						i--;
						//System.out.println("[-36] wrong value at the 36th position");
						i--;
				}
				assertEquals("[-32] wrong value at the 32nd position", result, IntegerToMiniRoman.intToMiniRoman(i));
		}
}
