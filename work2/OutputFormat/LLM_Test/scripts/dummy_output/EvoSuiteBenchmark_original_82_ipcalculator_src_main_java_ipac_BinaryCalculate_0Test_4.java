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
		
	private static BigInteger testIP1 = new BigInteger("255");
	private static BigInteger testIP2 = new BigInteger("0.0.0.0");
	private static BigInteger testIP3 = new BigInteger("ffff:ffff");
	private static BigInteger testIP4 = new BigInteger("ffff");

	@Test
    public void addBinary_0_1IP() {
    
		BigInteger a = new BigInteger("ffff");
		BigInteger b = new BigInteger("ffff");
		
		// Case for I1, I2 - no IP addresses
		BigInteger address = a.add(b);
		String resultIP = testIP1.toString()+" "+hexToBinary(addition(new BigInteger(testIP1), b));

		// Case for I0.2, I0.3 - IP addresses with a shorter prefix is converted to the IPv4
		String prefix = "-0."+a.toString();
		String IP = "255." + address.toString() + prefix;
		BigInteger resultB = testIP1.add(address.subtract(testIP2)).add(a);
		String resultBIP = prefix + "+" + hexToBinary(resultB.toString());
		assertDeepEquals("BinaryAddition: " + testIP1 + "<" + b + ">" + testIP2, resultIP, resultBIP);
		
		// Case for I0.4 - IP addresses with full networks are converted to the IPv6
		String IPA = a.toString() + prefix + "-0.0.0";
		String resultP = testIP1.add(testIP2).add(address).add(address.subtract(a));
		String resultPIP = prefix + "+" + hexToBinary(resultP);
		assertDeepEquals("Percation: " + a + "<" + IPA + ">" + IPA, resultPIP, testIP4.add(address));
	}

	@Test
    public void addBinary_0_2IP() {
		BigInteger a = new BigInteger("ffff");
    		BigInteger b = new BigInteger("ff0");
    		
		// Case for I1.2, I1.3  - no IP addresses
		BigInteger address1 = a.add(b);
    		String resultIP = testIP1.toString() + " "+ hexToBinary(address1);

    		// Case for I0.2, I0.3  - IP addresses with a shorter prefix is converted to the IPv4
    		String prefix = "-0."+a.toString();
}
}