// MoveOneBallTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MoveOneBall}.
* It contains ten unit test cases for the {@link MoveOneBall#moveOneBall(List)} method.
*/
class MoveOneBallTest {

	@Test
	void testMoveOneBall_1() {
		List<Object> arr = List.of(1, 2, 3, 4, 5);
		assertTrue(MoveOneBall.moveOneBall(arr));
	}
	
	@Test
	void testMoveOneBall_2() {
		List<Object> arr = List.of(5, 4, 3, 2, 1);
		assertTrue(MoveOneBall.moveOneBall(arr));
	}
	
	@Test
	void testMoveOneBall_3() {
		List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		assertTrue(MoveOneBall.moveOneBall(arr));
	}
	
	@Test
	void testMoveOneBall_4() {
		List<Object> arr = List.of(10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
		assertTrue(MoveOneBall.moveOneBall(arr));
	}
	
	@Test
	void testMoveOneBall_5() {
		List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
		assertTrue(MoveOneBall.moveOneBall(arr));
	}
	
	@Test
	void testMoveOneBall_6() {
		List<Object> arr = List.of(20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
		assertTrue(MoveOneBall.moveOneBall(arr));
	}
	
	@Test
	void testMoveOneBall_7() {
		List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30);
		assertTrue(MoveOneBall.moveOneBall(arr));
	}
	
	@Test
	void testMoveOneBall_8() {
		List<Object> arr = List.of(30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
		assertTrue(MoveOneBall.moveOneBall(arr));
	}
	
	@Test
	void testMoveOneBall_9() {
		List<Object> arr = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40);
		assertTrue(MoveOneBall.moveOneBall(arr));
	}
	
	@Test
	void testMoveOneBall_10() {
		List<Object> arr = List.of(40, 39, 38, 37, 36, 35, 34, 33, 32, 31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1);
		assertTrue(MoveOneBall.moveOneBall(arr));
	}
}