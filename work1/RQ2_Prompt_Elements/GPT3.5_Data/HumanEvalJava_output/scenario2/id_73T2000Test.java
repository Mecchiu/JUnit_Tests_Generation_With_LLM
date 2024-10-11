import java.util.Arrays;
import java.util.List;

class SmallestChangeTest {

    @Test
    void testEmptyList() {
        List<Integer> arr = Arrays.asList();
        assertEquals(0, SmallestChange.smallestChange(arr));
    }

    @Test
    void testSingleElementList() {
        List<Integer> arr = Arrays.asList(1);
        assertEquals(0, SmallestChange.smallestChange(arr));
    }

    @Test
    void testTwoElementPalindrome() {
        List<Integer> arr = Arrays.asList(1, 1);
        assertEquals(0, SmallestChange.smallestChange(arr));
    }

    @Test
    void testTwoElementNonPalindrome() {
        List<Integer> arr = Arrays.asList(1, 2);
        assertEquals(1, SmallestChange.smallestChange(arr));
    }

    @Test
    void testThreeElementPalindrome() {
        List<Integer> arr = Arrays.asList(1, 2, 1);
        assertEquals(0, SmallestChange.smallestChange(arr));
    }

    @Test
    void testThreeElementNonPalindrome() {
        List<Integer> arr = Arrays.asList(1, 2, 3);
        assertEquals(2, SmallestChange.smallestChange(arr));
    }

    @Test
    void testFourElementPalindrome() {
        List<Integer> arr = Arrays.asList(1, 2, 2, 1);
        assertEquals(0, SmallestChange.smallestChange(arr));
    }

    @Test
    void testFourElementNonPalindrome() {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4);
        assertEquals(3, SmallestChange.smallestChange(arr));
    }

    @Test
    void testFiveElementPalindrome() {
        List<Integer> arr = Arrays.asList(1, 2, 3, 2, 1);
        assertEquals(0, SmallestChange.smallestChange(arr));
    }

    @Test
    void testFiveElementNonPalindrome() {
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(4, SmallestChange.smallestChange(arr));
    }
}