// BinaryCalculate_0Test.java
package ipac;

import java.text.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BinaryCalculate}.
* It contains one unit test case for the {@link BinaryCalculate#addBinary(String, String)} method.
*/
class BinaryCalculate_0Test {
		 /**
		 *  Constructs a binary calculator tested with only 1 IP range.
		 *
		 *  @param    Test IP Address for a test.
		 */
    private BinaryCalculate_0Test() {
    }

        /**
     *  The tests executed once for ip-range testing.
     *
     *  @param     IPAddress IP Address to be tested.
     *  @param     lengthOfToken Length in binary form after decimal address.
     */
    @Test
    public void addBinaryIP_1Length_1() {
	int size1 = 0;
	int length = 0;
	String ip = "1.1.1.1";
	String ipPrefix = ip + DELIMITER;
	int IPv4 = 0;
	int IPv6 = 0;

        try {
	    length = BinaryCalculate.addBinary(ip, ipPrefix);
	} catch (NumberFormatException ex) {
            System.out.format("IP Addr:%1$s length is %2$s. It shouldn't be an error if ip is a decimal value.",
                              ip, length);
        }

	int noOfIPAddresses = 2;
	for (int i=0;i<noOfIPAddresses;i++) {
	    BinaryCalculate.calculate(ip,length);
	    // TODO:
	    // TODO:
	    // TODO:
	}

        assertEquals(size1+1, (int) BinaryCalculate.getEndIP(ip));
	assertEquals(length1, ip.length());
	int first = BinaryCalculate.getStartIP();
	int last = BinaryCalculate.getEndIP(ip) + 1;
	IPv4 = BinaryCalculate.calculateIPv4(ip);
	IPv16 = BinaryCalculate.calculateIPv6(ip);
	IPv6 = BinaryCalculate.calculateIPv6(ip);
	assertEquals(size1, last);
	assertEquals(ip,first);
	assertEquals(IPv4 + IPv6, noOfIPAddresses);
	assertEquals("IP: "+ip + " IP prefix: "+ipPrefix, size1,BinaryCalculate.calculate(ipPrefix.substring(1),length1));
    }

        /**
     *  The tests executed once for longer IP address tests.
     *
     *  @return     IP Address string that has a length of 1 or greater than length of
     *               IPv4 and IPv6.
     */
}