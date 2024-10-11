// TriTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Tri}.
* It contains ten unit test cases for the {@link Tri#tri(int)} method.
*/
class TriTest {
	@Test
			void testTri() {
				List<Number> result = Tri.tri(3);
				assertEquals(1, result.get(0));
				assertEquals(3, result.get(1));
				assertEquals(2.0, result.get(2));
				assertEquals(8.0, result.get(3));
			}

			@Test
			void testTri2() {
				List<Number> result = Tri.tri(4);
				assertEquals(1, result.get(0));
				assertEquals(3, result.get(1));
				assertEquals(2.0, result.get(2));
				assertEquals(8.0, result.get(3));
				assertEquals(3.0, result.get(4));
			}

			@Test
			void testTri3() {
				List<Number> result = Tri.tri(5);
				assertEquals(1, result.get(0));
				assertEquals(3, result.get(1));
				assertEquals(2.0, result.get(2));
				assertEquals(8.0, result.get(3));
				assertEquals(3.0, result.get(4));
				assertEquals(15.0, result.get(5));
			}

			@Test
			void testTri4() {
				List<Number> result = Tri.tri(6);
				assertEquals(1, result.get(0));
				assertEquals(3, result.get(1));
				assertEquals(2.0, result.get(2));
				assertEquals(8.0, result.get(3));
				assertEquals(3.0, result.get(4));
				assertEquals(15.0, result.get(5));
				assertEquals(4.0, result.get(6));
			}

			@Test
			void testTri5() {
				List<Number> result = Tri.tri(7);
				assertEquals(1, result.get(0));
				assertEquals(3, result.get(1));
				assertEquals(2.0, result.get(2));
				assertEquals(8.0, result.get(3));
				assertEquals(3.0, result.get(4));
				assertEquals(15.0, result.get(5));
				assertEquals(4.0, result.get(6));
				assertEquals(24.0, result.get(7));
			}

			@Test
			void testTri6() {
				List<Number> result = Tri.tri(8);
				assertEquals(1, result.get(0));
				assertEquals(3, result.get(1));
				assertEquals(2.0, result.get(2));
				assertEquals(8.0, result.get(3));
				assertEquals(3.0, result.get(4));
				assertEquals(15.0, result.get(5));
				assertEquals(4.0, result.get(6));
				assertEquals(24.0, result.get(7));
				assertEquals(5.0, result.get(8));
			}

			@Test
			void testTri7() {
				List<Number> result = Tri.tri(9);
				assertEquals(1, result.get(0));
				assertEquals(3, result.get(1));
				assertEquals(2.0, result.get(2));
				assertEquals(8.0, result.get(3));
				assertEquals(3.0, result.get(4));
				assertEquals(15.0, result.get(5));
				assertEquals(4.0, result.get(6));
				assertEquals(24.0, result.get(7));
				assertEquals(5.0, result.get(8));
				assertEquals(35.0, result.get(9));
			}

			@Test
			void testTri8() {
				List<Number> result = Tri.tri(20);
				assertEquals(1, result.get(0));
				assertEquals(3, result.get(1));
				assertEquals(2.0, result.get(2));
				assertEquals(8.0, result.get(3));
				assertEquals(3.0, result.get(4));
				assertEquals(15.0, result.get(5));
				assertEquals(4.0, result.get(6));
				assertEquals(24.0, result.get(7));
				assertEquals(5.0, result.get(8));
				assertEquals(35.0, result.get(9));
				assertEquals(6.0, result.get(10));
				assertEquals(48.0, result.get(11));
				assertEquals(7.0, result.get(12));
				assertEquals(63.0, result.get(13));
				assertEquals(8.0, result.get(14));
				assertEquals(80.0, result.get(15));
				assertEquals(9.0, result.get(16));
				assertEquals(99.0, result.get(17));
				assertEquals(10.0, result.get(18));
				assertEquals(120.0, result.get(19));
				assertEquals(11.0, result.get(20));
			}

			@Test
			void testTri9() {
				List<Number> result = Tri.tri(0);
				assertEquals(1, result.get(0));
			}

			@Test
			void testTri10() {
				List<Number> result = Tri.tri(1);
				assertEquals(1, result.get(0));
				assertEquals(3, result.get(1));
			}
}
