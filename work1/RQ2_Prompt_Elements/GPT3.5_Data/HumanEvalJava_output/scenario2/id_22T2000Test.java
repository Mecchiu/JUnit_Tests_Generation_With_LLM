import static org.junit.jupiter.api.Assertions.assertEquals;

class FilterIntegersTest {

    @Test
    void testFilterIntegersWithEmptyList() {
        List<Object> values = new ArrayList<>();
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(0, result.size());
    }

    @Test
    void testFilterIntegersWithNonIntegerValues() {
        List<Object> values = new ArrayList<>();
        values.add("hello");
        values.add(3.14);
        values.add(true);
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(0, result.size());
    }

    @Test
    void testFilterIntegersWithIntegerValues() {
        List<Object> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(3, result.size());
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(3, result.get(2));
    }

    @Test
    void testFilterIntegersWithMixedValues() {
        List<Object> values = new ArrayList<>();
        values.add(1);
        values.add("hello");
        values.add(2);
        values.add(3.14);
        values.add(true);
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(2, result.size());
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
    }

    @Test
    void testFilterIntegersWithNullValues() {
        List<Object> values = new ArrayList<>();
        values.add(null);
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(0, result.size());
    }

    @Test
    void testFilterIntegersWithLargeList() {
        List<Object> values = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            values.add(i);
        }
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(1000000, result.size());
    }

    @Test
    void testFilterIntegersWithNegativeValues() {
        List<Object> values = new ArrayList<>();
        values.add(-1);
        values.add(-2);
        values.add(3);
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(3, result.size());
        assertEquals(-1, result.get(0));
        assertEquals(-2, result.get(1));
        assertEquals(3, result.get(2));
    }

    @Test
    void testFilterIntegersWithZeroValue() {
        List<Object> values = new ArrayList<>();
        values.add(0);
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(1, result.size());
        assertEquals(0, result.get(0));
    }

    @Test
    void testFilterIntegersWithDuplicateValues() {
        List<Object> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(2);
        values.add(3);
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(3, result.size());
        assertEquals(1, result.get(0));
        assertEquals(2, result.get(1));
        assertEquals(3, result.get(2));
    }

    @Test
    void testFilterIntegersWithLargeNegativeValues() {
        List<Object> values = new ArrayList<>();
        for (int i = -1000000; i < 0; i++) {
            values.add(i);
        }
        List<Object> result = FilterIntegers.filterIntegers(values);
        assertEquals(1000000, result.size());
    }
}