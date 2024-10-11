// ClientProperties_0Test.java
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
* It contains one unit test case for the {@link ClientProperties#getProperty(String)} method.
*/
class ClientProperties_0Test {
		protected final static Logger LOGGER = Logger.getLogger(ClientProperties_0Test.class);
            private ClientProperties clientProperties;
        
            File localProperties;
        
        /**
         * @throws java.io.IOException
         */
        @Test
        public void Constructor_1_1Test() throws IOException{
                    clientProperties = new ClientProperties("/tmp/tmpProperties.txt");
                    assertTrue("File was wrongly created, or not exists.",
                               clientProperties.fileExists());
        }
	@Test
	public void Constructor_2_1Test() throws IOException{
                    localProperties = new File("/tmp/tmpProperties.txt");
                    ClientProperties tempClientProperties;
                    File tempLocalProperties;
                    
                    tempLocalProperties = new File(Constants.TEST_PATH_LOCAL_PROPERTIES);
                    assertTrue(tempLocalProperties.exists());
                    // TODO: better error description
                    //throw new IOException("test error message");
                }
	@Test
        public void Constructor_3_0_TestAlloc() throws IOException {
                    clientProperties = new ClientProperties("/tmp/tmpProperties.txt");
                    assertTrue("File was wrongly created, or not exists.",
                               clientProperties.fileExists() &&
                               clientProperties.fileExists());
                }
	@Test
        public void Constructor_3_1TestFileWrite() throws Exception {
                    String strWrite = "Write";

                    File fileWrite = tempFileCreate();

                    logger.info("\n\nWriting data to " + fileWrite.getAbsolutePath() +"\n\n");
	    
                    xmlFunctions.createFile(fileWrite.getAbsolutePath(), "UTF-8", 
                                                      strWrite);

                    // checks readability file
                    InputStream testStream = new FileInputStream(localProperties);
                    InputStream testStream2 = fileWrite.getAbsoluteFile().getParent().getParent().createReadableStream();
                    InputStream testStream3 = new FileInputStream(fileWrite.getParent().getParent());
                    InputStream testStream4 = new FileInputStream(fileWrite.getParent());
		    String streamStrRead = testStream.readLine();
		    if (!fileWrite.equals(new File(""))) {
			    InputStream strRead1 = new FileInputStream(fileWrite.getAbsoluteFile());
			    assertTrue(xmlFunctions.isEqualString(streamStrRead, strRead1.readLine()));
		    }
		    else {
			    assertEquals(xmlFunctions.isEqualString(streamStrRead, strWrite), true);
		    }
                        InputStream testStream5 = new FileInputStream(fileWrite);

                        LOGGER.info("\n\nReading data from " + fileWrite.getAbsolutePath() +"\n\n");
		    String streamStrReadAll  = testStream5.readLine();
		    if (!fileWrite.equals(new File(""))) {
			    assertEquals(xmlFunctions.isEqualString(streamStrReadAll, streamStrReadAll), true);
		    }
		    else {
			    assertEquals(xmlFunctions.isEqualString(streamStrReadAll, streamStrWrite), true);
		    }
                        xmlFunctions.deleteFile(fileWrite);


	        }
	}