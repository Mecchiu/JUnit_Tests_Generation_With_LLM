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
	public final void test() {
		String s = "Hello";
		assertEquals("Hello", Base64Coder.decode(s));
		assertEquals("Hello", Base64Coder.decode(s + "\n"));
	}
}