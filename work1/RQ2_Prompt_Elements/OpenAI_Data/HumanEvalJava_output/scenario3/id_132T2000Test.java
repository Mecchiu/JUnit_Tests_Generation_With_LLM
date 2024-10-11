// IsNestedTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsNested}.
* It contains ten unit test cases for the {@link IsNested#isNested(String)} method.
*/
class IsNestedTest {
	@Test
			void testIsNested1() {
				Boolean result = IsNested.isNested("[[]]");
				assertTrue(result);
			}

			@Test
			void testIsNested2() {
				Boolean result = IsNested.isNested("[]]]]]]][[[[[]");
				assertFalse(result);
			}

			@Test
			void testIsNested3() {
				Boolean result = IsNested.isNested("[][]");
				assertFalse(result);
			}

			@Test
			void testIsNested4() {
				Boolean result = IsNested.isNested("[]");
				assertFalse(result);
			}

			@Test
			void testIsNested5() {
				Boolean result = IsNested.isNested("[[][]]");
				assertTrue(result);
			}

			@Test
			void testIsNested6() {
				Boolean result = IsNested.isNested("[[]][[");
				assertTrue(result);
			}

			@Test
			void testIsNested7() {
				Boolean result = IsNested.isNested("[[[[]]]]");
				assertTrue(result);
			}

			@Test
			void testIsNested8() {
				Boolean result = IsNested.isNested("[]]]]]]]]]]");
				assertFalse(result);
			}

			@Test
			void testIsNested9() {
				Boolean result = IsNested.isNested("[][][[]]");
				assertTrue(result);
			}

			@Test
			void testIsNested10() {
				Boolean result = IsNested.isNested("");
				assertFalse(result);
			}

			@Test
			void testIsNested11() {
				Boolean result = IsNested.isNested("[[[[[[[[");
				assertFalse(result);
			}

			@Test
			void testIsNested12() {
				Boolean result = IsNested.isNested("]]]]]]]]]");
				assertFalse(result);
			}
}