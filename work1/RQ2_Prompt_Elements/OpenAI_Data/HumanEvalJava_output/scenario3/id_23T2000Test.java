// StrlenTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Strlen}.
* It contains ten unit test cases for the {@link Strlen#strlen(String)} method.
*/
class StrlenTest {
	@Test
			void testEmptyString() {
				assertEquals(0, Strlen.strlen(""));
			}
			
			@Test
			void testOneCharString() {
				assertEquals(1, Strlen.strlen("x"));
			}
			
			@Test
			void testNormalString() {
				assertEquals(3, Strlen.strlen("abc"));
			}
			
			@Test
			void testLongString() {
				assertEquals(9, Strlen.strlen("asdasnakj"));
			}
			
			@Test
			void testNullString() {
				assertEquals(0, Strlen.strlen(null));
			}
			
			@Test
			void testStringWithSpaces() {
				assertEquals(5, Strlen.strlen("a b c d"));
			}
			
			@Test
			void testStringWithSpecialChars() {
				assertEquals(5, Strlen.strlen("a!b@c#d$"));
			}
			
			@Test
			void testStringWithNumbers() {
				assertEquals(5, Strlen.strlen("a1b2c3d4"));
			}
			
			@Test
			void testStringWithNewLine() {
				assertEquals(5, Strlen.strlen("a\nb\nc\nd"));
			}
			
			@Test
			void testStringWithTab() {
				assertEquals(5, Strlen.strlen("a\tb\tc\td"));
			}
}