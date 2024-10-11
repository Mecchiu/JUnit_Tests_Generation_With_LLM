Here's the code for the SolveTest class:

```
package scenario2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolveTest {

    @Test
    void testAllLowerCase() {
        String input = "hello world";
        String expectedOutput = "HELLO WORLD";
        String actualOutput = Solve.solve(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testAllUpperCase() {
        String input = "HELLO WORLD";
        String expectedOutput = "hello world";
        String actualOutput = Solve.solve(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testMixedCase() {
        String input = "HeLLo WoRLd";
        String expectedOutput = "hEllO wOrlD";
        String actualOutput = Solve.solve(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testNoLetters() {
        String input = "12345";
        String expectedOutput = "54321";
        String actualOutput = Solve.solve(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testEmptyString() {
        String input = "";
        String expectedOutput = "";
        String actualOutput = Solve.solve(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testSingleLetter() {
        String input = "a";
        String expectedOutput = "A";
        String actualOutput = Solve.solve(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testSingleNonLetter() {
        String input = "!";
        String expectedOutput = "!";
        String actualOutput = Solve.solve(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testMultipleNonLetters() {
        String input = "!@#$%";
        String expectedOutput = "%$#@!";
        String actualOutput = Solve.solve(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testMultipleSpaces() {
        String input = "   ";
        String expectedOutput = "   ";
        String actualOutput = Solve.solve(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testMixedCaseAndNonLetters() {
        String input = "HeLLo WoRLd!";
        String expectedOutput = "hEllO wOrlD!";
        String actualOutput = Solve.solve(input);
        assertEquals(expectedOutput, actualOutput);
    }
}
```

This test class contains ten unit test cases for the `solve` method of the `Solve` class. Each test case tests a different scenario, such as all lowercase letters, all uppercase letters, mixed case letters, no letters, empty string, single letter, single non-letter, multiple non-letters, multiple spaces, and mixed case letters and non-letters. The `assertEquals` method is used to compare the expected output with the actual output of the `solve` method.