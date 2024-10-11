// CycpatternCheckTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CycpatternCheck}.
* It contains ten unit test cases for the {@link CycpatternCheck#cycpatternCheck(String, String)} method.
*/
class CycpatternCheckTest {
	@Test
			void test1() {
				String a = "abcabcabc";
				String b = "abc";
				assertTrue(CycpatternCheck.cycpatternCheck(a, b));
			}
			
			@Test
			void test2() {
				String a = "abcabcabc";
				String b = "ab";
				assertFalse(CycpatternCheck.cycpatternCheck(a, b));
			}
			
			@Test
			void test3() {
				String a = "abcabcabc";
				String b = "abcd";
				assertFalse(CycpatternCheck.cycpatternCheck(a, b));
			}
			
			@Test
			void test4() {
				String a = "abcabcabc";
				String b = "abcabc";
				assertTrue(CycpatternCheck.cycpatternCheck(a, b));
			}
			
			@Test
			void test5() {
				String a = "abcabcabc";
				String b = "abcabcabc";
				assertTrue(CycpatternCheck.cycpatternCheck(a, b));
			}
			
			@Test
			void test6() {
				String a = "abcabcabc";
				String b = "abcabcabcd";
				assertFalse(CycpatternCheck.cycpatternCheck(a, b));
			}
			
			@Test
			void test7() {
				String a = "abcabcabc";
				String b = "abcabcabcabc";
				assertFalse(CycpatternCheck.cycpatternCheck(a, b));
			}
			
			@Test
			void test8() {
				String a = "abcabcabc";
				String b = "abcabcabcabcabc";
				assertFalse(CycpatternCheck.cycpatternCheck(a, b));
			}
			
			@Test
			void test9() {
				String a = "abcabcabc";
				String b = "abcabcabcabcabcabc";
				assertFalse(CycpatternCheck.cycpatternCheck(a, b));
			}
			
			@Test
			void test10() {
				String a = "abcabcabc";
				String b = "abcabcabcabcabcabcabc";
				assertFalse(CycpatternCheck.cycpatternCheck(a, b));
			}
}
