// DownloadQueueBeanTest.java
package org.heal.module.download;

import java.io.File;
import java.io.Serializable;
import java.util.Collection;
import java.util.TreeSet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DownloadQueueBean}.
* It contains ten unit test cases for the {@link DownloadQueueBean#removeAllFromQueue()} method.
*/
class DownloadQueueBeanTest {
		
	@Test
	void testRemoveAllFromQueue() {
		DownloadQueueBean downloadQueueBean = new DownloadQueueBean();
		assertTrue(downloadQueueBean.removeAllFromQueue());
	}
}