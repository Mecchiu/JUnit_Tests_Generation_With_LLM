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
		 *  Returns the starting IP address of an IPRange from the supplied
		 *  IP Address, IP Address range, and IP Range prefix.
		 */
		String getStartIP(String IPAddress, String IPAddressRange,
			String IPRangePrefix);

        String getEndIP(String IPAddress, String IPAddressRange,
                        String IPRangePrefix);


	@Test
    // Test the results of IPv4IPAddresses and IPv6IPAddresses
	public void IPv4IPAddresses() {
        String IPv4Prefix = "";
        BigInteger ipInNetwork = BigInteger.ZERO;
        BigInteger totalIPAddresses = BigInteger.ONE;

        /**
         *  IPv4: IPv4IPAddresses
         */
        assertEqual(ipv4IP, IPv4.subnettoIP(".0.0.0", 32).toString());
        assertGreaterThan(totalIPAddresses, 0);
        int IPv4Length = IPv4.IP4AddrLen;
        for (int i=0; i<IPv4Length;i++) {
            ipInNetwork = ipInNetwork.add(BigInteger.valueOf(i));
        }
        assertEqual("".substring(0,3), IPv4.subnettoIP(".0.", 32).toString());
        assertEqual(1208.0, ipInNetwork.divide(BigInteger.valueOf(2)));
        assertEqual(totalIPAddresses, ipInNetwork.add(ipInNetwork).divide(ipInNetwork.subtract(ipInNetwork)));

        /**
         *  IPv6: IPv6IPAddresses
         */

        /**
        IPv6: IPv6IPAddresses
        */
        assertEqual("00000000000000000000000000000000000000000000", IPv6.subnettoIP(".0.0.", 128).toString());
        int IPv6Length = IPv6.IP6AddrLen;
        for (int i=0; i<IPv6Length;i++) {
            ipInNetwork = ipInNetwork.add(BigInteger.valueOf(i));
        }
        assertEqual("00000000000000000000000000000000000000000000", IPv6.subnettoIP(".0.", 128).toString());
        assertEqual(1209.0, ipInNetwork.divide(BigInteger.valueOf(2)));
        assertEqual(totalIPAddresses, ipInNetwork.add(ipInNetwork).divide(ipInNetwork.subtract(ipInNetwork)));

        /**
        IPv6: IPv6IPAddresses
        */
        ipInNetwork = BigInteger.