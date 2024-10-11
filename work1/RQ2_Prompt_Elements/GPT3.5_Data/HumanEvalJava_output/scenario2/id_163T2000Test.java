import static org.junit.jupiter.api.Assertions.assertEquals;

class GenerateIntegersTest {

    @Test
    void testGenerateIntegers() {
        List<Object> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        assertEquals(expected, GenerateIntegers.generateIntegers(1, 7));
    }

    @Test
    void testGenerateIntegersWithSameNumbers() {
        List<Object> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        assertEquals(expected, GenerateIntegers.generateIntegers(7, 7));
    }

    @Test
    void testGenerateIntegersWithNegativeNumbers() {
        List<Object> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        assertEquals(expected, GenerateIntegers.generateIntegers(-7, -1));
    }

    @Test
    void testGenerateIntegersWithOneEvenNumber() {
        List<Object> expected = new ArrayList<>();
        expected.add(2);
        assertEquals(expected, GenerateIntegers.generateIntegers(2, 3));
    }

    @Test
    void testGenerateIntegersWithOneOddNumber() {
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, GenerateIntegers.generateIntegers(3, 4));
    }

    @Test
    void testGenerateIntegersWithNoEvenNumbers() {
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, GenerateIntegers.generateIntegers(1, 3));
    }

    @Test
    void testGenerateIntegersWithSameEvenNumbers() {
        List<Object> expected = new ArrayList<>();
        expected.add(2);
        assertEquals(expected, GenerateIntegers.generateIntegers(2, 2));
    }

    @Test
    void testGenerateIntegersWithSameOddNumbers() {
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, GenerateIntegers.generateIntegers(3, 3));
    }

    @Test
    void testGenerateIntegersWithLargeNumbers() {
        List<Object> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        assertEquals(expected, GenerateIntegers.generateIntegers(100, 1000));
    }

    @Test
    void testGenerateIntegersWithReversedNumbers() {
        List<Object> expected = new ArrayList<>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        assertEquals(expected, GenerateIntegers.generateIntegers(7, 1));
    }
}