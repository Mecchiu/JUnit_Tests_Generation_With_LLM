// IsSimplePowerTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsSimplePower}.
* It contains ten unit test cases for the {@link IsSimplePower#isSimplePower(int, int)} method.
*/
class IsSimplePowerTest {
	@Test
			void testIsSimplePower1() {
				assertTrue(IsSimplePower.isSimplePower(1, 4));
			}
			@Test
			void testIsSimplePower2() {
				assertTrue(IsSimplePower.isSimplePower(2, 2));
			}
			@Test
			void testIsSimplePower3() {
				assertTrue(IsSimplePower.isSimplePower(8, 2));
			}
			@Test
			void testIsSimplePower4() {
				assertFalse(IsSimplePower.isSimplePower(3, 2));
			}
			@Test
			void testIsSimplePower5() {
				assertFalse(IsSimplePower.isSimplePower(3, 1));
			}
			@Test
			void testIsSimplePower6() {
				assertFalse(IsSimplePower.isSimplePower(5, 3));
			}
			@Test
			void testIsSimplePower7() {
				assertTrue(IsSimplePower.isSimplePower(16, 2));
			}
			@Test
			void testIsSimplePower8() {
				assertFalse(IsSimplePower.isSimplePower(143214, 16));
			}
			@Test
			void testIsSimplePower9() {
				assertTrue(IsSimplePower.isSimplePower(4, 2));
			}
			@Test
			void testIsSimplePower10() {
				assertTrue(IsSimplePower.isSimplePower(9, 3));
			}
			@Test
			void testIsSimplePower11() {
				assertTrue(IsSimplePower.isSimplePower(16, 4));
			}
			@Test
			void testIsSimplePower12() {
				assertFalse(IsSimplePower.isSimplePower(24, 2));
			}
			@Test
			void testIsSimplePower13() {
				assertFalse(IsSimplePower.isSimplePower(128, 4));
			}
			@Test
			void testIsSimplePower14() {
				assertFalse(IsSimplePower.isSimplePower(12, 6));
			}
			@Test
			void testIsSimplePower15() {
				assertTrue(IsSimplePower.isSimplePower(1, 1));
			}
			@Test
			void testIsSimplePower16() {
				assertTrue(IsSimplePower.isSimplePower(1, 12));
			}
}
