// EncodeTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Encode}.
* It contains one unit test case for the {@link Encode#encode(String)} method.
*/
class EncodeTest {
/**
		* Method {@link Encode#encode(String)}.
		* @throws Exception if an error occurs while loading or converting data
		* to bytes
		*/
		@Test
		void encode() throws Exception {
			String message = "Let's just have a look..";
			assertEquals("Let's just have a look..", Encode.encode(message)); //$NON-NLS-1$
		}
}
