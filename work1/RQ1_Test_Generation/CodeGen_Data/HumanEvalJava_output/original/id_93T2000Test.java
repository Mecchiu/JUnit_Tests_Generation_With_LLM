// EncodeTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Encode}.
* It contains one unit test case for the {@link Encode#encode(String)} method.
*/
class EncodeTest {

	@Test   
    public void testEncode() {
		// Input
        String message = "test";

		// Output
		String encode = Encode.encode(message);
		assertEquals(message, Encode.encode(encode));
    }
}
