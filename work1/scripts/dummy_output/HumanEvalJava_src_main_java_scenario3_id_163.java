// GenerateIntegersTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GenerateIntegers}.
* It contains ten unit test cases for the {@link GenerateIntegers#generateIntegers(int, int)} method.
*/
class GenerateIntegersTest {
			@Test
			void testGenerateIntegers1() {
				List<Object> result = GenerateIntegers.generateIntegers(2, 8);
				List<Object> expected = List.of(2, 4, 6, 8);
				assertEquals(expected, result);
			}

			@Test
			void testGenerateIntegers2() {
				List<Object> result = GenerateIntegers.generateIntegers(8, 2);
				List<Object> expected = List.of(2, 4, 6, 8);
				assertEquals(expected, result);
			}

			@Test
			void testGenerateIntegers3() {
				List<Object> result = GenerateIntegers.generateIntegers(10, 14);
				List<Object> expected = List.of();
				assertEquals(expected, result);
			}

			@Test
			void testGenerateIntegers4() {
				List<Object> result = GenerateIntegers.generateIntegers(2, 10);
				List<Object> expected = List.of(2, 4, 6, 8);
				assertEquals(expected, result);
			}

			@Test
			void testGenerateIntegers5() {
				List<Object> result = GenerateIntegers.generateIntegers(10, 2);
				List<Object> expected = List.of(2, 4, 6, 8);
				assertEquals(expected, result);
			}

			@Test
			void testGenerateIntegers6() {
				List<Object> result = GenerateIntegers.generateIntegers(132, 2);
				List<Object> expected = List.of(2, 4, 6, 8);
				assertEquals(expected, result);
			}

			@Test
			void testGenerateIntegers7() {
				List<Object> result = GenerateIntegers.generateIntegers(17, 89);
				List<Object> expected = List.of();
				assertEquals(expected, result);
			}

			@Test
			void testGenerateIntegers8() {
				List<Object> result = GenerateIntegers.generateIntegers(2, 2);
				List<Object> expected = List.of(2);
				assertEquals(expected, result);
			}

			@Test
			void testGenerateIntegers9() {
				List<Object> result = GenerateIntegers.generateIntegers(1, 1);
				List<Object> expected = List.of();
				assertEquals(expected, result);
			}

			@Test
			void testGenerateIntegers10() {
				List<Object> result = GenerateIntegers.generateIntegers(0, 0);
				List<Object> expected = List.of();
				assertEquals(expected, result);
			}
}