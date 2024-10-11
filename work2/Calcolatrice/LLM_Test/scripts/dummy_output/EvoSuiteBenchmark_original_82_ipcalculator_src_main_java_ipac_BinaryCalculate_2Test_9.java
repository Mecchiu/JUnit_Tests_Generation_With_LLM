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
		  
    @Test
    public void test_IPCalculate_0() {
        BinaryCalculate_1test();
    }

    @Test
    public void test_IPCalculate() {
        // IPv4 Test case
        BinaryCalculate_1test();
        // IPv6 Test case
        BinaryCalculate_2test_ipv6();
        // Empty test case
        BinaryCalculate_2test_emptyCase();
        
    }
    
    /**
     * Tests if the number of ip addresses can be represented in a ip
     * address.
     */
    private void BinaryCalculate_2test() {
        BinaryCalculate_2Test.checkIPType(getBinaryIP(subnet).length());
    }
    
    /**
     * Tests if the number of ip addresses can be represented in a ip
     * address containing a delimiter.
     * @throws NumberFormatException if IP Address does not contain a delimiter
     */
    private void BinaryCalculate_2test_ipv6() {
        // IPv6 Test case
        BinaryCalculate_2Test.checkIPType(subnet.length()-lengthOfToken);
    }

    /**
     * Tests if the number of ip addresses can be extracted from the given binary IP Address
     * with an end delimiter
     * @throws {@link StringException} if IP Address is malformed
     */
    private void BinaryCalculate_2test_emptyCase() throws NumberFormatException {
        // Empty IP Addresses Test Case
        int ipLength = Integer.parseInt(subnet.split("/")[subnet.length()-1]);

        int endIP = addDelimiter(subnet.split("/")[subnet.length()-1], ipLength + lengthOfToken);

        // Empty IP Address with no end delimiter
        BinaryCalculate_2Test.calculate(IPaddressWithoutEndDelimiter(String(IPaddressWithoutEndDelimiter(subnet) + DELIMITER + "1234567" + DELIMITER)),lengthOfToken);

        // Empty IP Address with start delimiter
        BinaryCalculate_2Test.calculate(IPaddressWithoutStartDelimiter(String(IPaddressWithoutStartDelimiter(subnet) + DELIMITER + "1234567" + DELIMITER)),2);

        // IP Address with start delimiter after the beginning
}
}