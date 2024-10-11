// MoveOneBallTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MoveOneBall}.
* It contains one unit test case for the {@link MoveOneBall#moveOneBall(List)} method.
*/
class MoveOneBallTest {
@Test
		void testMoveOneBall() {
				moveOneBall(List.of(0, 1, 2, 3, 4, 5, 6));
		}
}
