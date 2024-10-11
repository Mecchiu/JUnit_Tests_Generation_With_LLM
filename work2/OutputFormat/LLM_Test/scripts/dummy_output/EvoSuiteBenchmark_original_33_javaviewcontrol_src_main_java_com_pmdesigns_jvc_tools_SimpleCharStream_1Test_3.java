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
		String str0;
	/**
	* Test 1.  Read character from stream.
	*/
	@Test
	void readChar1() throws java.io.IOException {
	SimpleCharStream st0 = new SimpleCharStream(null);

	char buf0 = 0;

	while (st0.ready()) {
		buf0 = st0.readChar();

		fail ("Failure! Unexpected character in stream.");
	}

	assertEquals("Unexpected character in stream.", buf0, 'B');
	}

	/**
	* Test 2.  Read character with new line from input stream.
	*/
	@Test
	void readChar2() throws java.io.IOException {
	SimpleCharStream st0 = new SimpleCharStream(null);

	String str0 = "";

	char buf0 = '\n';

	while (st0.ready()) {
		int read_ch = st0.read();

		assertEquals("Unexpected character in stream.", read_ch, buf0);

		buf0 = st0.readChar();

		fail ("Failure! Unexpected character in stream.");
	}

	assertEquals("Unexpected character in stream.", buf0, '\n');
	}

	/**
	 * Test 3.  Read character with new line from input stream.
	 */
	@Test
	void readChar2() throws java.io.IOException {
	SimpleCharStream st0 = new SimpleCharStream(null);

	String str0 = "\n";

	char buf0 = '\\';

	while (st0.ready()) {
		int read_ch = st0.read();

		assertEquals("Unexpected character in stream.", read_ch, buf0);

		buf0 = st0.readChar();

		fail ("Failure! Unexpected character in stream.");
	}

	assertEquals("Unexpected character in stream.", buf0, '\\');
	}

	/**
	* Test 4.  Read line from input stream.
	*/
	@Test
	void readLine1() throws java.io.IOException {
	SimpleCharStream st0 = new SimpleCharStream(null);

	String str0 = "\r";

	char buf0 = '\n';

	while (st0.ready()) {
		int read_ch = st0.read();

		assertEquals("Unexpected character in stream.", read_ch, buf0);

		buf0 = st0.readChar();

		fail ("Failure! Unexpected character in stream.");
	}

}
}