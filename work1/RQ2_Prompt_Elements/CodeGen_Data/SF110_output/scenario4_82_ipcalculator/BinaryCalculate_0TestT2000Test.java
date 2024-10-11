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

	public BinaryCalculate_0Test() {
	}
	
	/**
	* Test the initialisation of binary IP address calculation.
	*/  	
	@Test
	public void IPcalculateInitialisation(){
		String IPAddress = "10.0.0.2";

		String IP = IPAddressInIPAddressCalculate.getIP(IP);

		assertEquals("IP in IPaddress calculation is wrong:",
			IP, IPAddress);			
	}

	/**
	* Test the IPRange calculation for provided IP Address.
	*
	* @param   BinAddress  The IP address that we're testing
	*/
	public void IPcalculateIPRange(String IPAddress, List<String> ipAddress);
	
	/**
	* Test the IPRange calculation for provided IP Address.
	*/
	public void IPCalculateIPRange(String IPAddress, String prefix, String IPPrefix, String endIP, String endPrefix);

	/**
	* Iterates over the IPArray and calls the 	{@link BinaryCalculate#calculate(String, int)}
	* method on every element from the array at the given index and checks that the ipAddress
	* contains expected IP address.
	*
	* @param   IPArray   IPArray to be iterated over and called on every element
	*/
	public void IPcalculate(String IPAddress, int first, int count);

}
