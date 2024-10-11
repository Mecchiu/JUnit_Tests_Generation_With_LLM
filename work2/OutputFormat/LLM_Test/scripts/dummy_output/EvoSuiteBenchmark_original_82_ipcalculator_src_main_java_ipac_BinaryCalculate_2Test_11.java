// BinaryCalculate_2Test.java
package ipac;

import java.text.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BinaryCalculate}.
* It contains one unit test case for the {@link BinaryCalculate#IPCalculate(String, String)} method.
*/
class BinaryCalculate_2Test {
		
	/**
	 * Initializes the tests of {@link BinaryCalculate_2Test}.
	 * @param testName The name of the test
	 */
	private static void testInit(String testName) {
		// Set up a new configuration
        String config =
            "<config>"
                + "    <property name=\"ip.ad.name\" value=\"%s  %s\"/>"
                + "    <property name=\"ip.ad.dotted\">"
                + "		<binary>%s</binary>"
                + "		<dynamic>true</dynamic>"
                + "    </property>"
                + "</config>";

        Locale locale = Locale.getDefault();
        Locale.setDefault(Locale.US);

        // Execute the test
        try {
            new BinaryCalculate(config, "ip.ad.dotted.binary", "x.x.x", "x", "xxx") ;
            fail("An exception is expected because the method IPCalculate must not be called when IP address is dotted-decimal or hexidecimal");
        } catch (ClassCastException e) {
            System.out.println("IPCalculate executed ok");
        }

        // Reset configuration, now test method is executed OK
        Locale.setDefault(locale);
    }

    /**
	 * Tests the binary representation of IP address.
	 */
	@Test
	public void testIPCalculate() {

		testInit("BinaryCalculate must not be called when IP Addresses are dotted-decimal or hexidecimal");
	}

	/**
	 * Tests IP address calculation.
	 */
	@Test
	public void testIPCalculate_1() {
		// IP address is dotted decimal
		assertIPAddr1("x.2.1.1", "x.2.1", "1");
		assertIPAddr1("x.2.1.2", "x.2.1", "2");
		// IP address is hexidecimal
		assertIPAddr1("x.0.1.11.1", "x.0.1", "11111");

		// IPAddrList addressList = new IPAddressList(new IPAddress("x.9.0.0.5"));
	     // IPAddrList addressList = new IPAddressList(new IPAddress("x.9.0.3"), IPAddress.IPType.HEX);
		// Iterator iter = addressList.iters();
		// while (iter.hasNext()) {
		// String ip = IPUtils.
}
}