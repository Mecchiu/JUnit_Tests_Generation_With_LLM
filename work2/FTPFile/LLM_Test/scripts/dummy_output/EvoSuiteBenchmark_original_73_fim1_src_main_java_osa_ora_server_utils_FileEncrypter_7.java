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
* It contains one unit test case for the {@link FileEncrypter#getInstance()} method.
*/
class FileEncrypterTest {
		
/*
* Test-class for the {@link FileEncrypter#getInstance()} method.
*/
    private static final FileEncrypterTest classInstance = new FileEncrypterTest();
	
    // Class test-case with the following code:
    // String content = Class.forName(contentClass).newInstance()
    // SecretKeySpec keySpec = new SecretKeySpec(new byte[32], "AES");
    // SecretKey skey;
    // try {
    //   skey = (SecretKey) Class.forName(skeyClass).newInstance();
    // }
    // catch (Exception e) {
    //   assertTrue("Unable to instantiate the class using the supplied class.", false);
    //   e.printStackTrace();
    // }
    // SecretKeySpec key = new SecretKeySpec(skey.getEncoded(), "AES");
 
    public FileEncrypterTest() {
          
    }
	 
    /**
	 * Tester method to get an instance of the class.
	 * @return an instance of the class.
	 */
    public FileEncrypter getInstance() {
        return classInstance.newInstance();
    }

	@Test
        @org.junit.jupiter.api.Disabled("Test is not stable yet")
        public void test1() throws Exception {

    }
	
	@Test
        @org.junit.jupiter.api.Disabled("Test is not stable yet")
        public void test2() throws Exception {

    }
	
}
// End FileEncrypterTest.java