// ClientProperties_1Test.java
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
* It contains one unit test case for the {@link ClientProperties#fileCopy(InputStream, File)} method.
*/
class ClientProperties_1Test {

	/**
	 * Constructor test.
	 */
    private void testConstructor() {
        try {
            // test for value that is greater than 255
        	assertTrue(0x0001FFFF > Constants.CONTROL_VALUE_MAX);
        	assertTrue(-1 > Constants.CONTROL_VALUE_MAX);
        	// test for value greater than 255
        	assertTrue(0x00FFFFFF > Constants.CONTROL_VALUE_MAX);
        	assertTrue(-1 > Constants.CONTROL_VALUE_MAX);
        	assertTrue(Constants.CONTROL_VALUE_MAX > Math.max(0, Constants.CONTROL_VALUE_MAX));
        	// test for value less than 255
        	assertTrue(0 > Constants.CONTROL_VALUE_MIN);
        	assertTrue(-1 > Constants.CONTROL_VALUE_MIN);
        	// test for value equal to 255
        	assertTrue(0x000000FF == Constants.CONTROL_VALUE_MAX);
        	assertTrue(-1 == Constants.CONTROL_VALUE_MAX);
            // test for value smaller than 255
        	assertTrue(0 < Constants.CONTROL_VALUE_MIN);
        	assertTrue(1 < Constants.CONTROL_VALUE_MIN);
            Logger.getLogger(getClass()).fatal("Test Failed", null)}
				catch (Exception ex) {
					fail(ex.getMessage());
				}
    }
		
	/**
	 * Constructor test.
	 */
    @Test
    public void testConstructor() {
        try (FileOutputStream out = new FileOutputStream("/Users/cchristian") ) {
            Logger.getLogger(getClass()).fatal("test1", null)
                   .append(Constants.CONTROL_VALUE_MAX)
                   .append('x')
                   .append(Constants.CONTROL_VALUE_MIN)
                   .append(' ')
                   .append('X')
                   .append('t')
                   .append('e')
                   .append('t')
                   .append('X')
                   .append('o')
                   .append(' ')
                   .append("test1")
                   .append('\n');

            ClientProperties.fileCopy(out, out);

            Logger.getLogger(getClass()).fatal("test2", null)
                   .append(Constants.CONTROL_VALUE_MAX)
                   .append('x')
                   .append(Constants.CONTROL_VALUE_MIN)
                   .append(' ')
                   .append('X')
                   .append('t')
                   .append('e')
                   .append('t')
                   .append('X')
                   .append('o')
                   .append(' ')
                   .append("test2")
                   .append('\n');
        } catch(IOException e) {
            Logger.getLogger(getClass()).fatal("test11", null)
                   .append(e.getMessage()).append('\n');
        }
    }
    
	/**
	 * Constructor test
	 */
    @Test  
  public void testConstructorWithNull() {
		try (InputStream sourceFile = File.createInputStream(Constants.CONTROL_FILE_NULL); File destFile) {
			FileOutputStream out = null;
			try {
				File tempDestFile = (new File(Constants.TMP_DIR, String.valueOf(System.currentTimeMillis()))).getParentFile();
				out = new FileOutputStream(tempDestFile);

				ClientProperties.fileCopy(sourceFile, out);
				
				if (Constants.TMP_DIR.getName().equalsIgnoreCase("/Users/cchristian/work/probio/test1") ||
						Constants.TMP_DIR.getName().equalsIgnoreCase("/Users/cchristian/work/probio") ||
						Constants.TMP_DIR.getName().equalsIgnoreCase("/Users/cchristian/workspace/probio/test1")) {
					File testFile = new File(tempDestFile, "test1.txt");
					assertTrue(null!= testFile);
					int len = 0;
					String content = null;
					InputStream in = null;
					try {
						ContentParser cp = new ContentParser(null, null, null);
						cp.parse(testFile.toString(), content, in);
						content = content.toString();
					} catch (Exception e) {
						System.err.println("test1" + e.getMessage());
						assertNull(content);
					}
				}
			} catch (Exception e) {
				Logger.getLogger(getClass()).fatal("test11", e.getMessage());
			} 
		} catch (Exception e) {
			Logger.getLogger(getClass()).fatal("test111", e.getMessage());
		}
		
	}
}
