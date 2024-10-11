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
			void testSpecialfilter1() {
				List<Object> nums = List.of(5, -2, 1, -5);
				assertEquals(0, Specialfilter.specialfilter(nums));
			}

			@Test
			void testSpecialfilter2() {
				List<Object> nums = List.of(15, -73, 14, -15);
				assertEquals(1, Specialfilter.specialfilter(nums));
			}

			@Test
			void testSpecialfilter3() {
				List<Object> nums = List.of(33, -2, -3, 45, 21, 109);
				assertEquals(2, Specialfilter.specialfilter(nums));
			}

			@Test
			void testSpecialfilter4() {
				List<Object> nums = List.of(43, -12, 93, 125, 121, 109);
				assertEquals(4, Specialfilter.specialfilter(nums));
			}

			@Test
			void testSpecialfilter5() {
				List<Object> nums = List.of(71, -2, -33, 75, 21, 19);
				assertEquals(3, Specialfilter.specialfilter(nums));
			}

			@Test
			void testSpecialfilter6() {
				List<Object> nums = List.of(1);
				assertEquals(0, Specialfilter.specialfilter(nums));
			}

			@Test
			void testSpecialfilter7() {
				List<Object> nums = List.of();
				assertEquals(0, Specialfilter.specialfilter(nums));
			}

			@Test
			void testSpecialfilter8() {
				List<Object> nums = List.of(11, 12, 13, 14, 15, 16, 17, 18, 19);
				assertEquals(5, Specialfilter.specialfilter(nums));
			}

			@Test
			void testSpecialfilter9() {
				List<Object> nums = List.of(11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
				assertEquals(5, Specialfilter.specialfilter(nums));
			}

			@Test
			void testSpecialfilter10() {
				List<Object> nums = List.of(11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21);
				assertEquals(6, Specialfilter.specialfilter(nums));
			}
}