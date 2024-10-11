// SolveTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solve}.
* It contains ten unit test cases for the {@link Solve#solve(String)} method.
*/
class SolveTest {
	@Test
			void test1() {
				assertEquals("aSdF", Solve.solve("AsDf"));
			}

			@Test
			void test2() {
				assertEquals("4321", Solve.solve("1234"));
			}

			@Test
			void test3() {
				assertEquals("AB", Solve.solve("ab"));
			}

			@Test
			void test4() {
				assertEquals("#A@c", Solve.solve("#a@C"));
			}

			@Test
			void test5() {
				assertEquals("#aSDFw^45", Solve.solve("#AsdfW^45"));
			}

			@Test
			void test6() {
				assertEquals("2@6#", Solve.solve("#6@2"));
			}

			@Test
			void test7() {
				assertEquals("#$A^d", Solve.solve("#$a^D"));
			}

			@Test
			void test8() {
				assertEquals("#CCC", Solve.solve("#ccc"));
			}

			@Test
			void test9() {
				assertEquals("aBcDeFg", Solve.solve("AbCdEfG"));
			}

			@Test
			void test10() {
				assertEquals("1234", Solve.solve("1234"));
			}
}
