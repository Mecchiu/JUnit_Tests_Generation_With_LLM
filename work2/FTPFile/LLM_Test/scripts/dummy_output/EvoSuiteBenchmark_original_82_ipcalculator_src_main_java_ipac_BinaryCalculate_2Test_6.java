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
		private String IP = "5.255.255.255";

	String IP_VAL		= "5.255.255.255";

	int IP_VAL_1		= 40000;

	int IP_VAL_2		= 16000;

	int ipv = 0;

	String startIP	= "5.251.55.15";

	String IP_VAL	= "5.255.255.255";


	/**
	 *  Tests binary IP calculation
	 */
	@Test
	void testIPCalculate( ) {

		this.IP_VAL		= "5.0.0.1";
		this.IP		= this.IP_VAL_2 + this.IP_VAL.toString() + this.IP_VAL.toString();
		this.checkIPType(5);
	}


	/**
	 *  Tests if the start IP is 5.0.0.1 by making sure that a DNS record (4 bytes) is first for
	 *  IP address. Otherwise the IPv4 address is considered as end of sequence IP
	 *  (15), and the IPv6 address is considered as the start of a sequence IP.
	*/
	@Test
	void testIPInDNS( ) {

		this.startIP		= this.IP_VAL_2;

		String result = BinaryCalculate.IPCalculate(this.IP, this.IP_VAL);

		assertNotNull("The start IP of IPv4 of DNS was not able to be get from current IPv4 address.", result);
		assertTrue("The start IPs in the IPv4 DNS not have a corresponding IPv4 address.",
				Integer.valueOf(0) == Integer.valueOf(result));

		assertNotNull("The IPv4 IPv6 DNS entry was not correctly added to the list of
	addresses for the IPv4 address.", BinaryCalculate.IPCalculate(this.startIP, this.IP_VAL_2));
	}


	/**
	 *  Tests if the start IP is 5.0.0.1 by making sure that a DNS entry (4 bytes) is
	 *  first for IPv6 address. Otherwise the IPv4 address is considered as end of sequence IP
	 *  (15), and the IPv6 address is considered as the start of a sequence IP.
	 */
	@Test
	void testIPValInDNS( ) {

		this.startIP_VAL	= this.IP_VAL_2;

		String result = BinaryCalculate.IPCalculate(this.IP, this.IP_VAL_1);

}
}