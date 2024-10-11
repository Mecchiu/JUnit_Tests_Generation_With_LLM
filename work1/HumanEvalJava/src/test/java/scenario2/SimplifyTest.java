// SimplifyTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Simplify}.
* It contains ten unit test cases for the {@link Simplify#simplify(String, String)} method.
*/
class SimplifyTest {
			@Test
			void testSimplify1() {
				assertEquals(true, Simplify.simplify("12/18", "2/3"));
			}
			
			@Test
			void testSimplify2() {
				assertEquals(false, Simplify.simplify("12/18", "2/4"));
			}
			
			@Test
			void testSimplify3() {
				assertEquals(true, Simplify.simplify("12/18", "1/2"));
			}
			
			@Test
			void testSimplify4() {
				assertEquals(false, Simplify.simplify("12/18", "1/3"));
			}
			
			@Test
			void testSimplify5() {
				assertEquals(true, Simplify.simplify("12/18", "3/2"));
			}
			
			@Test
			void testSimplify6() {
				assertEquals(false, Simplify.simplify("12/18", "3/4"));
			}
			
			@Test
			void testSimplify7() {
				assertEquals(true, Simplify.simplify("12/18", "4/3"));
			}
			
			@Test
			void testSimplify8() {
				assertEquals(false, Simplify.simplify("12/18", "4/6"));
			}
			
			@Test
			void testSimplify9() {
				assertEquals(true, Simplify.simplify("12/18", "6/4"));
			}
			
			@Test
			void testSimplify10() {
				assertEquals(false, Simplify.simplify("12/18", "6/9"));
			}
}