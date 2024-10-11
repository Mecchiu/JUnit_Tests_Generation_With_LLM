// Test case 1: Test with empty list
    @Test
    void testEmptyList() {
        List<Object> lst = new ArrayList<Object>();
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(null);
        expected.add(null);
        assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
    }

    // Test case 2: Test with list containing only positive integers
    @Test
    void testPositiveIntegers() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(5);
        lst.add(10);
        lst.add(15);
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(null);
        expected.add(5);
        assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
    }

    // Test case 3: Test with list containing only negative integers
    @Test
    void testNegativeIntegers() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(-5);
        lst.add(-10);
        lst.add(-15);
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(-5);
        expected.add(null);
        assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
    }

    // Test case 4: Test with list containing both positive and negative integers
    @Test
    void testPositiveAndNegativeIntegers() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(-5);
        lst.add(10);
        lst.add(-15);
        lst.add(20);
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(-5);
        expected.add(10);
        assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
    }

    // Test case 5: Test with list containing only zero
    @Test
    void testZero() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(0);
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(null);
        expected.add(null);
        assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
    }

    // Test case 6: Test with list containing both positive and negative integers including zero
    @Test
    void testPositiveNegativeAndZero() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(-5);
        lst.add(10);
        lst.add(0);
        lst.add(-15);
        lst.add(20);
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(-5);
        expected.add(10);
        assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
    }

    // Test case 7: Test with list containing only one positive integer
    @Test
    void testOnePositiveInteger() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(5);
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(null);
        expected.add(5);
        assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
    }

    // Test case 8: Test with list containing only one negative integer
    @Test
    void testOneNegativeInteger() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(-5);
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(-5);
        expected.add(null);
        assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
    }

    // Test case 9: Test with list containing both positive and negative integers with same absolute value
    @Test
    void testPositiveAndNegativeIntegersWithSameAbsoluteValue() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(-5);
        lst.add(5);
        lst.add(-10);
        lst.add(10);
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(-5);
        expected.add(5);
        assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
    }

    // Test case 10: Test with list containing both positive and negative integers with same value
    @Test
    void testPositiveAndNegativeIntegersWithSameValue() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(-5);
        lst.add(5);
        lst.add(-5);
        lst.add(5);
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(-5);
        expected.add(5);
        assertEquals(expected, LargestSmallestIntegers.largestSmallestIntegers(lst));
    }
}