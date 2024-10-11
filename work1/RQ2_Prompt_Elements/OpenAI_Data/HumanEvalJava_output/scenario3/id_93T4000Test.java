// EncodeTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Encode}.
* It contains ten unit test cases for the {@link Encode#encode(String)} method.
*/
class EncodeTest {

	@Test
	void testEncode() {
		assertEquals("tgst", Encode.encode("TEST"));
		assertEquals("mWDCSKR", Encode.encode("Mudasir"));
		assertEquals("ygs", Encode.encode("YES"));
		assertEquals("tHKS KS C MGSSCGG", Encode.encode("This is a message"));
		assertEquals("k dQnT kNqW wHcT Tq wRkTg", Encode.encode("I DoNt KnOw WhAt tO WrItE"));
	}
}