// Base64Coder_2Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#encode(byte[], int)} method.
*/
class Base64Coder_2Test {
		
	/**
	 * Initialize the unit under test after successful start-up.
	 */
	void initialize();
	
	/**
	 * Test of encode method, of class Base64CoderImpl.
	 * @throws java.io.IOException
	 */
	@Test
	void defaultValue() throws IOException {
		System.out.println("defaultValue");
		String in = "";
		String s = "";
		Base64Coder c = new Base64Coder();
		byte[] out = c.encode(in);
		assertArrayEquals(new byte[0], out);
	}

	/**
	 * Test of encode method, of class Base64CoderImpl.
	 * @throws java.io.IOException
	 */
	@Test
	void value_for_test_1() throws IOException {
		System.out.println("value_for_test_1");
		String in = "";
		String s = "";
		Base64Coder c = new Base64Coder(1);
		byte[] out = c.encode(in);
		assertArrayEquals(new byte[0], out);
	}

	/**
	 * Test of encode method, of class Base64CoderImpl.
	 * @throws java.io.IOException
	 */
	@Test
	void value_for_test_2() throws IOException {
		System.out.println("value_for_test_2");
		String in = "ABC";
		String s = "";
		Base64Coder c = new Base64Coder(2);
		byte[] out = c.encode(in);
		assertArrayEquals(new byte[] {97, 98}, out);
	}

	/**
	 * Test of encode method, of class Base64CoderImpl.
	 * @throws java.io.IOException
	 */
	@Test
	void value_for_test_3() throws IOException {
		System.out.println("value_for_test_3");
		String in = "ABC";
		String s = "";
		Base64Coder c = new Base64Coder(3);
		byte[] out = c.encode(in);
		assertArrayEquals(new byte[] {97, 98}, out);
	}

	/**
	 * Test of encode method, of class Base64CoderImpl.
	 * @throws java.io.IOException
	 */
	@Test
	void value_for_test_4() throws IOException {
		System.out.println("value_for_test_4");
		String in = "\n\n";
		String s = "";
		Base64Coder c = new Base64Coder(4);
		byte[] out = c.encode(in);
		assertArrayEquals(new byte[] {97, 98, 13, 14}, out);
	}

	/**
	 * Test of encode method, of class Base64CoderImpl.
	 * @throws java.io.IOException
	 */
	@Test
	void value_for_test_5() throws IOException {
		System.out.println("value_for_test_5");
		String in = "\r";
		String s = "";
		Base64Coder c = new Base64Coder(5);
		byte[] out = c.encode(in);
		assertArrayEquals(new byte[] {97, 98, 13, 14}, out);
	}

	/**
	 * Test of encode method, of class Base64CoderImpl.
	 * @throws java.io.IOException
	 */
	@Test
	void value_for_test_6() throws IOException {
		System.out.println("value_for_test_6");
		String in = "\r\n";
		String s = "";
		Base64Coder c = new Base64Coder(6);
		byte[] out = c.encode(in);
		assertArrayEquals(new byte[] {97, 98, 13, 14}, out);
	}

}