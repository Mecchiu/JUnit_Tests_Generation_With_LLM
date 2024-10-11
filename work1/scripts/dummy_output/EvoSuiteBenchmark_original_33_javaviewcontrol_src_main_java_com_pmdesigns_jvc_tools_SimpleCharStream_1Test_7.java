// SimpleCharStream_1Test.java
/* JavaCCOptions:STATIC=false,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleCharStream}.
* It contains one unit test case for the {@link SimpleCharStream#readChar()} method.
*/
class SimpleCharStream_1Test {
		/**
		* Each character in the char[] buffer is represented internally by the value
		* CharValue returned by the {@link SimpleCharStream#ReadChar()} method.
		*/
	@Test
	public void testreadchar_1() {
		assertEquals(1, new SimpleCharStream().readChar());
	}

	/**
	* Each character in the char[] buffer is represented internally by the value
	* CharValue returned by the {@link SimpleCharStream#ReadChar()} method.
	*/
	@Test
	public void testreadchar_2() {
		char[] data = new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' };
		SimpleCharStream instream = new SimpleCharStream();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		boolean lastRead = false;

		while (instream.readChar()!= -1) {
			if (!lastRead) {
				assertEquals("char read!", data[instream.getBegin()], instream.ReadChar());
				assertEquals("char read!", 'a', data[instream.getBegin()]);
				assertEquals("char read!", 'b', data[instream.getBegin() + 1]);
				assertEquals("char read!", 'c', data[instream.getBegin() + 2]);
				assertEquals("char read!", 'd', data[instream.getBegin() + 3]);
				assertEquals("char read!", 'e', data[instream.getBegin() + 4]);
				assertEquals("char read!", 'f', data[instream.getBegin() + 5]);
				assertEquals("char read!", 'g', data[instream.getBegin() + 6]);
				assertEquals("char read!", 'h', data[instream.getBegin() + 7]);
				lastRead = true;
			}
			instream.readChar();
		}
		assertFalse("last char read!", lastRead);
		SimpleCharStream instream2 = new SimpleCharStream( instream);
		byte[] out = baos.toByteArray();
		assertEquals("byte array read!", data.length, out.length);
		for (int i = 0; i < data.length; i++) {
			assertEquals("char read!", data[i], out[data.length - 1 - i]);
		}
	}
}