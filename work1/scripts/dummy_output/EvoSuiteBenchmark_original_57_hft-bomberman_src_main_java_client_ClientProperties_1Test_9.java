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
		private static final Logger log = Logger.getLogger(ClientProperties.class);
    @Test
    public void testCopy() {
        InputStream sourceStream = null;
        File fileDir = null;

        try {
            sourceStream = this.getClass().getResourceAsStream("/testFile.xml");
            fileDir = new File("/".concat(XmlFunctions.getFolder(".")));
            log.info("sourceStream = " + sourceStream);
            log.info("fileDir = " + fileDir);
        }
        catch (Exception ex) {
            ex.printStackTrace();
            fileError = true;
            log.error(ex.getMessage());
            return;
        }

        try {
            File destFile = this.fileCopy(sourceStream, fileDir);
            log.info("destFile = " + destFile);
            assertTrue(destFile.exists());
        }
        catch (Exception ex) {
            ex.printStackTrace(log.getErrorStream());
            fileError = true;
        }
        catch (FileNotFoundException exc) {
            log.error(fileError);
        }
    }

    private File fileCopy(InputStream sourceStream, File destFile) throws IOException {
		File srcDir   = new File("/".concat(Constants.SOURCE_PATH));
		File destDir  = new File("/".concat(Constants.TEST_PATH));
        File destFile = null;
        destFile = new File(destDir, "." + destFile.getName());
        try {
            destFile = new File(destDir, destFile.getName());
        }
        catch (Exception ex) {
            log.warn(ex.getMessage());
            return null;
        }

        InputStream destStream = null;
        try {
            FileOutputStream fos = new FileOutputStream(destFile);
            destStream = sourceStream;
            destStream = XmlFunctions.stringToInputStream(sourceStream.toString());
        }
        catch (Exception ex) {
            ex.printStackTrace(log.getErrorStream());
            return null;
        }

        try {
            destStream.close();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

        if (sourceStream!= null) {
            try {
                destStream = sourceStream;
            }
            catch (Exception ex) {
                ex.printStackTrace(log.getErrorStream());
            }
        }

        if (destFile!= null) {
			log.info("destFile = "+destFile.getPath());
        }

        return destFile;
    }
}