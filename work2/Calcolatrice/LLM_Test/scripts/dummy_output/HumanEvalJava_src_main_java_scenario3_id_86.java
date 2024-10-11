// AntiShuffleTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AntiShuffle}.
* It contains ten unit test cases for the {@link AntiShuffle#antiShuffle(String)} method.
*/
class AntiShuffleTest {
			@Test
			void testAntiShuffle1() {
				String input = "Hi";
				String expected = "Hi";
				String actual = AntiShuffle.antiShuffle(input);
				assertEquals(expected, actual);
			}

			@Test
			void testAntiShuffle2() {
				String input = "hello";
				String expected = "ehllo";
				String actual = AntiShuffle.antiShuffle(input);
				assertEquals(expected, actual);
			}

			@Test
			void testAntiShuffle3() {
				String input = "number";
				String expected = "bemnru";
				String actual = AntiShuffle.antiShuffle(input);
				assertEquals(expected, actual);
			}

			@Test
			void testAntiShuffle4() {
				String input = "abcd";
				String expected = "abcd";
				String actual = AntiShuffle.antiShuffle(input);
				assertEquals(expected, actual);
			}

			@Test
			void testAntiShuffle5() {
				String input = "Hello World!!!";
				String expected = "Hello !!!Wdlor";
				String actual = AntiShuffle.antiShuffle(input);
				assertEquals(expected, actual);
			}

			@Test
			void testAntiShuffle6() {
				String input = "";
				String expected = "";
				String actual = AntiShuffle.antiShuffle(input);
				assertEquals(expected, actual);
			}

			@Test
			void testAntiShuffle7() {
				String input = "Hi. My name is Mister Robot. How are you?";
				String expected = ".Hi My aemn is Meirst .Rboot How aer ?ouy";
				String actual = AntiShuffle.antiShuffle(input);
				assertEquals(expected, actual);
			}

			@Test
			void testAntiShuffle8() {
				String input = "Hello World!!!";
				String expected = "Hello !!!Wdlor";
				String actual = AntiShuffle.antiShuffle(input);
				assertEquals(expected, actual);
			}

			@Test
			void testAntiShuffle9() {
				String input = "Hello World!!!";
				String expected = "Hello !!!Wdlor";
				String actual = AntiShuffle.antiShuffle(input);
				assertEquals(expected, actual);
			}

			@Test
			void testAntiShuffle10() {
				String input = "Hello World!!!";
				String expected = "Hello !!!Wdlor";
				String actual = AntiShuffle.antiShuffle(input);
				assertEquals(expected, actual);
			}
}