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
		private final int DELIMITERC = 0;

    /**
     *  Constructor.
     */
    public BinaryCalculate_2Test() {
    }

	/**
	*  Gets the given argument and checks if a binary representation is
	*  returned.
	*
	*  @param      args    Targets IP address
	*  @return     ip representation of the IP Address
	*/
    public static String getBinaryIP(String args) {
        String ip = null;

        ip = getIPAddress(args);
        //System.out.println(ip);

        if (ip.length() < 8) {
            ip = ip + "0";
        }

        return ip;
    }

    /**
    *  Adds multiple delimiters back into an IP address.
    *
    *  @param      ips   IP Address having multiple delimiter
    *  @param      delimiters  Delimiters to use in addition
    *  @return     IPPaddingIP Address
    */
    private static String getIPPaddingIP(String []ips, String delimiters);

	/**
	*  Converts an IP Address into a hexidecimal format.
	*
	*  @param  ip  IP address to convert to hexidecimal format
	*/
    public static String getHexidecimalIP(String ip);

    /**
    *  Determines whether an IP Address provided in binary form is an IPv4 or
    *  an IPv6 by the length of the binary string.
    *
    *  @param      size1    Length of binary string
    */
    private static void checkIPType(int size1);

	/**
	*  Tries to convert a string representing an IP address into hexidecimal format
	*  for that IP address.
	*
	*  @param  IP  IP address to convert to hexidecimal format
	*  @return  hexidecimal representation of the IP Address
	*
	*/
    private static String convertToHexidecimalIP(String IP);

    /**
     *  Converts an IP Address into an IP version 4/6 formatted IP String
     *  before it is converted to an IPv4 formatted IP String.
     *
     *  @param ip  IP address to be converted to IPv4
     *  @return    IP version 4 formatted IPv4 representation
     *  @throws   NullPointerException  IP was null
     */
    public static String getIPVersion4(String ip);

}