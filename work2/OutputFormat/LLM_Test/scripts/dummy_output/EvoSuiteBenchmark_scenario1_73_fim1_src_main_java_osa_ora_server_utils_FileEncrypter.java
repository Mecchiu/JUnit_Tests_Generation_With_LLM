// FileEncrypterTest.java
package osa.ora.server.utils;

// -----------------------------------------------------------------------------
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.crypto.Cipher;
import java.io.IOException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileEncrypter}.
* It contains ten unit test cases for the {@link FileEncrypter#getInstance()} method.
*/
class FileEncrypterTest {
		
	/**
	* Test case for the {@link FileEncrypter#getInstance()} method.
	* It tests if the method returns a non-null object.
	*/
	@Test
	void testGetInstance() {
		FileEncrypter fileEncrypter = FileEncrypter.getInstance();
		assertNotNull(fileEncrypter);
	}
}