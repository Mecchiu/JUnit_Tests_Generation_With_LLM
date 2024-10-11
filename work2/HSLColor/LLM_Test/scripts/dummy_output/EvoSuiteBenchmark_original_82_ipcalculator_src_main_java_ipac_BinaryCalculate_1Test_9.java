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
		/**
		*  Unit test for {@link BinaryCalculate#subBinary(String, String)}.
		*
		*  @throws  Exception  If an unexpected exception is thrown
		*/
	@Test
	public void test() throws Exception {
		calculate(0x0A0A0A0A0A0A0A0A0A0A0A0A0A0A0A0A0, 24, MAXPREFIX - 1, prefixInPrefixCalculate); //ipv4
		calculate("",0,0,prefixInPrefixCalculate); //ipv6

		calculate(0x0123456789ABCDEF, 0, 0, prefixInPrefixCalculate); //ipv4
		calculate("",0,0,prefixInPrefixCalculate); //ipv6

		calculate("1" + IPRangeAddress, 0, 0, null); //IPv4
		calculate("1.2.3.4", 0, IPRangeAddress, null); //IPv6
															 //IPv4
		calculate("1.234.567.89", 0, IPv6, null);   //IPv6
															//IPv4
	}
}