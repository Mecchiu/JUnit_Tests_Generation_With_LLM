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
		* Test method for
		* {@link ipac.BinaryCalculate#addBinary(String, String)}
		*/
		@Test
    public void testaddBinary_1(){
            String address1 = "1.2.3.4";
            String address2 = "1.2.3.4";
            String address3 = "1.2.3.4";
            String address4 = "";

            String s1 = "IPv4 addBinary";
            String s2 = "";

            String res = BinaryCalculate.addBinary(address1, "+");
            assertEquals(s1, BinaryCalculate.addBinary(address1, s2));

            s1 = "IPv4 addBinary";
            s2 = "+";

            res = BinaryCalculate.addBinary(address1, "+");
            assertEquals(s1, BinaryCalculate.addBinary(address1, s2));
            //assertEquals(s1+address1, BinaryCalculate.addBinary(address1, s2));

            s1 = "IPv4 addBinary";
            s2 = "IPv4 addBinary ";

            res = BinaryCalculate.addBinary(address1, "+");
            assertEquals(s1, BinaryCalculate.addBinary(address1, s2));
            //assertEquals(s1+address1, BinaryCalculate.addBinary(address1, s2));

            s1 = "IPv4 addBinary";
            s2 = "";

            res = BinaryCalculate.addBinary(address1, "+");
            assertEquals(s1, BinaryCalculate.addBinary(address1, s2));
            //assertEquals(s1+++addBinary(address1, "+"), BinaryCalculate.addBinary(address1, s2));
            // assertEquals("IPv4 + "+addBinary(address1, "+"),"0:0.1.2.3:12345*/255", BinaryCalculate.addBinary(address1, s2));
            //assertEquals("IPv6 + "+addBinary(address1, "+"),"/255.255.255.255:12345*/255", BinaryCalculate.addBinary(address1, s2));
            //assertEquals("IPv6 + "+addBinary(address1, "+"),"/64.0.0.0:12345*/255", BinaryCalculate.addBinary(address1, s2));

}
}