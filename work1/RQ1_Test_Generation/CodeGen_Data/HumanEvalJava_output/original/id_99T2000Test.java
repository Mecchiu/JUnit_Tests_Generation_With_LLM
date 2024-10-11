// ClosestIntegerTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClosestInteger}.
* It contains one unit test case for the {@link ClosestInteger#closestInteger(String)} method.
*/
class ClosestIntegerTest {
/*
         * <editor-fold desc="Constructor">//**
         * Private members
         * </editor-fold>
		 */
    private String nameValue; //String value of parameter
	private int value;
    /*
     * <editor-fold desc="Final public member variables">
     * End of public members
     * </editor-fold>
     */

  /*
  * Public members
  * </editor-fold>
  */
    /*
    * Constructor taking a String representing a number
    * and returns the closest integer to it. If the number is equidistant
    * from two integers, round it away from zero.
    *
    * Examples
    * >>> closest_integer("10")
    * 10
    * >>> closest_integer("15.3")
    * 15
    *
    * <p>Note:
    * Rounding away from zero means that if the given number is equidistant
    * from two integers, the one you should return is the one that is the
    * farthest from zero. For example closest_integer("14.5") should
    * return 15 and closest_integer("-14.5") should return -15.
    *
    * >>> closest_integer("10")
    * 10
    * >>> closest_integer("14.5")
    * 15
    * >>> closest_integer("-15.5")
    * -16
    * > closest_integer("15.3")
    * 15
    * > closest_integer("0")
    * 0
    *
    * @param value Number value used for the test function
    */
	public ClosestIntegerTest(String nameValue, int value) {
		this.nameValue = nameValue;
		this.value = value;
	}


    /**
    * Test of test function that takes a value (string) representing a number
    * and returns the closest integer to it. If the number is equidistant
    * from two integers, round it away from zero.
    *
    * @throws junit.framework.AssertFailure if the test fails

    */
	@Test
	public void testClosestInteger() {
		ClosestInteger.closestInteger(nameValue);
	}

    /**
    * Test of test function that takes a double representing a number
    * and returns the closest integer to it. If the number is equidistant
    * from two integers, round it away from zero.
    *
    * @throws junit.framework.AssertFailure if the test fails

    */
	@Test
	public void testClosestDouble() {
		int minValue = ClosestInteger.closestInteger(Double.parseDouble("-0.5"));
		assertEquals(minValue, ClosestInteger.closestInteger(Double.parseDouble("0")));
		assertEquals(minValue, ClosestInteger.closestInteger(Double.parseDouble("1")));
		assertEquals(minValue, ClosestInteger.closestInteger(Doubles.parseDouble("1e-2")));
	}


	/**
	 *
	 * @param nameValue
	 * @return
	 */
	public double closest_integer(String nameValue) {
		return ClosestInteger.closestInteger(nameValue);
	}

    /**
 	 * Test of test function that takes a double representing a number
 	 * and returns the closest integer to it. If the number is equidistant
 	 * from two integers, round it away from zero.
 	 *
 	 * @throws junit.framework.AssertFailure if the test fails

 	 */
	@Test
	public void testRoundedDouble() {

	}

}

