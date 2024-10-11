// TriTest.java
package scenario2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Tri}.
* It contains ten unit test cases for the {@link Tri#tri(int)} method.
*/
class TriTest {
	@Test
			void testTri0() {
				List<Number> expected = Arrays.asList(1);
				List<Number> actual = Tri.tri(0);
				assertEquals(expected, actual);
			}

			@Test
			void testTri1() {
				List<Number> expected = Arrays.asList(1, 3);
				List<Number> actual = Tri.tri(1);
				assertEquals(expected, actual);
			}

			@Test
			void testTri2() {
				List<Number> expected = Arrays.asList(1, 3, 2);
				List<Number> actual = Tri.tri(2);
				assertEquals(expected, actual);
			}

			@Test
			void testTri3() {
				List<Number> expected = Arrays.asList(1, 3, 2, 8);
				List<Number> actual = Tri.tri(3);
				assertEquals(expected, actual);
			}

			@Test
			void testTri4() {
				List<Number> expected = Arrays.asList(1, 3, 2, 8, 5);
				List<Number> actual = Tri.tri(4);
				assertEquals(expected, actual);
			}

			@Test
			void testTri5() {
				List<Number> expected = Arrays.asList(1, 3, 2, 8, 5, 16);
				List<Number> actual = Tri.tri(5);
				assertEquals(expected, actual);
			}

			@Test
			void testTri6() {
				List<Number> expected = Arrays.asList(1, 3, 2, 8, 5, 16, 9);
				List<Number> actual = Tri.tri(6);
				assertEquals(expected, actual);
			}

			@Test
			void testTri7() {
				List<Number> expected = Arrays.asList(1, 3, 2, 8, 5, 16, 9, 32);
				List<Number> actual = Tri.tri(7);
				assertEquals(expected, actual);
			}

			@Test
			void testTri8() {
				List<Number> expected = Arrays.asList(1, 3, 2, 8, 5, 16, 9, 32, 17);
				List<Number> actual = Tri.tri(8);
				assertEquals(expected, actual);
			}

			@Test
			void testTri9() {
				List<Number> expected = Arrays.asList(1, 3, 2, 8, 5, 16, 9, 32, 17, 64);
				List<Number> actual = Tri.tri(9);
				assertEquals(expected, actual);
			}

			@Test
			void testTri10() {
				List<Number> expected = Arrays.asList(1, 3, 2, 8, 5, 16, 9, 32, 17, 64, 33);
				List<Number> actual = Tri.tri(10);
				assertEquals(expected, actual);
			}
		}
