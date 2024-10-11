// WillItFlyTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link WillItFly}.
* It contains ten unit test cases for the {@link WillItFly#willItFly(List, int)} method.
*/
class WillItFlyTest {
	@Test
			void testWillItFly1() {
				List<Integer> q = List.of(3, 2, 3);
				int w = 9;
				boolean result = WillItFly.willItFly(q, w);
				assertTrue(result);
			}

			@Test
			void testWillItFly2() {
				List<Integer> q = List.of(1, 2);
				int w = 5;
				boolean result = WillItFly.willItFly(q, w);
				assertFalse(result);
			}

			@Test
			void testWillItFly3() {
				List<Integer> q = List.of(3);
				int w = 5;
				boolean result = WillItFly.willItFly(q, w);
				assertTrue(result);
			}

			@Test
			void testWillItFly4() {
				List<Integer> q = List.of(3, 2, 3);
				int w = 1;
				boolean result = WillItFly.willItFly(q, w);
				assertFalse(result);
			}

			@Test
			void testWillItFly5() {
				List<Integer> q = List.of(1, 2, 3);
				int w = 6;
				boolean result = WillItFly.willItFly(q, w);
				assertFalse(result);
			}

			@Test
			void testWillItFly6() {
				List<Integer> q = List.of(5);
				int w = 5;
				boolean result = WillItFly.willItFly(q, w);
				assertTrue(result);
			}

			@Test
			void testWillItFly7() {
				List<Integer> q = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
				int w = 45;
				boolean result = WillItFly.willItFly(q, w);
				assertTrue(result);
			}

			@Test
			void testWillItFly8() {
				List<Integer> q = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
				int w = 44;
				boolean result = WillItFly.willItFly(q, w);
				assertFalse(result);
			}

			@Test
			void testWillItFly9() {
				List<Integer> q = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
				int w = 46;
				boolean result = WillItFly.willItFly(q, w);
				assertFalse(result);
			}

			@Test
			void testWillItFly10() {
				List<Integer> q = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
				int w = 45;
				boolean result = WillItFly.willItFly(q, w);
				assertTrue(result);
			}
}