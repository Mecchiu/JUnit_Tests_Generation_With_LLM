// CorrectBracketing1Test.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CorrectBracketing1}.
* It contains ten unit test cases for the {@link CorrectBracketing1#correctBracketing(String)} method.
*/
class CorrectBracketing1Test {
			@Test
			void test1() {
				assertTrue(CorrectBracketing1.correctBracketing("()"));
			}
			
			@Test
			void test2() {
				assertTrue(CorrectBracketing1.correctBracketing("(()())"));
			}
			
			@Test
			void test3() {
				assertTrue(CorrectBracketing1.correctBracketing("()()(()())()"));
			}
			
			@Test
			void test4() {
				assertTrue(CorrectBracketing1.correctBracketing("()()((()()())())(()()(()))"));
			}
			
			@Test
			void test5() {
				assertFalse(CorrectBracketing1.correctBracketing("((()())))"));
			}
			
			@Test
			void test6() {
				assertFalse(CorrectBracketing1.correctBracketing(")(()"));
			}
			
			@Test
			void test7() {
				assertFalse(CorrectBracketing1.correctBracketing("("));
			}
			
			@Test
			void test8() {
				assertFalse(CorrectBracketing1.correctBracketing("(((("));
			}
			
			@Test
			void test9() {
				assertFalse(CorrectBracketing1.correctBracketing(")"));
			}
			
			@Test
			void test10() {
				assertFalse(CorrectBracketing1.correctBracketing("(()"));
			}
			
			@Test
			void test11() {
				assertFalse(CorrectBracketing1.correctBracketing("()()(()())())(()"));
			}
			
			@Test
			void test12() {
				assertFalse(CorrectBracketing1.correctBracketing("()()(()())()))()"));
			}
}