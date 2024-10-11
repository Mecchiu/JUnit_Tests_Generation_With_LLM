Here's the code for the test class:

```
class BelowZeroTest {

    @Test
    void testEmptyList() {
        List<Object> operations = new ArrayList<>();
        assertFalse(BelowZero.belowZero(operations));
    }

    @Test
    void testPositiveBalance() {
        List<Object> operations = Arrays.asList(10.0, 20, 30.0);
        assertFalse(BelowZero.belowZero(operations));
    }

    @Test
    void testNegativeBalance() {
        List<Object> operations = Arrays.asList(10.0, -20, 30.0);
        assertTrue(BelowZero.belowZero(operations));
    }

    @Test
    void testZeroBalance() {
        List<Object> operations = Arrays.asList(10.0, -10, 20.0, -20);
        assertFalse(BelowZero.belowZero(operations));
    }

    @Test
    void testOnlyPositiveOperations() {
        List<Object> operations = Arrays.asList(10.0, 20, 30.0);
        assertFalse(BelowZero.belowZero(operations));
    }

    @Test
    void testOnlyNegativeOperations() {
        List<Object> operations = Arrays.asList(-10.0, -20, -30.0);
        assertTrue(BelowZero.belowZero(operations));
    }

    @Test
    void testMixedOperations() {
        List<Object> operations = Arrays.asList(10.0, -20, 30, -40.0, 50.0);
        assertTrue(BelowZero.belowZero(operations));
    }

    @Test
    void testDoubleOperations() {
        List<Object> operations = Arrays.asList(10.0, -20.5, 30.5);
        assertTrue(BelowZero.belowZero(operations));
    }

    @Test
    void testIntegerOperations() {
        List<Object> operations = Arrays.asList(10, -20, 30);
        assertTrue(BelowZero.belowZero(operations));
    }

    @Test
    void testInvalidOperationType() {
        List<Object> operations = Arrays.asList(10, -20, "30");
        assertThrows(IllegalArgumentException.class, () -> BelowZero.belowZero(operations));
    }
}
```

This test class contains ten test cases that cover different scenarios for the `belowZero` method. The test cases include empty list, positive balance, negative balance, zero balance, only positive operations, only negative operations, mixed operations, double operations, integer operations, and invalid operation type.