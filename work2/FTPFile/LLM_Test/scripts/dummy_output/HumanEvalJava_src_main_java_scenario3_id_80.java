// IsHappyTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsHappy}.
* It contains ten unit test cases for the {@link IsHappy#isHappy(String)} method.
*/
class IsHappyTest {
			@Test
			void testIsHappy1() {
				assertFalse(IsHappy.isHappy("a"));
			}

			@Test
			void testIsHappy2() {
				assertFalse(IsHappy.isHappy("aa"));
			}

			@Test
			void testIsHappy3() {
				assertTrue(IsHappy.isHappy("abcd"));
			}

			@Test
			void testIsHappy4() {
				assertFalse(IsHappy.isHappy("aabb"));
			}

			@Test
			void testIsHappy5() {
				assertTrue(IsHappy.isHappy("adb"));
			}

			@Test
			void testIsHappy6() {
				assertFalse(IsHappy.isHappy("xyy"));
			}

			@Test
			void testIsHappy7() {
				assertTrue(IsHappy.isHappy("iopaxpoi"));
			}

			@Test
			void testIsHappy8() {
				assertFalse(IsHappy.isHappy("iopaxioi"));
			}

			@Test
			void testIsHappy9() {
				assertTrue(IsHappy.isHappy("abc"));
			}

			@Test
			void testIsHappy10() {
				assertFalse(IsHappy.isHappy("ab"));
			}
}