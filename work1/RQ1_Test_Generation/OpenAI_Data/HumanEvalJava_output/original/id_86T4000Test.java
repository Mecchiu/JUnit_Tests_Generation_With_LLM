// AntiShuffleTest.java
package original;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AntiShuffle}.
* It contains ten unit test cases for the {@link AntiShuffle#antiShuffle(String)} method.
*/
class AntiShuffleTest {

	@Test
	void testAntiShuffle() {
		assertEquals("Hi", AntiShuffle.antiShuffle("Hi"));
		assertEquals("ehllo", AntiShuffle.antiShuffle("hello"));
		assertEquals("bemnru", AntiShuffle.antiShuffle("number"));
		assertEquals("abcd", AntiShuffle.antiShuffle("abcd"));
		assertEquals("Hello !!!Wdlor", AntiShuffle.antiShuffle("Hello World!!!"));
		assertEquals("", AntiShuffle.antiShuffle(""));
		assertEquals(".Hi My aemn is Meirst .Rboot How aer ?ouy", AntiShuffle.antiShuffle("Hi. My name is Mister Robot. How are you?"));
		assertEquals("", AntiShuffle.antiShuffle(" "));
		assertEquals("", AntiShuffle.antiShuffle("  "));
		assertEquals("", AntiShuffle.antiShuffle("   "));
	}
}