// FixSpacesTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FixSpaces}.
* It contains ten unit test cases for the {@link FixSpaces#fixSpaces(String)} method.
*/
class FixSpacesTest {
	@Test
			void test1() {
				String text = "Hello World";
				String expected = "Hello_World";
				String actual = FixSpaces.fixSpaces(text);
				assertEquals(expected, actual);
			}

			@Test
			void test2() {
				String text = "Hello  World";
				String expected = "Hello_-World";
				String actual = FixSpaces.fixSpaces(text);
				assertEquals(expected, actual);
			}

			@Test
			void test3() {
				String text = "Hello   World";
				String expected = "Hello_-_-World";
				String actual = FixSpaces.fixSpaces(text);
				assertEquals(expected, actual);
			}

			@Test
			void test4() {
				String text = "Hello    World";
				String expected = "Hello_-_-_-World";
				String actual = FixSpaces.fixSpaces(text);
				assertEquals(expected, actual);
			}

			@Test
			void test5() {
				String text = "Hello     World";
				String expected = "Hello_-_-_-_-World";
				String actual = FixSpaces.fixSpaces(text);
				assertEquals(expected, actual);
			}

			@Test
			void test6() {
				String text = "Hello      World";
				String expected = "Hello_-_-_-_-_-World";
				String actual = FixSpaces.fixSpaces(text);
				assertEquals(expected, actual);
			}

			@Test
			void test7() {
				String text = "Hello       World";
				String expected = "Hello_-_-_-_-_-_-World";
				String actual = FixSpaces.fixSpaces(text);
				assertEquals(expected, actual);
			}

			@Test
			void test8() {
				String text = "Hello        World";
				String expected = "Hello_-_-_-_-_-_-_-World";
				String actual = FixSpaces.fixSpaces(text);
				assertEquals(expected, actual);
			}

			@Test
			void test9() {
				String text = "Hello         World";
				String expected = "Hello_-_-_-_-_-_-_-_-World";
				String actual = FixSpaces.fixSpaces(text);
				assertEquals(expected, actual);
			}

			@Test
			void test10() {
				String text = "Hello          World";
				String expected = "Hello_-_-_-_-_-_-_-_-_-World";
				String actual = FixSpaces.fixSpaces(text);
				assertEquals(expected, actual);
			}
}
