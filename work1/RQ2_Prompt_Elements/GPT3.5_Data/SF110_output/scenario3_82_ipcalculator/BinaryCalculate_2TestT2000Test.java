// Here's an example implementation of the BinaryCalculate class and its test class:

// BinaryCalculate.java
package ipac;

import java.math.BigInteger;

public class BinaryCalculate {

    /**
     * Calculates the IP Range from the provided IP address and number of IP
     * addresses. The results are stored into a string to be returned to the
     * method that called it.
     *
     * @param IP        The starting IP address (subnet) in binary
     * @param IPPrefix  Number of IP addresses in binary
     * @return Results string
     */
    public String IPCalculate(String IP, String IPPrefix) {
        BigInteger ip = new BigInteger(IP, 2);
        BigInteger prefix = new BigInteger(IPPrefix, 2);

        BigInteger mask = BigInteger.ONE.shiftLeft(32).subtract(BigInteger.ONE).shiftRight(prefix.intValue());

        BigInteger startIP = ip.and(mask);
        BigInteger endIP = startIP.add(BigInteger.ONE.shiftLeft(32 - prefix.intValue())).subtract(BigInteger.ONE);

        return "Start IP: " + startIP.toString(2) + "\nEnd IP: " + endIP.toString(2);
    }
}

// BinaryCalculateTest.java
package ipac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinaryCalculateTest {

    @Test
    void testIPCalculate() {
        BinaryCalculate binaryCalculate = new BinaryCalculate();

        String IP = "11000000101010000000000100000000";
        String IPPrefix = "11111111111111111111111100000000";

        String expected = "Start IP: 11000000101010000000000100000000\nEnd IP: 11000000101010000000000111111111";
        String actual = binaryCalculate.IPCalculate(IP, IPPrefix);

        assertEquals(expected, actual);
    }
}