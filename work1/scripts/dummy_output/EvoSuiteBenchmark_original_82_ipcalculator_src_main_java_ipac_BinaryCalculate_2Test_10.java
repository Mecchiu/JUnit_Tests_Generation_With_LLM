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
		*  Default constructor.
		*/
	public BinaryCalculate_2Test(){}

		/**
		*  Converts IP address to dotted-decimal format and checks.
		*
		*  @param  IP  IP address to be converted
		*/
	public void checkIPType(String IP){
		System.out.println(IP);
		convertToBinary(IP);
		assertTrue(IP.length() > 0);
		assertTrue(IP.compareTo(IP.substring(0,IP.length()-2))==0);
		System.out.println("-----------------------");
		convert(IP);
		assertTrue(IP.length() > 0);
		assertTrue(IP.compareTo(IP.substring(0,IP.length()-2))==0);
	}

}