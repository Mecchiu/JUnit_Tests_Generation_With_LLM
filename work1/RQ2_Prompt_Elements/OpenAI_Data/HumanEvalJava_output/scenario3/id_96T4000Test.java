// CountUpToTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountUpTo}.
* It contains ten unit test cases for the {@link CountUpTo#countUpTo(int)} method.
*/
class CountUpToTest {

	@Test
	void testCountUpTo() {
		assertEquals(List.of(2, 3), CountUpTo.countUpTo(5));
		assertEquals(List.of(2, 3, 5), CountUpTo.countUpTo(6));
		assertEquals(List.of(2, 3, 5), CountUpTo.countUpTo(7));
		assertEquals(List.of(2, 3, 5, 7), CountUpTo.countUpTo(10));
		assertEquals(List.of(), CountUpTo.countUpTo(0));
		assertEquals(List.of(2, 3, 5, 7, 11, 13, 17, 19), CountUpTo.countUpTo(22));
		assertEquals(List.of(), CountUpTo.countUpTo(1));
		assertEquals(List.of(2, 3, 5, 7, 11, 13, 17), CountUpTo.countUpTo(18));
		assertEquals(List.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43), CountUpTo.countUpTo(47));
		assertEquals(List.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97), CountUpTo.countUpTo(101));
	}
}