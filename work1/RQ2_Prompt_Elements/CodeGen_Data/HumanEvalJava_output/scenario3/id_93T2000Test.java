// EncodeTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Encode}.
* It contains one unit test case for the {@link Encode#encode(String)} method.
*/
class EncodeTest {
private final Encode encode = new Encode();

    	/**
    	 * Test method for
    	 * {@link Encode#encode(String)}. 
    	 */
		@Test
		public void testEncode() {
			String input = "This is a message.";
			assertEquals("This is a message.", encode.encode(input));
		}	

}
