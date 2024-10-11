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

	protected static final int IPA = 1;
	protected static final int IPPref = 2;
	protected String IP;
	protected String IPPrefix;
	protected String IPaddr;
	protected String prefix;
	protected String ip;
	protected String currentIP;
	protected String totalIPAddresses;
	protected ArrayList IPAddresses;
	protected int totalIPAddressesIPBin;
	final int maxPossibleIPBin = 4;
	final static int IPBinWidth = 7;
	
	/**
	* Test case constructor.
	* This test case is required to test the results of the other tests
	* of <code>IPCalculate</code>. It contains one test case. It contains
	* 4 tests cases:
	*   <OL>
	*       <LI>Test for IP calculation at IPADDR1 and IPADDR2.
	*       <LI>Test for IP calculation in IPADDR1 and IPADDR2.
	*   </OL>
	*/
	public BinaryCalculate_2Test() {
		IPAddresses = new ArrayList();
		IP = "00:00:00:00:00:00";
		IPPrefix = "00.0.0.0";
		IPaddr = "00.0.0.0";
		prefix = "00.0.0.0";
		ip = IP;
		currentIP = ip;
		totalIPAddresses = convert(ip).length();
		NumberFormat formatter = NumberFormat.getNumberInstance();//new DecimalFormat("0.####");
		try {
			totalIPAddressesIPBin = formatter.parse(totalIPAddresses).intValue();
			ip = convert(totalIPAddressesIPBin);//(totalIPAddressesIPBin);
		} catch (java.text.ParseException ee) {
		}
		
	}
	
	/**
	*   Calculates the IP Range from given IP address and IP prefix. The results
	*   are stored in an <code>string</code> returned by this method.
	* @param IP The IP address
	* @param IPPrefix The IP address prefix
	* @return results string
	*/
	public String IPcalculateIPRange(String IP, String IPPrefix){
		IPAddresses.add(IPAddresses.size(), IPPrefix + IP);
		IP += IPPrefix + IP;
		String outputText = "";
		calculate(IP);
		totalIPAddressesIPBin--;
		currentIP = ip;
		NumberFormat formatter = NumberFormat.getNumberInstance();
		outputText += "Total range : " + formatter.format(totalIPAddressesIPBin) + "\n";
		outputText += "Total usable range : " + formatter.format(totalIPAddresses) + "\n";
		outputText += "Total usable range : " + formatter.toString() + "\n";
		return outputText;
	}


}
//class BinaryCalculate
//class BinaryCalculate_2Test
//class BinaryCalculate_3Test
//class BinaryCalculate_4Test

/**
* Test unit test for <code>IPCalculate</code>.
* It contains one test case:
*   <OL>
*       <LI>Test for an IP calculation.
*   </OL>
*
*/
class IPCalculateTest extends Test {

    
   	/**
   	* Tests the IP calculation result.
   	* @throws Throwable
   	*/
    @Test
	public void testIPCalculation() throws Throwable {
		IPCalculateTest.calculateIP(IP,IP);
		//return;
	}
	

}
//class IPCalculateTest

/**
* Test unit test for <code>IPCalculate</code>.
* It contains one test case:
*   <OL>
*       <LI>Test for another IP calculation result.
*   </OL>
*
*/
class IPCalculateTest_1 extends IPCalculateTest {

}
//class IPCalculateTest_1

/**
* Test unit test for <code>IPCalculate</code>.
* It contains one test case:
*   <OL>
*       <LI>Test for other IP calculation.
*   </OL>
*
*/
class IPCalculateTest_2 extends IPCalculateTest {

}
//class IPCalculateTest_2

/**
* Test unit test for <code>IPCalculate</code>.
* It contains one test case:
*   <OL>
*       <LI>Test for a wrong input parameters.
*   </OL>
*
*/
class IPCalculateTest_3 extends IPCalculateTest {

}
//class IPCalculateTest_3

/**
* Test unit test for <code>IPCalculate</code>.
* It contains one test case:
*   <OL>
*       <LI>Test for an empty string for the ip.
*   </OL>
*
*/
class IPCalculateTest_4 extends IPCalculateTest {

}


/**
* Test unit test for <code>IPCalculate</code>.
* It contains one test case for more than one IP address.
* @throws Throwable
*/
class IPCalculateTest_5 extends IPCalculateTest {

}


/**
* Test unit test for <code>IPCalculate</code>.
* It contains one test case for an IPv4-specific version.
* @throws Throwable
*/
class IPCalculateTest_6 extends IPCalculateTest {

}






