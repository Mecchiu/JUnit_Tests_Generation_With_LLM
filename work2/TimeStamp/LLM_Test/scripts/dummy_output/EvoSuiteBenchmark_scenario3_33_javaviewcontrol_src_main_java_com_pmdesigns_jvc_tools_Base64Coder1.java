// Base64CoderTest.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#encode(byte[])} method.
*/
class Base64CoderTest {
		
	@Test
	void testEncode() {
		assertArrayEquals("".toCharArray(), Base64Coder.encode("".getBytes()));
		assertArrayEquals("Zg==".toCharArray(), Base64Coder.encode("f".getBytes()));
		assertArrayEquals("Zm8=".toCharArray(), Base64Coder.encode("fo".getBytes()));
		assertArrayEquals("Zm9v".toCharArray(), Base64Coder.encode("foo".getBytes()));
		assertArrayEquals("Zm9vYg==".toCharArray(), Base64Coder.encode("foob".getBytes()));
		assertArrayEquals("Zm9vYmE=".toCharArray(), Base64Coder.encode("fooba".getBytes()));
		assertArrayEquals("Zm9vYmFy".toCharArray(), Base64Coder.encode("foobar".getBytes()));
		assertArrayEquals("Zm9vYmFyZg==".toCharArray(), Base64Coder.encode("foobarf".getBytes()));
		assertArrayEquals("Zm9vYmFyZm8=".toCharArray(), Base64Coder.encode("foobarfo".getBytes()));
		assertArrayEquals("Zm9vYmFyZm9v".toCharArray(), Base64Coder.encode("foobarfoo".getBytes()));
	}
}