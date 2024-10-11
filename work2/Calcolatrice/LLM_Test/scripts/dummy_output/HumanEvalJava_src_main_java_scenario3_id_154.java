// CycpatternCheckTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CycpatternCheck}.
* It contains ten unit test cases for the {@link CycpatternCheck#cycpatternCheck(String, String)} method.
*/
class CycpatternCheckTest {
			@Test
			void testCycpatternCheck1() {
				Boolean result = CycpatternCheck.cycpatternCheck("abcd", "abd");
				assertFalse(result);
			}

			@Test
			void testCycpatternCheck2() {
				Boolean result = CycpatternCheck.cycpatternCheck("hello", "ell");
				assertTrue(result);
			}

			@Test
			void testCycpatternCheck3() {
				Boolean result = CycpatternCheck.cycpatternCheck("whassup", "psus");
				assertFalse(result);
			}

			@Test
			void testCycpatternCheck4() {
				Boolean result = CycpatternCheck.cycpatternCheck("abab", "baa");
				assertTrue(result);
			}

			@Test
			void testCycpatternCheck5() {
				Boolean result = CycpatternCheck.cycpatternCheck("efef", "eeff");
				assertFalse(result);
			}

			@Test
			void testCycpatternCheck6() {
				Boolean result = CycpatternCheck.cycpatternCheck("himenss", "simen");
				assertTrue(result);
			}

			@Test
			void testCycpatternCheck7() {
				Boolean result = CycpatternCheck.cycpatternCheck("xyzw", "xyw");
				assertFalse(result);
			}

			@Test
			void testCycpatternCheck8() {
				Boolean result = CycpatternCheck.cycpatternCheck("yello", "ell");
				assertTrue(result);
			}

			@Test
			void testCycpatternCheck9() {
				Boolean result = CycpatternCheck.cycpatternCheck("whattup", "ptut");
				assertFalse(result);
			}

			@Test
			void testCycpatternCheck10() {
				Boolean result = CycpatternCheck.cycpatternCheck("efef", "fee");
				assertTrue(result);
			}

			@Test
			void testCycpatternCheck11() {
				Boolean result = CycpatternCheck.cycpatternCheck("abab", "aabb");
				assertFalse(result);
			}

			@Test
			void testCycpatternCheck12() {
				Boolean result = CycpatternCheck.cycpatternCheck("winemtt", "tinem");
				assertTrue(result);
			}
}