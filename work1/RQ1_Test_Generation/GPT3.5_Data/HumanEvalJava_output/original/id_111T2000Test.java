```java
class HistogramTest {

    @Test
    void testHistogramWithSingleLetter() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 1);
        assertEquals(expected, Histogram.histogram("a"));
    }

    @Test
    void testHistogramWithMultipleLetters() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 2);
        expected.put("b", 2);
        assertEquals(expected, Histogram.histogram("a b b a"));
    }

    @Test
    void testHistogramWithAllDifferentLetters() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 1);
        expected.put("b", 1);
        expected.put("c", 1);
        expected.put("d", 1);
        expected.put("g", 1);
        assertEquals(expected, Histogram.histogram("a b c d g"));
    }

    @Test
    void testHistogramWithAllSameLetters() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("b", 4);
        assertEquals(expected, Histogram.histogram("b b b b a"));
    }

    @Test
    void testHistogramWithEmptyString() {
        Map<String, Integer> expected = new HashMap<>();
        assertEquals(expected, Histogram.histogram(""));
    }

    @Test
    void testHistogramWithSpaceSeparatedLetters() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("r", 1);
        expected.put("t", 1);
        expected.put("g", 1);
        assertEquals(expected, Histogram.histogram("r t g"));
    }

    @Test
    void testHistogramWithSameCountLetters() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 2);
        expected.put("b", 2);
        assertEquals(expected, Histogram.histogram("a b c a b"));
    }

    @Test
    void testHistogramWithSameCountLetters2() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 1);
        expected.put("b", 1);
        expected.put("c", 1);
        assertEquals(expected, Histogram.histogram("a b c"));
    }

    @Test
    void testHistogramWithSameCountLetters3() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 1);
        expected.put("b", 1);
        expected.put("c", 1);
        assertEquals(expected, Histogram.histogram("c a b"));
    }

    @Test
    void testHistogramWithSameCountLetters4() {
        Map<String, Integer> expected = new HashMap<>();
        expected.put("a", 1);
        expected.put("b", 1);
        expected.put("c", 1);
        assertEquals(expected, Histogram.histogram("b c a"));
    }
}
```
```