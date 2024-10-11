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

The TDD cycle is a short and simple process that can be repeated many times in a row.

1. Add a test
2. Run all tests and see if the new one fails
3. Write some code
4. Run tests
5. Refactor code
6. Repeat

### Test-Driven Development Benefits

* TDD helps you to write better code.
* TDD helps you to write less code.
* TDD helps you to write code faster.
* TDD helps you to find bugs early.
* TDD helps you to design better code.
* TDD helps you to refactor code with confidence.
* TDD helps you to document your code.
* TDD helps you to build a suite of tests that can be run at any time.
* TDD helps you to build a safety net for change.
* TDD helps you to build a living documentation of your system.

### Test-Driven Development Disadvantages

* TDD requires a lot of discipline.
* TDD requires a lot of practice.
* TDD requires a lot of patience.
* TDD requires a lot of time.
* TDD requires a lot of effort.
* TDD requires a lot of learning.
* TDD requires a lot of thinking.
* TDD requires a lot of experience.
* TDD requires a lot of knowledge.
* TDD requires a lot of skill.

### Test-Driven Development Rules

* You are not allowed to write any production code unless it is to make a failing unit test pass.
* You are not allowed to write any more of a unit test than is sufficient to fail; and compilation failures are failures.
* You are not allowed to write any more production code than is sufficient to pass the one failing unit test.

### Test-Driven Development Principles

* You must write a failing unit test before you write any production code.
* You must not write more of a unit test than is sufficient to fail, and compilation failures are failures.
* You must not write more production code than is sufficient to pass the currently failing test.

### Test-Driven Development Practices

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Guidelines

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Best Practices

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Tips

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Tricks

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Techniques

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Pitfalls

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Gotchas

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Common Mistakes

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Anti-Patterns

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Code Smells

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Code Examples

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Code Snippets

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Code Samples

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Code Fragments

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Code Solutions

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Code Templates

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Code Patterns

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Code Idioms

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Code Recipes

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Code Snippets

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Code Examples

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Code Fragments

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Code Solutions

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Code Templates

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Code Patterns

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Code Idioms

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Code Recipes

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Code Snippets

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Code Examples

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Code Fragments

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Code Solutions

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Code Templates

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Code Patterns

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Code Idioms

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Code Recipes

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Code Snippets

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Code Examples

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Code Fragments

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Code Solutions

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Code Templates

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Code Patterns

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Code Idioms

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Code Recipes

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Code Snippets

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Code Examples

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Code Fragments

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Code Solutions

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Code Templates

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Code Patterns

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Code Idioms

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Code Recipes

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Code Snippets

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Code Examples

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Code Fragments

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Code Solutions

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Code Templates

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Code Patterns

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
* Repeat.

### Test-Driven Development Code Idioms

* Write a test.
* Run all tests and see if the new one fails.
* Write some code.
* Run tests.
* Refactor code.
*