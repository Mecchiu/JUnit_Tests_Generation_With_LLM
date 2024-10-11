// CompareTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Compare}.
* It contains one unit test case for the {@link Compare#compare(List, List)} method.
*/
class CompareTest {

	private final Compare compare;
	
	public CompareTest() {
		compare = new Compare();
	}

	@Test
	void compare() {
		// example: compare([1, 2, 3, 4, 5, 1], [1, 2, 3, 4, 2, -2])
		// result: [1, 2, 3, 4, 1, 2, 3, 4, 2, -2]
		compare.compare(Collections.singletonList(1), Collections.singletonList(7));
		compare.compare(Collections.singletonList(1), Collections.singletonList(-16));
		compare.compare(Collections.singletonList(1), Collections.singletonList(24));

		// example: compare([0,5,0,0,0,4],[4,1,1,0,0,-2])
		// result: [0,0,0,0,3,3]
		compare.compare(Collections.singletonList(-1), Collections.singletonList(-2));
		compare.compare(Collections.singletonList(-1), Collections.singletonList(-1));
		compare.compare(Collections.singletonList(-1), Collections.singletonList(24));

		// example: compare([1,2,3,4,5,1], [-1,2,3,4,2,3])
		// result: [0,2,4,6]
		compare.compare(Collections.singletonList(-2), Collections.singletonList(-1));
		compare.compare(Collections.singletonList(-2), Collections.singletonList(6));
		compare.compare(Collections.singletonList(-2), Collections.singletonList(-4));

		// example: compare([1,2,3,4,5,1], [1,2,3,4,2,3])
		// result: [1,2,3,4,5,1]
		compare.compare(Collections.singletonList(1), Collections.singletonList(2));
		compare.compare(Collections.singletonList(1), Collections.singletonList(5));
		compare.compare(Collections.singletonList(1), Collections.singletonList(7));
		compare.compare(Collections.singletonList(1), Collections.singletonList(10));
		compare.compare(Collections.singletonList(1), Collections.singletonList(11));
		compare.compare(Collections.singletonList(1), Collections.singletonList(13));

		// example: compare([1,2,3,4,5,1], [-1,1,1,2,2,2])
		// result: [1,3,4,6]
		compare.compare(Collections.singletonList(-1), Collections.singletonList(1));
		compare.compare(Collections.singletonList(1), Collections.singletonList(-1));
		compare.compare(Collections.singletonList(-1), Collections.singletonList(2));

		// example: compare([1,2,3,4,5,1], [-2,0,0,0,1,2])
		// result: [0,0,0,1,2]
		compare.compare(Collections.singletonList(-1), Collections.singletonList(-2));
		compare.compare(Collections.singletonList(-1), Collections.singletonList(6));
		compare.compare(Collections.singletonList(-1), Collections.singletonList(10));
		compare.compare(Collections.singletonList(1), Collections.singletonList(11));
		compare.compare(Collections.singletonList(1), Collections.singletonList(13));

		// example: compare([1,2,3,4,5,1], [-1,2,3,4,2,3])
		// result: [1,3,4,5,1]
		compare.compare(Collections.singletonList(1), Collections.singletonList(2));
		compare.compare(Collections.singletonList(1), Collections.singletonList(5));
		compare.compare(Collections.singletonList(1), Collections.singletonList(7));
		compare.compare(Collections.singletonList(1), Collections.singletonList(10));
		compare.compare(Collections.singletonList(1), Collections.singletonList(11));
		compare.compare(Collections.singletonList(1), Collections.singletonList(13));

		// example: compare([1,2,3,4,5,1], [-2,0,0,0,1,2])
		// result: [0,0,0,1,2]
		compare.compare(Collections.singletonList(-1), Collections.singletonList(2));
		compare.compare(Collections.singletonList(-1), Collections.singletonList(6));
		compare.compare(Collections.singletonList(-1), Collections.singletonList(10));
		compare.compare(Collections.singletonList(1), Collections.singletonList(11));
		compare.compare(Collections.singletonList(1), Collections.singletonList(13));
	}
}