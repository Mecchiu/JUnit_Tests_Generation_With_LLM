Here's the code for the test class:

```
class PrimeLengthTest {

    @Test
    void testEmptyString() {
        assertFalse(PrimeLength.primeLength(""));
    }

    @Test
    void testSingleCharacterString() {
        assertFalse(PrimeLength.primeLength("a"));
    }

    @Test
    void testTwoCharacterString() {
        assertTrue(PrimeLength.primeLength("ab"));
    }

    @Test
    void testThreeCharacterString() {
        assertTrue(PrimeLength.primeLength("abc"));
    }

    @Test
    void testFourCharacterString() {
        assertFalse(PrimeLength.primeLength("abcd"));
    }

    @Test
    void testFiveCharacterString() {
        assertTrue(PrimeLength.primeLength("abcde"));
    }

    @Test
    void testSixCharacterString() {
        assertFalse(PrimeLength.primeLength("abcdef"));
    }

    @Test
    void testSevenCharacterString() {
        assertTrue(PrimeLength.primeLength("abcdefg"));
    }

    @Test
    void testEightCharacterString() {
        assertFalse(PrimeLength.primeLength("abcdefgh"));
    }

    @Test
    void testNineCharacterString() {
        assertFalse(PrimeLength.primeLength("abcdefghi"));
    }
}
```

This test class contains ten test cases that cover different scenarios for the `primeLength` method. The test cases include empty strings, single character strings, strings with prime length, and strings with non-prime length.