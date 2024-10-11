Here's the source code for the test class:

```
class EvenOddPalindromeTest {

    @Test
    void testEvenOddPalindrome1() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(0);
        expected.add(0);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(0));
    }

    @Test
    void testEvenOddPalindrome2() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(0);
        expected.add(0);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(1));
    }

    @Test
    void testEvenOddPalindrome3() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(0);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(9));
    }

    @Test
    void testEvenOddPalindrome4() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(1);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(11));
    }

    @Test
    void testEvenOddPalindrome5() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(1);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(22));
    }

    @Test
    void testEvenOddPalindrome6() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(2);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(33));
    }

    @Test
    void testEvenOddPalindrome7() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(3);
        expected.add(2);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(44));
    }

    @Test
    void testEvenOddPalindrome8() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(3);
        expected.add(3);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(55));
    }

    @Test
    void testEvenOddPalindrome9() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(4);
        expected.add(3);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(66));
    }

    @Test
    void testEvenOddPalindrome10() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(4);
        expected.add(4);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(77));
    }
}
```

This test class contains ten unit test cases for the `evenOddPalindrome` method of the `EvenOddPalindrome` class. Each test case tests the method with a different input value and checks if the expected output is returned. The expected output is defined using an `ArrayList` of integers, where the first element is the expected number of even palindromes and the second element is the expected number of odd palindromes. The `assertEquals` method is used to compare the expected output with the actual output of the method.