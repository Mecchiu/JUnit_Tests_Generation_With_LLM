// EncryptTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Encrypt}.
* It contains one unit test case for the {@link Encrypt#encrypt(String)} method.
*/
class EncryptTest {

	/**
	* Test for {@link Encrypt#encrypt(String)}.
	*/
	@Test
    public void testEncrypt() {
		
	//	assertEquals("3A5a6b8ece826a6d88c9bca8e2e6bdc", new Encrypt().encrypt("ABC"));
		assertEquals("8f8a6c8bc5c3ca0b4f8b5a2c6c6b8bd", new Encrypt().encrypt("DEF"));
		assertEquals("1e6a8ecc9c5a2c6c96c8f39ca8c9bcec", new Encrypt().encrypt("JKL"));
		assertEquals("7a8ecc8ac05b2e6a89cad8bc6c96c8bd", new Encrypt().encrypt("MNO"));
		System.out.println("END: testEncrypt");
	}

}
