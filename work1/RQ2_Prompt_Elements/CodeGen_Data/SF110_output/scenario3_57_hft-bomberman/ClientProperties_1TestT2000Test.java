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

	// logger
	private static final Logger logger = Logger.getLogger(ClientProperties_1Test.class);

    // private static final String filePathRoot = XmlFunctions.XMLPATH + File.separator
    //                     + Constants.ROOT.getValue();
    @Test
    void testFileCopy() throws IOException{
    	// test case 0: copy a file from a to a 
     	File sourceFile1 = new File(Constants.SOURCE_FILE_ROOT + File.separator
     			+ Constants.XMLFRAGMENT.getValue() + "/"+Constants.A.getValue()
     			+ File.separator
     			+  Constants.FILEID2.getValue());
     	File destFile1 = new File(Constants.TARGET_FILE_ROOT + Constants.FILE.getName());
     	int returnValue1 = fileCopy(sourceFile1.toURL(), destFile1.toURL());

     	// test case 1: if destination exists
     	File destFile2 = new File(Constants.TARGET_FILE_ROOT + Constants.FILE.getName());
     	assertTrue("Unable to create file: "+destFile2.getAbsolutePath(), destFile2.exists());

     	// test case 2: if destination exists, remove it after execution
        destFile2.setLastModifiedTime(destFile1.lastModified());
		File destFile3 = new File(Constants.TARGET_FILE_ROOT + Constants.FILE.getName());
//		destFile3.delete();       
        boolean deleteFile = destFile2.delete();
        assertTrue("Unable to delete file: "+destFile3.getAbsolutePath(), deleteFile);

     	// test case 3: test correct behavior when source and destination files have different lengths
        sourceFile1.setSize(Constants.TOMATO_SIZE-Constants.FILEID.getValue().length()-Constants.FILEID2.getValue().length());
        destFile1.setSize(Constants.TOMATO_SIZE-Constants.FILEID.getValue().length()-Constants.FILEID2.getValue().length());
//		destFile2.setSize(Constants.TOMATO_SIZE);

//		sourceFile1.setSize(destFile2.getPos());
//		destFile2.setSize(destFile1.getPos());
    }

    @Test
    void testInputStreamRead() throws IOException{
        InputStream sourceContent = new FileInputStream(Constants.SOURCE_FILE_ROOT + File.separator
        		+Constants.XMLFRAGMENT.getValue() + "/"+Constants.A.getValue()
        		+ File.separator
        		+  Constants.FILEID.getValue());
     	InputStream destContent = new FileInputStream(Constants.TARGET_FILE_ROOT + File.separator
     			+Constants.XMLFRAGMENT.getValue() + "/"+Constants.A.getValue()
     			+ File.separator
     			+  Constants.FILEID.getValue());
     	int returnValue = fileCopy(sourceContent, destContent);
//    	destContent.close();
         assertEquals("Successful copy of xml fragment file.", Constants.SOURCE_FILE_ROOT+Constants.XMLFRAGMENT.getValue()+"/",Constants.TARGET_FILE.getValue());

     	XmlFunctions.XMLREADER(Constants.XMLFRAGMENT.getValue()
     			+ File.separator
     			+ Constants.FILE.getName())
        	.readUntilEnd();

//    	String lastElementContent = XmlFunctions.XMLREADER(Constants.XMLFRAGMENT.getValue
//        		+ File.separator
//        		+ Constants.FILE.getName())
//            	.getContent();

    }
}
   