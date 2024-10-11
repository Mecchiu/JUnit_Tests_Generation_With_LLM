// FTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link F}.
* It contains ten unit test cases for the {@link F#f(int)} method.
*/
class FTest {
	@Test
			void testF() {
				List<Integer> result = F.f(5);
				assertEquals(1, result.get(0));
				assertEquals(2, result.get(1));
				assertEquals(6, result.get(2));
				assertEquals(24, result.get(3));
				assertEquals(15, result.get(4));
			}

			@Test
			void testF2() {
				List<Integer> result = F.f(7);
				assertEquals(1, result.get(0));
				assertEquals(2, result.get(1));
				assertEquals(6, result.get(2));
				assertEquals(24, result.get(3));
				assertEquals(15, result.get(4));
				assertEquals(720, result.get(5));
				assertEquals(28, result.get(6));
			}

			@Test
			void testF3() {
				List<Integer> result = F.f(1);
				assertEquals(1, result.get(0));
			}

			@Test
			void testF4() {
				List<Integer> result = F.f(3);
				assertEquals(1, result.get(0));
				assertEquals(2, result.get(1));
				assertEquals(6, result.get(2));
			}

			@Test
			void testF5() {
				List<Integer> result = F.f(0);
				assertEquals(0, result.size());
			}

			@Test
			void testF6() {
				List<Integer> result = F.f(-1);
				assertEquals(0, result.size());
			}

			@Test
			void testF7() {
				List<Integer> result = F.f(10);
				assertEquals(1, result.get(0));
				assertEquals(2, result.get(1));
				assertEquals(6, result.get(2));
				assertEquals(24, result.get(3));
				assertEquals(15, result.get(4));
				assertEquals(720, result.get(5));
				assertEquals(28, result.get(6));
				assertEquals(40320, result.get(7));
				assertEquals(36, result.get(8));
				assertEquals(362880, result.get(9));
			}

			@Test
			void testF8() {
				List<Integer> result = F.f(11);
				assertEquals(1, result.get(0));
				assertEquals(2, result.get(1));
				assertEquals(6, result.get(2));
				assertEquals(24, result.get(3));
				assertEquals(15, result.get(4));
				assertEquals(720, result.get(5));
				assertEquals(28, result.get(6));
				assertEquals(40320, result.get(7));
				assertEquals(36, result.get(8));
				assertEquals(362880, result.get(9));
				assertEquals(45, result.get(10));
			}

			@Test
			void testF9() {
				List<Integer> result = F.f(12);
				assertEquals(1, result.get(0));
				assertEquals(2, result.get(1));
				assertEquals(6, result.get(2));
				assertEquals(24, result.get(3));
				assertEquals(15, result.get(4));
				assertEquals(720, result.get(5));
				assertEquals(28, result.get(6));
				assertEquals(40320, result.get(7));
				assertEquals(36, result.get(8));
				assertEquals(362880, result.get(9));
				assertEquals(45, result.get(10));
				assertEquals(479001600, result.get(11));
			}

			@Test
			void testF10() {
				List<Integer> result = F.f(13);
				assertEquals(1, result.get(0));
				assertEquals(2, result.get(1));
				assertEquals(6, result.get(2));
				assertEquals(24, result.get(3));
				assertEquals(15, result.get(4));
				assertEquals(720, result.get(5));
				assertEquals(28, result.get(6));
				assertEquals(40320, result.get(7));
				assertEquals(36, result.get(8));
				assertEquals(362880, result.get(9));
				assertEquals(45, result.get(10));
				assertEquals(479001600, result.get(11));
				assertEquals(55, result.get(12));
			}
}
