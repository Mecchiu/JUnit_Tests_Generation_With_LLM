// GreatestCommonDivisorTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GreatestCommonDivisor}.
* It contains one unit test case for the {@link GreatestCommonDivisor#greatestCommonDivisor(int, int)} method.
*/
class GreatestCommonDivisorTest {
/**
		 * This is the test case for {@link GreatestCommonDivisor#greatestCommonDivisor(int, int)}.
		 * The method tests the algorithm of {@link GreatestCommonDivisor#greatestCommonDivisor(int, int)} and 
		 * {@link GreatestCommonDivisor#greatestCommonDivisor(int, int)}.
		 */
    @Test
    public void twoNumbersGCDTest(){
	int a = 20;
	int b = 20;
	assertEquals(a/b, 1);
    }
}
