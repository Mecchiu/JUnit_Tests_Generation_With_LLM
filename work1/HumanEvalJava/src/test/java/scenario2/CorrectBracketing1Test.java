// CorrectBracketing1Test.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CorrectBracketing1}.
* It contains ten unit test cases for the {@link CorrectBracketing1#correctBracketing(String)} method.
*/
class CorrectBracketing1Test {
			@Test
			void testCorrectBracketing1() {
				assertTrue(CorrectBracketing1.correctBracketing(""));
			}
			
			@Test
			void testCorrectBracketing2() {
				assertTrue(CorrectBracketing1.correctBracketing("()"));
			}
			
			@Test
			void testCorrectBracketing3() {
				assertTrue(CorrectBracketing1.correctBracketing("()()"));
			}
			
			@Test
			void testCorrectBracketing4() {
				assertTrue(CorrectBracketing1.correctBracketing("(()())"));
			}
			
			@Test
			void testCorrectBracketing5() {
				assertFalse(CorrectBracketing1.correctBracketing(")"));
			}
			
			@Test
			void testCorrectBracketing6() {
				assertFalse(CorrectBracketing1.correctBracketing(")("));
			}
			
			@Test
			void testCorrectBracketing7() {
				assertFalse(CorrectBracketing1.correctBracketing("(()"));
			}
			
			@Test
			void testCorrectBracketing8() {
				assertFalse(CorrectBracketing1.correctBracketing("())"));
			}
			
			@Test
			void testCorrectBracketing9() {
				assertFalse(CorrectBracketing1.correctBracketing("((())"));
			}
			
			@Test
			void testCorrectBracketing10() {
				assertFalse(CorrectBracketing1.correctBracketing("(()))"));
			}
}