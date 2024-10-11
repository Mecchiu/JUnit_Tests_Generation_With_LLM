// Base64Coder_3Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#decodeString(String)} method.
*/
class Base64Coder_3Test {
		private final byte[] encoded;
		Base64Coder_3Test(String encoded) {
			try {
					encoded = Base64Coder.decodeString(encoded);
			} catch (IllegalArgumentException
					| NullPointerException ignore) {
				}
			this.encoded = Base64Coder.decode(encoded);
		}

	/**
	 * Test method for {@link com.pmdesigns.jvc.tools.Base64Coder#decodeString(java.lang.String)}
	 * with no encoded data.
	 */
	@Test
	public void testDecodeStringNoEncodedData() {
		assertNotNull(Base64Coder.decodeString(""));
	}

	/**
	 * Test method for {@link com.pmdesigns.jvc.tools.Base64Coder#decode(java.lang.String)}
	 * with an encoded data.
	 */
	@Test
	public void testDecodeStringEncodedData() {
		for (int i = 0, imax = encoded.length; i < imax - 7; i++) {
			assertEquals(encoded[i], Base64Coder.decode(encoded)[i]);
		}
	}

	/**
	 * Test method for {@link com.pmdesigns.jvc.tools.Base64Coder#equals(java.lang.Object)}
	 * with no encoded data.
	 */
	@Test
	public void testEqualsNoEncodedData() {
		assertFalse(Base64Coder.equals(null));
		assertFalse(Base64Coder.equals(""));
	}

	/**
	 * Test method for {@link com.pmdesigns.jvc.tools.Base64Coder#equals(java.lang.Object)}
	 * with an encoded data.
	 */
	@Test
	public void testEqualsEncodedData() {
		final byte[] encoded1 = new byte[] {(byte) 0};
		assertEquals(Base64Coder.decode(this.encoded), Base64Coder.decode(encoded1));
	}
}