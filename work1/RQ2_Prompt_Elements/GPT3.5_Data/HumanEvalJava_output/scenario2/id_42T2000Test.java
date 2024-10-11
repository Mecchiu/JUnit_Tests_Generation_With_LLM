import static org.junit.jupiter.api.Assertions.assertEquals;

class IncrListTest {

    @Test
    void testIncrListWithEmptyList() {
        List<Object> input = new ArrayList<>();
        List<Object> expectedOutput = new ArrayList<>();
        assertEquals(expectedOutput, IncrList.incrList(input));
    }

    @Test
    void testIncrListWithOneInteger() {
        List<Object> input = new ArrayList<>();
        input.add(5);
        List<Object> expectedOutput = new ArrayList<>();
        expectedOutput.add(6);
        assertEquals(expectedOutput, IncrList.incrList(input));
    }

    @Test
    void testIncrListWithOneNonInteger() {
        List<Object> input = new ArrayList<>();
        input.add("hello");
        List<Object> expectedOutput = new ArrayList<>();
        assertEquals(expectedOutput, IncrList.incrList(input));
    }

    @Test
    void testIncrListWithMultipleIntegers() {
        List<Object> input = new ArrayList<>();
        input.add(5);
        input.add(10);
        input.add(15);
        List<Object> expectedOutput = new ArrayList<>();
        expectedOutput.add(6);
        expectedOutput.add(11);
        expectedOutput.add(16);
        assertEquals(expectedOutput, IncrList.incrList(input));
    }

    @Test
    void testIncrListWithMultipleMixedTypes() {
        List<Object> input = new ArrayList<>();
        input.add(5);
        input.add("hello");
        input.add(10);
        input.add("world");
        input.add(15);
        List<Object> expectedOutput = new ArrayList<>();
        expectedOutput.add(6);
        expectedOutput.add(11);
        expectedOutput.add(16);
        assertEquals(expectedOutput, IncrList.incrList(input));
    }

    @Test
    void testIncrListWithNullInput() {
        List<Object> input = null;
        List<Object> expectedOutput = null;
        assertEquals(expectedOutput, IncrList.incrList(input));
    }

    @Test
    void testIncrListWithLargeInteger() {
        List<Object> input = new ArrayList<>();
        input.add(Integer.MAX_VALUE);
        List<Object> expectedOutput = new ArrayList<>();
        expectedOutput.add(Integer.MIN_VALUE);
        assertEquals(expectedOutput, IncrList.incrList(input));
    }

    @Test
    void testIncrListWithNegativeInteger() {
        List<Object> input = new ArrayList<>();
        input.add(-5);
        List<Object> expectedOutput = new ArrayList<>();
        expectedOutput.add(-4);
        assertEquals(expectedOutput, IncrList.incrList(input));
    }

    @Test
    void testIncrListWithZero() {
        List<Object> input = new ArrayList<>();
        input.add(0);
        List<Object> expectedOutput = new ArrayList<>();
        expectedOutput.add(1);
        assertEquals(expectedOutput, IncrList.incrList(input));
    }

    @Test
    void testIncrListWithMultipleZeros() {
        List<Object> input = new ArrayList<>();
        input.add(0);
        input.add(0);
        input.add(0);
        List<Object> expectedOutput = new ArrayList<>();
        expectedOutput.add(1);
        expectedOutput.add(1);
        expectedOutput.add(1);
        assertEquals(expectedOutput, IncrList.incrList(input));
    }
}