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
		/**
		 * Test method for {@link org.heal.module.download.DownloadQueueBean#purgeQueue()}.
		 */
		@Test
		public void purgeQueue() {
			DownloadQueueBean queueBean = new DownloadQueueBean();
			queueBean.purgeQueue();
			assertTrue("Queue should be empty.", queueBean.getNumEntries() == 0);
		}

		/**
		 * Test method for {@link org.heal.module.download.DownloadQueueBean#purgeQueue()}.
		 */
		@Test
		public void purgeQueueCascades() {
			DownloadQueueBean queueBean = new DownloadQueueBean();
			queueBean.purgeQueue();
			queueBean.purgeQueue();
			assertTrue("Queue should be empty.", queueBean.getNumEntries() == 0);
		}

		/**
		 * Test method for {@link org.heal.module.download.DownloadQueueBean#removeAllFromQueue()}.
		 */
		@Test
		public void removeAllFromQueue() {
			DownloadQueueBean queueBean = new DownloadQueueBean();
			queueBean.purgeQueue();

            TreeSet contentSet = new TreeSet();
            ListQueueBean listQueueBean = new ListQueueBean(contentSet, null);
            int removeCount = listQueueBean.removeAllFromQueue();
            assertEquals("RemoveCount should be zero", 0, removeCount);

            listQueueBean = new ListQueueBean(contentSet, null);
            removeCount = listQueueBean.removeAllFromQueue();
            assertEquals("RemoveCount should be zero", 0, removeCount);
		}
}