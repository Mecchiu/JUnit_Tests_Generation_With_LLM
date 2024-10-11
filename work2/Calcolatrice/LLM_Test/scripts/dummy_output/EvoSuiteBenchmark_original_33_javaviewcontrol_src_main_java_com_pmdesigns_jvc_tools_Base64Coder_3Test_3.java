// Base64Coder_3Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#decodeString(String)} method.
*/
class Base64Coder_3Test {
		
    @Test
    public void testDecodeString() {
	assertEquals("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", 
	    decodeString("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+"));
    }

    @Test
    public void testDecodeNoDashes() {
	assertEquals("ABCDEFG", 
	    decodeString("ABCDEFG"));
    }

    @Test
    public void testDecodeNoSections() {
	assertEquals("VHKYWX", 
	    decodeString("VHKYWX"));
    }

    @Test
    public void testDecodeLineSections() {
	assertEquals("VHKYWX", 
	    decodeString("VHKYWX\n"));
    }

    // Test the {@link Base64Coder#decode(char[])} method of {@link Base64Coder},
	// it is a dummy method test case.
	@Test
	public void testDecodeStringNoSectionsLine() {
		assertTrue(decode("VHKYWX")==null);
    }

    // Test the {@link Base64Coder#decode(byte[])} method of {@link Base64Coder},
	// it is a dummy method test case.
	@Test
	public void testDecodeStringNoSectionsNoLine() {
		assertTrue(decode("VHKYWX")==null);
    }

    // Test the {@link Base64Coder#isBase64(char[])} method of {@link Base64Coder},
	// it is a dummy method test case.
	@Test
	public void testIsBase64NoSectionsLine() {
		assertFalse(isBase64("VHKYWX"));
    }

    // Test the {@link Base64Coder#isBase64(byte[])} method of {@link Base64Coder},
	// it is a dummy method test case.
	@Test
	public void testIsBase64NoSectionsNoLine() {
		assertFalse(isBase64("VHKYWX"));
    }

    // Test the {@link Base64Coder#encode(byte[])} method of {@link Base64Coder},
	// it is a dummy method test case.
	@Test
	public void testEncodeByteArrayNoSections() {
		assertNull(encode("VHKYWX"));
    }

    // Test the {@link Base64Coder#encode(char[])} method of {@link Base64Coder},
	// it is a dummy method test case.
	@Test
	public void testEncodeCharArray() {
		assertNull(encode("VHKYWX\n"));
    }

    // Test the {@link Base64Coder#encode(byte[][])} method of {@link Base64Coder},
	// it is a dummy method test case.
	@Test
	public void testEncodeByteArrayNoSectionsNoLine() {
		assertNull(encode("VHKYWX\n"));
    }

    // Test the {@link Base64Coder#encode(char[][))} method of {@link Base64Coder},
	// it is a dummy method test case.
	@Test
	public void testEncodeCharArrayNoSectionsNoLine() {
		assertNull(encode("VHKYWX\n"));
    }

    // Test the {@link Base64Coder#decode(char[])} method of {@link Base64Coder},
	// it is a dummy method test case.
	@Test
	public void testDecodeCharArrayLineSections() {
		assertEquals(0,
		    decode("VHKYWX\n"));
	}

	// Test the {@link Base64Coder#decode(byte[][))} method of {@link Base64Coder},
	// it is a dummy method test case.
	@Test
	public void testDecodeByteArrayLineSections() {
		assertEquals(0,
		    decode("VHKYWX\n"));
	}

	// Test the {@link Base64Coder#decode(char[][))} method of {@link Base64Coder},
	// it is a dummy method test case.
	@Test
	public void testDecodeCharArrayLineSectionsNoLine() {
		assertEquals(0,
		    decode("VHKYWX\n"));
    }

	// Test the {@link Base64Coder#decode(ByteArrayInputStream)}} method of 
    // {@link Base64Coder},
	// it is a dummy method test case.
	@Test
	public void testDecodeByteArrayStream() {
	}
}