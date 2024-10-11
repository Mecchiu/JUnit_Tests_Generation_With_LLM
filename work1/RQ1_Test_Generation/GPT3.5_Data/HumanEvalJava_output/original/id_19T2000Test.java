```java
class SortNumbersTest {

    @Test
    void testSortNumbers_ThreeOneFive() {
        assertEquals("one three five", SortNumbers.sortNumbers("three one five"));
    }

    @Test
    void testSortNumbers_EmptyString() {
        assertEquals("", SortNumbers.sortNumbers(""));
    }

    @Test
    void testSortNumbers_Three() {
        assertEquals("three", SortNumbers.sortNumbers("three"));
    }

    @Test
    void testSortNumbers_ThreeFiveNine() {
        assertEquals("three five nine", SortNumbers.sortNumbers("three five nine"));
    }

    @Test
    void testSortNumbers_FiveZeroFourSevenNineEight() {
        assertEquals("zero four five seven eight nine", SortNumbers.sortNumbers("five zero four seven nine eight"));
    }

    @Test
    void testSortNumbers_SixFiveFourThreeTwoOneZero() {
        assertEquals("zero one two three four five six", SortNumbers.sortNumbers("six five four three two one zero"));
    }

    @Test
    void testSortNumbers_InvalidInput() {
        assertEquals("", SortNumbers.sortNumbers("invalid input"));
    }

    @Test
    void testSortNumbers_MultipleOccurrences() {
        assertEquals("one one three three five five", SortNumbers.sortNumbers("three one five three one five"));
    }

    @Test
    void testSortNumbers_AllNumbers() {
        assertEquals("zero one two three four five six seven eight nine", SortNumbers.sortNumbers("zero one two three four five six seven eight nine"));
    }

    @Test
    void testSortNumbers_RepeatedNumbers() {
        assertEquals("zero zero one one two two three three four four five five six six seven seven eight eight nine nine", SortNumbers.sortNumbers("zero one two three four five six seven eight nine zero one two three four five six seven eight nine"));
    }
}
```
```