I can help you write the code for the AntiShuffleTest class. Here's an example:

```
class AntiShuffleTest {

    @Test
    void testAntiShuffle() {
        String input = "hello world";
        String expectedOutput = "ehllo dlrow";
        String actualOutput = AntiShuffle.antiShuffle(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testAntiShuffleWithEmptyString() {
        String input = "";
        String expectedOutput = "";
        String actualOutput = AntiShuffle.antiShuffle(input);
        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    void testAntiShuffleWithOneWord() {
        String input = "hello";
        String expectedOutput = "ehllo";
        String actualOutput = AntiShuffle.antiShuffle(input);
        assertEquals(expectedOutput, actualOutput);
    }

    // Add more test cases here
}
```

You can add more test cases by following the same pattern. Each test case should have a descriptive name, an input string, an expected output string, and an assertion that compares the expected output with the actual output of the `antiShuffle` method.