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
		private FileLocator fileLocator;

		/**
		 * Initializes this class with a file locator object for testing purposes.
		 */
		private void setFileLocator(FileLocator fileLocator) {
			this.fileLocator = fileLocator;
		}

		@Test
		public void testSetFileLocator() throws Exception {
			setFileLocator(FileLocator.createFromArgs(FileLocator.PATH_NAME_FILE));
			DownloadFolderTag tag = new DownloadFolderTag();
			assertEquals(tag.getDownloadQueue().getQueue(), DownloadQueueBean.DEFAULT_DOWNLOAD_QUEUE_VALUE);
			assertNull(tag.getShortMetadata());
			tag.setFileLocator(null);
			assertNull(tag.getDownloadQueue());
			assertEquals(tag.getShortMetadata(), null);
			assertEquals(tag.getDownloadFolderType(), UNAVAILABLE);

			setFileLocator(FileLocator.createFromArgs("")); //$NON-NLS-1$
			assertEquals(UNAVAILABLE, tag.getDownloadQueue().getQueue());
		}
}