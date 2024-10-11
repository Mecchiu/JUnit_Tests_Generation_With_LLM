// Base64Coder_3Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#decodeString(String)} method.
*/
class Base64Coder_3Test {
		
	/**
	 * Method tests the getString() method.
	 * @throws IllegalAccessException if the class of a constructor is not public.
	 */
	@Test
	/**
	 * Test the setString() method.
	 */
	public void setString(){
		Base64Coder base64Coder = new Base64Coder();
		String s = base64Coder.getString();
		assertEquals(".AQIAZ6P8Yt+9pHwQaB3gZT9x9L7RwRn7pY7+aYK/1bRuF3g=", s);
	}

	/**
	 * Get the string value from an array of bytes.
	 * @throws IllegalAccessException if the class of a constructor is not public.
	 */
	@Test
	/**
	 * Test a case where all the bytes do not share a set of bytes.
	 */
	public void notAllSameByteTest(){
		Base64Coder base64Coder = new Base64Coder();
	}

	/**
	 * Test the getString() method.
	 */
	@Test
	public void getString(){
		Base64Coder base64Coder = new Base64Coder();
		String s = base64Coder.getString();
		assertTrue(".QzUHc+6fIgLXFpwA3y+wT7JUq1e+2j3x5+m==",s.equals(".QzUHc+6fIgLXFpwA3y+wT7JUq1e+2j3x5+m=="));
	}

	/**
	 * Convert a byte array into a String.
	 * @throws IllegalAccessException if the class of a constant is not public.
	 */
	@Test
	/**
	 * Test the setString() method.
	 */
	public void setString(){
		Base64Coder base64Coder = new Base64Coder();
		String s = base64Coder.setString( new byte[0]);
		assertTrue(".QzUHc+6fIgLXFpwA3y+wT7JUq1e+2j3x5+8b==",s.equals(".QzUHc+6fIgLXFpwA3y+wT7JUq1e+2j3x5+8b=="));
	}
}