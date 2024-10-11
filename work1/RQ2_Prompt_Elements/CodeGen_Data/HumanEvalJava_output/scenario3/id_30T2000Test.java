// GetPositiveTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPositive}.
* It contains one unit test case for the {@link GetPositive#getPositive(List)} method.
*/
class GetPositiveTest {

	/**
	 * Test case for {@link GetPositive#getPositive(List)}.
	 * @throws Exception
	 */
	@Test
	public void test() throws Exception {
		System.out.println("Starting");
		getPositive(new List<>(-1, 4, 9, 0));

		assertEquals(new List<>(-1, -1 - 4, 9, 1), new List<>(-1, -1 - 4, 9));
		assertEquals(new List<>(-1, 4, 9, 0), new List<>(-1, 4, 9, 0));

		assertEquals(new List<>(-1, -1 - 4, 9, 1), new List<>(-1, -1 - 4, 9));
		assertEquals(new List<>(-1, 4, 9, 0), new List<>(-1, 4, 9, 0));

		assertEquals(new List<>(-1, -1 - 4, 9, 1), new List<>(-1, -1 - 4, 9));
		assertEquals(new List<>(-1, 4, 9, 0), new List<>(-1, 4, 9, 0));
		
		assertEquals(new List<>(1, 2, 3, 4, -1), new List<>(1));
		assertEquals(new List<>(1, 2, 3, 4), new List<>(1));
	}
}



