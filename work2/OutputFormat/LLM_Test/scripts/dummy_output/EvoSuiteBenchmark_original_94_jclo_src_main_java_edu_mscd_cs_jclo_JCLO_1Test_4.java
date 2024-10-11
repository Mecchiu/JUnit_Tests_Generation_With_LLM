// JCLO_1Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains one unit test case for the {@link JCLO#usage()} method.
*/
class JCLO_1Test {
		
	/**
	* 	Construct a JCLO_1Test.
	*/
	public JCLO_1Test() { }
	
	/**
	* 	A unit method that performs a single parsed option or a parsing method
	* 				that gets the array from a String.
	* 
	* 	@param	key		the key of the string
	* 	@param	val		a string with the value
	*/
	public void singleOneArg(String key, String val) { }
	
	/**
	* 	A unit method that performs a parse of command line and a parsing method
	* 				that gets the array from a String.
	* 
	* 	@param	key		the key of the string
	* 	@param	val		a string with the value
	* 	@param	type	the class of the string
	* 	@return		an array with the value
	*/
	public Object parseOneArg(String key, String val, Class type) {
		return parseStringOneArg(val, type);
	}

	/**
	* 	An auxiliary method that performs parsing of the method and
	* 				adding an alias for it.
	* 
	* 	@param	key		the key of the parsing method
	* @param	val		a string with the value
	* 	@param	type	the class of the string
	* 	@return		The alias for this string
	*/
	public String getFrom(String key, String val) { return key; }

}