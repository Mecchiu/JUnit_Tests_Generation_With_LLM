// RollingMaxTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RollingMax}.
* It contains ten unit test cases for the {@link RollingMax#rollingMax(List)} method.
*/
class RollingMaxTest {

	@Test
	void testRollingMax() {
		assertEquals(List.of(1, 2, 3, 3, 3, 4, 4), RollingMax.rollingMax(List.of(1, 2, 3, 2, 3, 4, 2)));
		assertEquals(List.of(), RollingMax.rollingMax(List.of()));
		assertEquals(List.of(1, 2, 3, 4), RollingMax.rollingMax(List.of(1, 2, 3, 4)));
		assertEquals(List.of(4, 4, 4, 4), RollingMax.rollingMax(List.of(4, 3, 2, 1)));
		assertEquals(List.of(3, 3, 3, 100, 100), RollingMax.rollingMax(List.of(3, 2, 3, 100, 3)));
		assertEquals(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), RollingMax.rollingMax(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
		assertEquals(List.of(10, 10, 10, 10, 10, 10, 10, 10, 10, 10), RollingMax.rollingMax(List.of(10, 9, 8, 7, 6, 5, 4, 3, 2, 1)));
		assertEquals(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), RollingMax.rollingMax(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
		assertEquals(List.of(10, 10, 10, 10, 10, 10, 10, 10, 10, 10), RollingMax.rollingMax(List.of(10, 9, 8, 7, 6, 5, 4, 3, 2, 1)));
		assertEquals(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), RollingMax.rollingMax(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
	}
}