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
		
	final java.io.RandomAccessFile raf;
	
	final int[] testdata = { 0x1, 0x2, 0x3, 0x4, 0x5,0x6, 0x7, 0x8 };

	public SimpleCharStream_1Test() {
		this.raf = null;
	}

	@Test
	public void testReadChar() {
		/*
		 * In this test we will need 4 random characters and a few values.
		 * We will then check if two consecutive values are equal and at the end
		 * at least one of those values is a valid one.
		 */
		String tmp = "";

}
}