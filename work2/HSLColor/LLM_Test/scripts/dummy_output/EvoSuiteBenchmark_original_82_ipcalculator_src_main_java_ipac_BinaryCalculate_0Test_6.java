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
     *  tests the IPRangeAdd() method with a valid input of startIP and a valid
     *  prefix size.
     */
        @Test
    public void IPRangeAdd() {
        IPrRange range = new IPRange("8.8.8.8", new BigInteger("4294967295"));
        String number = addBinary("10.10.10.10", "1");
        int noOfIPs = IPCalculate(number, "0");

        BigInteger IP1 = new BigInteger("10.10.10");
        BigInteger IP2 = new BigInteger("10.10.11");

        checkIPType(noOfIPs);

        assertTrue(range.inclusive());
        assertTrue(range.contains(IP1));
        assertTrue(range.contains(IP2));
        assertFalse(range.contains(IP1));
    }

		/**
     *  tests the prefix add method with a valid input of ip and prefix value.
     */
    @Test
    public void prefixInPrefixAdd() {
        IPrRange range = new IPRange("10.10.10.10", new BigInteger("4294967295"));
        String number = addBinary("10.10.10.10", "1");
        int noOfIPs = IPCalculate(number, "0");

        String IP = addBinary("10.10.10.10", "1");

        BigInteger IP1 = new BigInteger("10.10.10");
        BigInteger IP2 = new BigInteger("10.10.10");

        assertEquals(IP, IP1);
        assertEquals(IP, IP2);

        checkIPType(noOfIPs);

        assertEquals(new BigInteger("4294967295"), range.size());
        assertEquals(new BigInteger("4294967295"), range.at(0));
        assertEquals(new BigInteger("4294967295"), range.at(range.size() - 1));
    }

    @Test
    public void addBinaryIPOnlyIPRange() {

        IPrRange range = new IPRange("10.10.10.10", new BigInteger("4294967295"));

    }

}

// end of class BinaryCalculate_0Test.java