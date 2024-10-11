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
	*  Test adding several binary numbers
	*
	*  @throws NumberFormatException
	*  @throws IndexOutOfBoundsException if binary number exceeds
	*                       range of a max prefix
	*/
	@Test
	public void addBinary() throws NumberFormatException, IndexOutOfBoundsException{
		String result = IPCalculate_0.addBinary(IPrangeAddress, currentIP, MAXPREFIX);
		checkIPType(result.length());
		assertEquals(currentIP, result);
		
		String res1 = IPCalculate.getBinaryIP(IPrangeAddress);
		currentIP = IPCalculate.IPcalculate(IPrangeAddress, MAXPREFIX);
		fullReassembler = IPCalculate.IPcalculate(IPrangeAddress, currentIP);
		assertEquals(currentIP, fullReassembler);
	}
	
}