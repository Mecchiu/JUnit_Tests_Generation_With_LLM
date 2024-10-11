import static org.junit.jupiter.api.Assertions.assertEquals;

class IntersperseTest {

    @Test
    void testIntersperseWithEmptyList() {
        List<Object> input = new ArrayList<>();
        List<Object> expectedOutput = new ArrayList<>();
        assertEquals(expectedOutput, Intersperse.intersperse(input, 5));
    }

    @Test
    void testIntersperseWithSingleElementList() {
        List<Object> input = new ArrayList<>();
        input.add(10);
        List<Object> expectedOutput = new ArrayList<>();
        expectedOutput.add(10);
        assertEquals(expectedOutput, Intersperse.intersperse(input, 5));
    }

    @Test
    void testIntersperseWithTwoElementList() {
        List<Object> input = new ArrayList<>();
        input.add(10);
        input.add(20);
        List<Object> expectedOutput = new ArrayList<>();
        expectedOutput.add(10);
        expectedOutput.add(5);
        expectedOutput.add(20);
        assertEquals(expectedOutput, Intersperse.intersperse(input, 5));
    }

    @Test
    void testIntersperseWithMultipleElementList() {
        List<Object> input = new ArrayList<>();
        input.add(10);
        input.add(20);
        input.add(30);
        input.add(40);
        List<Object> expectedOutput = new ArrayList<>();
        expectedOutput.add(10);
        expectedOutput.add(5);
        expectedOutput.add(20);
        expectedOutput.add(5);
        expectedOutput.add(30);
        expectedOutput.add(5);
        expectedOutput.add(40);
        assertEquals(expectedOutput, Intersperse.intersperse(input, 5));
    }

    @Test
    void testIntersperseWithNegativeDelimiter() {
        List<Object> input = new ArrayList<>();
        input.add(10);
        input.add(20);
        input.add(30);
        input.add(40);
        List<Object> expectedOutput = new ArrayList<>();
        expectedOutput.add(10);
        expectedOutput.add(-5);
        expectedOutput.add(20);
        expectedOutput.add(-5);
        expectedOutput.add(30);
        expectedOutput.add(-5);
        expectedOutput.add(40);
        assertEquals(expectedOutput, Intersperse.intersperse(input, -5));
    }

    @Test
    void testIntersperseWithZeroDelimiter() {
        List<Object> input = new ArrayList<>();
        input.add(10);
        input.add(20);
        input.add(30);
        input.add(40);
        List<Object> expectedOutput = new ArrayList<>();
        expectedOutput.add(10);
        expectedOutput.add(0);
        expectedOutput.add(20);
        expectedOutput.add(0);
        expectedOutput.add(30);
        expectedOutput.add(0);
        expectedOutput.add(40);
        assertEquals(expectedOutput, Intersperse.intersperse(input, 0));
    }

    @Test
    void testIntersperseWithNullList() {
        List<Object> input = null;
        List<Object> expectedOutput = null;
        assertEquals(expectedOutput, Intersperse.intersperse(input, 5));
    }

    @Test
    void testIntersperseWithNullDelimiter() {
        List<Object> input = new ArrayList<>();
        input.add(10);
        input.add(20);
        input.add(30);
        input.add(40);
        List<Object> expectedOutput = new ArrayList<>();
        expectedOutput.add(10);
        expectedOutput.add(null);
        expectedOutput.add(20);
        expectedOutput.add(null);
        expectedOutput.add(30);
        expectedOutput.add(null);
        expectedOutput.add(40);
        assertEquals(expectedOutput, Intersperse.intersperse(input, null));
    }

    @Test
    void testIntersperseWithMixedTypeList() {
        List<Object> input = new ArrayList<>();
        input.add(10);
        input.add("hello");
        input.add(30);
        input.add(40.5);
        List<Object> expectedOutput = new ArrayList<>();
        expectedOutput.add(10);
        expectedOutput.add(5);
        expectedOutput.add("hello");
        expectedOutput.add(5);
        expectedOutput.add(30);
        expectedOutput.add(5);
        expectedOutput.add(40.5);
        assertEquals(expectedOutput, Intersperse.intersperse(input, 5));
    }

    @Test
    void testIntersperseWithLargeList() {
        List<Object> input = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            input.add(i);
        }
        List<Object> expectedOutput = new ArrayList<>();
        for (int i = 0; i < 99999; i++) {
            expectedOutput.add(i);
            expectedOutput.add(5);
        }
        expectedOutput.add(99999);
        assertEquals(expectedOutput, Intersperse.intersperse(input, 5));
    }
}