// BinaryCalculate_1Test.java
package ipac;

import java.text.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BinaryCalculate}.
* It contains one unit test case for the {@link BinaryCalculate#subBinary(String, String)} method.
*/
class BinaryCalculate_1Test {
  // All variables in this class which are defined by the class
		  // BinaryCalculate_1Test.
	  private int[] numArray;

    /**
     *  Constructs the object.
     */
    public BinaryCalculate_1Test() {
        // Noop constructor
        return;
    }


		/**
	   *  Gets the number of IPs in <code>numArray</code> from the given
	   *  <code>numArray</code> values.
	   *
	   *  @param 	numArray  Number of IPv4 Addresses to be extracted
	   *  @return	Number of IPs in the array
	   */
    private int[] getNumArray(int[] numArray);

    /**
     * @see BinaryCalculate#generateSubnet()
     */
    @org.junit.jupiter.api.Test
    public void Test_generateSubnet() {

		  // Noop test.
    }


    /**
     * @see BinaryCalculate#IPcalculate(String, String)
     */
    @org.junit.jupiter.api.Test
    public void Test_IPcalculate() {
		int[] numArray = this.getNumArray(this.numArray);

		assertNotNull(numArray);

		assertEquals(1, numArray.length);
	}

}