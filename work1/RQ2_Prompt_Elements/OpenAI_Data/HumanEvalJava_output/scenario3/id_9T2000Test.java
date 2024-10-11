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
				List<Object> numbers = Arrays.asList(1, 2, 3, 2, 3, 4, 2);
				List<Object> expected = Arrays.asList(1, 2, 3, 3, 3, 4, 4);
				assertEquals(expected, RollingMax.rollingMax(numbers));
			}

			@Test
			void testRollingMaxEmptyList() {
				List<Object> numbers = Collections.emptyList();
				List<Object> expected = Collections.emptyList();
				assertEquals(expected, RollingMax.rollingMax(numbers));
			}

			@Test
			void testRollingMaxSingleElement() {
				List<Object> numbers = Collections.singletonList(1);
				List<Object> expected = Collections.singletonList(1);
				assertEquals(expected, RollingMax.rollingMax(numbers));
			}

			@Test
			void testRollingMaxTwoElements() {
				List<Object> numbers = Arrays.asList(1, 2);
				List<Object> expected = Arrays.asList(1, 2);
				assertEquals(expected, RollingMax.rollingMax(numbers));
			}

			@Test
			void testRollingMaxThreeElements() {
				List<Object> numbers = Arrays.asList(1, 2, 3);
				List<Object> expected = Arrays.asList(1, 2, 3);
				assertEquals(expected, RollingMax.rollingMax(numbers));
			}

			@Test
			void testRollingMaxFourElements() {
				List<Object> numbers = Arrays.asList(1, 2, 3, 4);
				List<Object> expected = Arrays.asList(1, 2, 3, 4);
				assertEquals(expected, RollingMax.rollingMax(numbers));
			}

			@Test
			void testRollingMaxDescendingOrder() {
				List<Object> numbers = Arrays.asList(4, 3, 2, 1);
				List<Object> expected = Arrays.asList(4, 4, 4, 4);
				assertEquals(expected, RollingMax.rollingMax(numbers));
			}

			@Test
			void testRollingMaxAscendingOrder() {
				List<Object> numbers = Arrays.asList(1, 2, 3, 4);
				List<Object> expected = Arrays.asList(1, 2, 3, 4);
				assertEquals(expected, RollingMax.rollingMax(numbers));
			}

			@Test
			void testRollingMaxEqualElements() {
				List<Object> numbers = Arrays.asList(1, 1, 1, 1);
				List<Object> expected = Arrays.asList(1, 1, 1, 1);
				assertEquals(expected, RollingMax.rollingMax(numbers));
			}

			@Test
			void testRollingMaxNegativeElements() {
				List<Object> numbers = Arrays.asList(-1, -2, -3, -4);
				List<Object> expected = Arrays.asList(-1, -1, -1, -1);
				assertEquals(expected, RollingMax.rollingMax(numbers));
			}
}