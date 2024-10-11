// EncodeTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Encode}.
* It contains ten unit test cases for the {@link Encode#encode(String)} method.
*/
class EncodeTest {

	@Test
	void testEncode() {
		assertEquals("TGST", Encode.encode("test"));
		assertEquals("tHKS KS C MGSSCGG", Encode.encode("This is a message"));
		assertEquals("TGST", Encode.encode("TEST"));
		assertEquals("mWDCSKR", Encode.encode("Mudasir"));
		assertEquals("YGS", Encode.encode("YES"));
		assertEquals("tHKS KS C MGSSCGG", Encode.encode("This is a message"));
		assertEquals("k DQNT KNQW WHCT TQ WRKTG", Encode.encode("I DoNt KnOw WhAt tO WrItE"));
		assertEquals("", Encode.encode(""));
		assertEquals(" ", Encode.encode(" "));
		assertEquals("1", Encode.encode("1"));
	}
}