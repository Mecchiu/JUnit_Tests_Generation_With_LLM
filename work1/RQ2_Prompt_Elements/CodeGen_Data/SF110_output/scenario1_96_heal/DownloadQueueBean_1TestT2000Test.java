// DownloadQueueBean_1Test.java
package org.heal.module.download;

import java.io.File;
import java.io.Serializable;
import java.util.Collection;
import java.util.TreeSet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DownloadQueueBean}.
* It contains one unit test case for the {@link DownloadQueueBean#clearPackageFileSettings()} method.
*/
class DownloadQueueBean_1Test {

	  
	int testNumber;
	
	
	/**
	 * Test case of {@link DownloadQueueBean#clearPackageFileSettings()}.
	*/
	@Test
	void ClearPackageFileSettings() {
	  boolean result = (DownloadQueueBean.clearPackageFileSettings())? true:false;
	  
	  assertTrue( result );
	}
	
	@Test
	void testClearPackageFileSettings() {
		testNumber = 19;
		
	  assertTrue("A temporary queue is initialized", DownloadQueueBean.clearPackageFileSettings());	  
	}
 

}
