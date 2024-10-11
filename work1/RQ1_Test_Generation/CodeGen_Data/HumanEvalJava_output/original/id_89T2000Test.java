// EncryptTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Encrypt}.
* It contains one unit test case for the {@link Encrypt#encrypt(String)} method.
*/
class EncryptTest {
/**
		* Test method for {@link org.junit.jupiter.api.Test#assertEquals(java.lang.String)}.
		* @throws Throwable throws exception if some unexpected happens.
		*/
	@Test
	void testHashString() throws Throwable {
		assertEquals("johndewhawfawf", Encrypt.encrypt("johndewhawfawf"));
		assertEquals("bazlfhsdgafb", Encrypt.encrypt("bazlfhsdgafb"));
		assertNull(Encrypt.encrypt("a"));
		assertNull(Encrypt.encrypt("abcdfa9b9f"));
	}
}

// EncryptTest.java end