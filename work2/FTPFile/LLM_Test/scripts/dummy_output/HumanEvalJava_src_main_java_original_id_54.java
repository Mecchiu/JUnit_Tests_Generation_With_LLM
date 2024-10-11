// SameCharsTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SameChars}.
* It contains ten unit test cases for the {@link SameChars#sameChars(String, String)} method.
*/
class SameCharsTest {
			@Test
			void testSameChars1() {
				Boolean result = SameChars.sameChars("abcd", "dddddddabce");
				assertFalse(result);
			}
			
			@Test
			void testSameChars2() {
				Boolean result = SameChars.sameChars("eabcdzzzz", "dddzzzzzzzddeddabc");
				assertTrue(result);
			}
			
			@Test
			void testSameChars3() {
				Boolean result = SameChars.sameChars("abcd", "dddddddabc");
				assertTrue(result);
			}
			
			@Test
			void testSameChars4() {
				Boolean result = SameChars.sameChars("dddddddabc", "abcd");
				assertTrue(result);
			}
			
			@Test
			void testSameChars5() {
				Boolean result = SameChars.sameChars("eabcd", "dddddddabc");
				assertFalse(result);
			}
			
			@Test
			void testSameChars6() {
				Boolean result = SameChars.sameChars("abcd", "dddddddabcf");
				assertFalse(result);
			}
			
			@Test
			void testSameChars7() {
				Boolean result = SameChars.sameChars("eabcdzzzz", "dddzzzzzzzddddabc");
				assertFalse(result);
			}
			
			@Test
			void testSameChars8() {
				Boolean result = SameChars.sameChars("aabb", "aaccc");
				assertFalse(result);
			}
			
			@Test
			void testSameChars9() {
				Boolean result = SameChars.sameChars("aabb", "aabb");
				assertTrue(result);
			}
			
			@Test
			void testSameChars10() {
				Boolean result = SameChars.sameChars("aabb", "aabbcc");
				assertFalse(result);
			}
}