// MoveOneBallTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MoveOneBall}.
* It contains ten unit test cases for the {@link MoveOneBall#moveOneBall(List)} method.
*/
class MoveOneBallTest {
			// Test case 1: Empty list
    @Test
    void testEmptyList() {
        List<Object> arr = List.of();
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    // Test case 2: One element
    @Test
    void testOneElement() {
        List<Object> arr = List.of(1);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    // Test case 3: Two elements
    @Test
    void testTwoElements() {
        List<Object> arr = List.of(1, 2);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    // Test case 4: Three elements
    @Test
    void testThreeElements() {
        List<Object> arr = List.of(1, 2, 3);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    // Test case 5: Four elements
    @Test
    void testFourElements() {
        List<Object> arr = List.of(1, 2, 3, 4);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    // Test case 6: Five elements
    @Test
    void testFiveElements() {
        List<Object> arr = List.of(1, 2, 3, 4, 5);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    // Test case 7: Six elements
    @Test
    void testSixElements() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 6);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    // Test case 8: Seven elements
    @Test
    void testSevenElements() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    // Test case 9: Eight elements
    @Test
    void testEightElements() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }

    // Test case 10: Nine elements
    @Test
    void testNineElements() {
        List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertTrue(MoveOneBall.moveOneBall(arr));
    }
}