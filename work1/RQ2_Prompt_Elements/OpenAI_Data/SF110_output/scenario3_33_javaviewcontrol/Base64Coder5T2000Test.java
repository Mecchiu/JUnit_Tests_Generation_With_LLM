// Base64CoderTest.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#decode(char[])} method.
*/
class Base64CoderTest {

	@Test
	void testDecode() {
		// Test 1
		char[] in = "".toCharArray();
		byte[] expected = new byte[0];
		byte[] actual = Base64Coder.decode(in);
		assertArrayEquals(expected, actual);
		
		// Test 2
		in = "a".toCharArray();
		expected = new byte[] {0};
		actual = Base64Coder.decode(in);
		assertArrayEquals(expected, actual);
		
		// Test 3
		in = "ab".toCharArray();
		expected = new byte[] {0, 0};
		actual = Base64Coder.decode(in);
		assertArrayEquals(expected, actual);
		
		// Test 4
		in = "abc".toCharArray();
		expected = new byte[] {0, 0, 0};
		actual = Base64Coder.decode(in);
		assertArrayEquals(expected, actual);
		
		// Test 5
		in = "abcd".toCharArray();
		expected = new byte[] {0, 0, 0, 0};
		actual = Base64Coder.decode(in);
		assertArrayEquals(expected, actual);
		
		// Test 6
		in = "abcde".toCharArray();
		expected = new byte[] {0, 0, 0, 0, 0};
		actual = Base64Coder.decode(in);
		assertArrayEquals(expected, actual);
		
		// Test 7
		in = "abcdef".toCharArray();
		expected = new byte[] {0, 0, 0, 0, 0, 0};
		actual = Base64Coder.decode(in);
		assertArrayEquals(expected, actual);
		
		// Test 8
		in = "abcdefg".toCharArray();
		expected = new byte[] {0, 0, 0, 0, 0, 0, 0};
		actual = Base64Coder.decode(in);
		assertArrayEquals(expected, actual);
		
		// Test 9
		in = "abcdefgh".toCharArray();
		expected = new byte[] {0, 0, 0, 0, 0, 0, 0, 0};
		actual = Base64Coder.decode(in);
		assertArrayEquals(expected, actual);
		
		// Test 10
		in = "abcdefghi".toCharArray();
		expected = new byte[] {0, 0, 0, 0, 0, 0, 0, 0, 0};
		actual = Base64Coder.decode(in);
		assertArrayEquals(expected, actual);
	}
}
```

## Test-Driven Development

Test-Driven Development (TDD) is a software development process that relies on the repetition of a very short development cycle: requirements are turned into very specific test cases, then the software is improved to pass the new tests, only. This is opposed to software development that allows software to be added that is not proven to meet requirements.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is related to the test-first programming concepts of extreme programming, begun in 1999, but more recently has created more general interest in its own right. Programmers also apply the concept to improving and debugging legacy code developed with older techniques.

TDD is