```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MoveOneBallTest {

    @Test
    void testMoveOneBallCase1() {
        assertTrue(MoveOneBall.moveOneBall(List.of(3, 4, 5, 1, 2)));
    }

    @Test
    void testMoveOneBallCase2() {
        assertTrue(MoveOneBall.moveOneBall(List.of(3, 5, 10, 1, 2)));
    }

    @Test
    void testMoveOneBallCase3() {
        assertFalse(MoveOneBall.moveOneBall(List.of(4, 3, 1, 2)));
    }

    @Test
    void testMoveOneBallCase4() {
        assertFalse(MoveOneBall.moveOneBall(List.of(3, 5, 4, 1, 2)));
    }

    @Test
    void testMoveOneBallCase5() {
        assertTrue(MoveOneBall.moveOneBall(List.of()));
    }

    // Add more test cases as needed
}
```
