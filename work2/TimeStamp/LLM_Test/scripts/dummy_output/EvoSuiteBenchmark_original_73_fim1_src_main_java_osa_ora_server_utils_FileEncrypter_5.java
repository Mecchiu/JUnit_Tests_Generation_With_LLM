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
		
    /**
     * Singleton
     */
    static FileEncrypter getInstance() {
			return FileEncrypterTest.getInstance();
    }

    /**
    * Test method for {@link osa.ora.server.utils.FileEncrypter#getInstance()}.
		    * Test method for {@link osa.ora.server.utils.FileEncrypter#getInstance()}
    * and its return value is the same object.
    */
    @Test
    public void testGetInstance() {
		
    	String cipherAlgorithm = "Testing ";
    	String cipher = "Testing Cipher ";
    	
        FileEncrypter encrypter = FileEncrypter.getInstance();
		
        assertNotNull(encrypter);
        
        File cipherFile = new File("target/test-classes/oa/ora/server/data/" + cipherAlgorithm + ".txt");
        File cipherFile2 = new File("target/test-classes/oa/oa/server/data/" + cipherAlgorithm + ".txt");
        File cipherFile3 = new File("target/test-classes/oa/ora/server/data/" + cipherAlgorithm + ".txt");
        
        encrypter.setCipherFile(cipherFile);
        encrypter.setCipherFile(cipherFile2);
        encrypter.setCipherFile(cipherFile3);
        
        File encryptedFile = null;
        
        try {
			
			encryptedFile = encrypter.getInstance();
			
			assertNotNull(encryptedFile);
			FileInputStream fis = new FileInputStream(cipherFile);
			File cipherFile2Fis = new File("target/test-classes/oa/ora/server/data/" + cipherAlgorithm + ".txt");
			fis.skip(cipherFile2Fis.length());
			fis.read();
			
			fis.close();
	    } catch (IOException e) {
	    	assertThrows("Error", e);
    	} catch (Throwable t) {
	    	assertThrows("Error", t);
    	}
	}

}