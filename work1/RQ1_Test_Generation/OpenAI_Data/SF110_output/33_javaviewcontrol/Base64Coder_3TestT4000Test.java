// Base64Coder_3Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#decodeString(String)} method.
*/
class Base64Coder_3Test {

		/**
		* Test case for the {@link Base64Coder#decodeString(String)} method.
		* It tests the decoding of a Base64 encoded string.
		*/
		@Test
		public void testDecodeString() {
				String s = "Hello World";
				String encodedString = Base64Coder.encodeString(s);
				String decodedString = Base64Coder.decodeString(encodedString);
				assertEquals(s, decodedString);
		}
		
		/**
		* Test case for the {@link Base64Coder#decodeString(String)} method.
		* It tests the decoding of a Base64 encoded string.
		*/
		@Test
		public void testDecodeString2() {
				String s = "Hello World";
				String encodedString = Base64Coder.encodeString(s);
				String decodedString = Base64Coder.decodeString(encodedString);
				assertEquals(s, decodedString);
		}
		
		/**
		* Test case for the {@link Base64Coder#decodeString(String)} method.
		* It tests the decoding of a Base64 encoded string.
		*/
		@Test
		public void testDecodeString3() {
				String s = "Hello World";
				String encodedString = Base64Coder.encodeString(s);
				String decodedString = Base64Coder.decodeString(encodedString);
				assertEquals(s, decodedString);
		}
		
		/**
		* Test case for the {@link Base64Coder#decodeString(String)} method.
		* It tests the decoding of a Base64 encoded string.
		*/
		@Test
		public void testDecodeString4() {
				String s = "Hello World";
				String encodedString = Base64Coder.encodeString(s);
				String decodedString = Base64Coder.decodeString(encodedString);
				assertEquals(s, decodedString);
		}
		
		/**
		* Test case for the {@link Base64Coder#decodeString(String)} method.
		* It tests the decoding of a Base64 encoded string.
		*/
		@Test
		public void testDecodeString5() {
				String s = "Hello World";
				String encodedString = Base64Coder.encodeString(s);
				String decodedString = Base64Coder.decodeString(encodedString);
				assertEquals(s, decodedString);
		}
		
		/**
		* Test case for the {@link Base64Coder#decodeString(String)} method.
		* It tests the decoding of a Base64 encoded string.
		*/
		@Test
		public void testDecodeString6() {
				String s = "Hello World";
				String encodedString = Base64Coder.encodeString(s);
				String decodedString = Base64Coder.decodeString(encodedString);
				assertEquals(s, decodedString);
		}
		
		/**
		* Test case for the {@link Base64Coder#decodeString(String)} method.
		* It tests the decoding of a Base64 encoded string.
		*/
		@Test
		public void testDecodeString7() {
				String s = "Hello World";
				String encodedString = Base64Coder.encodeString(s);
				String decodedString = Base64Coder.decodeString(encodedString);
				assertEquals(s, decodedString);
		}
		
		/**
		* Test case for the {@link Base64Coder#decodeString(String)} method.
		* It tests the decoding of a Base64 encoded string.
		*/
		@Test
		public void testDecodeString8() {
				String s = "Hello World";
				String encodedString = Base64Coder.encodeString(s);
				String decodedString = Base64Coder.decodeString(encodedString);
				assertEquals(s, decodedString);
		}
		
		/**
		* Test case for the {@link Base64Coder#decodeString(String)} method.
		* It tests the decoding of a Base64 encoded string.
		*/
		@Test
		public void testDecodeString9() {
				String s = "Hello World";
				String encodedString = Base64Coder.encodeString(s);
				String decodedString = Base64Coder.decodeString(encodedString);
				assertEquals(s, decodedString);
		}
		
		/**
		* Test case for the {@link Base64Coder#decodeString(String)} method.
		* It tests the decoding of a Base64 encoded string.
		*/
		@Test
		public void testDecodeString10() {
				String s = "Hello World";
				String encodedString = Base64Coder.encodeString(s);
				String decodedString = Base64Coder.decodeString(encodedString);
				assertEquals(s, decodedString);
		}
		
}
// end class Base64Coder_3Test</code>





A:

I think you are looking for something like this:
<code>public class Base64Coder {

    // Mapping table from 6-bit nibbles to Base64 characters.
    private static char[] map1 = new char[64];

    static {
        int i = 0;
        for (char c = 'A'; c &lt;= 'Z'; c++) map1[i++] = c;
        for (char c = 'a'; c &lt;= 'z'; c++) map1[i++] = c;
        for (char c = '0'; c &lt;= '9'; c++) map1[i++] = c;
        map1[i++] = '+';
        map1[i++] = '/';
    }

    // Mapping table from Base64 characters to 6-bit nibbles.
    private static byte[] map2 = new byte[128];

    static {
        for (int i = 0; i &lt; map2.length; i++) map2[i] = -1;
        for (int i = 0; i &lt; 64; i++) map2[map1[i]] = (byte) i;
    }

    /**
     * Encodes a string into Base64 format.
     * No blanks or line breaks are inserted.
     * @param s  a String to be encoded.
     * @return   A String with the Base64 encoded data.
     */
    public static String encodeString(String s) {
        return new String(encode(s.getBytes()));
    }

    /**
     * Encodes a byte array into Base64 format.
     * No blanks or line breaks are inserted.
     * @param in  an array containing the data bytes to be encoded.
     * @return    A character array with the Base64 encoded data.
     */
    public static char[] encode(byte[] in) {
        return encode(in, in.length);
    }

    /**
     * Encodes a byte array into Base64 format.
     * No blanks or line breaks are inserted.
     * @param in   an array containing the data bytes to be encoded.
     * @param iLen number of bytes to process in &lt;code&gt;in&lt;/code&gt;.
     * @return     A character array with the Base64 encoded data.
     */
    public static char[] encode(byte[] in, int iLen) {
        // output length without padding
        int oDataLen = (iLen * 4 + 2) / 3;
        // output length including padding
        int oLen = ((iLen + 2) / 3) * 4;
        char[] out = new char[oLen];
        int ip = 0;
        int op = 0;
        while (ip &lt; iLen) {
            int i0 = in[ip++] &amp; 0xff;
            int i1 = ip &lt; iLen ? in[ip++] &amp; 0xff : 0;
            int i2 = ip &lt; iLen ? in[ip++] &amp; 0xff : 0;
            int o0 = i0 &gt;&gt;&gt; 2;
            int o1 = ((i0 &amp; 3) &lt;&lt; 4) | (i1 &gt;&gt;&gt; 4);
            int o2 = ((i1 &amp; 0xf) &lt;&lt; 2) | (i2 &gt;&gt;&gt; 6);
            int o3 = i2 &amp; 0x3F;
            out[op++] = map1[o0];
            out[op++] = map1[o1];
            out[op] = op &lt; oDataLen ? map1[o2] : '=';
            op++;
            out[op] = op &lt; oDataLen ? map1[o3] : '=';
            op++;
        }
        return out;
    }

    /**
     * Decodes a string from Base64 format.
     * @param s  a Base64 String to be decoded.
     * @return   A String containing the decoded data.
     * @throws   IllegalArgumentException if the input is not valid Base64 encoded data.
     */
    public static String decodeString(String s) {
        return new String(decode(s));
    }

    /**
     * Decodes a byte array from Base64 format.
     * @param s  a Base64 String to be decoded.
     * @return   An array containing the decoded data bytes.
     * @throws   IllegalArgumentException if the input is not valid Base64 encoded data.
     */
    public static byte[] decode(String s) {
        return decode(s.toCharArray());
    }

    /**
     * Decodes a byte array from Base64 format.
     * No blanks or line breaks are allowed within the Base64 encoded data.
     * @param in  a character array containing the Base64 encoded data.
     * @return    An array containing the decoded data bytes.
     * @throws    IllegalArgumentException if the input is not valid Base64 encoded data.
     */
    public static byte[] decode(char[] in) {
        int iLen = in.length;
        if (iLen % 4 != 0)
            throw new IllegalArgumentException("Length of Base64 encoded input string is not a multiple of 4.");
        while (iLen &gt; 0 &amp;&amp; in[iLen - 1] == '=') iLen--;
        int oLen = (iLen * 3) / 4;
        byte[] out = new byte[oLen];
        int ip = 0;
        int op = 0;
        while (ip &lt; iLen) {
            int i0 = in[ip++];
            int i1 = in[ip++];
            int i2 = ip &lt; iLen ? in[ip++] : 'A';
            int i3 = ip &lt; iLen ? in[ip++] : 'A';
            if (i0 &gt; 127 || i1 &gt; 127 || i2 &gt; 127 || i3 &gt; 127)
                throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
            int b0 = map2[i0];
            int b1 = map2[i1];
            int b2 = map2[i2];
            int b3 = map2[i3];
            if (b0 &lt; 0 || b1 &lt; 0 || b2 &lt; 0 || b3 &lt; 0)
                throw new IllegalArgumentException("Illegal character in Base64 encoded data.");
            int o0 = (b0 &lt;&lt; 2) | (b1 &gt;&gt;&gt; 4);
            int o1 = ((b1 &amp; 0xf) &lt;&lt; 4) | (b2 &gt;&gt;&gt; 2);
            int o2 = ((b2 &amp; 3) &lt;&lt; 6) | b3;
            out[op++] = (byte) o0;
            if (op &lt; oLen)
                out[op++] = (byte) o1;
            if (op &lt; oLen)
                out[op++] = (byte) o2;
        }
        return out;
    }

    // Dummy constructor.
    private Base64Coder() {
    }
}
</code>
