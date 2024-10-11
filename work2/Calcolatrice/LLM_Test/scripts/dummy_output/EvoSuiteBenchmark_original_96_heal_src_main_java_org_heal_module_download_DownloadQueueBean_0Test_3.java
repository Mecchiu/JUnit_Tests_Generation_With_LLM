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
		
	@Test
	public void testRemoveAllFromQueue() {
		DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
		assertFalse(downloadQueueBean.isQueueModified());
		assertTrue(downloadQueueBean.addToQueue("id1"));
		Collection queueIdCollection = downloadQueueBean.getContentIds();
		// check there were 2 items returned by list of ids
		assertEquals(2, queueIdCollection.size());
		
		// remove id1
		assertTrue(downloadQueueBean.removeFromQueue("id1"));
		// check list size was decreased
		assertEquals(1, downloadQueueBean.getContentIds().size());
		
		// add id2.  This should be false
		assertFalse(downloadQueueBean.removeFromQueue("id2"));
		// check list size was increased
		assertEquals(1, downloadQueueBean.getContentIds().size());
	}
}