Here's the code for the test class:

```
class RemoveDuplicatesTest {

    @Test
    void testRemoveDuplicates_emptyList() {
        List<Object> input = new ArrayList<>();
        List<Object> expectedOutput = new ArrayList<>();
        assertEquals(expectedOutput, RemoveDuplicates.removeDuplicates(input));
    }

    @Test
    void testRemoveDuplicates_noDuplicates() {
        List<Object> input = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        List<Object> expectedOutput = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        assertEquals(expectedOutput, RemoveDuplicates.removeDuplicates(input));
    }

    @Test
    void testRemoveDuplicates_allDuplicates() {
        List<Object> input = new ArrayList<>(List.of(1, 1, 1, 1, 1));
        List<Object> expectedOutput = new ArrayList<>(List.of());
        assertEquals(expectedOutput, RemoveDuplicates.removeDuplicates(input));
    }

    @Test
    void testRemoveDuplicates_someDuplicates() {
        List<Object> input = new ArrayList<>(List.of(1, 2, 3, 2, 4, 5, 3));
        List<Object> expectedOutput = new ArrayList<>(List.of(1, 4, 5));
        assertEquals(expectedOutput, RemoveDuplicates.removeDuplicates(input));
    }

    @Test
    void testRemoveDuplicates_strings() {
        List<Object> input = new ArrayList<>(List.of("hello", "world", "hello", "java", "world"));
        List<Object> expectedOutput = new ArrayList<>(List.of("java"));
        assertEquals(expectedOutput, RemoveDuplicates.removeDuplicates(input));
    }

    @Test
    void testRemoveDuplicates_mixedTypes() {
        List<Object> input = new ArrayList<>(List.of(1, "hello", 2, "world", 1, "hello"));
        List<Object> expectedOutput = new ArrayList<>(List.of("world", 2));
        assertEquals(expectedOutput, RemoveDuplicates.removeDuplicates(input));
    }

    @Test
    void testRemoveDuplicates_singleElement() {
        List<Object> input = new ArrayList<>(List.of(1));
        List<Object> expectedOutput = new ArrayList<>(List.of(1));
        assertEquals(expectedOutput, RemoveDuplicates.removeDuplicates(input));
    }

    @Test
    void testRemoveDuplicates_multipleElements() {
        List<Object> input = new ArrayList<>(List.of(1, 2, 3));
        List<Object> expectedOutput = new ArrayList<>(List.of(1, 2, 3));
        assertEquals(expectedOutput, RemoveDuplicates.removeDuplicates(input));
    }

    @Test
    void testRemoveDuplicates_nullInput() {
        assertThrows(NullPointerException.class, () -> RemoveDuplicates.removeDuplicates(null));
    }

    @Test
    void testRemoveDuplicates_largeInput() {
        List<Object> input = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            input.add(i % 100);
        }
        List<Object> expectedOutput = new ArrayList<>(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        assertEquals(expectedOutput, RemoveDuplicates.removeDuplicates(input));
    }
}
```