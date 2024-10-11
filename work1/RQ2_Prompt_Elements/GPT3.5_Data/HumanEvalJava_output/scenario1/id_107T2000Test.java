// Test case 1: Test with n = 0
    @Test
    void testWithZero() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(0);
        expected.add(0);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(0));
    }

    // Test case 2: Test with n = 1
    @Test
    void testWithOne() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        expected.add(0);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(1));
    }

    // Test case 3: Test with n = 10
    @Test
    void testWithTen() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(5);
        expected.add(5);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(10));
    }

    // Test case 4: Test with n = 100
    @Test
    void testWithHundred() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(45);
        expected.add(55);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(100));
    }

    // Test case 5: Test with n = 1000
    @Test
    void testWithThousand() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(495);
        expected.add(505);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(1000));
    }

    // Test case 6: Test with n = 10000
    @Test
    void testWithTenThousand() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(4995);
        expected.add(5005);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(10000));
    }

    // Test case 7: Test with n = 100000
    @Test
    void testWithHundredThousand() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(49995);
        expected.add(50005);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(100000));
    }

    // Test case 8: Test with n = 1000000
    @Test
    void testWithMillion() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(499995);
        expected.add(500005);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(1000000));
    }

    // Test case 9: Test with n = 10000000
    @Test
    void testWithTenMillion() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(4999995);
        expected.add(5000005);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(10000000));
    }

    // Test case 10: Test with n = 100000000
    @Test
    void testWithHundredMillion() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(49999995);
        expected.add(50000005);
        assertEquals(expected, EvenOddPalindrome.evenOddPalindrome(100000000));
    }
}