// Here's an example of how you can test the Base64Coder class using JUnit 5:

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

class Base64CoderTest {

    @Test
    void testEncode() {
        byte[] input = "Hello, world!".getBytes();
        char[] expectedOutput = "SGVsbG8sIHdvcmxkIQ==".toCharArray();
        char[] actualOutput = Base64Coder.encode(input);
        assertArrayEquals(expectedOutput, actualOutput);
    }
}

// This test case encodes the string "Hello, world!" using the Base64Coder class and compares the result to the expected output. If the actual output matches the expected output, the test passes.