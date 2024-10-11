Here's the source code for the SortArrayTest class with ten unit test cases for the sortArray method:

```
class SortArrayTest {

    @Test
    void testSortArrayWithEmptyList() {
        List<Object> arr = new ArrayList<Object>();
        List<Object> expected = new ArrayList<Object>();
        List<Object> result = SortArray.sortArray(arr);
        assertEquals(expected, result);
    }

    @Test
    void testSortArrayWithOneElement() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(5);
        List<Object> expected = new ArrayList<Object>();
        expected.add(5);
        List<Object> result = SortArray.sortArray(arr);
        assertEquals(expected, result);
    }

    @Test
    void testSortArrayWithTwoElements() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(5);
        arr.add(3);
        List<Object> expected = new ArrayList<Object>();
        expected.add(3);
        expected.add(5);
        List<Object> result = SortArray.sortArray(arr);
        assertEquals(expected, result);
    }

    @Test
    void testSortArrayWithMultipleElements() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(5);
        arr.add(3);
        arr.add(7);
        arr.add(2);
        arr.add(8);
        List<Object> expected = new ArrayList<Object>();
        expected.add(3);
        expected.add(5);
        expected.add(2);
        expected.add(7);
        expected.add(8);
        List<Object> result = SortArray.sortArray(arr);
        assertEquals(expected, result);
    }

    @Test
    void testSortArrayWithNegativeElements() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(-5);
        arr.add(3);
        arr.add(-7);
        arr.add(2);
        arr.add(8);
        List<Object> expected = new ArrayList<Object>();
        expected.add(-7);
        expected.add(3);
        expected.add(-5);
        expected.add(2);
        expected.add(8);
        List<Object> result = SortArray.sortArray(arr);
        assertEquals(expected, result);
    }

    @Test
    void testSortArrayWithDuplicateElements() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(5);
        arr.add(3);
        arr.add(7);
        arr.add(2);
        arr.add(5);
        List<Object> expected = new ArrayList<Object>();
        expected.add(3);
        expected.add(5);
        expected.add(5);
        expected.add(2);
        expected.add(7);
        List<Object> result = SortArray.sortArray(arr);
        assertEquals(expected, result);
    }

    @Test
    void testSortArrayWithAllZeros() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(0);
        arr.add(0);
        arr.add(0);
        List<Object> expected = new ArrayList<Object>();
        expected.add(0);
        expected.add(0);
        expected.add(0);
        List<Object> result = SortArray.sortArray(arr);
        assertEquals(expected, result);
    }

    @Test
    void testSortArrayWithAllOnes() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(1);
        arr.add(1);
        arr.add(1);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(1);
        expected.add(1);
        List<Object> result = SortArray.sortArray(arr);
        assertEquals(expected, result);
    }

    @Test
    void testSortArrayWithMixedElements() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(5);
        arr.add(-3);
        arr.add(7);
        arr.add(0);
        arr.add(8);
        arr.add(-2);
        List<Object> expected = new ArrayList<Object>();
        expected.add(-3);
        expected.add(7);
        expected.add(-2);
        expected.add(0);
        expected.add(5);
        expected.add(8);
        List<Object> result = SortArray.sortArray(arr);
        assertEquals(expected, result);
    }

    @Test
    void testSortArrayWithLargeNumbers() {
        List<Object> arr = new ArrayList<Object>();
        arr.add(1000000);
        arr.add(999999);
        arr.add(1000001);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1000001);
        expected.add(999999);
        expected.add(1000000);
        List<Object> result = SortArray.sortArray(arr);
        assertEquals(expected, result);
    }
}
```