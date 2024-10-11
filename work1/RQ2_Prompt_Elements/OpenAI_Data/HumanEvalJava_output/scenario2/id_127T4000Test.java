// IntersectionTest.java
package scenario2;

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
		assertEquals("YES", Intersection.intersection(List.of(1, 3), List.of(2, 4)));
		assertEquals("NO", Intersection.intersection(List.of(1, 3), List.of(4, 5)));
		assertEquals("NO", Intersection.intersection(List.of(1, 3), List.of(2, 2)));
		assertEquals("YES", Intersection.intersection(List.of(1, 3), List.of(1, 3)));
		assertEquals("YES", Intersection.intersection(List.of(1, 3), List.of(1, 2)));
		assertEquals("YES", Intersection.intersection(List.of(1, 3), List.of(2, 3)));
		assertEquals("NO", Intersection.intersection(List.of(1, 3), List.of(3, 4)));
		assertEquals("NO", Intersection.intersection(List.of(1, 3), List.of(0, 0)));
		assertEquals("NO", Intersection.intersection(List.of(1, 3), List.of(4, 4)));
		assertEquals("NO", Intersection.intersection(List.of(1, 3), List.of(0, 1)));
	}
}