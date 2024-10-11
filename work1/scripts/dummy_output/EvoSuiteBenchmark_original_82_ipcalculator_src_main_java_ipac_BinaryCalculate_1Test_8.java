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
		
	private static String IP = "";
	private static boolean VERBOSE = true;
	
	public void initTest() {
		IP = "192.168";
		IP = "128.0.0.0";
		IP = "0.0.0.0";
		IP = "1.0.0.0";
		IP = "192.168.0.0";
			
		currentIP = "";
		fullReassembler = "";
		semiCol = 0;
		prefix = "";
		totalIPAddresses = BigInteger.ONE;
		MAXPREFIX = 255;
		
		}
		

//     protected void setUp() throws Exception {
//    	 initTest();
//    	}
	/**
     *  Test method for {@link BinaryCalculate#addBinary(String, String)}.
     */
    @Test
    public final void testAddBinary() {
    
    	String binaryResult = new BinaryCalculate().addBinary(currentIP,IP);
    	String expectedResult = "8.5.251.1.10";
    	
    	checkIPType(10);
//    	 checkResult("IP address cannot contain decimal nor hexadecimal representation");
    	 assertEquals(expectedResult, binaryResult);
        
//    	 checkResult("IP address cannot be a single IP address");
    	 
    }

//     protected void tearDown() throws Exception {}
}