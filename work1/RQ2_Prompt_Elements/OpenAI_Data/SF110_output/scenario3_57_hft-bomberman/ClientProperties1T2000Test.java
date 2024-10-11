// ClientPropertiesTest.java
package client;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import common.Constants;
import common.XmlFunctions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClientProperties}.
* It contains ten unit test cases for the {@link ClientProperties#fileCopy(InputStream, File)} method.
*/
class ClientPropertiesTest {

	/**
	* Test case for {@link ClientProperties#fileCopy(InputStream, File)} method.
	* It tests if the method returns true if the file is successfully copied.
	*/
	@Test
	public void testFileCopySuccess() {
		// TODO: implement
	}
	
	/**
	* Test case for {@link ClientProperties#fileCopy(InputStream, File)} method.
	* It tests if the method returns false if the file is not successfully copied.
	*/
	@Test
	public void testFileCopyFailure() {
		// TODO: implement
	}
	
	/**
	* Test case for {@link ClientProperties#fileCopy(InputStream, File)} method.
	* It tests if the method returns false if the file is not successfully copied.
	*/
	@Test
	public void testFileCopyFailure() {
		// TODO: implement
	}
	
	/**
	* Test case for {@link ClientProperties#fileCopy(InputStream, File)} method.
	* It tests if the method returns false if the file is not successfully copied.
	*/
	@Test
	public void testFileCopyFailure() {
		// TODO: implement
	}
	
	/**
	* Test case for {@link ClientProperties#fileCopy(InputStream, File)} method.
	* It tests if the method returns false if the file is not successfully copied.
	*/
	@Test
	public void testFileCopyFailure() {
		// TODO: implement
	}
	
	/**
	* Test case for {@link ClientProperties#fileCopy(InputStream, File)} method.
	* It tests if the method returns false if the file is not successfully copied.
	*/
	@Test
	public void testFileCopyFailure() {
		// TODO: implement
	}
	
	/**
	* Test case for {@link ClientProperties#fileCopy(InputStream, File)} method.
	* It tests if the method returns false if the file is not successfully copied.
	*/
	@Test
	public void testFileCopyFailure() {
		// TODO: implement
	}
	
	/**
	* Test case for {@link ClientProperties#fileCopy(InputStream, File)} method.
	* It tests if the method returns false if the file is not successfully copied.
	*/
	@Test
	public void testFileCopyFailure() {
		// TODO: implement
	}
	
	/**
	* Test case for {@link ClientProperties#fileCopy(InputStream, File)} method.
	* It tests if the method returns false if the file is not successfully copied.
	*/
	@Test
	public void testFileCopyFailure() {
		// TODO: implement
	}
	
	/**
	* Test case for {@link ClientProperties#fileCopy(InputStream, File)} method.
	* It tests if the method returns false if the file is not successfully copied.
	*/
	@Test
	public void testFileCopyFailure() {
		// TODO: implement
	}
}

// ClientProperties.java
package client;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import common.Constants;
import common.XmlFunctions;

/**
 * reads and writes properties to xml-file
 * properties file is saved to user directory
 *
 * @author christian
 */
public class ClientProperties {

    /**
     * copies a file from a to b
     * used InputStream as provided from ResourceService class as
     * source and File as destination
     *
     * @param sourceFile -
     *            InputStream - File which should be copied
     * @param destFile -
     *            destination where file should be copied to
     * @return boolean - true if successfully copied, otherwise false
     */
    public static boolean fileCopy(InputStream sourceFile, File destFile) {
        boolean success = false;
        try {
            FileOutputStream fos = new FileOutputStream(destFile);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = sourceFile.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }
            fos.close();
            success = true;
        } catch (IOException e) {
            logger.error("Error while copying file: " + e.getMessage());
        }
        return success;
    }
}

// ClientPropertiesTest.java
package client;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import common.Constants;
import common.XmlFunctions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClientProperties}.
* It contains ten unit test cases for the {@link ClientProperties#fileCopy(InputStream, File)} method.
*/
class ClientPropertiesTest {
		
	/**
	* Test case for {@link ClientProperties#fileCopy(InputStream, File)} method.
	* It tests if the method returns true if the file is successfully copied.
	*/
	@Test
	public void testFileCopySuccess() {
		// TODO: implement
	}
	
	/**
	* Test case for {@link ClientProperties#fileCopy(InputStream, File)} method.
	* It tests if the method returns false if the file is not successfully copied.
	*/
	@Test
	public void testFileCopyFailure() {
		// TODO: implement
	}
	
	/**
	* Test case for {@link ClientProperties#fileCopy(InputStream, File)} method.
	* It tests if the method returns false if the file is not successfully copied.
	*/
	@Test
	public void testFileCopyFailure() {
		// TODO: implement
	}
	
	/**
	* Test case for {@link ClientProperties#fileCopy(InputStream, File)} method.
	* It tests if the method returns false if the file is not successfully copied.
	*/
	@Test
	public void testFileCopyFailure() {
		// TODO: implement
	}
	
	/**
	* Test case for {@link ClientProperties#fileCopy(InputStream, File)} method.
	* It tests if the method returns false if the file is not successfully copied.
	*/
	@Test
	public void testFileCopyFailure() {
		// TODO: implement
	}
	
	/**
	* Test case for {@link ClientProperties#fileCopy(InputStream, File)} method.
	* It tests if the method returns false if the file is not successfully copied.
	*/
	@Test
	public void testFileCopyFailure() {
		// TODO: implement
	}
	
	/**
	* Test case for {@link ClientProperties#fileCopy(InputStream, File)} method.
	* It tests if the method returns false if the file is not successfully copied.
	*/
	@Test
	public void testFileCopyFailure() {
		// TODO: implement
	}
	
	/**
	* Test case for {@link ClientProperties#fileCopy(InputStream, File)} method.
	* It tests if the method returns false if the file is not successfully copied.
	*/
	@Test
	public void testFileCopyFailure() {
		// TODO: implement
	}
	
	/**
	* Test case for {@link ClientProperties#fileCopy(InputStream, File)} method.
	* It tests if the method returns false if the file is not successfully copied.
	*/
	@Test
	public void testFileCopyFailure() {
		// TODO: implement
	}
	
	/**
	* Test case for {@link ClientProperties#fileCopy(InputStream, File)} method.
	* It tests if the method returns false if the file is not successfully copied.
	*/
	@Test
	public void testFileCopyFailure() {
		// TODO: implement
	}
