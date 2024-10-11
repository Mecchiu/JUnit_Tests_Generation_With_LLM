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
	 * Tests the <code>addBinary(String, String) </code> method of BinaryCalculate.
	 */
	@Test
    public void addBinBinaryTest() {

    	String inputIP1 = "192.168.0.1";
    	String inputIP2 = "192.168.0.11";
    	String inputIP3 = "192.168.0.21";
    	String ip1 = "192.168.0.1";
    	String ip2 = "192.168.0.2";
    	String ip3 = "192.168.0.22";

    	//calculate the final IP address from these IPs
    	final String inputIP = calculateAddOneIP(inputIP1, inputIP2, inputIP3);

    	//compare the IP address computed in the first binary IP calculation with 
    	//the IP stored at the end.
    	if (isIPv4 == true) {
    		assertEquals(inputIP1, addBinary(ip1, inputIP3), DELIMITER + " " + DELIMITER + " ");
    	} else {
    		assertEquals(inputIP1, addBinary(ip1, inputIP), DELIMITER + " " + DELIMITER + " ");
    	}

    	//compare the IP address computed in the second binary IP calculation with 
    	//the IP stored at the end.
    	if (isIPv6 == true) {
    		assertEquals(inputIP3, addBinary(ip2, inputIP3), DELIMITER + " " + DELIMITER + " ");
    	} else {
    		assertEquals(inputIP3, addBinary(ip2, inputIP), DELIMITER + " " + DELIMITER + " ");
    	}

    	//compare the IP address computed in the third binary IP calculation with 
    	//the IP stored at the end.
    	if (isIPv4 == true) {
    		assertEquals(inputIP2, addBinary(ip1, inputIP), DELIMITER + " " + DELIMITER + " ");
    	} else {
    		assertEquals(inputIP2, addBinary(ip1, inputIP), DELIMITER + " " + DELIMITER + " ");    	
    	}
		}

}