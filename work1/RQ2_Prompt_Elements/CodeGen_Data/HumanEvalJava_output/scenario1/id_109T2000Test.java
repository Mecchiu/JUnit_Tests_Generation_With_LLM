// MoveOneBallTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MoveOneBall}.
* It contains one unit test case for the {@link MoveOneBall#moveOneBall(List)} method.
*/
class MoveOneBallTest {

	/**
	 * Test method for {@link MoveOneBall#moveOneBall(List} action.
	 * @throws Exception if the method execution fails
	*/
	@Test
	void testMoveOneBall() throws Exception {
		// mock
		
		// act
		List<Object> arr = moveOneBall(Arrays.asList(1));
		
		// assert
		assertNotNull("List with two elements", arr);
		
		assertTrue("Array size should be 1", arr.size());
	}
}
