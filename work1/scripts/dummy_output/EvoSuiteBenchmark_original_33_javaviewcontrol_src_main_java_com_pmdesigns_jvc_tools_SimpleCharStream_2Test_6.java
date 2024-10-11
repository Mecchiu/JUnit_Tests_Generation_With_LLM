// SimpleCharStream_2Test.java
/* JavaCCOptions:STATIC=false,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleCharStream}.
* It contains one unit test case for the {@link SimpleCharStream#GetImage()} method.
*/
class SimpleCharStream_2Test {
		
	/**
	 * Method for adjusting the line and column numbers for tokens
	 * of the current parser and then reading the characters into the
	 * char[] variable.
	 */
	@Test
	public void testCurrentToken() {
		if (SimpleCharStream.line == 1 && SimpleCharStream.column == 0) {
			throw new java.io.UnsupportedOperationException();
		}
		
		assertTrue(">");
	}

	/**
	 * Method to adjust the line and column numbers for tokens
	 * of the current parser and then reading the characters into the
	 * char[] variable.
	 */
	@Test
	public void testUnget() {
		if (SimpleCharStream.line == 1 && SimpleCharStream.column == 0) {
			throw new java.io.UnsupportedOperationException();
		}
		
		char c = '>';
		assertEquals('>', SimpleCharStream.inputStream.read());
		
		assertEquals(1, SimpleCharStream.charArrayRef.length);
		System.arraycopy(SimpleCharStream.charArrayRef, 0, SimpleCharStream.charArray, 1, 1);
		SimpleCharStream.inputStream.unget(c);
	}
}