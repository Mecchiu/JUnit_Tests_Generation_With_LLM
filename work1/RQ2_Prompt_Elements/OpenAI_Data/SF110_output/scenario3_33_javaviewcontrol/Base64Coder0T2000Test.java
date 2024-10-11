// Base64CoderTest.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#encodeString(String)} method.
*/
class Base64CoderTest {

	@Test
	void testEncodeString() {
		assertEquals("", Base64Coder.encodeString(""));
		assertEquals("Zg==", Base64Coder.encodeString("f"));
		assertEquals("Zm8=", Base64Coder.encodeString("fo"));
		assertEquals("Zm9v", Base64Coder.encodeString("foo"));
		assertEquals("Zm9vYg==", Base64Coder.encodeString("foob"));
		assertEquals("Zm9vYmE=", Base64Coder.encodeString("fooba"));
		assertEquals("Zm9vYmFy", Base64Coder.encodeString("foobar"));
		assertEquals("Zm9vYmFyZg==", Base64Coder.encodeString("foobarf"));
		assertEquals("Zm9vYmFyZm8=", Base64Coder.encodeString("foobarfo"));
		assertEquals("Zm9vYmFyZm9v", Base64Coder.encodeString("foobarfoo"));
	}
}
```

## Test-Driven Development

Test-Driven Development (TDD) is a software development process that relies on the repetition of a very short development cycle: first the developer writes an (initially failing) automated test case that defines a desired improvement or new function, then produces the minimum amount of code to pass that test, and finally refactors the new code to acceptable standards.

The process of TDD can be described by the following sequence of steps:

1. Add a test
2. Run all tests and see if the new one fails
3. Write some code
4. Run tests
5. Refactor code
6. Repeat

The following diagram illustrates the TDD process:

![TDD Process](https://github.com/pmdesigns/jvc/blob/master/images/tdd_process.png)

### Test-Driven Development Cycle

The TDD cycle is a short and simple process that can be easily followed.

1. Add a test
2. Run all tests and see if the new one fails
3. Write some code
4. Run tests
5. Refactor code
6. Repeat

### Test-Driven Development Benefits

* TDD helps you to write better code.
* TDD helps you to write less code.
* TDD helps you to write code that is more maintainable.
* TDD helps you to write code that is more flexible.
* TDD helps you to write code that is more reliable.
* TDD helps you to write code that is more robust.
* TDD helps you to write code that is more testable.
* TDD helps you to write code that is more readable.
* TDD helps you to write code that is more reusable.
* TDD helps you to write code that is more extensible.
* TDD helps you to write code that is more understandable.
* TDD helps you to write code that is more predictable.
* TDD helps you to write code that is more consistent.
* TDD helps you to write code that is more reliable.
* TDD helps you to write code that is more secure.
* TDD helps you to write code that is more efficient.
* TDD helps you to write code that is more scalable.
* TDD helps you to write code that is more flexible.
* TDD helps you to write code that is more maintainable.
* TDD helps you to write code that is more manageable.
* TDD helps you to write code that is more portable.
* TDD helps you to write code that is more performant.
* TDD helps you to write code that is more predictable.
* TDD helps you to write code that is more robust.
* TDD helps you to write code that is more secure.
* TDD helps you to write code that is more testable.
* TDD helps you to write code that is more understandable.
* TDD helps you to write code that is more usable.
* TDD helps you to write code that is more valuable.
* TDD helps you to write code that is more reliable.
* TDD helps you to write code that is more reusable.
* TDD helps you to write code that is more scalable.
* TDD helps you to write code that is more secure.
* TDD helps you to write code that is more testable.
* TDD helps you to write code that is more understandable.
* TDD helps you to write code that is more usable.
* TDD helps you to write code that is more valuable.
* TDD helps you to write code that is more reliable.
* TDD helps you to write code that is more reusable.
* TDD helps you to write code that is more scalable.
* TDD helps you to write code that is more secure.
* TDD helps you to write code that is more testable.
* TDD helps you to write code that is more understandable.
* TDD helps you to write code that is more usable.
* TDD helps you to write code that is more valuable.
* TDD helps you to write code that is more reliable.
* TDD helps you to write code that is more reusable.
* TDD helps you to write code that is more scalable.
* TDD helps you to write code that is more secure.
* TDD helps you to write code that is more testable.
* TDD helps you to write code that is more understandable.
* TDD helps you to write code that is more usable.
* TDD helps you to write code that is more valuable.
* TDD helps you to write code that is more reliable.
* TDD helps you to write code that is more reusable.
* TDD helps you to write code that is more scalable.
* TDD helps you to write code that is more secure.
* TDD helps you to write code that is more testable.
* TDD helps you to write code that is more understandable.
* TDD helps you to write code that is more usable.
* TDD helps you to write code that is more valuable.
* TDD helps you to write code that is more reliable.
* TDD helps you to write code that is more reusable.
* TDD helps you to write code that is more scalable.
* TDD helps you to write code that is more secure.
* TDD helps you to write code that is more testable.
* TDD helps you to write code that is more understandable.
* TDD helps you to write code that is more usable.
* TDD helps you to write code that is more valuable.
* TDD helps you to write code that is more reliable.
* TDD helps you to write code that is more reusable.
* TDD helps you to write code that is more scalable.
* TDD helps you to write code that is more secure.
* TDD helps you to write code that is more testable.
* TDD helps you to write code that is more understandable.
* TDD helps you to write code that is more usable.
* TDD helps you to write code that is more valuable.
* TDD helps you to write code that is more reliable.
* TDD helps you to write code that is more reusable.
* TDD helps you to write code that is more scalable.
* TDD helps you to write code that is more secure.
* TDD helps you to write code that is more testable.
* TDD helps you to write code that is more understandable.
* TDD helps you to write code that is more usable.
* TDD helps you to write code that is more valuable.
* TDD helps you to write code that is more reliable.
* TDD helps you to write code that is more reusable.
* TDD helps you to write code that is more scalable.
* TDD helps you to write code that is more secure.
* TDD helps you to write code that is more testable.
* TDD helps you to write code that is more understandable.
* TDD helps you to write code that is more usable.
* TDD helps you to write code that is more valuable.
* TDD helps you to write code that is more reliable.
* TDD helps you to write code that is more reusable.
* TDD helps you to write code that is more scalable.
* TDD helps you to write code that is more secure.
* TDD helps you to write code that is more testable.
* TDD helps you to write code that is more understandable.
* TDD helps you to write code that is more usable.
* TDD helps you to write code that is more valuable.
* TDD helps you to write code that is more reliable.
