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
         * Test of convert method, of class ipac.binarycalculate.IPCalculate.
         */
        @Test
        public void testIPCalculate_1() {
        String IPAddress1 = "20.40.20.0";
        String IPAddression2 = "1.2.1.2";
        binaryCalculate(IPAddress1, IPAddression2);
        assertEquals("IPAddress2 ", "20.40.20.1", IPAddress1);
        assertEquals("IPAddress2 ", "1.2.1.2", IPAddression2);
        };

        /**
         * Test name, of {@link BinaryCalculate#convert(String)}.
         */
        @Test
        public void testConvert() {
        String IPAddression1 = "20.40.20.0";
        String IPAddress2 = "20.40.20.1";
        binaryCalculate("20.40.20.0", "20.40.20.1").convert(IPAddress2, IPAddression1);
        assertEquals("IPAddress2 ", "20.40.20.1", IPAddress2);
        assertEquals("IPAddress2 ", "20.40.20.1", IPAddression1);
        };
}