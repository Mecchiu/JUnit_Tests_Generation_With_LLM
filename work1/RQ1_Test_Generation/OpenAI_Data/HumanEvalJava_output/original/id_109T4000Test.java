// MoveOneBallTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MoveOneBall}.
* It contains ten unit test cases for the {@link MoveOneBall#moveOneBall(List)} method.
*/
class MoveOneBallTest {

	@Test
	void testMoveOneBall() {
		assertTrue(MoveOneBall.moveOneBall(List.of(3, 4, 5, 1, 2)));
		assertTrue(MoveOneBall.moveOneBall(List.of(3, 5, 10, 1, 2)));
		assertFalse(MoveOneBall.moveOneBall(List.of(4, 3, 1, 2)));
		assertFalse(MoveOneBall.moveOneBall(List.of(3, 5, 4, 1, 2)));
		assertTrue(MoveOneBall.moveOneBall(List.of()));
		assertTrue(MoveOneBall.moveOneBall(List.of(1, 2, 3, 4, 5)));
		assertTrue(MoveOneBall.moveOneBall(List.of(1, 2, 3, 4, 5, 6)));
		assertTrue(MoveOneBall.moveOneBall(List.of(1, 2, 3, 4, 5, 6, 7)));
		assertTrue(MoveOneBall.moveOneBall(List.of(1, 2, 3, 4, 5, 6, 7, 8)));
		assertTrue(MoveOneBall.moveOneBall(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9)));
	}
}