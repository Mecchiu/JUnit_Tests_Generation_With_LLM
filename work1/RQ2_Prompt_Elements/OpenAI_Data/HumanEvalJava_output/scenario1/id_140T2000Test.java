// FixSpacesTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FixSpaces}.
* It contains ten unit test cases for the {@link FixSpaces#fixSpaces(String)} method.
*/
class FixSpacesTest {
	@Test
			void test1() {
				String text = "I   love  Java";
				String expected = "I_love_Java";
				String actual = FixSpaces.fixSpaces(text);
				assertEquals(expected, actual);
			}

			@Test
			void test2() {
				String text = "I love Java";
				String expected = "I_love_Java";
				String actual = FixSpaces.fixSpaces(text);
				assertEquals(expected, actual);
			}

			@Test
			void test3() {
				String text = "I love  Java  programming";
				String expected = "I_love-Java_programming";
				String actual = FixSpaces.fixSpaces(text);
				assertEquals(expected, actual);
			}

			@Test
			void test4() {
				String text = "I love Java programming";
				String expected = "I_love-Java_programming";
				String actual = FixSpaces.fixSpaces(text);
				assertEquals(expected, actual);
			}

			@Test
			void test5() {
				String text = "I love   Java   programming";
				String expected = "I_love-Java_programming";
				String actual = FixSpaces.fixSpaces(text);
				assertEquals(expected, actual);
			}

			@Test
			void test6() {
				String text = "I love    Java    programming";
				String expected = "I_love-Java_programming";
				String actual = FixSpaces.fixSpaces(text);
				assertEquals(expected, actual);
			}

			@Test
			void test7() {
				String text = "I love     Java     programming";
				String expected = "I_love-Java_programming";
				String actual = FixSpaces.fixSpaces(text);
				assertEquals(expected, actual);
			}

			@Test
			void test8() {
				String text = "I love      Java      programming";
				String expected = "I_love-Java_programming";
				String actual = FixSpaces.fixSpaces(text);
				assertEquals(expected, actual);
			}

			@Test
			void test9() {
				String text = "I love       Java       programming";
				String expected = "I_love-Java_programming";
				String actual = FixSpaces.fixSpaces(text);
				assertEquals(expected, actual);
			}

			@Test
			void test10() {
				String text = "I love        Java        programming";
				String expected = "I_love-Java_programming";
				String actual = FixSpaces.fixSpaces(text);
				assertEquals(expected, actual);
			}
}
