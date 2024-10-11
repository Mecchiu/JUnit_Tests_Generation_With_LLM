// Base64Coder_2Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#encode(byte[], int)} method.
*/
class Base64Coder_2Test {
// Base64Coder.java
package com.pmdesigns.jvc.tools;

public class Base64Coder {

    /**
     * Encodes a byte array into Base64 format.
     * No blanks or line breaks are inserted.
     *
     * @param in an array containing the data bytes to be encoded.
     * @param iLen number of bytes to process in <code>in</code>.
     * @return A character array with the Base64 encoded data.
     */
    public static char[] encode(byte[] in, int iLen) {
        // output length without padding
        int oDataLen = (iLen * 4 + 2) / 3;
        // output length including padding
        int oLen = ((iLen + 2) / 3) * 4;
        char[] out = new char[oLen];
        int ip = 0;
        int op = 0;
        while (ip < iLen) {
            int i0 = in[ip++] & 0xff;
            int i1 = ip < iLen? in[ip++] & 0xff : 0;
            int i2 = ip < iLen? in[ip++] & 0xff : 0;
            int o0 = i0 >>> 2;
            int o1 = ((i0 & 3) << 4) | (i1 >>> 4);
            int o2 = ((i1 & 0xf) << 2) | (i2 >>> 6);
            int o3 = i2 & 0x3F;
            out[op++] = map1[o0];
            out[op++] = map1[o1];
            out[op] = op < oDataLen? map1[o2] : '=';
            op++;
            out[op] = op < oDataLen? map1[o3] : '=';
            op++;
        }
        return out;
    }
}

// Base64Coder_2Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#encode(byte[], int)} method.
*/
class Base64Coder_2Test {
		// The test cases.
		private final Base64Coder[] testCases = {
				new Base64Coder(new String[] { "Zg==", "Zg8=" }, false),
				new Base64Coder(new String[] { "Zg==", "Zg-=" }, true),
				new Base64Coder(new String[] { "Zg==", "Zg8=" }, true),
				new Base64Coder(new String[] { "Zg==", "Zg-=" }, true)};
		// Class under test.
		private Base64Coder testCase;

		/**
		 * Constructs a new test case with the given cases.
		 *
		 * @param cases the cases.
		 * @param ignoreCase If <code>true</code>, the input is expected to conform to the input using case-in-senstive algorithm (ISO 2022 in UTF-8).
		 * @throws NullPointerException thrown if the inputs are null.
		 */
		protected Base64Coder_2Test(Base64Coder... cases) {
			for (int i = 0; i < cases.length; i++) {
				super();
				testCase = cases[i];
			}
			assertNotNull(testCase);
		}
		;

		/**
		* Test method for {@link Base64Coder#encode(byte[], int)}
		* for an unsupported encoding format.
		*/
		@Test(expected = UnsupportedEncodingException.class)
		public void testEncodeUnsupported() {
			byte[] in = new byte[0];
			EncodeCoder encodeC = new EncodeCoder();
			testCase.encode(encodeC, in);
		}

		/**
* Test method for {@link Base64Coder#encode(byte[], int)}
* for a valid encoding format.
*/
		@Test
		public void testEncodeValid() {
			byte[] in = new byte[0];
			EncodeCoder encodeC = new EncodeCoder();
			char[] out = testCase.encode(encodeC, in);
			assertNotNull(out);
			assertTrue(("Zg=" + new String(encodeC.maskOut())).indexOf(out)!= -1);
			assertTrue(("Zg8=" + new String(encodeC.maskOut())).indexOf(out)!= -1);
		}

		/**
		* Test method for {@link Base64Coder#encode(byte[], int)}
		* for a valid encoding format.
		*/
		@Test
		public void testEncodeValidWithPadding() {
			byte[] in = new byte[0];
			EncodeCoder encodeC = new EncodeCoder();
			char[] out = testCase.encode(encodeC, in);
			assertNotNull(out);
			assertArrayEquals( ("Zg=" + new String(encodeC.maskOut())).getBytes()
					, out);
			assertTrue(("Zg=" + new String(out)).indexOf(out)!= -1);
			assertTrue(("Zg8=" + new String(out)).indexOf(out)!= -1);
		}

}
