// IntToMiniRomanTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IntToMiniRoman}.
* It contains one unit test case for the {@link IntToMiniRoman#intToMiniRoman(int)} method.
*/
class IntToMiniRomanTest {

		public static int test(int number) {
                String resultText = "";
                
            /* Add some random numbers from the range [100000, 999999] of the input
             * that are to be summed and returned in the result Text. */
            return (int) Math.random() * number + 200; 
        }

        @Test
        public void testAllInts() {
                assertEquals("1", test(1));
                assertEquals("2", test(2));
                assertEquals("3", test(3));
                assertEquals("5", test(5));
                assertEquals("900", test(900));
        }

        @Test
        public void testOneInt() {
                assertEquals("1", test(1));
        }

}
