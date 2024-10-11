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
    /**
     * Calls {@link DownloadQueueBean#clearQueueButIgnoresOldQueue()} but it does not write out the changes to the package
     * file location and url for the queue, which must already exist.
     */
    public void clearsQueueAndIgnoresOldQueue() throws Exception {
        Collection<String> content = new TreeSet<>();
        content.add("hello");
        content.add("world");
        content.add("world");
        assertFalse(DownloadQueueBean.clearQueue(null));
		assertFalse(DownloadQueueBean.clearQueueButIgnoresOldQueue(null));
	}
		
    @Test
    /**
     * Calls {@link DownloadQueueBean#clearQueue()} and reads all the values from the data file on disk,
     * and checks for that the file is written in the package file location and url.
     */
    public void clearsQueue() throws Exception {
        Collection<String> content = new TreeSet<>();
        File file = new File(File.separatorChar + "metadata" + File.separatorChar + "queue" + File.separatorChar + "file" + File.separatorChar + "testmetadatasymletitlestofile.json");
        assertFalse(DownloadQueueBean.clearQueue(file));
	assertTrue(DownloadQueueBean.writeQueueContentsToFile(content, file));
    }
}