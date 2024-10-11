// MoveOneBallTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MoveOneBall}.
* It contains ten unit test cases for the {@link MoveOneBall#moveOneBall(List)} method.
*/
class MoveOneBallTest {
	@Test
			void testMoveOneBall1() {
				List<Object> arr = List.of(3, 4, 5, 1, 2);
				assertTrue(MoveOneBall.moveOneBall(arr));
			}

			@Test
			void testMoveOneBall2() {
				List<Object> arr = List.of(3, 5, 10, 1, 2);
				assertTrue(MoveOneBall.moveOneBall(arr));
			}

			@Test
			void testMoveOneBall3() {
				List<Object> arr = List.of(4, 3, 1, 2);
				assertFalse(MoveOneBall.moveOneBall(arr));
			}

			@Test
			void testMoveOneBall4() {
				List<Object> arr = List.of(3, 5, 4, 1, 2);
				assertFalse(MoveOneBall.moveOneBall(arr));
			}

			@Test
			void testMoveOneBall5() {
				List<Object> arr = List.of();
				assertTrue(MoveOneBall.moveOneBall(arr));
			}

			@Test
			void testMoveOneBall6() {
				List<Object> arr = List.of(1);
				assertTrue(MoveOneBall.moveOneBall(arr));
			}

			@Test
			void testMoveOneBall7() {
				List<Object> arr = List.of(1, 2);
				assertTrue(MoveOneBall.moveOneBall(arr));
			}

			@Test
			void testMoveOneBall8() {
				List<Object> arr = List.of(2, 1);
				assertFalse(MoveOneBall.moveOneBall(arr));
			}

			@Test
			void testMoveOneBall9() {
				List<Object> arr = List.of(1, 2, 3, 4, 5);
				assertTrue(MoveOneBall.moveOneBall(arr));
			}

			@Test
			void testMoveOneBall10() {
				List<Object> arr = List.of(5, 4, 3, 2, 1);
				assertFalse(MoveOneBall.moveOneBall(arr));
			}
}
