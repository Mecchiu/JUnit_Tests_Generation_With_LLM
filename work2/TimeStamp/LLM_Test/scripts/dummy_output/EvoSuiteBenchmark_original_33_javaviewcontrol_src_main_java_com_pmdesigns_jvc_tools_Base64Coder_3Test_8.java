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
	 * Test of encode method, of class Base64Coder.
	 */
	@Test
    public void testEncodeString1() {
        String msg = "Hello world!";

        byte[] arr = {(byte)0x47, (byte)0x41, (byte)0x3C, (byte)0x9B,
                (byte)0x86, (byte)0x48, (byte)0x1A, (byte)0xC9,
                (byte)0x28, (byte)0x1B, (byte)0x45};
        byte[] decoded = Base64Coder.encodeString(msg);

        assertEquals("", Base64Coder.decodeString(msg));
		assertArrayEquals(arr, decoded);
    }
		
	/**
	 * Test of encode method, of class Base64Coder.
	 */
	@Test
    public void testEncodeString2() {
        String msg = "";

        byte[] decoded = Base64Coder.encodeString(msg);

        assertArrayEquals(encoded, decoded);
		
	}
		
	/**
	 * Test of decode method, of class Base64Coder.
	 */
	@Test
    public void testDecodeString() {
        String msg = "Hello world!";

        byte[] decoded = Base64Coder.decodeString(msg);

        assertArrayEquals(new byte[]{(byte)0x47, (byte)0x41, (byte)0x3C, (byte)0x9B,
                (byte)0x86, (byte)0x48, (byte)0x1A, (byte)0xC9,
                (byte)0x28, (byte)0x1B, (byte)0x45}, decoded);
		
	}
}