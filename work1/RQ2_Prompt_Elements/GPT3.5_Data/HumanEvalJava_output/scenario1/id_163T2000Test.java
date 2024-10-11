Here's the code for the test class:

```
class GenerateIntegersTest {

    @Test
    void testGenerateIntegersWithEqualValues() {
        List<Object> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        List<Object> actual = GenerateIntegers.generateIntegers(4, 4);
        assertEquals(expected, actual);
    }

    @Test
    void testGenerateIntegersWithAscendingValues() {
        List<Object> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        List<Object> actual = GenerateIntegers.generateIntegers(2, 6);
        assertEquals(expected, actual);
    }

    @Test
    void testGenerateIntegersWithDescendingValues() {
        List<Object> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        List<Object> actual = GenerateIntegers.generateIntegers(6, 2);
        assertEquals(expected, actual);
    }

    @Test
    void testGenerateIntegersWithLowerValueGreaterThan8() {
        List<Object> expected = new ArrayList<>();
        List<Object> actual = GenerateIntegers.generateIntegers(10, 6);
        assertEquals(expected, actual);
    }

    @Test
    void testGenerateIntegersWithUpperValueLessThan2() {
        List<Object> expected = new ArrayList<>();
        List<Object> actual = GenerateIntegers.generateIntegers(4, 0);
        assertEquals(expected, actual);
    }

    @Test
    void testGenerateIntegersWithLowerValueLessThan2() {
        List<Object> expected = new ArrayList<>();
        expected.add(2);
        List<Object> actual = GenerateIntegers.generateIntegers(0, 6);
        assertEquals(expected, actual);
    }

    @Test
    void testGenerateIntegersWithUpperValueGreaterThan8() {
        List<Object> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(8);
        List<Object> actual = GenerateIntegers.generateIntegers(4, 10);
        assertEquals(expected, actual);
    }

    @Test
    void testGenerateIntegersWithBothValuesGreaterThan8() {
        List<Object> expected = new ArrayList<>();
        List<Object> actual = GenerateIntegers.generateIntegers(10, 12);
        assertEquals(expected, actual);
    }

    @Test
    void testGenerateIntegersWithBothValuesLessThan2() {
        List<Object> expected = new ArrayList<>();
        List<Object> actual = GenerateIntegers.generateIntegers(0, 1);
        assertEquals(expected, actual);
    }

    @Test
    void testGenerateIntegersWithNegativeValues() {
        List<Object> expected = new ArrayList<>();
        expected.add(-6);
        expected.add(-4);
        expected.add(-2);
        List<Object> actual = GenerateIntegers.generateIntegers(-2, -6);
        assertEquals(expected, actual);
    }
}
```