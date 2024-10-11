// MoveOneBallTest.java
package scenario2;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MoveOneBall}.
* It contains ten unit test cases for the {@link MoveOneBall#moveOneBall(List)} method.
*/
class MoveOneBallTest {

    @Test
    void testEmptyList() {
        List<Object> arr = Arrays.asList();
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    @Test
    void testSingleElementList() {
        List<Object> arr = Arrays.asList(1);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    @Test
    void testSortedArray() {
        List<Object> arr = Arrays.asList(1, 2, 3, 4, 5);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    @Test
    void testUnsortedArray() {
        List<Object> arr = Arrays.asList(5, 1, 2, 3, 4);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    @Test
    void testUnsortedArray2() {
        List<Object> arr = Arrays.asList(3, 4, 5, 1, 2);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    @Test
    void testUnsortedArray3() {
        List<Object> arr = Arrays.asList(2, 3, 4, 5, 1);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    @Test
    void testUnsortedArray4() {
        List<Object> arr = Arrays.asList(4, 5, 1, 2, 3);
        assertFalse(MoveOneBall.moveOneBall(arr));
    }

    @Test
    void testUnsortedArray5() {
        List<Object> arr = Arrays.asList(5, 1, 2, 3, 4, 6);
        assertFalse(MoveOneBall.moveOneBall(arr));
    }

    @Test
    void testUnsortedArray6() {
        List<Object> arr = Arrays.asList(1, 2, 3, 4, 5, 0);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    @Test
    void testUnsortedArray7() {
        List<Object> arr = Arrays.asList(1, 2, 3, 5, 4, 6);
        assertFalse(MoveOneBall.moveOneBall(arr));
    }
}