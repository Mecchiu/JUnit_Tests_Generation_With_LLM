// IntersectionTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Intersection}.
* It contains ten unit test cases for the {@link Intersection#intersection(List, List)} method.
*/
class IntersectionTest {

	@Test
	void testIntersection() {
		assertEquals("NO", Intersection.intersection(List.of(1, 2), List.of(2, 3)));
		assertEquals("NO", Intersection.intersection(List.of(-1, 1), List.of(0, 4)));
		assertEquals("YES", Intersection.intersection(List.of(-3, -1), List.of(-5, 5)));
		assertEquals("YES", Intersection.intersection(List.of(-2, 2), List.of(-4, 0)));
		assertEquals("NO", Intersection.intersection(List.of(-11, 2), List.of(-1, -1)));
		assertEquals("NO", Intersection.intersection(List.of(1, 2), List.of(3, 5)));
		assertEquals("NO", Intersection.intersection(List.of(1, 2), List.of(1, 2)));
		assertEquals("NO", Intersection.intersection(List.of(-2, -2), List.of(-3, -2)));
		assertEquals("NO", Intersection.intersection(List.of(-1, 1), List.of(1, 3)));
		assertEquals("YES", Intersection.intersection(List.of(-1, 1), List.of(-1, 1)));
	}
}