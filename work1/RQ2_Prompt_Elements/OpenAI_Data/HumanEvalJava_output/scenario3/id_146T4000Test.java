// SpecialfilterTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Specialfilter}.
* It contains ten unit test cases for the {@link Specialfilter#specialfilter(List)} method.
*/
class SpecialfilterTest {

	@Test
	void testSpecialfilter() {
		assertEquals(0, Specialfilter.specialfilter(List.of(5, -2, 1, -5)));
		assertEquals(1, Specialfilter.specialfilter(List.of(15, -73, 14, -15)));
		assertEquals(2, Specialfilter.specialfilter(List.of(33, -2, -3, 45, 21, 109)));
		assertEquals(4, Specialfilter.specialfilter(List.of(43, -12, 93, 125, 121, 109)));
		assertEquals(3, Specialfilter.specialfilter(List.of(71, -2, -33, 75, 21, 19)));
		assertEquals(0, Specialfilter.specialfilter(List.of(1)));
		assertEquals(0, Specialfilter.specialfilter(List.of()));
		assertEquals(0, Specialfilter.specialfilter(List.of(0)));
		assertEquals(0, Specialfilter.specialfilter(List.of(10)));
		assertEquals(0, Specialfilter.specialfilter(List.of(11)));
	}
}