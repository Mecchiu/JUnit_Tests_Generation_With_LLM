// Here's the source code for the test class:

class StrangeSortListTest {

    @Test
    void testEmptyList() {
        List<Object> lst = new ArrayList<Object>();
        List<Object> expected = new ArrayList<Object>();
        List<Object> actual = StrangeSortList.strangeSortList(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testSingleInteger() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(42);
        List<Object> expected = new ArrayList<Object>();
        expected.add(42);
        List<Object> actual = StrangeSortList.strangeSortList(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testMultipleIntegers() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(3);
        lst.add(1);
        lst.add(4);
        lst.add(1);
        lst.add(5);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(5);
        expected.add(1);
        expected.add(4);
        expected.add(3);
        List<Object> actual = StrangeSortList.strangeSortList(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testMixedList() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(3);
        lst.add("hello");
        lst.add(4);
        lst.add(1);
        lst.add(5);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(5);
        expected.add(3);
        expected.add(4);
        expected.add("hello");
        List<Object> actual = StrangeSortList.strangeSortList(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testAllSameIntegers() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(1);
        lst.add(1);
        lst.add(1);
        lst.add(1);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(1);
        expected.add(1);
        expected.add(1);
        List<Object> actual = StrangeSortList.strangeSortList(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testNegativeIntegers() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(-3);
        lst.add(-1);
        lst.add(-4);
        lst.add(-1);
        lst.add(-5);
        List<Object> expected = new ArrayList<Object>();
        expected.add(-5);
        expected.add(-1);
        expected.add(-4);
        expected.add(-1);
        expected.add(-3);
        List<Object> actual = StrangeSortList.strangeSortList(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testMixedNegativeIntegers() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(-3);
        lst.add("hello");
        lst.add(-4);
        lst.add(-1);
        lst.add(-5);
        List<Object> expected = new ArrayList<Object>();
        expected.add(-5);
        expected.add(-1);
        expected.add(-3);
        expected.add(-4);
        expected.add("hello");
        List<Object> actual = StrangeSortList.strangeSortList(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testMixedPositiveAndNegativeIntegers() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(-3);
        lst.add(1);
        lst.add(-4);
        lst.add(-1);
        lst.add(5);
        List<Object> expected = new ArrayList<Object>();
        expected.add(-4);
        expected.add(5);
        expected.add(-3);
        expected.add(1);
        expected.add(-1);
        List<Object> actual = StrangeSortList.strangeSortList(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testDuplicateIntegers() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(3);
        lst.add(1);
        lst.add(4);
        lst.add(1);
        lst.add(5);
        lst.add(4);
        List<Object> expected = new ArrayList<Object>();
        expected.add(1);
        expected.add(5);
        expected.add(1);
        expected.add(4);
        expected.add(3);
        expected.add(4);
        List<Object> actual = StrangeSortList.strangeSortList(lst);
        assertEquals(expected, actual);
    }

    @Test
    void testNullValues() {
        List<Object> lst = new ArrayList<Object>();
        lst.add(null);
        lst.add(3);
        lst.add(null);
        lst.add(1);
        lst.add(4);
        lst.add(1);
        lst.add(5);
        List<Object> expected = new ArrayList<Object>();
        expected.add(null);
        expected.add(5);
        expected.add(1);
        expected.add(4);
        expected.add(1);
        expected.add(3);
        expected.add(null);
        List<Object> actual = StrangeSortList.strangeSortList(lst);
        assertEquals(expected, actual);
    }
}