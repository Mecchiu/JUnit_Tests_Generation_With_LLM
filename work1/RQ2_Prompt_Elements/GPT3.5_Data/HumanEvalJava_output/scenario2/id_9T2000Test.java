// Test case 1: Test with empty list
    @Test
    void testRollingMaxWithEmptyList() {
        List<Object> numbers = new ArrayList<Object>();
        List<Object> result = RollingMax.rollingMax(numbers);
        assertTrue(result.isEmpty());
    }

    // Test case 2: Test with list containing only one element
    @Test
    void testRollingMaxWithSingleElementList() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(5);
        List<Object> result = RollingMax.rollingMax(numbers);
        assertEquals(1, result.size());
        assertEquals(5, result.get(0));
    }

    // Test case 3: Test with list containing multiple elements in ascending order
    @Test
    void testRollingMaxWithAscendingOrderedList() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        List<Object> result = RollingMax.rollingMax(numbers);
        assertEquals(5, result.size());
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(3, result.get(2));
        assertEquals(4, result.get(3));
        assertEquals(5, result.get(4));
    }

    // Test case 4: Test with list containing multiple elements in descending order
    @Test
    void testRollingMaxWithDescendingOrderedList() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(5);
        numbers.add(4);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);
        List<Object> result = RollingMax.rollingMax(numbers);
        assertEquals(5, result.size());
        assertEquals(5, result.get(0));
        assertEquals(5, result.get(1));
        assertEquals(5, result.get(2));
        assertEquals(5, result.get(3));
        assertEquals(5, result.get(4));
    }

    // Test case 5: Test with list containing multiple elements in random order
    @Test
    void testRollingMaxWithRandomOrderedList() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(7);
        numbers.add(1);
        numbers.add(8);
        List<Object> result = RollingMax.rollingMax(numbers);
        assertEquals(5, result.size());
        assertEquals(5, result.get(0));
        assertEquals(5, result.get(1));
        assertEquals(7, result.get(2));
        assertEquals(7, result.get(3));
        assertEquals(8, result.get(4));
    }

    // Test case 6: Test with list containing negative numbers
    @Test
    void testRollingMaxWithNegativeNumbersList() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(-5);
        numbers.add(-2);
        numbers.add(-7);
        numbers.add(-1);
        numbers.add(-8);
        List<Object> result = RollingMax.rollingMax(numbers);
        assertEquals(5, result.size());
        assertEquals(-5, result.get(0));
        assertEquals(-2, result.get(1));
        assertEquals(-2, result.get(2));
        assertEquals(-1, result.get(3));
        assertEquals(-1, result.get(4));
    }

    // Test case 7: Test with list containing both positive and negative numbers
    @Test
    void testRollingMaxWithMixedNumbersList() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(-5);
        numbers.add(2);
        numbers.add(-7);
        numbers.add(1);
        numbers.add(8);
        List<Object> result = RollingMax.rollingMax(numbers);
        assertEquals(5, result.size());
        assertEquals(-5, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(2, result.get(2));
        assertEquals(2, result.get(3));
        assertEquals(8, result.get(4));
    }

    // Test case 8: Test with list containing non-integer elements
    @Test
    void testRollingMaxWithNonIntegerElementsList() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(5);
        numbers.add("test");
        numbers.add(7);
        assertThrows(IllegalArgumentException.class, () -> {
            RollingMax.rollingMax(numbers);
        });
    }

    // Test case 9: Test with list containing null elements
    @Test
    void testRollingMaxWithNullElementsList() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(5);
        numbers.add(null);
        numbers.add(7);
        assertThrows(NullPointerException.class, () -> {
            RollingMax.rollingMax(numbers);
        });
    }

    // Test case 10: Test with list containing only null elements
    @Test
    void testRollingMaxWithOnlyNullElementsList() {
        List<Object> numbers = new ArrayList<Object>();
        numbers.add(null);
        numbers.add(null);
        numbers.add(null);
        List<Object> result = RollingMax.rollingMax(numbers);
        assertEquals(3, result.size());
        assertNull(result.get(0));
        assertNull(result.get(1));
        assertNull(result.get(2));
    }
}