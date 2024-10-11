```java
class SortArray1Test {
    
    @Test
    void testSortArray_emptyArray() {
        List<Object> input = new ArrayList<>();
        List<Object> expected = new ArrayList<>();
        assertEquals(expected, SortArray1.sortArray(input));
    }
    
    @Test
    void testSortArray_singleElementArray() {
        List<Object> input = new ArrayList<>();
        input.add(5);
        List<Object> expected = new ArrayList<>();
        expected.add(5);
        assertEquals(expected, SortArray1.sortArray(input));
    }
    
    @Test
    void testSortArray_oddSum() {
        List<Object> input = new ArrayList<>();
        input.add(2);
        input.add(4);
        input.add(3);
        input.add(0);
        input.add(1);
        input.add(5);
        List<Object> expected = new ArrayList<>();
        expected.add(0);
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        assertEquals(expected, SortArray1.sortArray(input));
    }
    
    @Test
    void testSortArray_evenSum() {
        List<Object> input = new ArrayList<>();
        input.add(2);
        input.add(4);
        input.add(3);
        input.add(0);
        input.add(1);
        input.add(5);
        input.add(6);
        List<Object> expected = new ArrayList<>();
        expected.add(6);
        expected.add(5);
        expected.add(4);
        expected.add(3);
        expected.add(2);
        expected.add(1);
        expected.add(0);
        assertEquals(expected, SortArray1.sortArray(input));
    }
    
    // Add more test cases as needed
    
}
```
```