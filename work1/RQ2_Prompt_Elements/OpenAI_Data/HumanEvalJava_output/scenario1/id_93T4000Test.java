// EncodeTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Encode}.
* It contains ten unit test cases for the {@link Encode#encode(String)} method.
*/
class EncodeTest {

		/**
		* Test case for {@link Encode#encode(String)} method.
		* It tests if the method returns the correct encoded string for a given string.
		*/
		@Test
		void testEncode() {
				assertEquals("CcDdEe", Encode.encode("aAbBcC"));
				assertEquals("CcDdEe", Encode.encode("aAbBcC"));
				assertEquals("CcDdEe", Encode.encode("aAbBcC"));
				assertEquals("CcDdEe", Encode.encode("aAbBcC"));
				assertEquals("CcDdEe", Encode.encode("aAbBcC"));
				assertEquals("CcDdEe", Encode.encode("aAbBcC"));
				assertEquals("CcDdEe", Encode.encode("aAbBcC"));
				assertEquals("CcDdEe", Encode.encode("aAbBcC"));
				assertEquals("CcDdEe", Encode.encode("aAbBcC"));
				assertEquals("CcDdEe", Encode.encode("aAbBcC"));
		}
}