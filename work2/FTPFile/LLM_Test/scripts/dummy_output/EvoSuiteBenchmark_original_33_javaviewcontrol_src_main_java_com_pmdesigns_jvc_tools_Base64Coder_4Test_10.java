// Base64Coder_4Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#decode(String)} method.
*/
class Base64Coder_4Test {
		 private static final String testString = "World, OJO!";
		 static final char[] testData = testString.toCharArray();
	
	@Test
	public void testDecodeByteArray(){
		String decoded = Base64Coder.decode(testData);
		assertEquals(decoded, testData);		
	}
		private String testString = "Hello World, OJO";
		private char[] testData = testString.toCharArray();


}