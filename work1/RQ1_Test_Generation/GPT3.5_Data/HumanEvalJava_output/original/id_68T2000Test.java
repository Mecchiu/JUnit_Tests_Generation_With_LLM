```java
class PluckTest {

    @Test
    void testPluckSingleNode() {
        List<Object> input = new ArrayList<>();
        input.add(4);
        List<Object> expected = new ArrayList<>();
        expected.add(4);
        expected.add(0);
        assertEquals(expected, Pluck.pluck(input));
    }

    @Test
    void testPluckMultipleNodes() {
        List<Object> input = new ArrayList<>();
        input.add(5);
        input.add(0);
        input.add(3);
        input.add(0);
        input.add(4);
        input.add(2);
        List<Object> expected = new ArrayList<>();
        expected.add(0);
        expected.add(1);
        assertEquals(expected, Pluck.pluck(input));
    }

    @Test
    void testPluckNoEvenValues() {
        List<Object> input = new ArrayList<>();
        input.add(1);
        input.add(3);
        input.add(5);
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, Pluck.pluck(input));
    }

    @Test
    void testPluckEmptyList() {
        List<Object> input = new ArrayList<>();
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, Pluck.pluck(input));
    }

    @Test
    void testPluckMultipleMinEvenValues() {
        List<Object> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);
        input.add(0);
        input.add(5);
        input.add(3);
        List<Object> expected = new ArrayList<>();
        expected.add(0);
        expected.add(3);
        assertEquals(expected, Pluck.pluck(input));
    }

    @Test
    void testPluckMultipleMinEvenValuesWithSameIndex() {
        List<Object> input = new ArrayList<>();
        input.add(5);
        input.add(4);
        input.add(8);
        input.add(4);
        input.add(8);
        List<Object> expected = new ArrayList<>();
        expected.add(4);
        expected.add(1);
        assertEquals(expected, Pluck.pluck(input));
    }

    @Test
    void testPluckNoEvenValuesWithNonNegativeIntegers() {
        List<Object> input = new ArrayList<>();
        input.add(7);
        input.add(6);
        input.add(7);
        input.add(1);
        List<Object> expected = new ArrayList<>();
        expected.add(6);
        expected.add(1);
        assertEquals(expected, Pluck.pluck(input));
    }

    @Test
    void testPluckNoEvenValuesWithNonNegativeIntegers2() {
        List<Object> input = new ArrayList<>();
        input.add(7);
        input.add(9);
        input.add(7);
        input.add(1);
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, Pluck.pluck(input));
    }
}
```
```