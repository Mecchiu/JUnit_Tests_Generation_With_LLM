// IsSimplePowerTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsSimplePower}.
* It contains ten unit test cases for the {@link IsSimplePower#isSimplePower(int, int)} method.
*/
class IsSimplePowerTest {
	@Test
			void testIsSimplePower1() {
				Boolean result = IsSimplePower.isSimplePower(16, 2);
				assertTrue(result);
			}

			@Test
			void testIsSimplePower2() {
				Boolean result = IsSimplePower.isSimplePower(143214, 16);
				assertFalse(result);
			}

			@Test
			void testIsSimplePower3() {
				Boolean result = IsSimplePower.isSimplePower(4, 2);
				assertTrue(result);
			}

			@Test
			void testIsSimplePower4() {
				Boolean result = IsSimplePower.isSimplePower(9, 3);
				assertTrue(result);
			}

			@Test
			void testIsSimplePower5() {
				Boolean result = IsSimplePower.isSimplePower(16, 4);
				assertTrue(result);
			}

			@Test
			void testIsSimplePower6() {
				Boolean result = IsSimplePower.isSimplePower(24, 2);
				assertFalse(result);
			}

			@Test
			void testIsSimplePower7() {
				Boolean result = IsSimplePower.isSimplePower(128, 4);
				assertFalse(result);
			}

			@Test
			void testIsSimplePower8() {
				Boolean result = IsSimplePower.isSimplePower(12, 6);
				assertFalse(result);
			}

			@Test
			void testIsSimplePower9() {
				Boolean result = IsSimplePower.isSimplePower(1, 1);
				assertTrue(result);
			}

			@Test
			void testIsSimplePower10() {
				Boolean result = IsSimplePower.isSimplePower(1, 12);
				assertTrue(result);
			}
}
