// FTPFileStorageTest.java
package nu.staldal.lagoon.filestorage;

import java.io.*;
import java.net.*;
import nu.staldal.lagoon.core.*;
import nu.staldal.ftp.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPFileStorage}.
* It contains one unit test case for the {@link FTPFileStorage#createFile(String)} method.
*/
class FTPFileStorageTest {
		    private static final String FILE1 = "file1";
		    private static final String FILE2 = "file2";

		    private static final char PASSWORD = '1';
		    private static final int SERVERPORT = 9000;

		    @Test
        public void test_createFile_emptyDestination() throws Exception {
				// Set up the parameters
				FTPFileStorage fileStorage = new FTPFileStorage();

				// Build the transfer object
				ContentFilter contentFilter = new ContentFileSystemFilter();
                TransferFileFilter contentFilter1 = new ContentFileSystemFilter(fileStorage.getFactory(), "contentFileTest1");
				contentFilter1.setServerPort(SERVERPORT);
                TransferFileFilter contentFilter2 = new ContentFileSystemFilter(fileStorage.getFactory(), "contentFileTest2");
                contentFilter2.setPassword(PASSWORD);
				TransferFileFilter contentFilter3 = new ContentFileSystemFilter(fileStorage.getFactory(), FileNameGeneratorFactory.NULL);
				contentFilter3.setServerPort(SERVERPORT);

				// Finally create the transfer object
				TransferFile transfer = fileStorage.createFile(null /*remoteFileName*/);

				// Check if the file was created
				assertTrue(transfer.isFile());

				// Check if the content filters are set correctly
				assertTrue(contentFilter1.isContentAllowed());
				assertTrue(contentFilter2.isContentAllowed());
				assertTrue(contentFilter3.isContentAllowed());

                // Check if the server port has been set properly
				assertEquals(SERVERPORT, transfer.getPort());
        }

        @Test
		public void test_createFile_filename() throws Exception {
				boolean shouldRun = true;

				// Set up the parameters
				FTPFileStorage fileStorage = new FTPFileStorage();

				// Build the transfer object
				ContentFilter contentFilter = new ContentFileSystemFilter();
				TransferFileFilter contentFilter1 = new ContentFileSystemFilter(fileStorage.getFactory(), "contentFileTest1");
				contentFilter1.setFilename(FILE1);
				contentFilter1.setServerPort(SERVERPORT);
				TransferFile filter = fileStorage.createFile(null /*remoteFileName*/);

				assertNotNull(filter);
				assertNotNull(filter.getName());

				// Check if it was created
				assertTrue(filter.isFile());
				assertTrue(contentFilter1.isContentAllowed());

				// Check if the content filters are set correctly
				assertTrue(contentFilter.isContentAllowed());
		    }

		    @Test
		    public void test_createFile_remoteFileName() throws Exception {
				// Set up an invalid remote file name
				FTPFileStorage fileStorage = new FTPFileStorage();

				// Build the transfer object
				ContentFilter contentFilter = new ContentFileSystemFilter();
				TransferFileFilter contentFilter1 = new ContentFileSystemFilter(fileStorage.getFactory(), "contentFileTest1");
				contentFilter1.setFilename(FILE2);
				contentFilter1.setServerPort(SERVERPORT);
				TransferFile filter = fileStorage.createFile(null /*remoteFileName*/);

				assertNotNull(filter);
		    }

		    @Test
		    public void test_createFile_remoteFileName_with_invalid() throws Exception {
				// Set up an invalid remote file name
				FTPFileStorage fileStorage = new FTPFileStorage();

				// Build the transfer object
				ContentFilter contentFilter = new ContentFileSystemFilter();
				transfer = fileStorage.createFile(null /*remoteFileName*/);

				assertNull(transfer);
		    }
}

/**
* @param args the command line arguments
*/
public static void main(String[] args) {
  Runnable test = () -> {

		System.out.println("=== FileTransferTests ===");

        //test_createFile();
        test_createFile_emptyDestination();
		System.out.println("=== End ===");
	};

	try{
		new Thread(new Runnable() {
			@Override
			public void run() {
				test();
			}
		}).start();
	}catch(Throwable e){
		e.printStackTrace();
	}
}