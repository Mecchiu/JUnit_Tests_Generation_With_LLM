// ModifyCatalogQueueEntryActionTest.java
package org.heal.servlet.cataloger;

import org.heal.module.catalog.QueueDAO;
import org.heal.module.catalog.QueuedRecordBean;
import org.heal.module.metadata.MetadataDAO;
import org.heal.module.metadata.ShortMetadataBean;
import org.heal.servlet.Action;
import org.heal.util.AuthenticationTools;
import org.heal.util.FileLocator;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.sql.SQLException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifyCatalogQueueEntryAction}.
* It contains one unit test case for the {@link ModifyCatalogQueueEntryAction#actionRequiresLogin()} method.
*/
class ModifyCatalogQueueEntryActionTest {

	/**
	 * @exclude
	 * @description Tests method {@link ModifyCatalogQueueEntryAction#actionRequiresLogin()}.
	 */
	@org.junit.jupiter.api.Disabled
	@Test
	public void testActionRequiresLogin() throws SQLException, IOException, ServletException {

    
		QueueDAO queueDAO = new QueueDAO();
		
		String metadataFileBaseLocation = FileLocator.getFileFolder_AbsolutePath() + "/metadata/";
		String catalogFileBaseLocation = FileLocator.getFileFolder_AbsolutePath() + "/files/";
		File metadataBase = FileLocator.getFile(FileLocator.getMetadataDirectory() + FileLocator.metadataFilename);
		File catalogBase = FileLocator.getFile(FileLocator.getCatalogDirectory() + FileLocator.catalogFilename);

		// initialize queue with one queue record
		QueuedRecordBean record = new QueuedRecordBean();
		QueuedRecordBean newRecord = new QueuedRecordBean();
		
		newRecord.setRecordLocation(metadataFileBaseLocation);
		newRecord.setQueueLocation(catalogFileBaseLocation);
		
		//set the short metadata.  Note that this is how we set the queue
		String metadataString =  "<short>" + 
    			                        "<string>" + 
    			                        "<value>" + 
    			                        "<long>" + 
    			                        "<long>" + 
    			                        "<reference-id>" + // reference Id
    			                        "<string-id>" + // string Id
    			                        "<long>" + 
    			                        "</string></short>" + 
    			                        "</string></short>" + 

    			    		"</short>";
    		newRecord.setShortMetadata(datatypeToShort( metadataString ));
    		record.addRecord(newShortMetadataRecordBean(newRecord.getShortMetadata()), newRecord);
    		
    		record.setQueueLocation(catalogFileBaseLocation + catalogFileBaseLocation);
    		
    		// Add a new record with a new short Metadata.
    		newRecord.setQueueLocation(catalogFileBaseLocation + catalogFileBaseLocation + "/" + catalogFileBaseLocation + "/test1x.txt");
    		record.addRecord(newRecord.getShortMetadata(), newRecord);
    		
    		record.setQueueLocation(catalogFileBaseLocation + catalogFileBaseLocation + "/" + catalogFileBaseLocation + "/" + catalogFileBaseLocation + "/test1x");
    		
    		// Add the same long id to the record for this shortMetadataItem.
    		newRecord.setQueueLocation(catalogFileBaseLocation + catalogFileBaseLocation
    		                                  + catalogFileBaseLocation + "/"
    		                                  + catalogFileBaseLocation + "/"
    		                                  + catalogFileBaseLocation + "/test1x");
    		
    		// Add the same short id to the record for this shortMetadataItem.
    		newRecord.setQueueLocation(catalogFileBaseLocation + catalogFileBaseLocation
    		                                  + catalogFileBaseLocation + "/"
    		                                  + catalogFileBaseLocation + "/"
    		                                  + catalogFileBaseLocation + "/"
    		                                  + catalogFileBaseLocation
    		                                  + catalogFileBaseLocation + "/test1x");
    		
    		//Add a new record with a new short Metadata.
    		record.setQueueLocation(catalogFileBaseLocation + catalogFileBaseLocation
    		                                  + catalogFileBaseLocation + "/"
    		                                  + catalogFileBaseLocation + "/"
    		                                  + catalogFileBaseLocation + "/"
    		                                  + catalogFileBaseLocation + "/test1x");

        try {
	
        	// Create test file and write some metadata records
	        File tempFile = File.createTempFile("metadatatest", null);
	        FileOutputStream fos = new FileOutputStream(tempFile);
	        fos.write(metadataString.getBytes());
	        fos.close();
	        FileChannel channel = new FileInputStream(tempFile).getChannel();
	        fos = new FileOutputStream(metadataBase +"/" + catalogFileBaseLocation + "/test1x.txt");
	        channel.transferFrom(fos, channel.size());
	
            // Delete this test file
            fos.close();

        	fos = new FileOutputStream(metadataBase +"/" + catalogFileBaseLocation + "/" + catalogFileBaseLocation + "/" + catalogFileBaseLocation + "/" + catalogFileBaseLocation + "/test1x").getChannel();
	        channel.transferFrom(fos, channel.size());

        	// Copy the file to a test file and delete.
        	//Copy the file to a test file and delete.
	        FileSource src = new FileSource(tempFile);
	        CopySource source = new CopySource(src);
	        FileTarget target = new FileTarget(tempFile);
	        CopymapSource.copyMappings(target);
	        
		
	    	Thread.sleep(1000);
	        