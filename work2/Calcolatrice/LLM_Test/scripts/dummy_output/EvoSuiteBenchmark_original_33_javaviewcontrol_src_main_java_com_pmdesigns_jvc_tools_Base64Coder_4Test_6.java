// Base64Coder_4Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#decode(String)} method.
*/
class Base64Coder_4Test {
		
		@Test
		void testDecodeString() {
			// Invalid data.
			String invalid = null;
			assertThrows(IllegalArgumentException.class, () -> decode(invalid));
			
			// Base64 string.
			String base64 = "lorem ipsum";
			assertThrows(IllegalArgumentException.class, () -> decode(base64));
			
			// Base64 data.
			String base64data = encode(base64.getBytes());
			assertThat(base64data).isEqualTo(base64);
			
			// Base64 encoded data.
			byte[] base64EncodedData = encode(base64data.getBytes());
			assertThat(base64EncodedData).isNotNull();
			assertTrue(base64EncodedData.length == base64data.getBytes().length / 4);
			
		}
	}