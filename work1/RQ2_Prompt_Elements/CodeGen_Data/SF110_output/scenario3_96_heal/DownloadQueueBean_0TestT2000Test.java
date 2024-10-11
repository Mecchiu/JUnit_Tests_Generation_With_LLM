// DownloadQueueBean_0Test.java
package org.heal.module.download;

import java.io.File;
import java.io.Serializable;
import java.util.Collection;
import java.util.TreeSet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DownloadQueueBean}.
* It contains one unit test case for the {@link DownloadQueueBean#removeAllFromQueue()} method.
*/
class DownloadQueueBean_0Test {

	private static final String PACKAGE = "org.heal";
    // private static final String PACKAGE = "test.org.heal";
	private static final Collection<String> ITEMS = new TreeSet<>();
	
	private static final String DOWNLOAD_FILE = "test.txt";
	private static final String FILE_NOT_FOUND = "foo.txt";

	String getDownloadFile() {
		return DOWNLOAD_FILE;
	}
	
	String getFileNotFound() {
		return FILE_NOT_FOUND;
	}
	
    @Test
    public void testRemoveAllFromQueue() throws Exception {
    	DownloadQueueBean bean = new DownloadQueueBean();
    	bean.downloadFile = getDownloadFile();
    	bean.fileNotFound = getFileNotFound();
        bean.removeAllFromQueue();
        
        assertTrue(bean.downloadFile == getDownloadFile());
        assertTrue(bean.fileNotFound == getFileNotFound());
        assertTrue(bean.removeAllFromQueue());
	}
}