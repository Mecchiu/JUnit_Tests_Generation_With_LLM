```java
class SortEvenTest {

    @Test
    void testSortEven1() {
        List<Integer> input = new ArrayList<>(List.of(1, 2, 3));
        List<Integer> expected = List.of(1, 2, 3);
        assertEquals(expected, SortEven.sortEven(input));
    }

    @Test
    void testSortEven2() {
        List<Integer> input = new ArrayList<>(List.of(5, 6, 3, 4));
        List<Integer> expected = List.of(3, 6, 5, 4);
        assertEquals(expected, SortEven.sortEven(input));
    }

    @Test
    void testSortEven3() {
        List<Integer> input = new ArrayList<>(List.of(1, 2, 3));
        List<Integer> expected = List.of(1, 2, 3);
        assertEquals(expected, SortEven.sortEven(input));
    }

    @Test
    void testSortEven4() {
        List<Integer> input = new ArrayList<>(List.of(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10));
        List<Integer> expected = List.of(-10, 3, -5, 2, -3, 3, 5, 0, 9, 1, 123);
        assertEquals(expected, SortEven.sortEven(input));
    }

    @Test
    void testSortEven5() {
        List<Integer> input = new ArrayList<>(List.of(5, 8, -12, 4, 23, 2, 3, 11, 12, -10));
        List<Integer> expected = List.of(-12, 8, 3, 4, 5, 2, 12, 11, 23, -10);
        assertEquals(expected, SortEven.sortEven(input));
    }

    // Add more test cases as needed
}
```
```