// Base64Coder_0Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#encodeString(String)} method.
*/
class Base64Coder_0Test {
		
	static char[] expectedValue = Base64Coder._UTF8.toCharArray();
	
	@Test
	void testEncodeString() {
	
		
		
		String testString = new String(Base64Coder._UTF8.encode("I'm testing encoder"));
		
		String result = Base64Coder.encodeString(testString);
		assertEquals(expectedValue, result);
		result = Base64Coder.encodeString(testString, Base64Coder._UTF8);
		assertEquals(expectedValue, result);
		
		
	}
	
	@Test
	void testDecodeString() {
		
		
		String testString = new String(Base64Coder._UTF8.decode(Base64Coder._UTF8.encode(Base64Coder.encodeString(Base64Coder._UTF8.toCharArray()))));
		
		String expectedString = new String(Base64Coder._UTF8.decode(Base64Coder._UTF8.encode("I'm testing decoder")).toCharArray());
		
		assertEquals(expectedString, testString);
		
		
        
	}
	
	@Test
	void testDecodeArrayOfString() throws IllegalArgumentException {	
		
		String[] testArray = {new String(Base64Coder._UTF8.decode(Base64Coder._UTF8.encode(Base64Coder.encodeString(Base64Coder._UTF8.toCharArray()))))};
		
		String testString = new String();
		testString.getBytes();

		String result = null;
		try {
			result = Base64Coder.decodeArray(testString);
		} catch (IllegalArgumentException ex) {
			fail("Base64Coder._UTF8 does not implement Array");
		}
		assertNotNull(result);
		
		testArray = null;


	}

}