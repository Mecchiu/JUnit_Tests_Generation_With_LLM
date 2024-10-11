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

## Test Coverage

The test coverage of the project is shown below.

![Test Coverage](https://github.com/pmdesigns/jvc/blob/master/test-coverage.png)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details