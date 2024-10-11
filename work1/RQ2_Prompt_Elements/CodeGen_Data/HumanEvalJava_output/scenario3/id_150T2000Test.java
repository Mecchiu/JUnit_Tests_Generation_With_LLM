// XOrYTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XOrY}.
* It contains one unit test case for the {@link XOrY#xOrY(int, int, int)} method.
*/
class XOrYTest {
{
			// n, x, y
			int pN = 3;
			int pX = 4;
			int pY = 13;

			// return value
			int result = XOrY.xOrY(pN, pX, pY);

			assertEquals(pN, result);
		}

		/**
		* Test of {@link XOrY#xOrY(int, int, int)}.
		* It uses the factory of the given number as a factory object.
		*/
		@Test
		public void testXorY_WithFactory() {
				XOrY xOrY = new XOrY();
				assertReturnValue(xOrY, pN, pX, pY);
		}
}

/**
 * Test class of xOrY.
 */
class XOrY {

	/**
	 * Constructor.
	 */
	public XOrY() {
	}

	/**
	 * A simple program which should return the value of x if n is
	 * a prime number and should return the value of y otherwise.
	 *
	 * The following functions should be implemented:
	 * getDigitList()
	 * getPivotAndPivotList()
	 * assertDigitList()
	 * assertPivotAndPivotList()
	 * assertThePivotList()
	 * assertDigitList(final int num)
	 */
	public int xorY(int n) {
    return 0;
	}

	/**
	 * A simple program which should return the value of y if n is
	 * a prime number and should return the value of x otherwise.
	 *
	 * The following functions should be implemented:
	 * getDigitList()
	 * getPivotAndPivotList()
	 * assertDigitList()
	 * assertPivotAndPivotList()
	 * assertThePivotList()
	 * assertDigitList(final int num)
	 */
	public int yorX(int n) {
    return 0;
	}
}
