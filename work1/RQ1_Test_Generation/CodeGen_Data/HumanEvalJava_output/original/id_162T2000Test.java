// StringToMd5Test.java
package original;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringToMd5}.
* It contains one unit test case for the {@link StringToMd5#stringToMd5(String)} method.
*/
class StringToMd5Test {

	/**
	 * Test method for {@link StringToMd5#stringToMd5(String)}.
	 */
	@Test
	public void testStringToMd5() {
      assertEquals("3e25960a79dbc69b674cd4ec67a72c62", StringToMd5.stringToMd5("Hello world"));
      assertEquals("3e25960a79dbc69b674cd4ec67a72c62", StringToMd5.stringToMd5("A"));
      assertNull(StringToMd5.stringToMd5(null));
      assertNull(StringToMd5.stringToMd5(""));
  }
}