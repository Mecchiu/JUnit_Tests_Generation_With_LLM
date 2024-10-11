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

	
	@Test
	public void testClearPackageFileSettings() throws Exception {
        
        assertEquals(0, DownloadQueueBean.getPackageFormat());

        String fileLocation = new File(System.getProperty("java.io.tmpdir")).getAbsolutePath();
        
        DownloadQueueBean cb = new DownloadQueueBean("testqueue");
        System.out.println("queue length: " + cb.getNumEntries());
        
        // clearPackageFileSettings
        DownloadQueueBean.clearPackageFileSettings(cb, fileLocation);
        System.out.println("Clear: Package Queue");

        System.gc();
        System.runFinalization();
        System.gc();
        System.runFinalization();

        // check the queues have been cleared
        assertEquals("Packages have been cleaned?", 0, cb.getNumEntries());
        
        System.out.println("queue length: " + cb.getPackageFormat());

        // test getting the queue length
        assertEquals("Queue length should be one.", 1, cb.getPackageFormat());

        System.out.println("package file location is: " + cb.getPackageFileLocation());

        assertNotNull("Package file location is valid.", fileLocation);
        assertTrue("Package location didn't exist", new File(fileLocation).exists());
        if(cb.isPackageModified())
            assertTrue("Package file modified!", new File(cb.getPackageFileLocation()).exists());
        assertFalse("Package should be read only!", cb.isPackageFileReadOnly());
    }
    
    
}
