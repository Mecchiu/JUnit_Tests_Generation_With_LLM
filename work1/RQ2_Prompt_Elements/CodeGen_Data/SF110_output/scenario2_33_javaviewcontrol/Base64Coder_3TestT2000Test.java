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
     * Unit test case for {@link Base64Coder#decodeString(String)}.
     *
     * @throws Exception if test fails.
     */
	@Test
	public void testDecodeString() throws Exception {
        assertEquals("1123456789", Base64Coder.decodeString("1123456789"));
        assertEquals("1234567890", Base64Coder.decodeString("1234567890"));
		assertEquals("abcd", Base64Coder.decodeString("abc"));

        assertEquals("1", Base64Coder.decodeString("1"));
        assertEquals("10", Base64Coder.decodeString("10"));
        assertEquals("abcd", Base64Coder.decodeString("abcd"));
        assertEquals("123456789", Base64Coder.decodeString("123456789"));
        assertEquals("abcde", Base64Coder.decodeString("abcde"));
        assertEquals("ab4567", Base64Coder.decodeString("ab4567"));
        assertEquals("123", Base64Coder.decodeString("123"));
		
		try{	Base64Coder.decodeString(new char[0]);
		} catch(Exception e){fail("char[] must have 0 width");}
		
		//assertEquals('@\'', Base64Coder.decodeString('@'));
		assertEquals("b", Base64Coder.decodeString("b"));
		
        base64Coder_test(this.getClass().getSimpleName(), "test");
    }
    
    private static void base64Coder_test(String testName, String testCase) {
    	try{
    		assertEquals(testCase.replace("\"", ""), Base64Coder.decodeString(testName.replace("\"", "")));
    	} 
    	catch(Exception e){
    		fail(".decodeString(\""+EscapeUtils.escapeHtml(testName)+"\") failed in "+testCase+")");
    	}
    }

} // Class Base64Coder_3Test 
/// <reference file="Base64Coder.java"/>
