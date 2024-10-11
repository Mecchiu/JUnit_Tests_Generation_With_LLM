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
		
    /**
     * Test if the given IP Address can be reconstored as binary representation
     * of a number of IP addresses.
     */
    private void testConversion(String IP, String noOfIPAddresses);

    /**
     * Test if the given IP Address can be reconstored as a dotted-decimal dotted-
     * decimal binary representation of a number of IP addresses.
     */
    private void testDecimalIP(String IP, String ip);

	/**
	 * Test 1 - Test 3 - Test 1 - Test 1
	 *    Then set currentIP to "5.10.9.100"
	 *    Then the returned IP should be "5.0.0.100"
	 *    (IP should now be a valid IP address)
	 */
	@Test
	public void test1() {
		checkIPType(0);
		System.out.println("Test " + this.getClass().getCanonicalName() + " test1");
		testConversion("5.0.0.1", this.getIP());
		System.out.println("IP - " + testDecimalIP("5.0.0.1", this.getIP()));
		System.out.println("IP - " + testDecimalIP("5.2.0.1", this.getIP()));

		System.out.println("test1 - ip - " + testDecimalIP("5.10.9.1", testDecimalIP("5.10.9.1", this.getIP())));
		testConversion("5.10.9.1", this.getIP());
		System.out.println("IP - " + testDecimalIP("5.0.0.1000", this.getIP()));	
	}

	/**
	* Test 4 - Test 4
	*    Then set currentIP to "5.15.8.7"
	*    Then the returned IP should be "2.6.10.4"
	*    (IP should now be a valid IP address)
	*/
	@Test
	public void test4() {
		checkIPType(1);
		System.out.println("Test " + this.getClass().getCanonicalName() +
			" test4");
		testConversion("5.15.8.7", this.getIP());
		System.out.println("IP - " + testDecimalIP("5.15.8.7", this.getIP()));
	}

}