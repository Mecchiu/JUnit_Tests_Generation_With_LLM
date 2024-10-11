// SolveTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solve}.
* It contains ten unit test cases for the {@link Solve#solve(String)} method.
*/
class SolveTest {
	@Test
			void test1() {
				assertEquals("aBC", Solve.solve("Abc"));
			}
			
			@Test
			void test2() {
				assertEquals("aBC", Solve.solve("AbC"));
			}
			
			@Test
			void test3() {
				assertEquals("aBC", Solve.solve("aBc"));
			}
			
			@Test
			void test4() {
				assertEquals("aBC", Solve.solve("abC"));
			}
			
			@Test
			void test5() {
				assertEquals("aBC", Solve.solve("ABC"));
			}
			
			@Test
			void test6() {
				assertEquals("aBC", Solve.solve("aBc"));
			}
			
			@Test
			void test7() {
				assertEquals("aBC", Solve.solve("aBC"));
			}
			
			@Test
			void test8() {
				assertEquals("aBC", Solve.solve("Abc"));
			}
			
			@Test
			void test9() {
				assertEquals("aBC", Solve.solve("aBc"));
			}
			
			@Test
			void test10() {
				assertEquals("aBC", Solve.solve("aBC"));
			}
}
