// Base64Coder_2Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#encode(byte[], int)} method.
*/
class Base64Coder_2Test {
		
	@Test
	void encodings() throws Exception {
		String s = "ABC";
		assertEquals("ABC", encodeString(s));
		assertEquals("ABC", encode(s.getBytes()));
		String s1 = "ABC\000";
		assertEquals("ABC", encodeString(s1));
		assertEquals("ABC", encode(s1.getBytes()));
		String s2 = "ABCabc abcbc abcd abc";
		assertEquals("ABCabc abcbc abcd abc", encodeString(s2));
		assertEquals("ABCabc abcbc abcd abc", encode(s2.getBytes()));
		String s3 = "ABCabc abcbc abc";
		assertEquals("ABCabc abcbc abcbc",  encodeString(s2, s3));
		assertEquals("ABCabc abcbc abcbc",  encode(s2, s3));
		String s4 = "ABCabc abcbc abc";
		assertEquals("ABCabc abcbc abcbc",  encode(s2,s4));
		assertEquals("ABCabc abcbc abcbc",  encode(s4, s2));
			
// 		String s3 = "ABCabc abcbc abc";
// 		byte[] bs = encodeStringToBytes(s3);
// 		char[] cs = encodeStringToChars(s3);
// 		byte[] bytes4 = null;
// 		// This would not compile
// 		byte[] bytes7 = new byte[4];
// 		// But if the constructor was called, or the chars or the bytes were non-null, the code will take this path
// 		bytes4 = encode(bs, cs, bytes7);
// 		// We get a RuntimeException here, so we're really asserting
// 		assertEquals(cs, null);
	}
    
     @Test
	void encodeChars() throws Exception {
		String s = "ABCab";
		assertEquals("DGVzd1UZXJtZXIw", encodeString(s));
		assertEquals("DGVzd1UZXJtZXIw", encode(s.getBytes()));
		String s1 = "ABCab\000";
		assertEquals("DGVzd1UZXJtZXIw", encodeString(s1));
		assertEquals("DGVzd1UZXJtZXIw", encode(s1.getBytes()));
		String s2 = "ABCababc abcbc abc";
		assertEquals("DGVzd1UZXJtZXIw", encodeString(s2));
		assertEquals("DGVzd1UZXJtZXIw", encode(s2.getBytes()));
		String s3 = "ABCababc abcbc abc";
		assertEquals("DGVzd1UZXJtZXIw", encodeString(s3));
		assertEquals("DGVzd1UZXJtZXIw", encode(s3.getBytes()));
		String s4 = "ABCababc abcbc abc";
		assertEquals("DGVzd1UZXJtZXIw", encodeString(s4));
		assertEquals("DGVzd1UZXJtZXIw", encode(s4.getBytes()));
		String s5 = "ABCababc abcbc abc";
		assertEquals("DGVzd1UZXJtZXIw", encodeString(s2));
		assertEquals("DGVzd1UZXJtZXIw", encode(s5.getBytes()));	

	}
}