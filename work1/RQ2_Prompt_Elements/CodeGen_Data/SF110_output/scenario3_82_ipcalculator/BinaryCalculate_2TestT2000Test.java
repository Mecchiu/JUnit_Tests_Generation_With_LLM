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
/**
		* Sets Up the class before each test.
		*/
	@Test
	void setUp() {
	}

	/**
	* Tests the class method{@link BinaryCalculate#PCalculate(String, String)} for the
	* default IP parameters and other given values.
	*/
	@Test
    public void testCALCULATE_defaultIP() {
        assertEquals(new BigInteger("0"), BinaryCalculate.IPCalculate("0", null).byteValue());
         assertEquals(new Integer(0), BinaryCalculate.IPCalculate("0", "0"));
     }
    
     /**
     * Tests the class method{@link BinaryCalculate#PCalculate(String, String)} for IP range values.
     */
    @Test
    public void testCALCULATE_IPRange() {
        assertEquals(new BigInteger("0"), BinaryCalculate.IPCalculate("1", "1"));
         assertEquals(new Integer(1), BinaryCalculate.IPCalculate("1", "1"));
        assertEquals(new BigInteger("2"), BinaryCalculate.IPCalculate("2", "2"));
         assertEquals(new Integer(2), BinaryCalculate.IPCalculate("2", "2"));
        assertEquals(new BigInteger("32"), BinaryCalculate.IPCalculate("32", "4"));
         assertEquals(new Integer(32), BinaryCalculate.IPCalculate("32", "4"));
        assertEquals(new BigInteger("64"), BinaryCalculate.IPCalculate("64", "8"));
         assertEquals(new Integer(64), BinaryCalculate.IPCalculate("64", "8"));
    }

	/**
	* Tests the class method{@link BinaryCalculate#PCalculate(String, String)} for IP-range and IP-prefix values.
	*/
    @Test
    public void testCALCULATE_IPRangeAndIPPrefix() {
        String range = "32";
        String prefix = "4";

        assertEquals(new BigInteger("0"), BinaryCalculate.IPCalculate(range, prefix));
         assertEquals(new Integer(0), BinaryCalculate.IPCalculate(range, prefix));
        assertEquals(new BigInteger("0"), BinaryCalculate.IPPrefixCalculate(range, prefix));
         assertEquals(new Integer(0), BinaryCalculate.IPPrefixCalculate(range, prefix));
      assertEquals(new BigInteger("0"), BinaryCalculate.IPCalculate(range, null));
         assertEquals(new Integer(0), BinaryCalculate.IPCalculate(range, null));
      assertEquals(new BigInteger("0"), BinaryCalculate.IPCalculate(null, prefix));
         assertEquals(new Integer(0), BinaryCalculate.IPCalculate(null, prefix));
      }
}
