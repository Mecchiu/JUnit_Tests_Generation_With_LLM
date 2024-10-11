// DownloadFolderTag_1Test.java
package org.heal.tag.download;

import org.heal.module.download.DownloadQueueBean;
import org.heal.module.metadata.ShortMetadataBean;
import org.heal.util.FileLocator;
import javax.servlet.jsp.tagext.TagSupport;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DownloadFolderTag}.
* It contains one unit test case for the {@link DownloadFolderTag#doEndTag()} method.
*/
class DownloadFolderTag_1Test {
		
	/**
	 * Test if file location is set as the value of the <code>file</code> attribute correctly.
	 */
	@Test
	public void setFile() {
		// GIVEN
        // WHEN
		FileLocator.setLocation(UNAVAILABLE);
		// THEN
		assertNull("location is set as file attribute, but invalid value was passed (getLocation was NULL)", FileLocator.getFileLocation());
		
	}

	/**
	 * Test if download queue is not passed.
	 */
	@Test
	public void downloadQueueIsNull() {
		// GIVEN
        // WHEN
        assertNotNull("getQueue() must not return a non null value for tag", downloadQueue);
        
	}

	/**
	 * Test if short metadata is not passed.
	 */
	@Test
	public void shortMetadataIsNull() {
		// GIVEN
        // WHEN
		assertNotNull("getShortMetadata() must not return a non null value for tag", shortMetadata);
        
	}

	/**
	 * Test if file is not passed.
	 */
	@Test
	public void fileIsNull() {
		// GIVEN
        // WHEN
        assertNull("file is set as value of the <code>file</code> attribute, but invalid value was passed (getFile was NULL)", FileLocator.getFileLocation());
        
	}
	
	/**
	 * Test if download queue is passed.
	 */
	@Test
	public void validDownloadQueueAttr() {
		// GIVEN
        // WHEN
        assertNotNull("getDownloadQueue() must not return a non null value for tag", downloadQueue);
        
	}

	/**
	 * Test if short metadata is passed.
	 */
	@Test
	public void validShortMetadataAttr() {
		// GIVEN
        // WHEN
		assertNotNull("getShortMetadata() must not return a non null value for tag", shortMetadata);
        
	}

	/**
	 * Test if file is passed.
	 */
	@Test
	public void validFileAttr() {
		// GIVEN
        // WHEN
		assertNotNull("file is set as value of the <code>file</code> attribute, but invalid value was passed (getFile was NULL)", FileLocator.getFileLocation());
        
	}	
}

class DownloadFolderTag_2Test extends DownloadFolderTag {
	
	/**
	 * Test if a metadata record is added to the
	 * download folder if one is unavailable.
	 */
	@Test
	public void addMetadataRecord() {
		// GIVEN
        // WHEN
		ShortMetadataBean shortMetadata = downloadQueue.addMetadata("file1", "md5", "sha256");
		// THEN
		assertNotNull("addMetadata() must return a non-NULL value for'md5' and'sha256'", shortMetadata);

	}
	
	/* 
	 * This test suite does not make very sense.  But it works
	 * to just make sure that if this exception occurs the
	 * children of this tag throw something.  No exception occurs
	 * if this is never thrown.  If you can figure this out
	 * in Java, it means your code isn't overly inefficient.
	 * Please refer to the README for details.
	 */
	@Test
	public void noMetadataRecordAttr() {
		// GIVEN
        // WHEN
		ShortMetadataBean shortMetadata = downloadQueue.getMetadata("file1");
		// THEN 
		assertNull("getMetadata("+FileLocator.getFileLocation()+FileLocator.getFileName()+"() must return null", shortMetadata);
		
	}
	
}