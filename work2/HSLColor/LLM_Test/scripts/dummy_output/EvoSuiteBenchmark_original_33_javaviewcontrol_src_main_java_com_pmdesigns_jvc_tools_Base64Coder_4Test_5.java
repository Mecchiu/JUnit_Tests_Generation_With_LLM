// Base64Coder_4Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#decode(String)} method.
*/
class Base64Coder_4Test {
		String testValue;

		// Method to test if a number of bytes is expected to be decoded,
		// for that number of bytes, with "=". The test data is the input string with the bytes decoded
        @Test
        public  void testEncodingDecodingOfString_1() {

                String input = testValue;

                byte[] decoded = Base64Coder.decode(input);

                // Decoding the string with base64
                String output = Base64Coder.encodeString(input);

                // Compare the decoded data and the expected value
                assertEquals(decoded, output);
        }
		
		/*@Test
    @java.lang.SuppressWarnings("all")
		public  void testEncodingDecodingOfByteArray() {
		  byte[] data;
		  
		  data = new byte[] {0};
		  
		  base64Coder.encode(data, 0, data.length);
		  
		  String output = new String(data);
		  
		  byte[] decoded = Base64Coder.decode(output);
		  
		  String expected = Base64Coder.encodeString(data, 0, data.length);
		  
		  assertEquals(output, expected);

		  
		  base64Coder.encodeString(data, 0, data.length);
		  
		  output = new String(data);
		  
		  assertEquals(output, data);
		}*/

		/*@Test
    @java.lang.SuppressWarnings("all")
		public  void testEncodingDecodingOfSingeByteArray() {
		  byte[] data;
		  
		  byte[] data2 = new byte[] {0};
		  
		  base64Coder.encode(data2, 0, 1);
		  
		  String output = new String(data2);
		  
		  byte[] decoded = Base64Coder.decode(output);
		  
		  String expected = new String(data2);
		  
		  assertEquals(output, expected);
		  }*/

}